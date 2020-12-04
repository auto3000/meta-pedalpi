SUMMARY = "SoundFonts as LV2 plugins via FluidSynth"
SECTION = "multimedia"

LICENSE = "CC-BY-SA-3.0"
LIC_FILES_CHKSUM = "file://Black_Pearl_5.lv2/License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43 \
                    file://AVL_Drumkits_Perc.lv2/License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43 \
                    file://Red_Zeppelin_4.lv2/License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43 \
                    file://Black_Pearl_4B.lv2/License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43 \
                    file://Black_Pearl_4A.lv2/License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43 \
                    file://Red_Zeppelin_5.lv2/License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43"

SRC_URI = "git://github.com/falkTX/FluidPlug;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "8457f1036c5f7d4437febe2a4ea4f0ad263e0f88"

S = "${WORKDIR}/git"

FILES_${PN} = "${libdir}/lv2"

EXTRA_OEMAKE = " DESTDIR=${D} LINK_OPTS= "

DEPENDS = "lv2 fluidsynth p7zip-native"

do_configure () {
}

do_compile () {
	export GUI_LDFLAGS="${LDFLAGS}"
	oe_runmake BASE_OPTS="-O2 -ffast-math -fdata-sections -ffunction-sections" STRIP=echo
}

do_install() {
        oe_runmake install ${EXTRA_OEMAKE}
}


inherit pkgconfig

