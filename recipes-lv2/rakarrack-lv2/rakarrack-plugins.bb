DESCRIPTION = "Rakarrack LV2 Plugins modgui stylesheets and icons"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/moddevices/mod-lv2-data;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "499b98e5520e970dc06bf683851d11f9c2360e05"

S = "${WORKDIR}/git"

FILES_${PN} =  "${libdir}/lv2/"

do_configure () {
}

do_compile () {
}

do_install () {
	install -d ${D}${libdir}/lv2/rkr.lv2/
	install -d ${D}${libdir}/lv2/rkr.lv2/modgui/
	cp -R ${S}/plugins-fixed/rkr.lv2/modgui ${S}/plugins-fixed/rkr.lv2/modguis.ttl ${S}/plugins-fixed/rkr.lv2/manifest.ttl ${D}/${libdir}/lv2/rkr.lv2/
}

