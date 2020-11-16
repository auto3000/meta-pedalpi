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
	jack-server \
	mod-utilities \
	lv2bm \
	serd \
	sord \
	sratom \
	lsof \
	mod-ui \
	mod-host \
	sndfile-tools \
	rakarrack-lv2 \
	caps-lv2 \
	balance-lv2 \
	controlfilter-lv2 \
	fat1-lv2 \
	stepseq-lv2 \
	modspectre-lv2 \
	fil4-lv2 \
	modmeter-lv2 \
	tinyamp-lv2 \
	midigen-lv2 \
	midifilter-lv2 \ 
	mtc-lv2 \
	vocproc \
	infamousplugins \
	onsettrigger-lv2 \
	stereoroute-lv2 \
	tuna-lv2 \
	swh-lv2 \
	guitarix \
	mclk-lv2 \
	mod-distortion \
	mod-pitchshifter \
	gxswitchlesswah \
	gxplugins.lv2 \
	gxvoxtb \
	xfade-lv2 \
	fomp \
	amsynth-lv2 \
	dpf-plugins \
	kxstudio-lv2-extensions \
	invada-studio-plugins-lv2 \
	calf-studio-gear \
	mod-lv2-data \
	modgui \
	convo-lv2 \
	lv2 \
	lv2-plugins \
	mda-lv2 \
	sooperlooper-lv2-plugin \
	mod-factory-user-data \
	openav-artyfx \
	shiro-plugins \
	tap-lv2 \
	pdlv2 \
	fluidplug \
	setbfree \
	ams-lv2 \
	bolliedelay-lv2 \
	bolliedelayxt-lv2 \
	beatslash-lv2 \
	deteriorate-lv2 \
	fontconfig \
	liberation-fonts \
	freaked \
	"

PREFERRED_RPROVIDER_amsynth-lv2-ttl-files = "modgui"

