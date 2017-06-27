SUMMARY = "turns pure data patches into lv2 plugins."
SECTION = "multimedia"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE-isc;md5=4361d033b4c93ba5f5e283c91bc993c9"

DEPENDS = "lv2 ruby-native bundler-native"

SRCREV = "f8b8de956f649e481424b28cec9ca78174b21631"
SRC_URI = "gitsm://github.com/moddevices/pdlv2.git \
	file://0001-ssl-change-https-to-http-in-Gemfile-to-remove-SSL-co.patch"

S = "${WORKDIR}/git"

FILES_${PN} = " ${libdir}/lv2 "

EXTRA_OEMAKE = " INSTALL_DIR=${D}${libdir}/lv2 LV2_INCLUDE_DIR=${STAGING_INCDIR}/lv2 INSTALL_DIR=${D}${libdir}/lv2 LIBPD_FLAGS="install prefix=${STAGING_DIR_HOST}/usr" "

do_configure_prepend() {
	bundle config build.nokogiri --use-system-libraries
	bundle install
}

do_install() {
	oe_runmake install
}
