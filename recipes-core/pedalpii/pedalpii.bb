DESCRIPTION = "Physical (button/LCD) and console interfaces for the pedalpii."
SRC_URI = "git://github.com/auto3000/pedalpii.git"
SRCREV = "43b9e9ae436c451140d11dd4b36bde8c2c6ff59f"
LICENSE = "GPLv3" 

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

RDEPENDS_${PN} += " python3-tornado "

inherit setuptools3 

