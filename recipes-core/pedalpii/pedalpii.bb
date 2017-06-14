DESCRIPTION = "Physical (button/LCD) and console interfaces for the pedalpii."
SRC_URI = "git://github.com/auto3000/pedalpii.git"
SRCREV = "3b70a903641aacbc2487f14ad95fd2bfdbcb4a11"
LICENSE = "GPLv3" 

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

inherit setuptools3 

