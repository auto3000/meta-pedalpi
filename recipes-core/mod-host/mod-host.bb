SUMMARY = "LV2 host for Jack controllable via socket or command line."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "jack lilv readline fftwf cc-master "
DEPENDS_armv7 = " jack lilv readline fftwf cc-master ne10 "
DEPENDS_aarch64 = " jack lilv readline fftwf cc-master ne10 "
RDEPENDS_${PN} = " jack-utils lilv cc-master "

SRCREV = "520b7fc15579aa3ff836449385ebde6eeb1449b6"
SRC_URI = "git://github.com/moddevices/mod-host.git \
	file://0001-build-remove-object-stripping-and-O3-optimization.patch \
	file://0002-logger-add-syslog-support.patch \
	file://0004-mutex-disable-build-flags-inheritance-protocol.patch \
	file://0005-jack-add-retry-mechanism-to-connect-JACK.patch \
	file://0006-jack-add-logging-hook-to-JACK-library.patch \
	file://0007-logging-redirect-printf-to-logger.patch \
	"

FILES_${PN} = " /usr/bin/mod-host /usr/lib/jack/ "

S = "${WORKDIR}/git"

EXTRA_OEMAKE = " PREFIX=/usr DESTDIR=${D} "
EXTRA_OEMAKE_armv7 += " PREFIX=/usr DESTDIR=${D} HAVE_NE10=true "
EXTRA_OEMAKE_aarch64 += " PREFIX=/usr DESTDIR=${D} HAVE_NE10=true "

do_install() {
        oe_runmake install
}

inherit pkgconfig

