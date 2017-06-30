SUMMARY = "Analog distortion emulation lv2 plugins."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=783b7e40cdfb4a1344d15b1f7081af66"

DEPENDS = "lv2"

SRCREV = "e672d5feb9d631798e3d56eb96e8958c3d2c6821"
SRC_URI = "git://github.com/moddevices/mod-distortion.git"

S = "${WORKDIR}/git"

FILES_${PN} = " ${libdir}/lv2/ "

EXTRA_OEMAKE = " INSTALL_PATH=${D}${libdir}/lv2/ " 

do_install() {
        oe_runmake install
}


