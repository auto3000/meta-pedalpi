SUMMARY = "gui for plugins lv2 in mod"
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRCREV = "cb53b5468cb2b589fa0f095bf80d86fcd54ab45a"
SRC_URI = "git://github.com/popololo46/modgui.git;nobranch=1 \
           file://0001-amsynth-change-control-to-midi-portname.patch \
           "

S = "${WORKDIR}/git"

FILES_${PN} = " ${libdir}/lv2 "

inherit allarch

do_compile() {
}

PR = "r1"
RREPLACES_${PN} += " amsynth-lv2-ttl-files "
RCONFLICTS_${PN} += " amsynth-lv2-ttl-files "
RPROVIDES_${PN} += " amsynth-lv2-ttl-files "

do_install() {
	install -d ${D}${libdir}/lv2/amsynth.lv2/
	cp -R ${S}/amsynth.lv2 ${D}/${libdir}/lv2/

}
