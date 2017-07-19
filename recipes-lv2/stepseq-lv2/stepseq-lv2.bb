SUMMARY = "Simple Step Sequencer."
SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "lv2"

SRCREV = "b009812fd0af471b647c179c50ca0941c87ff6a4"
SRC_URI = "gitsm://github.com/x42/stepseq.lv2.git"

S = "${WORKDIR}/git"

FILES_${PN} = " ${libdir}/lv2/ "

EXTRA_OEMAKE = " MOD=1 DESTDIR=${D} PREFIX=/usr STRIP=echo " 

do_compile() {
	oe_runmake OPTIMIZATIONS="-ffast-math -fno-finite-math-only -DNDEBUG" 
}

do_install() {
	oe_runmake install
}

