PR = "r3"

SRC_URI = "git://git.linphone.org/msamr.git;protocol=git" 
SRCREV = "207ab85b81fc3d4dda75ee460f4a3107da7e14bc"
#SRCREV = "6ed342ed00526c21e85f8a06538fe3da2c7a24f4"
S = "${WORKDIR}/git"

require msamr-common.inc
