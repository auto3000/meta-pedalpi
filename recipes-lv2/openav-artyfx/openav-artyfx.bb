DESCRIPTION = "ArtyFX OpenAV Productions."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4cc91856b08b094b4f406a29dc61db21"

SRC_URI = "git://github.com/openAVproductions/openAV-ArtyFX.git \
           file://0001-lv2-update-modgui-and-.TTL-resources.patch \
           file://0001-lv2-update-modgui-and-.TTL-resources.tgz \
           "
SRCREV = "b247969a51bd7f5499e2f8d77c183c9faf828a11"

DEPENDS = "lv2 libsndfile1"

FILES_${PN} = "${libdir}/lv2/"

S = "${WORKDIR}/git/"

EXTRA_OECMAKE = " -DBUILD_GUI=OFF -DBUILD_SSE=OFF "

inherit cmake

