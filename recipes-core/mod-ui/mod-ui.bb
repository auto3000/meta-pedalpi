SUMMARY = "Web-based interface for the MOD."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5abed640d912caca185601d2312815e"

DEPENDS = "python3-pyserial pystache pillow python3-tornado lilv jack alsa-lib"

SRCREV = "46eae5a2591870b3e2fdf86eb3cf0b3023cd70dd"
SRC_URI = "git://github.com/auto3000/mod-ui.git;branch=hmi_socket"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/share/mod/ \
		/usr/bin/mod-ui"

inherit setuptools3

