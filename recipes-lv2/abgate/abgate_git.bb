SUMMARY = "abGate is LV2 noise gate plugin."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS = " lv2 "

PV="1.2.0"
SRCREV = "c416c29d66c09da610dc632605adad14781ede8d"
SRC_URI = "git://github.com/antanasbruzas/abGate.git;branch=master \
           "
S = "${WORKDIR}/git"

FILES_${PN} = "/usr/lib/lv2"

EXTRA_OEMAKE = "DESTDIR=${D} TARGET=gate.so PREFIX=/usr"

do_install() {
	oe_runmake install ${EXTRA_OEMAKE}
	rm -f ${D}/${libdir}/lv2/abGate.lv2/*ttl ${D}/${libdir}/lv2/abGate.lv2/*png
}

inherit pkgconfig

