DESCRIPTION = "Physical (button/LCD) and console interfaces for the pedalpii."
SRC_URI = "git://github.com/auto3000/pedalpii.git"
SRCREV = "dfaf4f1f67831463c586f0270472d520e1e8d8dd"
LICENSE = "GPLv3" 

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

inherit setuptools3 

