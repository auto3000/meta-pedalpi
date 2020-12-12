SUMMARY = "Freaked plugins: Freakclip, Freaktail, Granulator, Prefreak"
HOMEPAGE = "https://github.com/pjotrompet/Freaked"
SECTION = "multimedia"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

SRC_URI = "git://github.com/pjotrompet/Freaked;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "0e013fd1261cbdb409bc8abe78dc4c7a825cb9ef"

S = "${WORKDIR}/git"

inherit pkgconfig

DEPENDS += "lv2"

EXTRA_OEMAKE = "NOOPT=true DESTDIR=${D} PREFIX=/usr STRIP=echo LINK_OPTS= "

do_configure () {
}

do_compile () {
	export GUI_LDFLAGS="${LDFLAGS}"
	oe_runmake
}

do_install () {
	oe_runmake install ${EXTRA_OEMAKE}
}

FILES_${PN} += "${libdir}/lv2"
