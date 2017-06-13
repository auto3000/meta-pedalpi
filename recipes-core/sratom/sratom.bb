DESCRIPTION = "Sratom LV2 atom serialisation library."
SRC_URI = "git://git.drobilla.net/sratom.git;protocol=http"
SRCREV = "cc233a05de0690001ee2d067531bcc06248b751b"
LICENSE = "MIT" 

DEPENDS = "serd sord"

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://COPYING;md5=394d0c1b7157c45525c00dbf16afbe51"

inherit waf

