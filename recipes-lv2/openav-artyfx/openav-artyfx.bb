DESCRIPTION = "ArtyFX OpenAV Productions."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4cc91856b08b094b4f406a29dc61db21"

SRC_URI = "git://github.com/falkTX/openAV-ArtyFX.git \
	file://0001-build-remove-msse-non-portable-flags.patch \
	file://0002-build-install-modgui-subdir.patch \ 
	"
SRCREV = "da6fc7e718b90d15210d7750c0eb96744caef5c9"

DEPENDS = "lv2 libsndfile1 "

FILES_${PN} = "${libdir}/lv2/"

S = "${WORKDIR}/git/"

EXTRA_OECMAKE = " -DBUILD_GUI=OFF -DBUILD_SSE=OFF -DHAVE_NTK=OFF -DRELEASE_BUILD=ON "

inherit cmake

