inherit pypi setuptools3
require python-tornado.inc

# Requires _compression which is currently located in misc
RDEPENDS_${PN} += "\
    ${PYTHON_PN}-misc \
    "

SRC_URI[md5sum] = "d13a99dc0b60ba69f5f8ec1235e5b232"
SRC_URI[sha256sum] = "c9c2d32593d16eedf2cec1b6a41893626a2649b40b21ca9c4cac4243bde2efbf"
