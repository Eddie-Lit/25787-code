package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;

public class LConstants {
    static {
        TwoWheelConstants.forwardTicksToInches = .002;//.001989436789
        TwoWheelConstants.strafeTicksToInches = .002;
        TwoWheelConstants.forwardY = -4.83;//0.01
        TwoWheelConstants.strafeX = 0.01;//-4.83
        TwoWheelConstants.forwardEncoder_HardwareMapName = "LeftFrontMotor";//parallel RightBehindMotor
        TwoWheelConstants.strafeEncoder_HardwareMapName = "RightBehindMotor";//perpendicular LeftFrontMotor
        TwoWheelConstants.forwardEncoderDirection = Encoder.REVERSE;//FORWARD
        TwoWheelConstants.strafeEncoderDirection = Encoder.REVERSE;
        TwoWheelConstants.IMU_HardwareMapName = "imu";
        TwoWheelConstants.IMU_Orientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.LEFT, RevHubOrientationOnRobot.UsbFacingDirection.UP);
    }
}




