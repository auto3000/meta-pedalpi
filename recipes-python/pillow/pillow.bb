DESCRIPTION = "The friendly PIL fork (Python Imaging Library)."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ed22148166c9fd21895d7794dc16f6a5"

DEPENDS += "python3 python3-setuptools libjpeg-turbo zlib tiff freetype libpng jpeg"

SRCREV = "3f6db91ccc917e803227d245e38871169f08350f"
SRC_URI = "git://github.com/python-pillow/Pillow.git;protocol=git \
		file://0001-build-always-disable-platform-guessing.patch"

S = "${WORKDIR}/git"

inherit setuptools3 pkgconfig distutils-tools


CFLAGS_append = " -I${STAGING_INCDIR}"
LDFLAGS_append = " -L${STAGING_LIBDIR}"

do_compile_prepend() {
    export LDFLAGS="$LDFLAGS -L${STAGING_LIBDIR}"
    export CFLAGS="$CFLAGS -I${STAGING_INCDIR}"
}
