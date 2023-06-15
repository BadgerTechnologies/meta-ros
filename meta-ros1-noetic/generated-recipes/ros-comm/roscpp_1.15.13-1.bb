# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "roscpp is a C++ implementation of ROS. It provides     a <a href="http://wiki.ros.org/Client%20Libraries">client     library</a> that enables C++ programmers to quickly interface with     ROS <a href="http://ros.org/wiki/Topics">Topics</a>,     <a href="http://ros.org/wiki/Services">Services</a>,     and <a href="http://ros.org/wiki/Parameter Server">Parameters</a>.      roscpp is the most widely used ROS client library and is designed to     be the high-performance library for ROS."
AUTHOR = "Jacob Perron <jacob@openrobotics.org>"
ROS_AUTHOR = "Morgan Quigley"
HOMEPAGE = "http://ros.org/wiki/roscpp"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_comm"
ROS_BPN = "roscpp"

ROS_BUILD_DEPENDS = " \
    boost \
    cpp-common \
    message-generation \
    pkgconfig \
    rosconsole \
    roscpp-serialization \
    roscpp-traits \
    rosgraph-msgs \
    roslang \
    rostime \
    std-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    cpp-common \
    message-runtime \
    rosconsole \
    roscpp-serialization \
    roscpp-traits \
    rosgraph-msgs \
    rostime \
    std-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    cpp-common \
    message-runtime \
    rosconsole \
    roscpp-serialization \
    roscpp-traits \
    rosgraph-msgs \
    rostime \
    std-msgs \
    xmlrpcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_comm-release/archive/release/noetic/roscpp/1.15.13-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/roscpp"
SRC_URI = "git://github.com/ros-gbp/ros_comm-release;${ROS_BRANCH};protocol=https"
SRCREV = "fa011b4aa072ef1ba83be90e772dbfd548b916ca"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
BBCLASSEXTEND = "native"
