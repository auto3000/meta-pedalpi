DESCRIPTION = "Invada Studio plugins LV2."
SRC_URI = "https://launchpad.net/invada-studio/lv2/1.2/+download/invada-studio-plugins-lv2_1.2.0-nopkg.tgz \
           file://0001-build-fix-Makefile-to-enable-yocto-cross-build.patch \
           file://0002-rdf-update-TTL-and-modgui-resources.patch \
           file://0002-rdf-update-TTL-and-modgui-resources.tgz \
           "
LICENSE = "GPLv2" 

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

SRC_URI[md5sum] = "fe05214dd65dd3096d03c91d05bc3f5d"
SRC_URI[sha256sum] = "c6cac7c32effc6b3052e3b017133244f385ef8e053147859d88eae6facaf7d12"

S = "${WORKDIR}/invada-studio-plugins-lv2-1.2.0/"

FILES_${PN} = " ${libdir}/lv2/invada.lv2 "

EXTRA_OEMAKE = " DESTDIR=${D}${libdir}/ INSTALL_SYS_PLUGINS_DIR=lv2 "

do_install() {
	oe_runmake install-sys
}



