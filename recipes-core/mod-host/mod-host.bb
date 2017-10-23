SUMMARY = "LV2 host for Jack controllable via socket or command line."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "jack lilv readline fftwf "
DEPENDS_armv7 += " ne10 "
DEPENDS_aarch64 += " ne10 "
RDEPENDS_${PN} = " jack-utils lilv "

SRCREV = "1726ad06b11323da7e1aaed690ff8aef91f702b5"
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

EXTRA_OEMAKE = " PREFIX=/usr DESTDIR=${D} "
EXTRA_OEMAKE_armv7 += " HAVE_NE10=true "
EXTRA_OEMAKE_aarch64 += " HAVE_NE10=true "

do_install() {
        oe_runmake install
}



