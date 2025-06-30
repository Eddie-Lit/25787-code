package pedroPathing.constants;

import com.pedropathing.localization.Localizers;
import com.pedropathing.follower.FollowerConstants;
import com.pedropathing.util.CustomFilteredPIDFCoefficients;
import com.pedropathing.util.CustomPIDFCoefficients;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class FConstants {
    static {
        FollowerConstants.localizers = Localizers.PINPOINT;

        FollowerConstants.leftFrontMotorName = "LeftFrontMotor";
        FollowerConstants.leftRearMotorName = "LeftBehindMotor";
        FollowerConstants.rightFrontMotorName = "RightFrontMotor";
        FollowerConstants.rightRearMotorName = "RightBehindMotor";

        FollowerConstants.leftFrontMotorDirection = DcMotorSimple.Direction.REVERSE;//
        FollowerConstants.leftRearMotorDirection = DcMotorSimple.Direction.REVERSE;
        FollowerConstants.rightFrontMotorDirection = DcMotorSimple.Direction.FORWARD;
        FollowerConstants.rightRearMotorDirection = DcMotorSimple.Direction.FORWARD;

        FollowerConstants.mass = 12;

        FollowerConstants.xMovement = 69;
        FollowerConstants.yMovement = 54.13;

        FollowerConstants.forwardZeroPowerAcceleration = -24;
        FollowerConstants.lateralZeroPowerAcceleration = -55;

        FollowerConstants.translationalPIDFCoefficients.setCoefficients(0.22,0,0.01,0);
        FollowerConstants.useSecondaryTranslationalPID = true;//true
        FollowerConstants.secondaryTranslationalPIDFCoefficients.setCoefficients(0.28,0,0.01,0); // Not being used, @see useSecondaryTranslationalPID

        FollowerConstants.headingPIDFCoefficients.setCoefficients(4,0,0.5,0);
        FollowerConstants.useSecondaryHeadingPID = true;
        FollowerConstants.secondaryHeadingPIDFCoefficients.setCoefficients(1.4,0.08,0.12,0.06); // Not being used, @see useSecondaryHeadingPID

        FollowerConstants.drivePIDFCoefficients.setCoefficients(0.15,0.2,0.024,0.6,10);
        FollowerConstants.useSecondaryDrivePID = true;
        FollowerConstants.secondaryDrivePIDFCoefficients.setCoefficients(0.16,0.07,0.00001,0.6,5); // Not being used, @see useSecondaryDrivePID

        FollowerConstants.zeroPowerAccelerationMultiplier = 4;
        FollowerConstants.centripetalScaling = 0.0005;

        FollowerConstants.pathEndTimeoutConstraint = 500;
        FollowerConstants.pathEndTValueConstraint = 0.995;
        FollowerConstants.pathEndVelocityConstraint = 0.1;
        FollowerConstants.pathEndTranslationalConstraint = 0.1;
        FollowerConstants.pathEndHeadingConstraint = 0.007;

        FollowerConstants.turnHeadingErrorThreshold = 0.02;

    }
}
