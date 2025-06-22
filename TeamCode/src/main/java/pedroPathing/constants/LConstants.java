package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;

public class LConstants {
    static {
        TwoWheelConstants.forwardTicksToInches = .001989436789;
        TwoWheelConstants.strafeTicksToInches = .001989436789;
        TwoWheelConstants.forwardY = -4.83;//inch,not yet
        TwoWheelConstants.strafeX = 0.01;//not yet
        TwoWheelConstants.forwardEncoder_HardwareMapName = "RightBehindMotor";//parallel
        TwoWheelConstants.strafeEncoder_HardwareMapName = "LeftFrontMotor";//perpendicular
        TwoWheelConstants.forwardEncoderDirection = Encoder.FORWARD;//FORWARD
        TwoWheelConstants.strafeEncoderDirection = Encoder.REVERSE;
        TwoWheelConstants.IMU_HardwareMapName = "imu";
        TwoWheelConstants.IMU_Orientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.LEFT, RevHubOrientationOnRobot.UsbFacingDirection.UP);
    }
}




