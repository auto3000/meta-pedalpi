DESCRIPTION = "VocProc is a LV2 plugin for pitch shifting, vocoding, automatic pitch correction and harmonization of singing voice"
HOMEPAGE = "http://hyperglitch.com/dev/VocProc"
SECTION = "multimedia"
LICENSE = "GPLv2"
SRCNAME = "vocproc"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

SRC_URI = "\
	http://hyperglitch.com/files/vocproc/${SRCNAME}-${PV}.tar.gz \
	"

SRC_URI[md5sum] = "0cbc299ba6357fa41302d139696f56ce"
SRC_URI[sha256sum] = "b10236fcef9668464a60a786705f7381edb50bb591f87c55bca95f62118a3ead"

DEPENDS = " gtkmm fftwf lv2-c++-tools lv2peg-native "

S = "${WORKDIR}/${SRCNAME}.lv2"

FILES_${PN} = " ${libdir} "

do_compile() {
	lv2peg vocproc.ttl.voc vocproc.peg
        ${CXX} ${LDFLAGS} ${CXXFLAGS} -shared -fPIC -DPIC vocproc.cpp `pkg-config --cflags --libs lv2-plugin fftw3f` -lm -o vocproc.so
        ${CXX} ${LDFLAGS} ${CXXFLAGS} -shared -fPIC -DPIC vocproc_gui.cpp `pkg-config --cflags --libs lv2-gui` -o vocproc_gui.so

}

do_install() {
	install -d ${D}${libdir}/lv2/${SRCNAME}.lv2/
	install -c -m 644 manifest.ttl vocproc.so vocproc_gui.so vocproc_gui.ui ${D}${libdir}/lv2/${SRCNAME}.lv2/
	install -c -m 644 vocproc.ttl.voc ${D}${libdir}/lv2/${SRCNAME}.lv2/vocproc.ttl
}

