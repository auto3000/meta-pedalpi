DESCRIPTION = "LV2 is a plugin standard for audio systems."
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

SRC_URI = "git://github.com/drobilla/lv2;protocol=git"
SRCREV = "56f064dce822a53ad668c38d1bb7b2b3025fe270"

S = "${WORKDIR}/git/"


inherit waf

FILES_${PN} += "${datadir}/lv2specgen/*"

