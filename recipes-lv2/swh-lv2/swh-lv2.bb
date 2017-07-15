SUMMARY = "SWH Plugins in LV2 format"
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "lv2 fftwf"

SRCREV = "810b427069441ee365c819220d1515b2d68d941b"
SRC_URI = "git://github.com/moddevices/swh-lv2.git \
	file://0001-build-disable-TTL-generation.patch"

FILES_${PN} = " ${libdir}/lv2 "

S = "${WORKDIR}/git"

EXTRA_OEMAKE = " INSTALL_PATH=${D}${libdir}/lv2 "

do_install() {
        oe_runmake install-system
}


