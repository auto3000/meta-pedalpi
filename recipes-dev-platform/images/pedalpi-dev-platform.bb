SUMMARY = "pedalpi complete image."

IMAGE_INSTALL = "packagegroup-core-boot \
	${CORE_IMAGE_EXTRA_INSTALL} \
	packagegroup-pedalpii"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"

# Set default password for 'root' user
#inherit extrausers
#ROOTPASSWORD = "root"
#ROOTUSERNAME = "root"
#EXTRA_USERS_PARAMS ?= "usermod -P ${ROOTPASSWORD} ${ROOTUSERNAME};"

PV ?= "snapshot+${DATE}"

