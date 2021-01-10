DESCRIPTION = "Rakarrack Effects Ported to LV2 Plugins."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

SRC_URI = "git://github.com/ssj71/rkrlv2.git;protocol=https \
           file://0001-lv2-enable-msse-flags-on-x86-arch-only.patch \
           "
SRCREV = "7edcb4e29a358623bfd57fa2c27e5da60adfcec3"

DEPENDS = "lv2 libsamplerate0 fftwf"

FILES_${PN} = "\
	${libdir}/lv2/rkr.lv2 \
	"

S = "${WORKDIR}/git/"

inherit cmake

do_install_append() {
	rm -R ${D}${datadir}
	# Keep only .so file
	rm -R ${D}${libdir}/lv2/rkr.lv2/*ttl ${D}${libdir}/lv2/rkr.lv2/*rvb ${D}${libdir}/lv2/rkr.lv2/*dly
}
