SUMMARY = "Simulation of the Vintage Fuzz Master Pedal."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

DEPENDS = "lv2"

SRCREV = "eca863cc2e0514932e7a1f087506d960bc4a7ebd"
SRC_URI = "git://github.com/moddevices/GxVintageFuzzMaster.lv2.git"

S = "${WORKDIR}/git"

FILES_${PN} = "${libdir}/lv2/"


do_compile() {
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -ffast-math -fPIC -shared -Wl,--no-undefined -o gx_vfm.so gx_vfm.cpp 
}

do_install() {
	install -d ${D}${libdir}/lv2/gx_vfm.lv2
	install -m 0644 *.ttl ${D}${libdir}/lv2/gx_vfm.lv2/
	install -m 0755 gx_vfm.so ${D}${libdir}/lv2/gx_vfm.lv2/
	cp -R modgui ${D}${libdir}/lv2/gx_vfm.lv2/
}

