SUMMARY = "Fons Adriaensen's AT1 -- Autotune LV2 plugin."
SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "lv2 fftwf"

SRCREV = "71124f20faec6bbe803741750a7042ec08932615"
SRC_URI = "git://github.com/x42/fat1.lv2.git \
	file://0001-build-disable-object-stripping.patch"

S = "${WORKDIR}/git"

FILES_${PN} = " ${libdir}/lv2/ "

EXTRA_OEMAKE = " MOD=1 DESTDIR=${D} PREFIX=/usr " 

do_compile() {
	oe_runmake OPTIMIZATIONS="-ffast-math -fno-finite-math-only -DNDEBUG" 
}

do_install() {
	oe_runmake install
}

