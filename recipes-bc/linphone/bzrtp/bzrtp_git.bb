require bzrtp.inc

inherit gitpkgv

PR = "${INC_PR}.0"

SRCREV = "37542faebc1c938ec6d831e629c7a8ae937a14f7"
SRC_URI = "git://git.linphone.org/bzrtp.git"
PV = "git_${SRCREV}"
PKGV = "${GITPKGVTAG}"

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"
