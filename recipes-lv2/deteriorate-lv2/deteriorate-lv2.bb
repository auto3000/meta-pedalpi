DESCRIPTION = "A set of plugins to deteriorate the sound quality."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=783b7e40cdfb4a1344d15b1f7081af66"

SRC_URI = "git://github.com/blablack/deteriorate-lv2.git;protocol=https"
SRCREV = "9d9d25d89129a6ae6119b5b853f1c29645680532"

S = "${WORKDIR}/git/"

FILES_${PN} = "\
	${libdir}/lv2/deteriorate.lv2 \
	"

DEPENDS = " lv2 lvtk "

inherit waf

do_install_append() {
	rm ${D}${libdir}/lv2/deteriorate.lv2/*_gui.so
}
