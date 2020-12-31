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

# Workaround on ARM 32bits, ZamHeadX2 and ZamVerb are failing due to improper lpthread linking
PLUGINS ?= "ZamAutoSat ZaMaximX2 ZamComp ZamCompX2 ZamDelay ZamEQ2 ZamGate ZamGateX2 ZamGEQ31 ZamTube ZaMultiComp ZaMultiCompX2"
PLUGINS_armv7ve = "ZamAutoSat ZaMaximX2 ZamComp ZamCompX2 ZamDelay ZamEQ2 ZamGate ZamGateX2 ZamGEQ31 ZamTube ZaMultiComp ZaMultiCompX2"
PLUGINS_armv7a = "ZamAutoSat ZaMaximX2 ZamComp ZamCompX2 ZamDelay ZamEQ2 ZamGate ZamGateX2 ZamGEQ31 ZamTube ZaMultiComp ZaMultiCompX2"


EXTRA_OEMAKE += " \
    VERBOSE=true \
    PLUGINS="${PLUGINS}" \
    BUILD_C_FLAGS="-fPIC ${CFLAGS} -I. " \
    BUILD_CXX_FLAGS=" -fPIC ${CXXFLAGS} -I. -I../../dpf/distrho -I../../dpf/dgl -I../../distrho -I../../dgl" \
    LINK_FLAGS="-fPIC ${LDFLAGS} " \
    SKIP_STRIPPING=true \
    NOOPT=true \
    SKIP_STRIPPING=true \
    HAVE_GL=false \
    UNIX=false \
    HAVE_DGL=false \
    HAVE_JACK=false \
"

do_install() {
    touch bin/empty-ladspa.so
    touch bin/empty-vst.so
    ${MAKE} DESTDIR=${D} PREFIX= LIBDIR=${libdir} BINDIR=${bindir} install ${EXTRA_OEMAKE}
    rm -R ${D}${bindir}
    rm -R ${D}${libdir}/vst
    rm -R ${D}${libdir}/ladspa

    # MODGUI patching
    for i in ${PLUGINS} ; do
        sed -i 's#_dsp.ttl> .#_dsp.ttl> , <modgui.ttl> .#' ${D}${libdir}/lv2/${i}.lv2/manifest.ttl
    done
}

