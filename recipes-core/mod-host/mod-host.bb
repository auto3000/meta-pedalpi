SUMMARY = "LV2 host for Jack controllable via socket or command line."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "jack lilv readline"

SRCREV = "f84cd25f31bab67128696f32ced7f37f137ab280"
SRC_URI = "git://github.com/moddevices/mod-host.git"

S = "${WORKDIR}/git"



