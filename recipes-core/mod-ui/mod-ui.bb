SUMMARY = "Web-based interface for the MOD."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5abed640d912caca185601d2312815e"

RDEPENDS_${PN} = "python3-json python3-setuptools python3-pyserial pystache python3-pillow python3-tornado"
DEPENDS = "lilv jack alsa-lib"

SRCREV = "5634a7fad7d96eccdc20bd750134f8e263775c9a"
SRC_URI = "git://github.com/moddevices/mod-ui.git;branch=master \
           file://0002-host-discard-socket-close.patch \
           file://0007-build-disable-strip-of-.so-library-in-utils.patch \
           "

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/share/mod/ \
		/usr/bin/mod-ui"

inherit setuptools3

