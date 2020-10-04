DESCRIPTION = "Lilv LV2 host library."
SRC_URI = "git://git.drobilla.net/lilv.git;protocol=http \
           file://0001-logging-redirect-errors-to-syslog.patch \
           file://0002-python-re-enable-lilv_uri_to_path.patch \
           file://0003-node-initialize-node-field-with-NULL.patch \
           "
SRCREV = "b52c6ff71fa08557294f25faf0f2c4c6e285b796"
LICENSE = "MIT" 

DEPENDS = "serd sord sratom libsndfile1"

EXTRA_OECONF = " --bindings "

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://COPYING;md5=7aceb3a3edc99517b08f5cdd557e11fb"

FILES_${PN} = "  /usr/etc \
  /usr/etc/bash_completion.d \
  /usr/etc/bash_completion.d/lilv \
  /usr/bin/lilv-bench \
  ${bindir} \
  ${libdir} \
  ${datadir} "


# workaround: the following two lines enables installation of symlink liblilv-0.so
INSANE_SKIP_${PN} = "dev-so"
FILES_${PN}-dev = " \
	/usr/include/lilv-0/lilv/lilvmm.hpp \
	/usr/include/lilv-0/lilv/lilv.h \
	"

inherit waf pkgconfig python3-dir distutils3

# pass " --bindings " for installation
do_configure() {
	PYTHON="/usr/bin/python3" PYTHON_CONFIG="python3-config" PYTHONDIR="${PYTHON_SITEPACKAGES_DIR}" ${S}/waf configure --top ${S} --prefix=${prefix} ${EXTRA_OECONF}
}

do_install() {
	PYTHON="/usr/bin/python3" PYTHON_CONFIG="python3-config" PYTHONDIR="${PYTHON_SITEPACKAGES_DIR}" ${S}/waf install --top ${S} --destdir=${D} ${EXTRA_OECONF}
}

do_compile()  {
	PYTHON="/usr/bin/python3" PYTHON_CONFIG="python3-config" PYTHONDIR="${PYTHON_SITEPACKAGES_DIR}" ${S}/waf build --top ${S} ${@oe.utils.parallel_make_argument(d, '-j%d', limit=64)} --destdir=${D} ${EXTRA_OECONF}
}
