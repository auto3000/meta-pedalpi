DESCRIPTION = "Lilv LV2 host library."
SRC_URI = "git://git.drobilla.net/lilv.git;protocol=http"
SRCREV = "a208ffd4776ebc9072bfca2603d6931e24917ccf"
LICENSE = "MIT" 

DEPENDS = "serd sord sratom libsndfile1"

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://COPYING;md5=7aceb3a3edc99517b08f5cdd557e11fb"

FILES_${PN} = "  /usr/etc \
  /usr/etc/bash_completion.d \
  /usr/etc/bash_completion.d/lilv \
  /usr/bin/lilv-bench \
  ${bindir} \
  ${libdir} "

inherit waf pkgconfig

