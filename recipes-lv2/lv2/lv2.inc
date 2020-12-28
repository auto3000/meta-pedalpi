LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

SRC_URI = "gitsm://github.com/drobilla/lv2;protocol=git"
SRCREV = "64d4a4a46901b1b1ab4eaac4f3f57f8d353e42c5"

S = "${WORKDIR}/git/"

inherit waf pkgconfig

