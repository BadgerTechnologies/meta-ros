# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The adi_tmc_coe package"
AUTHOR = "ROS@analog.com <ROS@analog.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD-3 Clause"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=55e56c499a9aae9dd4d1a66537e3c69e"

ROS_CN = "adi_tmc_coe"
ROS_BPN = "adi_tmc_coe"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    roscpp \
    roscpp-serialization \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ethercat-grant \
    geometry-msgs \
    message-runtime \
    roscpp \
    roscpp-serialization \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/adi_tmcl_coe-release/archive/release/noetic/adi_tmc_coe/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/adi_tmc_coe"
SRC_URI = "git://github.com/ros2-gbp/adi_tmcl_coe-release;${ROS_BRANCH};protocol=https"
SRCREV = "031f2616132554a751872985260a8772e2a3db2d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
