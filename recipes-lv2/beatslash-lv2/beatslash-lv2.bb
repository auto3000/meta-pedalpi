DESCRIPTION = "A set of LV2 plugins to mangle, slash, repeat and do much more with your beats."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=783b7e40cdfb4a1344d15b1f7081af66"

SRC_URI = "git://github.com/blablack/beatslash-lv2.git"
SRCREV = "48efeda5377b6cb9f247f4282d0448251b23a819"

DEPENDS = " lvtk "

FILES_${PN} = "${libdir}/lv2/"

S = "${WORKDIR}/git/"

inherit waf

