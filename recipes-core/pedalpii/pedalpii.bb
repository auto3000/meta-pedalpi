DESCRIPTION = "Physical (button/LCD) and console interfaces for the pedalpii."
SRC_URI = "git://github.com/auto3000/pedalpii.git"
SRCREV = "d75f3fa4cbe6529723f7250e0ba8cbe7c090d1f1"
LICENSE = "GPLv3" 

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

inherit setuptools3 

