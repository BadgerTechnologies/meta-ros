# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The criutils package"
AUTHOR = "Francisco Suarez-Ruiz <fsuarez6@gmail.com>"
ROS_AUTHOR = "Francisco Suarez-Ruiz <fsuarez6@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/criutils"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD 3-Clause"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=f5654d47d02d927c4f7a04f0a51abaa1"

ROS_CN = "criutils"
ROS_BPN = "criutils"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-numpy \
    ${PYTHON_PN}-termcolor \
    baldor \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    resource-retriever \
    rostopic \
    sensor-msgs \
    std-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/crigroup/criutils-release/archive/release/melodic/criutils/0.1.3-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/criutils"
SRC_URI = "git://github.com/crigroup/criutils-release;${ROS_BRANCH};protocol=https"
SRCREV = "35757fde4844090bd111403f73179518c44c1382"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
