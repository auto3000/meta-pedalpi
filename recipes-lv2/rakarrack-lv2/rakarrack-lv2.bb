DESCRIPTION = "Rakarrack Effects Ported to LV2 Plugins."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

SRC_URI = "git://github.com/ssj71/rkrlv2.git;protocol=https \
	file://0001-build-remove-sse2-optimizations.patch \
	"
SRCREV = "bf4eca3115858246764d2294f34c73fe4082d040"

DEPENDS = "lv2 libsamplerate0 fftwf"

FILES_${PN} = "\
	${libdir}/lv2/rkr.lv2 \
	"

S = "${WORKDIR}/git/"

inherit cmake

do_install_prepend() {
	rm ${S}/lv2/ttl/manifest.ttl
}
do_install_append() {
	rm -R ${D}${datadir}
#	rm ${D}${libdir}/lv2/rkr.lv2/manifest.ttl
}
