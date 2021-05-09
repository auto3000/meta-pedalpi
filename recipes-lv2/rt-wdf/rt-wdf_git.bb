SUMMARY = "Real Time Wave Digital Filter Library"
HOMEPAGE = "https://github.com/RT-WDF/rt-wdf_lib"
SECTION = "multimedia"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/RT-WDF/rt-wdf_lib;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "4d250f1fc1ad4adaf09d82ce353443174ce2ddd7"

S = "${WORKDIR}/git"

inherit pkgconfig

DEPENDS += "armadillo"
#EXTRA_OEMAKE = "DESTDIR=${D} PREFIX=/usr STRIP=echo LINK_OPTS= INSTALL_PATH=${libdir}/lv2/"
# $(CXX) -o $(JUCE_OUTDIR)/$(TARGET) $(OBJECTS) $(JUCE_LDFLAGS) $(RESOURCES) $(TARGET_ARCH)

do_configure () {
}

do_compile () {
	${CXX} ${LDFLAGS} ${CXXFLAGS}  -I. -ffast-math -fPIC -shared -o rt-wdf.so ./Libs/rt-wdf/rt-wdf.cpp 
}

do_install () {
	install -d ${D}${libdir}/rt-wdf/
	install -m 0755 rt-wdf.so ${D}${libdir}/rt-wdf/rt-wdf.so
	install -d ${D}${includedir}/rt-wdf/
	install -m 0755 ./Libs/rt-wdf/*.h ${D}${includedir}/
}

FILES_${PN} = "${libdir} ${includedir}"
