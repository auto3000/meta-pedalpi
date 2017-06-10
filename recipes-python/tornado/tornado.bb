DESCRIPTION = "Tornado is a Python web framework and asynchronous networking library, originally developed at FriendFeed.."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "62e47215ce12aee83f951758c96775a43e80475b"
SRC_URI = "git://github.com/tornadoweb/tornado.git"

S = "${WORKDIR}/git"

inherit setuptools

