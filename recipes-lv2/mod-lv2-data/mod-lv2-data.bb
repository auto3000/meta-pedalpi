SUMMARY = "MOD LV2 data (plugins, presets and pedalboards)."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRCREV = "45dc0960d7b2b9ad9f6ca2835f1fcf06a2e165ed"
SRC_URI = "git://github.com/moddevices/mod-lv2-data.git"

S = "${WORKDIR}/git"

FILES_${PN} = " ${libdir}/lv2 "

inherit allarch

do_compile() {
}

do_install() {
	install -d ${D}${libdir}/lv2/invada.lv2/modgui
	cp -R ${S}/plugins-fixed/invada.lv2/modgui ${D}/${libdir}/lv2/invada.lv2/

	install -d ${D}${libdir}/lv2/Kars.lv2/
	install -d ${D}${libdir}/lv2/MVerb.lv2/
	install -d ${D}${libdir}/lv2/Nekobi.lv2/
	install -d ${D}${libdir}/lv2/PingPongPan.lv2/
	cp ${S}/plugins-fixed/Kars.lv2/manifest.ttl ${S}/plugins-fixed/Kars.lv2/Kars_dsp.ttl ${S}/plugins-fixed/Kars.lv2/default-preset.ttl ${D}/${libdir}/lv2/Kars.lv2
	cp ${S}/plugins-fixed/MVerb.lv2/manifest.ttl ${S}/plugins-fixed/MVerb.lv2/MVerb_dsp.ttl ${S}/plugins-fixed/MVerb.lv2/default-preset.ttl ${S}/plugins-fixed/MVerb.lv2/presets.ttl ${D}/${libdir}/lv2/MVerb.lv2
	cp ${S}/plugins-fixed/Nekobi.lv2/manifest.ttl ${S}/plugins-fixed/Nekobi.lv2/Nekobi_dsp.ttl ${S}/plugins-fixed/Nekobi.lv2/default-preset.ttl ${D}/${libdir}/lv2/Nekobi.lv2
	cp ${S}/plugins-fixed/PingPongPan.lv2/manifest.ttl ${S}/plugins-fixed/PingPongPan.lv2/PingPongPan_dsp.ttl ${S}/plugins-fixed/PingPongPan.lv2/default-preset.ttl ${S}/plugins-fixed/PingPongPan.lv2/presets.ttl ${D}/${libdir}/lv2/PingPongPan.lv2
}

