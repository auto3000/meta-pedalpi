DESCRIPTION = "Port of Alsa Modular Synth internal modules into LV2."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e8c1458438ead3c34974bc0be3a03ed6"

SRC_URI = "git://github.com/blablack/ams-lv2.git;protocol=https"
SRCREV = "d98cc0e343c53e4ab1329c58287873255f88f57f"

S = "${WORKDIR}/git/"

FILES_${PN} = "\
	${libdir}/lv2/ams.lv2 \
	"

DEPENDS = " lv2 lvtk fftwf "

inherit waf

do_install_append() {
	rm ${D}${libdir}/lv2/ams.lv2/*_gui.so
}
