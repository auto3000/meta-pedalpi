SUMMARY = "MOD LV2 data (plugins, presets and pedalboards)."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRCREV = "45dc0960d7b2b9ad9f6ca2835f1fcf06a2e165ed"
SRC_URI = "git://github.com/moddevices/mod-lv2-data.git"

S = "${WORKDIR}/git"

FILES_${PN} = "/root ${libdir}/lv2"

inherit allarch

do_compile() {
}

do_install() {
	install -d ${D}/root/.pedalboards
	cp -R ${S}/pedalboards/* ${D}/root/.pedalboards/
	install -d ${D}${libdir}/lv2
	cp -R ${S}/plugins/* ${D}/${libdir}/lv2/
	cp -R ${S}/plugins-fixed/* ${D}/${libdir}/lv2/
	cp -R ${S}/presets/* ${D}/${libdir}/lv2/
}

