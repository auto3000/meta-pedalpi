require x42-plugins.inc

SUMMARY = "stereo DJ X-fade plugin"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "lv2"

SRCREV = "06b27468de9689d53e9bfe24734ebd91a344b71e"
SRC_URI = "git://github.com/x42/xfade.lv2.git \
           file://0001-lv2-update-modgui-and-.TTL-resources.patch \
           file://0001-lv2-update-modgui-and-.TTL-resources.tgz \
           "
