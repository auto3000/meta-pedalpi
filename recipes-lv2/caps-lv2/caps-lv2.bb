SUMMARY = "LV2 port for the CAPS Audio Plugin Suit."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "lv2"

SRCREV = "072e2feb5c09d0fb51300e688b7e4f32b75e9c89"
SRC_URI = "git://github.com/moddevices/caps-lv2 \
           file://0001-plugins-update-TTL-and-modgui-resources.patch \
           file://0001-plugins-update-TTL-and-modgui-resources.tgz \
           "

S = "${WORKDIR}/git"

FILES_${PN} = "${libdir}/lv2/"


do_compile() {
	# Generate compilation rules with output of:
	# $ bitbake -c devshell caps-lv2
	# grep SOURCES\ = plugins/*/Makefile |tr '/' ' ' | tr '-' ' ' | sed 's/\.lv2//' | awk '{ print "\t${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o", $4 ".so " $9 " dsp/polynomials.cc plugins/mod-caps-" $4 ".lv2/interface.cc" }' | sed 's/Amp\.cc/Amp.cc ToneStack.cc/'
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o AmpVTS.so Amp.cc ToneStack.cc dsp/polynomials.cc plugins/mod-caps-AmpVTS.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o AutoFilter.so AutoFilter.cc dsp/polynomials.cc plugins/mod-caps-AutoFilter.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o CabinetIII.so CabIII.cc dsp/polynomials.cc plugins/mod-caps-CabinetIII.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o CabinetIV.so CabIV.cc dsp/polynomials.cc plugins/mod-caps-CabinetIV.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o CEO.so Click.cc dsp/polynomials.cc plugins/mod-caps-CEO.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o ChorusI.so Chorus.cc dsp/polynomials.cc plugins/mod-caps-ChorusI.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Click.so Click.cc dsp/polynomials.cc plugins/mod-caps-Click.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Compress.so Compress.cc dsp/polynomials.cc plugins/mod-caps-Compress.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o CompressX2.so Compress.cc dsp/polynomials.cc plugins/mod-caps-CompressX2.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Eq10.so Eq.cc dsp/polynomials.cc plugins/mod-caps-Eq10.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Eq10X2.so Eq.cc dsp/polynomials.cc plugins/mod-caps-Eq10X2.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Eq4p.so Eq.cc dsp/polynomials.cc plugins/mod-caps-Eq4p.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o EqFA4p.so Eq.cc dsp/polynomials.cc plugins/mod-caps-EqFA4p.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Fractal.so Fractals.cc dsp/polynomials.cc plugins/mod-caps-Fractal.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Narrower.so Pan.cc dsp/polynomials.cc plugins/mod-caps-Narrower.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Noisegate.so Noisegate.cc dsp/polynomials.cc plugins/mod-caps-Noisegate.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o PhaserII.so Phaser.cc dsp/polynomials.cc plugins/mod-caps-PhaserII.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Plate.so Reverb.cc dsp/polynomials.cc plugins/mod-caps-Plate.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o PlateX2.so Reverb.cc dsp/polynomials.cc plugins/mod-caps-PlateX2.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Saturate.so Saturate.cc dsp/polynomials.cc plugins/mod-caps-Saturate.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Scape.so Scape.cc dsp/polynomials.cc plugins/mod-caps-Scape.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Sin.so Sin.cc dsp/polynomials.cc plugins/mod-caps-Sin.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Spice.so Saturate.cc dsp/polynomials.cc plugins/mod-caps-Spice.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o SpiceX2.so Saturate.cc dsp/polynomials.cc plugins/mod-caps-SpiceX2.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o ToneStack.so ToneStack.cc dsp/polynomials.cc plugins/mod-caps-ToneStack.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o White.so White.cc dsp/polynomials.cc plugins/mod-caps-White.lv2/interface.cc
	${CXX} ${LDFLAGS} ${CXXFLAGS} -I. -Iwaves -Idsp -fPIC -DPIC -shared -Wl,--no-undefined -o Wider.so Pan.cc dsp/polynomials.cc plugins/mod-caps-Wider.lv2/interface.cc
}

