DESCRIPTION = "A Python module to control the GPIO on a NanoPi."
HOMEPAGE = "http://code.google.com/p/raspberry-gpio-python/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.txt;md5=9b95630a648966b142f1a0dcea001cb7"

COMPATIBLE_MACHINE = "(sun4i|sun5i|sun7i|sun8i|nanopi-neo|nanopi-neo-air)"

SRCREV = "cbb7cc7549c0b6b90c405767b08e2958e049ab19"
SRC_URI = "git://github.com/auto3000/RPi.GPIO_NP.git;protocol=git"

S = "${WORKDIR}/git"

inherit distutils3
