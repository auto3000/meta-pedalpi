require x42-plugins.inc

SUMMARY = "LV2 convolution plugin"

SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

DEPENDS = " lv2 fftwf zita-convolver libsamplerate0 "
SRCREV = "a63edad6fb836448b03907b8e944d914baaafaf4"
SRC_URI = "git://github.com/x42/convoLV2.git \
	file://0001-build-disable-header-file-check.patch"

