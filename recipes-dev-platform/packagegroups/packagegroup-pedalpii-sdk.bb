DESCRIPTION = "PedalPII SDK package group"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302" 

inherit packagegroup

PACKAGES = "\
    packagegroup-pedalpii-sdk \
    "

RDEPENDS_${PN} += "\
	jack-mod-pedalpii-initscripts-mod-sdk \
	mod-sdk \
	"

