SUMMARY = "Web-based interface for the MOD."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5abed640d912caca185601d2312815e"

RDEPENDS_${PN} = "python3-textutils python3-json python3-setuptools python3-pyserial pystache pillow python3-tornado"
DEPENDS = "lilv jack alsa-lib"

SRCREV = "ffad04feb06e03bd85162641cacab7290059d770"
SRC_URI = "git://github.com/auto3000/mod-ui.git;branch=hmi_socket"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/share/mod/ \
		/usr/bin/mod-ui"

inherit setuptools3

