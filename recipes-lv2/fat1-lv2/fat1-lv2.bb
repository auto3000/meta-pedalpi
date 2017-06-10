SUMMARY = "Fons Adriaensen's AT1 -- Autotune LV2 plugin."
SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "lv2 fftwf"

SRCREV = "71124f20faec6bbe803741750a7042ec08932615"
SRC_URI = "git://github.com/x42/fat1.lv2.git"

S = "${WORKDIR}/git"


do_compile() {
	oe_runmake OPTIMIZATIONS="-ffast-math -fno-finite-math-only -DNDEBUG" MOD=1 PREFIX="${D}"
}

EXTRA_OEMAKE = " MOD=1 " 