do_install() {
	# Generate compilation rules with output of:
	# $ bitbake -c devshell caps-lv2
	# grep SOURCES\ = plugins/*/Makefile |tr '/' ' ' | tr '-' ' ' | sed 's/\.lv2//' | awk '{ print "\tinstall -d ${D}${libdir}/lv2/mod-caps-" $4 ".lv2"; print "\tinstall -m 0644 plugins/mod-caps-" $4 ".lv2/*.ttl ${D}${libdir}/lv2/mod-caps-" $4 ".lv2/"; ; print "\tinstall -m 0755 " $4 ".so ${D}${libdir}/lv2/mod-caps-" $4 ".lv2/"; print "\tcp -R plugins/mod-caps-" $4 ".lv2/modgui ${D}${libdir}/lv2/mod-caps-" $4 ".lv2/" }
	install -d ${D}${libdir}/lv2/mod-caps-AmpVTS.lv2
	install -m 0644 plugins/mod-caps-AmpVTS.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-AmpVTS.lv2/
	install -m 0755 AmpVTS.so ${D}${libdir}/lv2/mod-caps-AmpVTS.lv2/
	cp -R plugins/mod-caps-AmpVTS.lv2/modgui ${D}${libdir}/lv2/mod-caps-AmpVTS.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-AutoFilter.lv2
	install -m 0644 plugins/mod-caps-AutoFilter.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-AutoFilter.lv2/
	install -m 0755 AutoFilter.so ${D}${libdir}/lv2/mod-caps-AutoFilter.lv2/
	cp -R plugins/mod-caps-AutoFilter.lv2/modgui ${D}${libdir}/lv2/mod-caps-AutoFilter.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-CabinetIII.lv2
	install -m 0644 plugins/mod-caps-CabinetIII.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-CabinetIII.lv2/
	install -m 0755 CabinetIII.so ${D}${libdir}/lv2/mod-caps-CabinetIII.lv2/
	cp -R plugins/mod-caps-CabinetIII.lv2/modgui ${D}${libdir}/lv2/mod-caps-CabinetIII.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-CabinetIV.lv2
	install -m 0644 plugins/mod-caps-CabinetIV.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-CabinetIV.lv2/
	install -m 0755 CabinetIV.so ${D}${libdir}/lv2/mod-caps-CabinetIV.lv2/
	cp -R plugins/mod-caps-CabinetIV.lv2/modgui ${D}${libdir}/lv2/mod-caps-CabinetIV.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-CEO.lv2
	install -m 0644 plugins/mod-caps-CEO.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-CEO.lv2/
	install -m 0755 CEO.so ${D}${libdir}/lv2/mod-caps-CEO.lv2/
	cp -R plugins/mod-caps-CEO.lv2/modgui ${D}${libdir}/lv2/mod-caps-CEO.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-ChorusI.lv2
	install -m 0644 plugins/mod-caps-ChorusI.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-ChorusI.lv2/
	install -m 0755 ChorusI.so ${D}${libdir}/lv2/mod-caps-ChorusI.lv2/
	cp -R plugins/mod-caps-ChorusI.lv2/modgui ${D}${libdir}/lv2/mod-caps-ChorusI.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Click.lv2
	install -m 0644 plugins/mod-caps-Click.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Click.lv2/
	install -m 0755 Click.so ${D}${libdir}/lv2/mod-caps-Click.lv2/
	cp -R plugins/mod-caps-Click.lv2/modgui ${D}${libdir}/lv2/mod-caps-Click.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Compress.lv2
	install -m 0644 plugins/mod-caps-Compress.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Compress.lv2/
	install -m 0755 Compress.so ${D}${libdir}/lv2/mod-caps-Compress.lv2/
	cp -R plugins/mod-caps-Compress.lv2/modgui ${D}${libdir}/lv2/mod-caps-Compress.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-CompressX2.lv2
	install -m 0644 plugins/mod-caps-CompressX2.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-CompressX2.lv2/
	install -m 0755 CompressX2.so ${D}${libdir}/lv2/mod-caps-CompressX2.lv2/
	cp -R plugins/mod-caps-CompressX2.lv2/modgui ${D}${libdir}/lv2/mod-caps-CompressX2.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Eq10.lv2
	install -m 0644 plugins/mod-caps-Eq10.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Eq10.lv2/
	install -m 0755 Eq10.so ${D}${libdir}/lv2/mod-caps-Eq10.lv2/
	cp -R plugins/mod-caps-Eq10.lv2/modgui ${D}${libdir}/lv2/mod-caps-Eq10.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Eq10X2.lv2
	install -m 0644 plugins/mod-caps-Eq10X2.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Eq10X2.lv2/
	install -m 0755 Eq10X2.so ${D}${libdir}/lv2/mod-caps-Eq10X2.lv2/
	cp -R plugins/mod-caps-Eq10X2.lv2/modgui ${D}${libdir}/lv2/mod-caps-Eq10X2.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Eq4p.lv2
	install -m 0644 plugins/mod-caps-Eq4p.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Eq4p.lv2/
	install -m 0755 Eq4p.so ${D}${libdir}/lv2/mod-caps-Eq4p.lv2/
	cp -R plugins/mod-caps-Eq4p.lv2/modgui ${D}${libdir}/lv2/mod-caps-Eq4p.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-EqFA4p.lv2
	install -m 0644 plugins/mod-caps-EqFA4p.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-EqFA4p.lv2/
	install -m 0755 EqFA4p.so ${D}${libdir}/lv2/mod-caps-EqFA4p.lv2/
	cp -R plugins/mod-caps-EqFA4p.lv2/modgui ${D}${libdir}/lv2/mod-caps-EqFA4p.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Fractal.lv2
	install -m 0644 plugins/mod-caps-Fractal.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Fractal.lv2/
	install -m 0755 Fractal.so ${D}${libdir}/lv2/mod-caps-Fractal.lv2/
	cp -R plugins/mod-caps-Fractal.lv2/modgui ${D}${libdir}/lv2/mod-caps-Fractal.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Narrower.lv2
	install -m 0644 plugins/mod-caps-Narrower.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Narrower.lv2/
	install -m 0755 Narrower.so ${D}${libdir}/lv2/mod-caps-Narrower.lv2/
	cp -R plugins/mod-caps-Narrower.lv2/modgui ${D}${libdir}/lv2/mod-caps-Narrower.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Noisegate.lv2
	install -m 0644 plugins/mod-caps-Noisegate.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Noisegate.lv2/
	install -m 0755 Noisegate.so ${D}${libdir}/lv2/mod-caps-Noisegate.lv2/
	cp -R plugins/mod-caps-Noisegate.lv2/modgui ${D}${libdir}/lv2/mod-caps-Noisegate.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-PhaserII.lv2
	install -m 0644 plugins/mod-caps-PhaserII.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-PhaserII.lv2/
	install -m 0755 PhaserII.so ${D}${libdir}/lv2/mod-caps-PhaserII.lv2/
	cp -R plugins/mod-caps-PhaserII.lv2/modgui ${D}${libdir}/lv2/mod-caps-PhaserII.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Plate.lv2
	install -m 0644 plugins/mod-caps-Plate.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Plate.lv2/
	install -m 0755 Plate.so ${D}${libdir}/lv2/mod-caps-Plate.lv2/
	cp -R plugins/mod-caps-Plate.lv2/modgui ${D}${libdir}/lv2/mod-caps-Plate.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-PlateX2.lv2
	install -m 0644 plugins/mod-caps-PlateX2.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-PlateX2.lv2/
	install -m 0755 PlateX2.so ${D}${libdir}/lv2/mod-caps-PlateX2.lv2/
	cp -R plugins/mod-caps-PlateX2.lv2/modgui ${D}${libdir}/lv2/mod-caps-PlateX2.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Saturate.lv2
	install -m 0644 plugins/mod-caps-Saturate.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Saturate.lv2/
	install -m 0755 Saturate.so ${D}${libdir}/lv2/mod-caps-Saturate.lv2/
	cp -R plugins/mod-caps-Saturate.lv2/modgui ${D}${libdir}/lv2/mod-caps-Saturate.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Scape.lv2
	install -m 0644 plugins/mod-caps-Scape.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Scape.lv2/
	install -m 0755 Scape.so ${D}${libdir}/lv2/mod-caps-Scape.lv2/
	cp -R plugins/mod-caps-Scape.lv2/modgui ${D}${libdir}/lv2/mod-caps-Scape.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Sin.lv2
	install -m 0644 plugins/mod-caps-Sin.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Sin.lv2/
	install -m 0755 Sin.so ${D}${libdir}/lv2/mod-caps-Sin.lv2/
	cp -R plugins/mod-caps-Sin.lv2/modgui ${D}${libdir}/lv2/mod-caps-Sin.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Spice.lv2
	install -m 0644 plugins/mod-caps-Spice.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Spice.lv2/
	install -m 0755 Spice.so ${D}${libdir}/lv2/mod-caps-Spice.lv2/
	cp -R plugins/mod-caps-Spice.lv2/modgui ${D}${libdir}/lv2/mod-caps-Spice.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-SpiceX2.lv2
	install -m 0644 plugins/mod-caps-SpiceX2.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-SpiceX2.lv2/
	install -m 0755 SpiceX2.so ${D}${libdir}/lv2/mod-caps-SpiceX2.lv2/
	cp -R plugins/mod-caps-SpiceX2.lv2/modgui ${D}${libdir}/lv2/mod-caps-SpiceX2.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-ToneStack.lv2
	install -m 0644 plugins/mod-caps-ToneStack.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-ToneStack.lv2/
	install -m 0755 ToneStack.so ${D}${libdir}/lv2/mod-caps-ToneStack.lv2/
	cp -R plugins/mod-caps-ToneStack.lv2/modgui ${D}${libdir}/lv2/mod-caps-ToneStack.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-White.lv2
	install -m 0644 plugins/mod-caps-White.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-White.lv2/
	install -m 0755 White.so ${D}${libdir}/lv2/mod-caps-White.lv2/
	cp -R plugins/mod-caps-White.lv2/modgui ${D}${libdir}/lv2/mod-caps-White.lv2/
	install -d ${D}${libdir}/lv2/mod-caps-Wider.lv2
	install -m 0644 plugins/mod-caps-Wider.lv2/*.ttl ${D}${libdir}/lv2/mod-caps-Wider.lv2/
	install -m 0755 Wider.so ${D}${libdir}/lv2/mod-caps-Wider.lv2/
	cp -R plugins/mod-caps-Wider.lv2/modgui ${D}${libdir}/lv2/mod-caps-Wider.lv2/
}

