SUMMARY = "Web-based interface for the MOD."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5abed640d912caca185601d2312815e"

RDEPENDS_${PN} = "python3-textutils python3-json python3-setuptools python3-pyserial pystache python3-pillow python3-tornado"
DEPENDS = "lilv jack alsa-lib"

SRCREV = "03ede9bbfac9d42010f010e59dacf66ac54fa8b3"
SRC_URI = "git://github.com/moddevices/mod-ui.git;branch=master \
           file://0001-logging-add-logging-message-for-host-config.patch \
           file://0002-hmi_socket-file-creation.patch \
           file://0003-hmi-add-HMI-socket.patch \
           file://0004-rpiclient-add-rpi-client.patch \
           file://0005-rpiclient-add-internal-statemachine.patch \
           file://0006-rpiclient-add-queue-and-cooperative-thread-for-LCD-d.patch \
           file://0007-build-disable-strip-of-.so-library-in-utils.patch \
           file://0008-logging-replace-print-with-logging.patch \
           file://0009-rpiclient-remove-deprecated-module.patch \
           file://0010-logging-redirect-logging-to-syslog.patch \
           file://0011-logging-fix-print-to-logging-in-webserver.py.patch \
           file://0012-build-add-clean-rule.patch \
           file://0013-lilv-redirect-error-log-to-syslog.patch \
           file://0014-desktop-differentiate-two-similar-logging-messages.patch \
           file://0015-host-add-retry-mechanism-to-connect-mod-host-socket.patch \
           file://0016-logging-add-some-traces-in-utils-and-webserver.patch \
           "

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/share/mod/ \
		/usr/bin/mod-ui"

inherit setuptools3

