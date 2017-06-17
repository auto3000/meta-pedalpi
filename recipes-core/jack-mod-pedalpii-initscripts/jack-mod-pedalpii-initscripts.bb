DESCRIPTION = "Initscripts for JACK, MOD and pedalpII"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://jackd"
PACKAGES = "${PN}-jackd"
INITSCRIPT_PACKAGES = "${PN}-jackd"
INITSCRIPT_NAME_${PN}-jackd = "jackd"
INITSCRIPT_PARAMS_${PN}-jackd = "defaults 30 70"

FILES_${PN}-jackd = "${sysconfdir}/init.d/jackd"

inherit update-rc.d

S = "${WORKDIR}"
do_install () {
	install -d ${D}${sysconfdir}/init.d/
	install -c -m 755 ${WORKDIR}/jackd ${D}${sysconfdir}/init.d/jackd
}

