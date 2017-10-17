SUMMARY = "LV2 host for Jack controllable via socket or command line."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "jack lilv readline ne10 fftwf "
RDEPENDS_${PN} = " jack-utils "

SRCREV = "f84cd25f31bab67128696f32ced7f37f137ab280"
SRC_URI = "git://github.com/moddevices/mod-host.git \
	file://0001-build-remove-object-stripping-and-O3-optimization.patch \
	file://0002-logger-add-syslog-support.patch \
	file://0003-buffer-valgrind-detects-unitialized-buffer-in-effect.patch \
	file://0004-mutex-disable-build-flags-inheritance-protocol.patch \
	file://0005-jack-add-retry-mechanism-to-connect-JACK.patch \
	file://0006-jack-add-logging-hook-to-JACK-library.patch \
	file://0007-logging-redirect-printf-to-logger.patch \
	"

FILES_${PN} = " /usr/bin/mod-host /usr/lib/jack/ "

S = "${WORKDIR}/git"

EXTRA_OEMAKE = " PREFIX=/usr DESTDIR=${D} HAVE_NE10=true "

do_install() {
        oe_runmake install
}



