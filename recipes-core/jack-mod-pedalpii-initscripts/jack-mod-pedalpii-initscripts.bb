DESCRIPTION = "Initscripts for JACK, MOD and pedalpII"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "\
	file://jackd \
	file://mod-host \
	"
PACKAGES = "${PN}-jackd ${PN}-mod-host"
INITSCRIPT_PACKAGES = "${PN}-jackd ${PN}-mod-host"
INITSCRIPT_NAME_${PN}-jackd = "jackd"
INITSCRIPT_PARAMS_${PN}-jackd = "defaults 30 70"
INITSCRIPT_NAME_${PN}-mod-host = "mod-host"
INITSCRIPT_PARAMS_${PN}-mod-host = "defaults 31 69"

FILES_${PN}-jackd = "${sysconfdir}/init.d/jackd"
FILES_${PN}-mod-host = "${sysconfdir}/init.d/mod-host"

inherit update-rc.d

S = "${WORKDIR}"
do_install () {
	install -d ${D}${sysconfdir}/init.d/
	install -c -m 755 ${WORKDIR}/jackd ${D}${sysconfdir}/init.d/jackd
	install -c -m 755 ${WORKDIR}/mod-host ${D}${sysconfdir}/init.d/mod-host
}

