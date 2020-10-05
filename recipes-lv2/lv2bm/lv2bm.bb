DESCRIPTION = "lv2bm is a benchmark tool for LV2 plugins."
HOMEPAGE = "https://github.com/moddevices/lv2bm"
SECTION = "multimedia"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRCREV = "f728ad2f58ef638b1d662227a270f6841823f4d5"
SRC_URI = "git://github.com/moddevices/lv2bm \
           file://0001-Makefile-rewrite-build-options-for-external-invocati.patch \
           "

DEPENDS = " lilv libsndfile1 glib-2.0 pkgconfig "

S = "${WORKDIR}/git"

EXTRA_OEMAKE = " PREFIX=${D}/${prefix}  "

do_install() {
        oe_runmake install ${EXTRA_OEMAKE}
}

inherit pkgconfig
