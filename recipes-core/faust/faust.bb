SUMMARY = "Faust : signal processing language."
SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=cb340d2b4e7d435294bfbbaf3990a111"

SRCREV = "2eab0d77c61e3abf8c5abee3f6ab8d4e481542b6"
SRC_URI = "git://git.code.sf.net/p/faudiostream/code;protocol=https"

RDEPENDS_faust = "bash"

FILES_${PN}-staticdev = "/usr/share/faust/iOS/osclib/liboscpack.a \
	/usr/share/faust/iOS/osclib/libOSCFaust.a \
	/usr/share/faust/iOS/osclib/faust/libOSCFaust.a \
	/usr/share/faust/iOS/osclib/oscpack/liboscpack.a "

S = "${WORKDIR}/git"

do_install() {
	oe_runmake install "DESTDIR=${D}" "PREFIX=${prefix}"
}

