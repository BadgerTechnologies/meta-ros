# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This is a set of tools for recording from and playing back to ROS     topics.  It is intended to be high performance and avoids     deserialization and reserialization of the messages."
AUTHOR = "Jacob Perron <jacob@openrobotics.org>"
ROS_AUTHOR = "Tim Field"
HOMEPAGE = "http://wiki.ros.org/rosbag"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_comm"
ROS_BPN = "rosbag"

ROS_BUILD_DEPENDS = " \
    boost \
    cpp-common \
    python3-pillow \
    rosbag-storage \
    rosconsole \
    roscpp \
    roscpp-serialization \
    std-srvs \
    topic-tools \
    xmlrpcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    rosbag-storage \
    rosconsole \
    roscpp \
    std-srvs \
    xmlrpcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    genmsg \
    genpy \
    python3-gnupg \
    python3-pycryptodomex \
    python3-rospkg \
    rosbag-storage \
    rosconsole \
    roscpp \
    roslib \
    rospy \
    std-srvs \
    topic-tools \
    xmlrpcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_comm-release/archive/release/noetic/rosbag/1.15.13-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rosbag"
SRC_URI = "git://github.com/ros-gbp/ros_comm-release;${ROS_BRANCH};protocol=https"
SRCREV = "0ad6c7cef3b292d58f260589b04eb261c71e6212"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
BBCLASSEXTEND = "native"
