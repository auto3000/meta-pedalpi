DESCRIPTION = "PedalPII package group"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302" 

inherit packagegroup

PACKAGES = "\
    packagegroup-pedalpii \
    "

RDEPENDS_${PN} += "\
	jack-mod-pedalpii-initscripts-jackd \
	jack-mod-pedalpii-initscripts-mod-host \
	pedalpii \
	jack-server \
	mod-lilvlib  \
	mod-sdk \
	mod-utilities \
	serd \
	sord \
	sratom \
	mod-ui \
	mod-host \
	caps-lv2 \
	fat1-lv2 \
	guitarix \
	gxslowgear \
	gxswitchlesswah \
	gxvfm \
	gxvoxtb \
	kxstudio-lv2-extensions \
	lv2 \
	mda-lv2 \
	mod-factory-user-data \
	openav-artyfx \
	shiro-plugins \
	tap-lv2 \
	"
