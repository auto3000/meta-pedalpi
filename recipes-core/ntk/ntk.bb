DESCRIPTION = "NTK is a fork of FLTK 1.3.0."
LICENSE = "LGPL-2.0"
SRC_URI = "git://github.com/original-male/ntk.git;protocol=http \
	file://0001-build-set-constants-for-arch-32.patch \
	"
SRCREV = "92365eca0f9a6f054abc70489c009aba0fcde0ff"

DEPENDS = " cairo xft jpeg "

FILES_${PN} = " \
	${bindir} \
	${libdir} \
	"

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://COPYING;md5=f6b26344a24a941a01a5b0826e80b5ca"

BBCLASSEXTEND = "native"

inherit waf pkgconfig

