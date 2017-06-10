SUMMARY = "GxSlowGear.lv2."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

DEPENDS = "lv2"

SRCREV = "a523522ca44717fff93ad1b421d52a8d2cfc59a6"
SRC_URI = "git://github.com/moddevices/GxSlowGear.lv2.git"

S = "${WORKDIR}/git"

FILES_${PN} = "${libdir}/lv2/"


do_compile() {
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -ffast-math -fPIC -shared -Wl,--no-undefined -o gx_slowgear.so gx_slowgear.cpp 
}

do_install() {
	install -d ${D}${libdir}/lv2/gx_slowgear.lv2
	install -m 0644 *.ttl ${D}${libdir}/lv2/gx_slowgear.lv2/
	install -m 0755 gx_slowgear.so ${D}${libdir}/lv2/gx_slowgear.lv2/
	cp -R modgui ${D}${libdir}/lv2/gx_slowgear.lv2/
}

