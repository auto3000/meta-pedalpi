DESCRIPTION = "A set of helper methods to extract plugin and pedalboard data from TTLs using lilv."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302" 

DEPENDS = "lilv"

SRCREV = "84be1c710a187aeaa0dca5827c4c2776f967d863"
#SRCREV = "e5a65d03295309a4b6ccea003b52cd22fc97fc02"
SRC_URI = "git://github.com/moddevices/lilvlib"

S = "${WORKDIR}/git"

inherit setuptools3

