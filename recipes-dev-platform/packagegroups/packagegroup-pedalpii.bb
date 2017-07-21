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
	jack-mod-pedalpii-initscripts-mod-ui \
	jack-mod-pedalpii-initscripts-pedalpii \
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
	stepseq-lv2 \
	modspectre-lv2 \
	fil4-lv2 \
	modmeter-lv2 \
	tinyamp-lv2 \
	midigen-lv2 \
	midifilter-lv2 \ 
	mtc-lv2 \
	tuna-lv2 \
	swh-lv2 \
	guitarix \
	mclk-lv2 \
	mod-distortion \
	gxslowgear \
	gxswitchlesswah \
	gxvfm \
	gxvoxtb \
	xfade-lv2 \
	fomp \
	dpf-plugins \
	kxstudio-lv2-extensions \
	invada-studio-plugins-lv2 \
	mod-lv2-data \
	lv2 \
	mda-lv2 \
	sooperlooper-lv2-plugin \
	mod-factory-user-data \
	openav-artyfx \
	shiro-plugins \
	tap-lv2 \
	pdlv2 \
	"

