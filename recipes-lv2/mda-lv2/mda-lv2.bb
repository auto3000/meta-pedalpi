DESCRIPTION = "This is a port of the MDA VST plugins to LV2."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/moddevices/mda-lv2.git"
SRCREV = "3d6dd099146b72c1fe88e06679034715fb999a5b"

FILES_${PN} = "${libdir}/lv2/"

S = "${WORKDIR}/git/"

inherit waf pkgconfig

# Fix installation issue on parallel builds
waf_do_install() {
	${S}/waf install --destdir=${D} -j1
}

