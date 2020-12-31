DESCRIPTION = "A module to control Raspberry Pi GPIO channels"
HOMEPAGE = "http://code.google.com/p/raspberry-gpio-python/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.txt;md5=9b95630a648966b142f1a0dcea001cb7"

SRCNAME = "RPi.GPIO"

SRC_URI = " \
        https://github.com/auto3000/pedalpi-dev-platform/releases/download/v2.1/${SRCNAME}-${PV}.tar.gz \
        "

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit distutils3

COMPATIBLE_MACHINE = "raspberrypi"

SRC_URI[md5sum] = "9db86fd5f3bae872de9dbb068ee0b096"
SRC_URI[sha256sum] = "82acff0ef6bbe3cdf6f4dbdd73d96add5294bb94baf7f51c1d901861af3c2392"

