DESCRIPTION = "Serd RDF serialisation library."
SRC_URI = "git://git.drobilla.net/serd.git;protocol=http"
SRCREV = "221549c2580bb72ceb91cfff70e7295f65ce46bf"
LICENSE = "MIT" 

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://COPYING;md5=7aceb3a3edc99517b08f5cdd557e11fb"

inherit waf pkgconfig

