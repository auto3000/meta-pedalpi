DESCRIPTION = "Convert HTML to PDF using Webkit (QtWebKit)."
SRC_URI = "git://github.com/wkhtmltopdf/wkhtmltopdf.git;protocol=http"
SRCREV = "4f1b79df10d91ec2cbd286c7b24b7604df30a8a4"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS = " qtbase qtwebkit qtsvg "
RDEPENDS_${PN} = " \
            packagegroup-fonts-truetype-core \
            fontconfig \
            "

S = "${WORKDIR}/git/"

inherit qmake5

INSANE_SKIP_${PN} = " useless-rpaths "

# Include the symlink in the package
FILES_${PN} += " /usr/lib/fonts "

# move output to /usr
do_install_append() {
	cd ${D}
	pwd
	X=$(ls)
	echo $X
	mkdir usr
	mv $X usr/

	# Fix path problem related to QT5 and fontconfig
	ln -sf /usr/share/fonts ${D}/usr/lib/fonts
}
