SUMMARY = "stereo DJ X-fade plugin"
SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "lv2"

SRCREV = "06b27468de9689d53e9bfe24734ebd91a344b71e"
SRC_URI = "git://github.com/x42/xfade.lv2.git \
	file://0001-build-disable-strip-of-output-lib.patch"

FILES_${PN} = " ${libdir}/lv2 "

S = "${WORKDIR}/git"

EXTRA_OEMAKE = " PREFIX=${D}${prefix}/ "

do_install() {
        oe_runmake install
}

