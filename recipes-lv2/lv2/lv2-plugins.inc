SUMMARY = "LV2 is an open standard for audio plugins"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

SRC_URI = " \
    gitsm://github.com/lv2/lv2.git \
"
SRCREV = "5f40c5c421ffc50783962efb4cab151c8c2519dd"
#SRC_URI = "git://github.com/drobilla/lv2;protocol=git"
#SRCREV = "56f064dce822a53ad668c38d1bb7b2b3025fe270"

S = "${WORKDIR}/git/"
PV = "1.18.0"

inherit waf pkgconfig

