DESCRIPTION = "guitarix virtual versatile amplification for Jack/Linux."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=384f45fb7968a0fe30622ce6160d3b69"

SRC_URI = "git://git.code.sf.net/p/guitarix/git;protocol=http"
SRCREV = "787969e02a017e9ab715ef9a098665176b58129b"

DEPENDS = "jack glibmm fftwf lv2 libeigen gtk+ gtkmm"

FILES_${PN} = "${libdir}/lv2 ${datadir}"

S = "${WORKDIR}/git/trunk"

EXTRA_OECONF = " --lv2-only --disable-sse --includeresampler --includeconvolver '--cxxflags=${CXXFLAGS}' '--ldflags=${LDFLAGS}' " 

inherit waf

do_install_append() {
	# --no-lv2-gui configuration option does not properly work, consequently we 
	# built useless files that we are removing now
	rm ${D}${libdir}/lv2/*.lv2/*_gui.so
	rm ${D}${libdir}/libgxw*

	# Clean files overriden by mod-lv2-data
	rm -R ${D}${libdir}/lv2/gx_colwah.lv2/modgui.ttl
}

