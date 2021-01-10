SUMMARY = "Initial user data shipped on new devices.."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRCREV = "32543b0c32ce2fe20d555e3ed11ae2f283cf7884"
SRC_URI = "git://github.com/moddevices/mod-factory-user-data.git \
           "

S = "${WORKDIR}/git"

FILES_${PN} = "${ROOT_HOME}"

inherit allarch

do_compile() {
}

do_install() {
	install -d ${D}/${ROOT_HOME}/.pedalboards
	install -d ${D}/${ROOT_HOME}/data
	cp -R ${S}/modduo/.pedalboards/* ${D}/${ROOT_HOME}/.pedalboards/
	cp -R ${S}/modduo/data/* ${D}/${ROOT_HOME}/data/
	sed -e "s:/root/:${ROOT_HOME}/:g" -i ${D}/${ROOT_HOME}/.pedalboards/*/* ${D}/${ROOT_HOME}/data/*

	echo "Remove Rig_* pedalboard because these are including non-distributed onyx and cabinet-vintage plugins"
	rm -Rf ${D}/${ROOT_HOME}/.pedalboards/Rig*
}

