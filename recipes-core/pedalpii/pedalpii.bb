DESCRIPTION = "Physical (button/LCD) and console interfaces for the pedalpii."
SRC_URI = "git://github.com/auto3000/pedalpii.git"
SRCREV = "c6c8906a018d53f21d15c68778a8dc6bbed82f52"
LICENSE = "GPLv3" 

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

inherit setuptools3 

