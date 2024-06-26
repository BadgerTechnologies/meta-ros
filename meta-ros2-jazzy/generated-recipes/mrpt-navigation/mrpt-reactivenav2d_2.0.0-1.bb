# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Reactive navigation for wheeled robots using MRPT navigation algorithms (TP-Space)"
AUTHOR = "Jose-Luis Blanco-Claraco <jlblanco@ual.es>"
ROS_AUTHOR = "Jose-Luis Blanco-Claraco <jlblanco@ual.es>"
HOMEPAGE = "https://github.com/mrpt-ros-pkg/mrpt_navigation"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt_navigation"
ROS_BPN = "mrpt_reactivenav2d"

ROS_BUILD_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    geometry-msgs \
    mrpt-msgs \
    mrpt-nav-interfaces \
    mrpt2 \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    geometry-msgs \
    mrpt-msgs \
    mrpt-nav-interfaces \
    mrpt2 \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    geometry-msgs \
    mrpt-msgs \
    mrpt-nav-interfaces \
    mrpt2 \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mrpt_navigation-release/archive/release/jazzy/mrpt_reactivenav2d/2.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/mrpt_reactivenav2d"
SRC_URI = "git://github.com/ros2-gbp/mrpt_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "5287aff260b81aba178025561e8e034d67731044"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
