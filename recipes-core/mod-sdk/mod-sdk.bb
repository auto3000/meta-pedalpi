SUMMARY = "SDK to implement the MOD gui interface."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = " pystache python3-pillow python3-tornado olefile "
RDEPENDS_${PN} = " lilv wkhtmltopdf tar imagemagick "

SRCREV = "417e161a126721dfc71e5eaf37caad2b02ed45d9"
SRC_URI = "git://github.com/moddevices/mod-sdk.git \
           file://0001-build-disable-object-stripping.patch \
           file://0002-lilvlib-update-to-new-lilv.py-API.patch \
           file://0003-settings-make-default-http-localhost-80-instead-of-8.patch \
           file://0004-fixup-lilvlib-update-to-new-lilv.py-API.patch \
           file://0005-webserver-wkhtmltoimage-to-generate-pedal-thumbnail-.patch \
           file://0006-webserver-enable-logs-to-http-application.patch \
           file://0007-webserver-replace-Tornado.process-Popen-to-Subproces.patch \
           "

S = "${WORKDIR}/git"

FILES_${PN} = " ${bindir} ${datadir} "

inherit distutils3 

do_install_append() {
	install -d ${D}${datadir}/mod-sdk
	cp -R html ${D}${datadir}/mod-sdk/
}
