SUMMARY = "A Lv2 version of the old LADSPA SooperLooper plugin."
SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://../COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = "lv2"

SRCREV = "d3e80029ce4f6ef62b3758e95c5b889cab1db740"
#SRCREV = "39c81b5e3996b3f10b89e333dab3a194b9ea5011"
SRC_URI = "git://github.com/moddevices/sooperlooper-lv2-plugin.git"

S = "${WORKDIR}/git/sooperlooper"

FILES_${PN} = " ${libdir}/lv2/ "

EXTRA_OEMAKE = " INSTALL_PATH=/usr/lib/lv2/ DESTDIR=${D} " 

do_install() {
        oe_runmake install
}

