SUMMARY = "turns pure data patches into lv2 plugins."
SECTION = "multimedia"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE-isc;md5=4361d033b4c93ba5f5e283c91bc993c9"

DEPENDS = "lv2 ruby-native bundler"

SRCREV = "f8b8de956f649e481424b28cec9ca78174b21631"
SRC_URI = "gitsm://github.com/moddevices/pdlv2.git"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "INSTALL_DIR=${D}/${libdir}"

