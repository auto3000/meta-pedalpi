DESCRIPTION = "ArtyFX OpenAV Productions."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4cc91856b08b094b4f406a29dc61db21"

SRC_URI = "git://github.com/openAVproductions/openAV-ArtyFX.git"
SRCREV = "01b303e4ef37c8d05841afbad09f4fa393062bdb"

DEPENDS = "lv2 libsndfile1"

FILES_${PN} = "${libdir}/lv2/"

S = "${WORKDIR}/git/"

EXTRA_OECMAKE = " -DBUILD_GUI=OFF -DBUILD_SSE=OFF "

inherit cmake

