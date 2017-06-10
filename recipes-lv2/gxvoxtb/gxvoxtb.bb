SUMMARY = "Fuzz Tonebender plugin."
SECTION = "multimedia"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"


DEPENDS = "lv2"

SRCREV = "54a9acc8fe85212542c1cb4088338d3627788139"
SRC_URI = "git://github.com/moddevices/gx_voxtb.lv2.git"

S = "${WORKDIR}/git"

FILES_${PN} = "${libdir}/lv2/"


do_compile() {
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -ffast-math -fPIC -shared -Wl,--no-undefined -o gx_voxtb.so gx_voxtb.cpp 
}

do_install() {
	install -d ${D}${libdir}/lv2/gx_voxtb.lv2
	install -m 0644 *.ttl ${D}${libdir}/lv2/gx_voxtb.lv2/
	install -m 0755 gx_voxtb.so ${D}${libdir}/lv2/gx_voxtb.lv2/
	cp -R modgui ${D}${libdir}/lv2/gx_voxtb.lv2/
}
