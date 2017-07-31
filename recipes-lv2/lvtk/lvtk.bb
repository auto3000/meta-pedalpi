DESCRIPTION = "LV2 Toolkit."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/lvtk/lvtk.git"
SRCREV = "7c0ffdf49baecf92137441065ac921a1e57d2ca9"

S = "${WORKDIR}/git/"

DEPENDS = " gtkmm "

inherit waf

