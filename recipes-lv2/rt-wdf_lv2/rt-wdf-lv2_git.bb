SUMMARY = "Real Time Wave Digital Filter lv2 plugin examples"
HOMEPAGE = "https://github.com/MaxPayne86/rt-wdf_lv2/"
SECTION = "multimedia"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e8c1458438ead3c34974bc0be3a03ed6"

SRC_URI = "git://github.com/MaxPayne86/rt-wdf_lv2/;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "19ff0d7e5ab7d45c60ff227c71ca2e273f8d2a73"

S = "${WORKDIR}/git"

inherit pkgconfig

DEPENDS = "lv2 rt-wdf"

#EXTRA_OEMAKE = "NOOPT=true DESTDIR=${D} PREFIX=/usr STRIP=echo LINK_OPTS= INSTALL_PATH=${libdir}/lv2/" 

#CXXFLAGS += " -std=gnu++0x -O3 -ffast-math -fPIC -DPIC -Wall -I. -c "
#LDFLAGS += " -shared -Wl,-O1 -Wl,--as-needed -Wl,--no-undefined -Wl,--strip-all "

FILES_${PN} = "${libdir}/lv2/"

do_compile () {
	${CXX} ${CXXFLAGS} ${LDFLAGS} -I. -ffast-math -fPIC -shared -Wl,--no-undefined -lrt-wdf -o JTM45.o JTM45/src/JTM45.cpp
	#${CXX} ${LDFLAGS} -shared -Wl,--no-undefined -o JTM45.so JTM45.o
	#${CXX} ${LDFLAGS} -std=gnu++0x -O3 -ffast-math -fPIC -DPIC -Wall $(shell pkg-config --cflags rt-wdf) -I. -shared -Wl,-O1 -Wl,--as-needed -Wl,--no-undefined -Wl,--strip-all $(shell pkg-config --libs rt-wdf) -lrt-wdf -lm -o ToneStack.so ToneStack/src/ToneStack.cpp 
}

do_install () {
	install -d ${D}${libdir}/lv2/ToneStack.lv2
	install -d ${D}${libdir}/lv2/ToneStack.lv2/modgui
	install -m 0644 ToneStack/ttl/*.ttl ${D}${libdir}/lv2/ToneStack.lv2/
	cp -R ToneStack/ttl/modgui ${D}${libdir}/lv2/ToneStack.lv2/
	install -m 0755 ToneStack.so ${D}${libdir}/lv2/ToneStack.lv2/
	install -d ${D}${libdir}/lv2/JTM45.lv2
	install -m 0644 JTM45/ttl/*.ttl ${D}${libdir}/lv2/JTM45.lv2/
	install -m 0755 JTM45.so ${D}${libdir}/lv2/JTM45.lv2/
	cp -R JTM45/ttl/modgui ${D}${libdir}/lv2/JTM45.lv2/
}

