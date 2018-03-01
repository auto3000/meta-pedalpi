DESCRIPTION = "olefile is a Python package to parse, read and write Microsoft OLE2 files"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4ca349e8afc48e4721808ca1d6b096b8"

SRCREV = "ab8edf24c5e1109dd5cfd7b6de0fa32469ec49aa"
SRC_URI = "git://github.com/decalage2/olefile.git;protocol=git"

S = "${WORKDIR}/git"

inherit setuptools3 pkgconfig
