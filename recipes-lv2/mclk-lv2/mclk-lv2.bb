SUMMARY = "Midi Clock Generator LV2 Plugin"
SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "lv2"

SRCREV = "4d31ee52fbe037ed54c453022a090bdd52bcaf6c"
SRC_URI = "git://github.com/x42/mclk.lv2.git \
		file://0001-build-disable-strip-command.patch"

FILES_${PN} = " ${libdir}/lv2 "

S = "${WORKDIR}/git"

EXTRA_OEMAKE = " MOD=1 PREFIX=${D}${prefix}/ "

do_install() {
        oe_runmake install
}


