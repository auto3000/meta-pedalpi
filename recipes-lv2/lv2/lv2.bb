require lv2.inc

DESCRIPTION = "LV2 is a plugin standard for audio systems."

FILES_${PN} += "${datadir}/lv2specgen/*"

BBCLASSEXTEND = "native"

EXTRA_OECONF = " --no-plugins "
