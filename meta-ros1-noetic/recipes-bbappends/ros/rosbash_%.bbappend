# Copyright (c) 2019 LG Electronics, Inc.

PACKAGECONFIG ??= "bash-real"

# "rosrun" uses array variables, so we can't use the BASH provided by "busybox" but must use a "real" one. NB. "busybox" is only
# present on the target.
do_install:append:class-target() {
    if ${@bb.utils.contains('PACKAGECONFIG', 'bash-real', 'true', 'false', d)}; then
        sed -i -e '1 s@^.*$@#!/usr/bin/env bash-real@' ${D}${ros_bindir}/rosrun
    fi
}

RDEPENDS:${PN}:append:class-target = " ${@bb.utils.contains('PACKAGECONFIG', 'bash-real', 'bash-real', '', d)}"
