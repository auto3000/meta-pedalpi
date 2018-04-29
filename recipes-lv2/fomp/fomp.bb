DESCRIPTION = "LV2 port of the MCP, VCO, FIL, and WAH plugins by Fons Adriaensen."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

SRC_URI = "git://git.drobilla.net/fomp.lv2.git;protocol=http \
	 file://0001-lv2-update-TTL-and-modgui-resources.patch \
	 file://0001-lv2-update-TTL-and-modgui-resources.tgz \
	 "
SRCREV = "82b9f14974124c7c016af96ac12e08c703286769"

S = "${WORKDIR}/git/"


inherit waf

FILES_${PN} += "${libdir}/lv2/fomp.lv2/*"

