SUMMARY = "Analog wah emulation with switchless activation."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

DEPENDS = "lv2"

SRCREV = "5d2fc315c85ac38e90ebe079968d45b805000fd2"
SRC_URI = "git://github.com/moddevices/GxSwitchlessWah.lv2.git"

S = "${WORKDIR}/git"

FILES_${PN} = "${libdir}/lv2/"


do_compile() {
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -ffast-math -fPIC -shared -Wl,--no-undefined -o gx_switchless_wah.so gx_switchless_wah.cpp 
}

do_install() {
	install -d ${D}${libdir}/lv2/gx_switchless_wah.lv2
	install -m 0644 *.ttl ${D}${libdir}/lv2/gx_switchless_wah.lv2/
	install -m 0755 gx_switchless_wah.so ${D}${libdir}/lv2/gx_switchless_wah.lv2/
	cp -R modgui ${D}${libdir}/lv2/gx_switchless_wah.lv2/
}

