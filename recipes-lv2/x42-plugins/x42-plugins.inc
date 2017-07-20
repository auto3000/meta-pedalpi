SECTION = "multimedia"

S = "${WORKDIR}/git"

FILES_${PN} = " ${libdir}/lv2/ "

EXTRA_OEMAKE = " MOD=1 DESTDIR=${D} PREFIX=/usr STRIP=echo " 

do_compile() {
	oe_runmake OPTIMIZATIONS="-ffast-math -fno-finite-math-only -DNDEBUG" 
}

do_install() {
	oe_runmake install
}

