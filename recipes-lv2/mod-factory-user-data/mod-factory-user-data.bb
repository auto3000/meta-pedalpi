SUMMARY = "Initial user data shipped on new devices.."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRCREV = "d3624867cfc76a68046c2cd23632b8bea4cae221"
#SRCREV = "4b2b9307f8254a86a91ae5cf60390d9570dbeaf9"
SRC_URI = "git://github.com/moddevices/mod-factory-user-data.git \
           "
#           file://0001-Tilt_Tone-fix-gain-control-to-level-control.patch 

S = "${WORKDIR}/git"

FILES_${PN} = "/home/root"

inherit allarch

do_compile() {
}

do_install() {
	install -d ${D}/home/root/.pedalboards
	install -d ${D}/home/root/data
	cp -R ${S}/modduo/.pedalboards/* ${D}/home/root/.pedalboards/
	cp -R ${S}/modduo/data/* ${D}/home/root/data/
}

