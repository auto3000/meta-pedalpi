SUMMARY = "Initial user data shipped on new devices.."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRCREV = "4b2b9307f8254a86a91ae5cf60390d9570dbeaf9"
SRC_URI = "git://github.com/moddevices/mod-factory-user-data.git"

S = "${WORKDIR}/git"

FILES_${PN} = "/root"

inherit allarch

do_compile() {
}

do_install() {
	install -d ${D}/root/.pedalboards
	install -d ${D}/root/data
	cp -R ${S}/modduo/.pedalboards/* ${D}/root/.pedalboards/
	cp -R ${S}/modduo/data/* ${D}/root/data/
}

