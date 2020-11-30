SECTION = "multimedia"

S = "${WORKDIR}/git"

FILES_${PN} = " ${libdir}/lv2/ "

EXTRA_OEMAKE = " LINK_FLAGS='${LDFLAGS}' DESTDIR=${D} PREFIX=/usr " 

do_compile() {
	oe_runmake
}

do_install() {
	oe_runmake install
}

