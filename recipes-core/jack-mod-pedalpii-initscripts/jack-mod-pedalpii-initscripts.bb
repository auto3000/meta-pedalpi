DESCRIPTION = "Initscripts for JACK, MOD and pedalpII"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "\
	file://jackd \
	file://mod-host \
	file://mod-ui \
	file://mod-sdk \
	file://pedalpII \
	"
PACKAGES = "${PN}-jackd ${PN}-mod-host ${PN}-mod-ui ${PN}-pedalpii ${PN}-mod-sdk"
INITSCRIPT_PACKAGES = "${PN}-jackd ${PN}-mod-host ${PN}-mod-ui ${PN}-mod-sdk ${PN}-pedalpii"
INITSCRIPT_NAME_${PN}-jackd = "jackd"
INITSCRIPT_PARAMS_${PN}-jackd = "defaults 30 70"
INITSCRIPT_NAME_${PN}-mod-host = "mod-host"
INITSCRIPT_PARAMS_${PN}-mod-host = "defaults 31 69"
INITSCRIPT_NAME_${PN}-mod-ui = "mod-ui"
INITSCRIPT_PARAMS_${PN}-mod-ui = "defaults 32 68"
INITSCRIPT_NAME_${PN}-mod-sdk = "mod-sdk"
INITSCRIPT_PARAMS_${PN}-mod-sdk = "defaults 40 60"
INITSCRIPT_NAME_${PN}-pedalpii = "pedalpII"
INITSCRIPT_PARAMS_${PN}-pedalpii = "defaults 29 71"

FILES_${PN}-jackd = "${sysconfdir}/init.d/jackd"
FILES_${PN}-mod-host = "${sysconfdir}/init.d/mod-host"
FILES_${PN}-mod-ui = "${sysconfdir}/init.d/mod-ui"
FILES_${PN}-mod-sdk = "${sysconfdir}/init.d/mod-sdk"
FILES_${PN}-pedalpii = "${sysconfdir}/init.d/pedalpII"

inherit update-rc.d

S = "${WORKDIR}"
do_install () {
	install -d ${D}${sysconfdir}/init.d/
	install -c -m 755 ${WORKDIR}/jackd ${D}${sysconfdir}/init.d/jackd
	install -c -m 755 ${WORKDIR}/mod-host ${D}${sysconfdir}/init.d/mod-host
	install -c -m 755 ${WORKDIR}/mod-ui ${D}${sysconfdir}/init.d/mod-ui
	install -c -m 755 ${WORKDIR}/pedalpII ${D}${sysconfdir}/init.d/mod-sdk
	install -c -m 755 ${WORKDIR}/pedalpII ${D}${sysconfdir}/init.d/pedalpII
}

