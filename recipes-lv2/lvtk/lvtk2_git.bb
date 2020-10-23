DESCRIPTION = "LV2 Toolkit v2."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=905c38b5340fed9d382aab1d5221bb66"

SRC_URI = "git://github.com/lvtk/lvtk.git"
SRCREV = "c3d76e818072713da7049c53a484d4286ba6cfe2"

S = "${WORKDIR}/git/"

DEPENDS = " gtkmm lv2 "

EXTRA_OECONF = " --bundle=lvtk-2.lv2 "

inherit waf pkgconfig

do_install_prepend() {
    cp -R ../build/ ${S}/
}

do_install_append() {
   rm -R ${D}${libdir}/lv2/
}
