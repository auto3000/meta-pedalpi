SUMMARY = "Analog distortion emulation lv2 plugins."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=783b7e40cdfb4a1344d15b1f7081af66"

DEPENDS = "lv2"

SRCREV = "3622901c643570087b9d26fec2fd878384eaa98e"
SRC_URI = "git://github.com/moddevices/mod-distortion.git"

S = "${WORKDIR}/git"

FILES_${PN} = " ${libdir}/lv2/ "

EXTRA_OEMAKE = " INSTALL_PATH=${D}${libdir}/lv2/ " 

do_install() {
        oe_runmake install
}


