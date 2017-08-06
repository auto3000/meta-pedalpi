SUMMARY = "turns pure data patches into lv2 plugins."
SECTION = "multimedia"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE-isc;md5=4361d033b4c93ba5f5e283c91bc993c9"

DEPENDS = "lv2 xz-native libxml2-native libxslt-native pkgconfig-native ruby-native bundler-native"

SRCREV = "f8b8de956f649e481424b28cec9ca78174b21631"
SRC_URI = "gitsm://github.com/moddevices/pdlv2.git \
	file://0001-ssl-change-https-to-http-in-Gemfile-to-remove-SSL-co.patch \
	file://0001-build-LDFLAGS-and-CFLAGS-inherits-from-the-calling-c.patch \
	file://0001-build-clean-LDFLAGS-variable.patch"

S = "${WORKDIR}/git"

FILES_${PN} = " ${libdir}/lv2 "

EXTRA_OEMAKE = " INSTALL_DIR=${D}${libdir}/lv2 LV2_INCLUDE_DIR=${STAGING_INCDIR}/lv2 INSTALL_DIR=${D}${libdir}/lv2 LIBPD_FLAGS="install prefix=${S}" "

do_configure_prepend() {
	CC=${BUILD_CC} CXX=${BUILD_CXX} gem install linkeddata --no-ri --no-rdoc --source http://rubygems.org/ -- --use-system-libraries     --enable-cross-build \
		--with-xml2-lib=${STAGING_DIR_NATIVE}/usr/lib \
		--with-xml2-include=${STAGING_DIR_NATIVE}/usr/include/libxml2 \
		--with-xml2-dir=${STAGING_DIR_NATIVE}/usr \
		--with-xslt-lib=${STAGING_DIR_NATIVE}/usr/lib \
		--with-xslt-include=${STAGING_DIR_NATIVE}/usr/include/libxslt \
		--with-xslt-dir=${STAGING_DIR_NATIVE}/usr \
		--with-zlib-lib=${STAGING_DIR_NATIVE}/usr/lib \
		--with-zlib-include=${STAGING_DIR_NATIVE}/usr/include \
		--with-zlib-dir=${STAGING_DIR_NATIVE}/usr \
		--with-opt-lib=${STAGING_DIR_NATIVE}/usr/lib \
		--with-opt-include=${STAGING_DIR_NATIVE}/usr/include \
		--with-opt-dir=${STAGING_DIR_NATIVE}/usr
	gem install rdf --no-ri --no-rdoc --source http://rubygems.org/
}

do_install() {
	oe_runmake install
}
