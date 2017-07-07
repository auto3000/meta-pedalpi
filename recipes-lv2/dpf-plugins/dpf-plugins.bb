DESCRIPTION = "Collection of DPF-based plugins."
SRC_URI = "git://github.com/DISTRHO/DPF-Plugins;protocol=https \
	file://0001-build-remove-strip-flags-and-gen-rule.patch"
SRCREV = "6454c590a2b5402195e655b1386358210e067dfd"
LICENSE = "ISC" 

LIC_FILES_CHKSUM = "file://LICENSE;md5=ec024abddfab2ee463c8c1ad98883d12"

S = "${WORKDIR}/git/"

FILES_${PN} = " ${libdir}/lv2/ "

EXTRA_OEMAKE = " DESTDIR=${D} PREFIX=${prefix}/ "

do_install() {
	oe_runmake install
	
	rm -Rf ${D}${libdir}/dssi ${D}${libdir}/vst ${D}${libdir}/ladspa
	rm -Rf ${D}${libdir}/MaBitcrush.lv2
	rm -Rf ${D}${libdir}/3BandSplitter.lv2
	rm -Rf ${D}${libdir}/MaGigaverb.lv2
	rm -Rf ${D}${libdir}/SoulForce.lv2
	rm -Rf ${D}${libdir}/MaPitchshift.lv2
	rm -Rf ${D}${libdir}/CycleShifter.lv2
	rm -Rf ${D}${libdir}/AmplitudeImposer.lv2
	rm -Rf ${D}${libdir}/3BandEQ.lv2
	rm -Rf ${D}${libdir}/MaFreeverb.lv2
}

