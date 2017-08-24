DESCRIPTION = "Calf Studio Gear is an audio plug-in pack for LV2."
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=dcf3c825659e82539645da41a7908589"

SRC_URI = "git://github.com/calf-studio-gear/calf.git \
	file://0001-calfmakerdf-allow-build-in-cross-environment.patch \
	file://0002-build-add-without-gui-to-configure.ac.patch \
	"
SRCREV = "38d1b2b53734b5a7a209a12c8a225bc6df24c108"

DEPENDS = " fluidsynth readline pkgconfig lv2 lv2-native "

FILES_${PN} = " ${libdir}/calf \
	${libdir}/lv2/ \
	"

EXTRA_OECONF = " --without-gui --without-jack "

S = "${WORKDIR}/git/"

# Prevent QA warning about symbolic link between lv2 library to calf library
INSANE_SKIP_${PN} += "dev-so"

inherit autotools

do_install_append() {
        # --without-gui configuration option does not properly work, consequently we
        # built useless files that we are removing now
        rm -R ${D}/usr/share
}

