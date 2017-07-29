DESCRIPTION = "A Python module to control the GPIO on a NanoPi."
HOMEPAGE = "http://code.google.com/p/raspberry-gpio-python/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.txt;md5=9b95630a648966b142f1a0dcea001cb7"

COMPATIBLE_MACHINE = "(sun4i|sun5i|sun7i|sun8i|nanopi-neo|nanopi-neo-air)"

SRCREV = "ed72e5f3b6cb62d1c78d6131260b204c10f1b9be"
SRC_URI = "git://github.com/auto3000/RPi.GPIO_NP.git;protocol=git;branch=0.6.3_NP"

S = "${WORKDIR}/git"

inherit distutils3
