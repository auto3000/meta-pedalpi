DESCRIPTION = "A module to control Raspberry Pi GPIO channels"
HOMEPAGE = "http://code.google.com/p/raspberry-gpio-python/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.txt;md5=9b95630a648966b142f1a0dcea001cb7"

SRCNAME = "RPi.GPIO"

SRC_URI = "\
          https://github.com/rgov/RPi.GPIO/archive/${PV}.tar.gz \
          "
S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit distutils3

COMPATIBLE_MACHINE = "raspberrypi"

SRC_URI[md5sum] = "07f0de7f2b79c1452cd4304e208a5e49"
SRC_URI[sha256sum] = "be656438721488f1455b4b67f5e9f05425be355b0f2ba906b6132148b7e3ddf4"
