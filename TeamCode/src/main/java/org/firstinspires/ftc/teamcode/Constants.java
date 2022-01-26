package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;

@Config
public final class Constants
{
    public static final double robotRadius = 17.875 / 2; // Length from center of robot to back

    public static double ARM_MANUAL_MULTIPLIER = 6.0;
    public static int ARM_INTAKE = 0;
    public static int ARM_HIGH = -610;
    public static int ARM_MEDIUM = -850;
    public static int ARM_LOW = -920;

    public static double DUMPER_OPEN = 0.0;
    public static double DUMPER_HOLD = 0.12;
    public static double DUMPER_RELEASE = 0.3;

    public static double INTAKE_POWER = 0.5;
    public static double INTAKE_POWER_EJECT = -0.5;

    public static double CAROUSEL_STOP_SPEED = 0.25;
    public static double CAROUSEL_RAMP_UP_TIME = 500000000.0;
    public static double CAROUSEL_SPEED_CAP = 0.75;

    public static double TRIGGER_POWER_SCALAR = 0.5;


    public static final double armHighOffset = 18;
    public static final double armMedOffset = 26;
    public static final double armLowOffset = 27.5;

    public static final double armHighSquareOffset = Math.sqrt(0.5 * Math.pow(armHighOffset, 2));
    public static final double armMedSquareOffset = Math.sqrt(0.5 * Math.pow(armMedOffset, 2));
    public static final double armLowSquareOffset = Math.sqrt(0.5 * Math.pow(armLowOffset, 2));



    public static final double redDuckStartingPoseX = -3 * 12;
    public static final double redDuckStartingPoseY = (-6 * 12) + robotRadius;
    public static final double redDuckStartingPoseHeading = Math.toRadians(90);
    public static final Pose2d redDuckStartingPose =
            new Pose2d(redDuckStartingPoseX, redDuckStartingPoseY, redDuckStartingPoseHeading);

    public static final double redWarehouseStartingPoseX = 1 * 12;
    public static final double redWarehouseStartingPoseY = (-6 * 12) + robotRadius;
    public static final double redWarehouseStartingPoseHeading = Math.toRadians(90);
    public static final Pose2d redWarehouseStartingPose =
            new Pose2d(redWarehouseStartingPoseX, redWarehouseStartingPoseY, redWarehouseStartingPoseHeading);

    public static final double blueDuckStartingPoseX = -3 * 12;
    public static final double blueDuckStartingPoseY = (6 * 12) - robotRadius;
    public static final double blueDuckStartingPoseHeading = Math.toRadians(270);
    public static final Pose2d blueDuckStartingPose =
            new Pose2d(blueDuckStartingPoseX, blueDuckStartingPoseY, blueDuckStartingPoseHeading);

    public static final double blueWarehouseStartingPoseX = 1 * 12;
    public static final double blueWarehouseStartingPoseY = (6 * 12) - robotRadius;
    public static final double blueWarehouseStartingPoseHeading = Math.toRadians(270);
    public static final Pose2d blueWarehouseStartingPose =
            new Pose2d(blueWarehouseStartingPoseX, blueWarehouseStartingPoseY, blueWarehouseStartingPoseHeading);


    public static final double redShippingHubX = -1 * 12;
    public static final double redShippingHubY = -2 * 12;
    public static final Vector2d redShippingHubPos = new Vector2d(redShippingHubX, redShippingHubY);

    public static final double blueShippingHubX = -1 * 12;
    public static final double blueShippingHubY = 2 * 12;
    public static final Vector2d blueShippingHubPos = new Vector2d(blueShippingHubX, blueShippingHubY);

    public static final double sharedShippingHubX = 4 * 12;
    public static final double sharedShippingHubY = 0;
    public static final Vector2d sharedShippingHubPos = new Vector2d(sharedShippingHubX, sharedShippingHubY);


    public static final double redDuckSpinnerX = -6 * 12;
    public static final double redDuckSpinnerY = -6 * 12;
    public static final Vector2d redDuckSpinnerPos = new Vector2d(redDuckSpinnerX, redDuckSpinnerY);

    public static final double blueDuckSpinnerX = -6 * 12;
    public static final double blueDuckSpinnerY = 6 * 12;
    public static final Vector2d blueDuckSpinnerPos = new Vector2d(blueDuckSpinnerX, blueDuckSpinnerY);
}