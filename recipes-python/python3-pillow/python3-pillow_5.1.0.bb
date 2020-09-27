SUMMARY = "Pillow is the friendly PIL (where PIL is the Python Imaging Library)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6379001ecb47e2a0420c40177fc1125"

SRC_URI = "https://github.com/python-pillow/Pillow/archive/${PV}.tar.gz;downloadfilename=Pillow-${PV}.tar.gz"

SRC_URI[md5sum] = "04d2b1d1ce8b9f6831e33fb85b34316d"
SRC_URI[sha256sum] = "de34dfb23981fd94fa8b4b3b5fd3641082de9e618b2a8bbd66ce846d09eba9a0"


S = "${WORKDIR}/Pillow-${PV}"

DEPENDS = "lcms freetype libpng jpeg zlib tiff python3-cython-native libwebp"
DEPENDS += "python3-dateutil python3-six \
            python3-jinja2 python3-markupsafe python3-docutils \
            python3-requests olefile "

inherit distutils3 python3-dir setuptools3

# python3-pytz  python3-pyflakes  python3-pep8

# this is in the upstream docs but no configure exists  :(
EXTRA_OECONF = " --disable-platform-guessing --disable-tcl --disable-tk \
                 --disable-webp --disable-webpmux --disable-jpeg2000 \
                 --disable-imagequant"

DISTUTILS_INSTALL_ARGS = "--root=${D} \
    --skip-build \
    --prefix=${prefix} \
    --install-lib=${PYTHON_SITEPACKAGES_DIR} \
    --install-data=${datadir}"

do_compile_prepend() {
        sed -i -e s:/usr/local/lib:${STAGING_LIBDIR}:g \
               -e s:/usr/local/include:${STAGING_INCDIR}:g \
               -e s:/usr/local/lib64:${STAGING_LIBDIR}:g \
               -e s:/usr/lib:${STAGING_LIBDIR}:g \
               -e s:/usr/lib64:${STAGING_LIBDIR}:g \
               -e s:\"/lib:\"${STAGING_BASELIBDIR}:g \
               -e s:/lib64:${STAGING_BASELIBDIR}:g \
               -e s:/usr/include:${STAGING_INCDIR}:g \
               ${S}/setup.py
}


BBCLASSEXTEND = "native"
