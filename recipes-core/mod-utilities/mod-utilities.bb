SUMMARY = "Some utilities lv2 plugins."
SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e8c1458438ead3c34974bc0be3a03ed6"

DEPENDS = "lv2 alsa-lib"

SRCREV = "442da1b035fa912475f4e5ccfaa99226b504caac"
SRC_URI = "git://github.com/moddevices/mod-utilities.git"

FILES_${PN} = "${libdir}/lv2"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "MOD=1"

do_install() {
	oe_runmake install MOD=1 INSTALL_PATH=${D}/${libdir}/lv2
}


