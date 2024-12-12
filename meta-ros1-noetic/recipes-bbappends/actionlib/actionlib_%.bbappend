# Copyright (c) 2019-2020 LG Electronics, Inc.

# Currently, wxpython doesn't build, but it's only needed by the GUI debug tools ax*.py => don't install them and remove the
# RDEPENDS on "wxpython" until it builds.

do_install:append() {
    rm -f ${D}${ros_libdir}/${BPN}/axclient.py ${D}${ros_libdir}/${BPN}/axserver.py
}

RDEPENDS:${PN}:remove = "wxpython"
