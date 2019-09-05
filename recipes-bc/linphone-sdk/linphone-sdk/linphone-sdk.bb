require linphone-sdk.inc

inherit gitpkgv

PR = "${INC_PR}.0"

python () {
    if d.getVar('LATEST_REVISIONS', True) == "1":
        d.setVar('SRCREV', '${AUTOREV}')
    else:
        d.setVar('SRCREV', '2676368f3bcfae065b1a580331ce8dda7e68d8ea')
# TODO set to 4.2 tag after merge of yocto-sumo branch
}

# For visualisation
python () {
    print("")
    print("linphone-sdk")
    print(d.getVar('SRCREV', True))
}

SRC_URI = "gitsm://gitlab.linphone.org/BC/public/linphone-sdk.git;protocol=https;branch=yocto_sumo"

PV = "git_${SRCREV}"
PKGV = "${GITPKGVTAG}"

LIC_FILES_CHKSUM = "file://COPYING;md5=d421c6fe1a13d8b1dc830e02bcd20fcd"
