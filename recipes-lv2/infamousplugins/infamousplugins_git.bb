SUMMARY = "INFAMOUS Plugins"
SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = " lv2 cairo ntk ntk-native fftwf zita-resampler fltk fltk-native "
SRCREV = "3931d704b2ca6337869f59dd4cc1f9376569df92"
SRC_URI = "git://github.com/ssj71/infamousPlugins.git;branch=master \
           "

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " -DMOD=ON -DPLUGINS="hip2b;powercut;stuck;ewham;mindi" "

FILES_${PN} = " \
	${bindir}/infamous-rule \
	${libdir}/lv2/ \
	"

inherit cmake pkgconfig

