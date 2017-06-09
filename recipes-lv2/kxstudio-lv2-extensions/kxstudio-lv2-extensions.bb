DESCRIPTION = "LV2 Extensions."
SRC_URI = "git://github.com/KXStudio/LV2-Extensions.git;protocol=git"
SRCREV = "c724d33aa66fa8c45310664e594945bd0c84137c"
LICENSE = "ISC" 

LIC_FILES_CHKSUM = "file://generate-lv2-html-docs.sh;md5=cdf73df76fff8a133301ad9f6b7a54f3"

S = "${WORKDIR}/git/"

FILES_${PN} = " /usr \
  /usr/lib/lv2 \
  /usr/lib/lv2/kx-meta \
  /usr/lib/lv2/kx-programs.lv2 \
  /usr/lib/lv2/kx-external-ui.lv2 \
  /usr/lib/lv2/kx-rtmempool.lv2 \
  /usr/lib/lv2/kx-meta/manifest.ttl \
  /usr/lib/lv2/kx-meta/meta.ttl \
  /usr/lib/lv2/kx-programs.lv2/programs.h \
  /usr/lib/lv2/kx-programs.lv2/manifest.ttl \
  /usr/lib/lv2/kx-programs.lv2/programs.doap.ttl \
  /usr/lib/lv2/kx-programs.lv2/programs.ttl \
  /usr/lib/lv2/kx-external-ui.lv2/manifest.ttl \
  /usr/lib/lv2/kx-external-ui.lv2/external-ui.ttl \
  /usr/lib/lv2/kx-external-ui.lv2/external-ui.h \
  /usr/lib/lv2/kx-external-ui.lv2/external-ui.doap.ttl \
  /usr/lib/lv2/kx-rtmempool.lv2/rtmempool.h \
  /usr/lib/lv2/kx-rtmempool.lv2/rtmempool.ttl \
  /usr/lib/lv2/kx-rtmempool.lv2/manifest.ttl \
  /usr/lib/lv2/kx-rtmempool.lv2/rtmempool.doap.ttl "

inherit allarch

do_compile() {
}

do_install() {
 install -d ${D}${libdir}/lv2/kx-external-ui.lv2
 install -d ${D}${libdir}/lv2/kx-meta
 install -d ${D}${libdir}/lv2/kx-programs.lv2
 install -d ${D}${libdir}/lv2/kx-rtmempool.lv2
 install -m 0644 ${S}/kx-external-ui.lv2/* ${D}/${libdir}/lv2/kx-external-ui.lv2/
 install -m 0644 ${S}/kx-meta/* ${D}/${libdir}/lv2/kx-meta/
 install -m 0644 ${S}/kx-programs.lv2/* ${D}/${libdir}/lv2/kx-programs.lv2/
 install -m 0644 ${S}/kx-rtmempool.lv2/* ${D}/${libdir}/lv2/kx-rtmempool.lv2/
}



