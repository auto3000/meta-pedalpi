SUMMARY = "Collection of LADSPA/LV2/VST/JACK audio plugins for high-quality processing"
HOMEPAGE = "http://www.zamaudio.com/?p=976"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += " \
    liblo \
    jack \
    rubberband \
    libsamplerate0 \
    libsndfile1 \
    fftw \
"

inherit pkgconfig lv2-turtle-helper pack_audio_plugins

REQUIRED_DISTRO_FEATURES = "x11"

SRC_URI = "gitsm://github.com/zamaudio/${BPN}.git"
SRCREV = "e7077fcc0b7f60daa7471eae42015ffc9cba73d9"
S = "${WORKDIR}/git"
PV = "3.14"

EXTRA_OEMAKE += " \
    SKIP_STRIPPING=true \
    NOOPT=true \
    SKIP_STRIPPING=true \
    HAVE_GL=false \
    UNIX=false \
    HAVE_DGL=false \
    HAVE_JACK=false \
"

do_install() {
    ${MAKE} DESTDIR=${D} PREFIX= LIBDIR=${libdir} BINDIR=${bindir} install
    rm -R ${D}${bindir}
    rm -R ${D}${libdir}/vst
    rm -R ${D}${libdir}/ladspa
}

