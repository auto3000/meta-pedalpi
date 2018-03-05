SUMMARY = "SDK to implement the MOD gui interface."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = " pystache python3-pillow python3-tornado olefile "
RDEPENDS_${PN} = " lilv "

SRCREV = "417e161a126721dfc71e5eaf37caad2b02ed45d9"
SRC_URI = "git://github.com/moddevices/mod-sdk.git \
	file://0001-build-disable-object-stripping.patch"

S = "${WORKDIR}/git"

FILES_${PN} = " ${bindir} ${datadir} "

inherit distutils3 

