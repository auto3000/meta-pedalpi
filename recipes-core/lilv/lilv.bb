DESCRIPTION = "Lilv LV2 host library."
SRC_URI = "git://git.drobilla.net/lilv.git;protocol=http"
SRCREV = "23293be2f10fd64ff85eddb50b6aa381694fa3a3"
LICENSE = "MIT" 

DEPENDS = "serd sord sratom"

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://COPYING;md5=9f6de02da791b5def4aa51ea92a6fc94"

FILES_${PN} = "  /usr/etc \
  /usr/etc/bash_completion.d \
  /usr/etc/bash_completion.d/lilv \
  /usr/bin/lilv-bench \
  /usr/bin/lv2ls \
  /usr/bin/lv2info \
  /usr/bin/lv2bench \
  /usr/lib/liblilv-0.so.0 \
  /usr/lib/liblilv-0.so.0.22.1 "

inherit waf

