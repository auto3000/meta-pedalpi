SUMMARY = "A set of extra lv2 plugins from the guitarix project"
HOMEPAGE = "https://github.com/brummer10/GxPlugins.lv2"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "gitsm://github.com/brummer10/GxPlugins.lv2.git"
SRCREV = "265415bd40df93532060825a27d954a34ec6cc9f"
S = "${WORKDIR}/git"
PV = "0.8-265415"

inherit pkgconfig

DEPENDS += " \
    lv2 \
"

do_compile() {
    export GUI_LDFLAGS="${LDFLAGS}"
    oe_runmake SSE_CFLAGS= STRIP=echo mod
}

do_install() {
    oe_runmake DESTDIR=${D} PREFIX=${prefix} INSTALL_DIR=${libdir}/lv2 install
}


FILES_${PN} += "${libdir}/lv2"
