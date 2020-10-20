DESCRIPTION = "guitarix virtual versatile amplification for Jack/Linux."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=384f45fb7968a0fe30622ce6160d3b69"

SRC_URI = "git://git.code.sf.net/p/guitarix/git;protocol=http \
	file://0001-lv2-update-TTL-and-modgui-resources.tgz \
	"
SRCREV = "a1d20126e9997d5cca793aa686f54015b7ff2d94"

DEPENDS = "jack glibmm fftwf lv2 libeigen gtk+ gtkmm"

FILES_${PN} = "${libdir}/lv2 ${datadir}"

S = "${WORKDIR}/git/trunk"

EXTRA_OECONF = " --no-standalone --no-faust --no-desktop-update --disable-nls --no-lv2-gui --mod-lv2 --no-avahi --no-bluez --no-nsm --disable-sse --includeresampler --includeconvolver '--cxxflags=${CXXFLAGS}' '--ldflags=${LDFLAGS}' " 

inherit waf pkgconfig

INSANE_SKIP_${PN} = "already-stripped"
