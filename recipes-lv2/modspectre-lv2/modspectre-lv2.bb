SUMMARY = "Crude FFT Spectrum Analyzer"
SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "lv2 fftwf"

SRCREV = "ca8c8b26ebb318a55a60fa9dd6ab2f54e80a7f82"
SRC_URI = "git://github.com/x42/modspectre.lv2.git"

S = "${WORKDIR}/git"

FILES_${PN} = " ${libdir}/lv2/ "

EXTRA_OEMAKE = " MOD=1 DESTDIR=${D} PREFIX=/usr STRIP=echo " 

do_compile() {
	oe_runmake OPTIMIZATIONS="-ffast-math -fno-finite-math-only -DNDEBUG" 
}

do_install() {
	oe_runmake install
}

