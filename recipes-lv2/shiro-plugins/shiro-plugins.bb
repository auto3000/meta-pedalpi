SUMMARY = "Collection of SHIRO Plugins for the MOD Duo made in MAX Gen~."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

DEPENDS = "lv2"

SRCREV = "60a678ca6abdb7fa10b0ac8dd87e0e41052abe78"
SRC_URI = "gitsm://github.com/ninodewit/SHIRO-Plugins.git \
	file://0001-build-disable-optimization-flags.patch \
	file://0002-prebuilt-add-.ttl-files-from-prebuilts.patch"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/lib"

EXTRA_OEMAKE = "NO_CUSTOM_OPTS=true DESTDIR=${D}"

do_install() {
	oe_runmake install DESTDIR=${D} PREFIX=/usr 
}
