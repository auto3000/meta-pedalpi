require lv2.inc

DESCRIPTION = "Plugins from the LV2 standard package."

FILES_${PN} += "${libdir}/lv2"

do_install_append() {
	# Remove files already provided by lv2.bb recipe
	rm -R ${D}${datadir}
	rm -R ${D}${bindir}
	rm -R ${D}/usr/include
	rm -R ${D}${libdir}/pkgconfig
	for i in atom.lv2 buf-size.lv2 data-access.lv2 dynmanifest.lv2 event.lv2 instance-access.lv2 log.lv2 lv2core.lv2 midi.lv2 morph.lv2 options.lv2 parameters.lv2 patch.lv2 port-groups.lv2 port-props.lv2  presets.lv2 resize-port.lv2 schemas.lv2 state.lv2 time.lv2 ui.lv2 units.lv2 urid.lv2 uri-map.lv2 worker.lv2
	do
		rm -R ${D}${libdir}/lv2/$i
	done
}

