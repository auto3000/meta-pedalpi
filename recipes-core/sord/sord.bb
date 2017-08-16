DESCRIPTION = "Sord RDF data structure."
LICENSE = "MIT"
SRC_URI = "git://git.drobilla.net/sord.git;protocol=http"
SRCREV = "24ab5bbeb0dece32887d2702d786b76a877d0f59"

DEPENDS = "serd libpcre"

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://COPYING;md5=6b8d060e6d32fbd53684f9dc0443b6a3"

inherit waf pkgconfig

