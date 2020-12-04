# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   Black_Pearl_5.lv2/License.pdf
#   AVL_Drumkits_Perc.lv2/License.pdf
#   Red_Zeppelin_4.lv2/License.pdf
#   Black_Pearl_4B.lv2/License.pdf
#   Black_Pearl_4A.lv2/License.pdf
#   Red_Zeppelin_5.lv2/License.pdf
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://Black_Pearl_5.lv2/License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43 \
                    file://AVL_Drumkits_Perc.lv2/License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43 \
                    file://Red_Zeppelin_4.lv2/License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43 \
                    file://Black_Pearl_4B.lv2/License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43 \
                    file://Black_Pearl_4A.lv2/License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43 \
                    file://Red_Zeppelin_5.lv2/License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43"

SRC_URI = "git://github.com/falkTX/FluidPlug;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "8457f1036c5f7d4437febe2a4ea4f0ad263e0f88"

S = "${WORKDIR}/git"

FILES_${PN} = "${libdir}/lv2"
FILES_${PN}-blakpearl-license = "${libdir}/lv2/Black_Pearl_5.lv2/License.pdf"
FILES_${PN}-avl-drumkits-license = "${libdir}/lv2/AVL_Drumkits_Perc.lv2/License.pdf"
FILES_${PN}-black-pearl4b-license = "${libdir}/lv2/Black_Pearl_4B.lv2/License.pdf"
FILES_${PN}-black-pearl4a-license = "${libdir}/lv2/Black_Pearl_4A.lv2/License.pdf"
FILES_${PN}-red-zeppelin-5-license = "${libdir}/lv2/Red_Zeppelin_5.lv2/License.pdf"

inherit pkgconfig

DEPENDS = "lv2 fluidsynth p7zip-native"

do_configure () {
}

do_compile () {
	export GUI_LDFLAGS="${LDFLAGS}" 
	oe_runmake BASE_OPTS="-O2 -ffast-math -fdata-sections -ffunction-sections" STRIP=echo
}

#do_install () {
#	oe_runmake install
#}

