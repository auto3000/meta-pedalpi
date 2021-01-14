DESCRIPTION = "Collection of programs (written in C) to do interesting things with sound files."
LICENSE = "GPLv3"
SRC_URI = "git://github.com/libsndfile/sndfile-tools.git;protocol=http \
	"
SRCREV = "6bc73450de421739169642641ad1cc23b10dcf92"

DEPENDS = " cairo jack libsndfile1 libsamplerate0 fftwf"

FILES_${PN} = " \
	${bindir} \
	${libdir} \
	"

S = "${WORKDIR}/git/"
LIC_FILES_CHKSUM = "file://COPYING.GPLv3;md5=d32239bcb673463ab874e80d47fae504"

do_install_append() {
        # Conflicting file with libsamplerate0 package
	rm ${D}${bindir}/sndfile-resample
}

inherit autotools pkgconfig

