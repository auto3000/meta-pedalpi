SUMMARY = "LV2 port for the TAP (Tom's Audio Processing) plugins."
SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = "lv2"

SRCREV = "cab6e0dfb2ce20e4ad34b067d1281ec0b193598a"
SRC_URI = "git://github.com/moddevices/tap-lv2.git \
	file://0001-build-CFLAGS-and-LDFLAGS-are-made-optional.patch"

FILES_${PN} = " ${libdir}/lv2 "

S = "${WORKDIR}/git"

EXTRA_OEMAKE = " INSTALL_PATH=${D}${libdir}/lv2 "

do_install() {
        oe_runmake install
}

