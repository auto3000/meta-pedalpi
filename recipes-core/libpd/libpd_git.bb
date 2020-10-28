DESCRIPTION = "Pure Data is an embeddable audio synthesis library"
HOMEPAGE = "http://libpd.cc/"
LICENSE = "BSD-3-Clause"
SRC_URI = "gitsm://github.com/${BPN}/${BPN}.git;protocol=git \
           file://0001-Makefile-use-LDFLAGS-from-environment.patch \
           file://0002-Makefile-add-soname.patch \
           "
SRCREV = "019f864802cebc531f425ba6d1be8fd49f630a3e"
PD_VERSION = "0.10.0"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://${S}/LICENSE.txt;md5=ef3d3f3acede8823822519f658e24cc6"

CFLAGS_append = " \
  -I./pure-data/src \
  -I./libpd_wrapper \
  -DPD \
  -DHAVE_UNISTD_H \
  -DUSEAPI_DUMMY \
  -DHAVE_LIBDL \
  -Wno-int-to-pointer-cast \
  -Wno-pointer-to-int-cast \
  -fPIC \
  -O3 \
"

EXTRA_OEMAKE = "UTIL=true EXTRA=true "

do_install() {
  install -d ${D}${libdir}
  cp libs/${PN}.so libs/${PN}.so.${PD_VERSION}
  oe_soinstall libs/${PN}.so.${PD_VERSION} ${D}${libdir}
  install -d ${D}${includedir}
  install -d ${D}${includedir}/libpd
  install -d ${D}${includedir}/libpd/util
  install libpd_wrapper/z_libpd.h ${D}${includedir}/libpd
  install pure-data/src/m_pd.h ${D}${includedir}/libpd
  install libpd_wrapper/util/z_print_util.h ${D}${includedir}/libpd/util
  install libpd_wrapper/util/z_queued.h ${D}${includedir}/libpd/util
}


