SUMMARY = "LV2 host for Jack controllable via socket or command line"
SECTION = "multimedia"

LICENSE = "GPLv3"
DEPENDS = "libjack-jackd2 liblilv libreadline lilv-utils"

SRCREV = "f84cd25f31bab67128696f32ced7f37f137ab280"
SRC_URI = "git://github.com/moddevices/mod-host.git"

S = "${WORKDIR}/git"



