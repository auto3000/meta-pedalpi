SUMMARY = "Pitch Shifter developed by mod team."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

DEPENDS = "lv2 fftwf fftwf-native armadillo"

SRCREV = "d404edc4d79fb59ee77bb9e87ce51de050e70a88"
SRC_URI = "git://github.com/moddevices/mod-pitchshifter.git;protocol=https \
	file://0001-build-remove-object-stripping.patch \
	"

FILES_${PN} = " ${libdir}/lv2 "

S = "${WORKDIR}/git"

EXTRA_OEMAKE = " INSTALL_PATH=${D}${libdir}/lv2 NOOPT=true "

do_install() {
        oe_runmake install
}

