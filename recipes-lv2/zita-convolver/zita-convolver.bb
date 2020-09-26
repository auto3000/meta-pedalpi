DESCRIPTION = "Convolution library by Fons Adriaensen."
SRC_URI = "https://sources.voidlinux.org/zita-convolver-3.1.0/zita-convolver-3.1.0.tar.bz2"
SRCREV = "c724d33aa66fa8c45310664e594945bd0c84137c"
LICENSE = "GPLv3" 

LIC_FILES_CHKSUM = "file://../COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = " fftwf libsndfile1 "
RPROVIDES_${PN} = "libzita-convolver3"

SRC_URI[md5sum] = "7e264d0fb0d8ea277cdb4e33d764c68a"
SRC_URI[sha256sum] = "bf7e93b582168b78d40666974460ad8142c2fa3c3412e327e4ab960b3fb31993"

S = "${WORKDIR}/zita-convolver-3.1.0/libs/"

FILES_${PN} = " ${libdir} "

do_compile() {
 ${CXX} ${CXXFLAGS} -I. -D_REENTRANT -D_POSIX_PTHREAD_SEMANTICS -DENABLE_VECTOR_MODE -ffast-math -fPIC -c zita-convolver.cc
 ${CXX} ${LDFLAGS} -lfftw3f -lpthread -shared -Wl,-soname,libzita-convolver.so.3 -o libzita-convolver.so.3.1.0 zita-convolver.o
}
do_install() {
 install -d ${D}${libdir}
 install -d ${D}${includedir} 
 install -m 0755 libzita-convolver.so.3.1.0 ${D}${libdir}
 install -m 0755 zita-convolver.h ${D}${includedir}
 ln -s libzita-convolver.so.3.1.0 ${D}/${libdir}/libzita-convolver.so.3.1
 ln -s libzita-convolver.so.3.1 ${D}/${libdir}/libzita-convolver.so.3
 ln -s libzita-convolver.so.3 ${D}/${libdir}/libzita-convolver.so
}
