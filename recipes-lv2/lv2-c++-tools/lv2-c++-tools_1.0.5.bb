DESCRIPTION = "Make it easier to write LV2 plugins."
HOMEPAGE = "http://ll-plugins.nongnu.org/hacking.html"
SECTION = "multimedia"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRCNAME = "lv2-c++-tools"

SRC_URI = "\
	http://ftp.igh.cnrs.fr/pub/nongnu/ll-plugins/${SRCNAME}-${PV}.tar.bz2 \
	"

SRC_URI[md5sum] = "4707f2507f86d6c7bbaa809bb52eed9b"
SRC_URI[sha256sum] = "6ce16a51a37259a45d8a7a59f39a6c36fc09b4c700dd26244a9dada241864e3b"

DEPENDS = " lv2 boost gtkmm "

inherit pkgconfig

S = "${WORKDIR}/${SRCNAME}-${PV}"

# Inhibit generation of lv2peg program installed by lv2peg.bb recipe
EXTRA_OEMAKE = " DESTDIR=${D} prefix=${prefix} bindir=${bindir} libdir=${libdir} datadir=${datadir} includedir=${includedir} lv2peg_LDFLAGS=-lboost_system PROGRAMS= "

do_install() {
        oe_runmake install ${EXTRA_OEMAKE}
}

