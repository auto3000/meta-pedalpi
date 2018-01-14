DESCRIPTION = "A module to control Raspberry Pi GPIO channels"
HOMEPAGE = "http://code.google.com/p/raspberry-gpio-python/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.txt;md5=9b95630a648966b142f1a0dcea001cb7"

SRCNAME = "RPi.GPIO"
TGZFILE = "http://pypi.python.org/packages/source/R/RPi.GPIO/${SRCNAME}-${PV}.tar.gz"

SRC_URI = "\
          ${TGZFILE} \
          "
MIRRORS += "\
${TGZFILE}    https://pypi.python.org/packages/c1/a8/de92cf6d04376f541ce250de420f4fe7cbb2b32a7128929a600bc89aede5/${SRCNAME}-${PV}.tar.gz \n \
${TGZFILE}    http://sources.libreelec.tv/mirror/RPi.GPIO/RPi.GPIO-0.6.2.tar.gz \n \
	"
S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit distutils3

COMPATIBLE_MACHINE = "raspberrypi"

SRC_URI[md5sum] = "9db86fd5f3bae872de9dbb068ee0b096"
SRC_URI[sha256sum] = "82acff0ef6bbe3cdf6f4dbdd73d96add5294bb94baf7f51c1d901861af3c2392"

