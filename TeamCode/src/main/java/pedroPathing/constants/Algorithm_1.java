package pedroPathing.constants;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import java.util.HashMap;

import pedroPathing.ClassLibrary.Arm;
import pedroPathing.ClassLibrary.Claw;
import pedroPathing.ClassLibrary.Spin;
import pedroPathing.ClassLibrary.Terrace;
import pedroPathing.ClassLibrary.Wrist;

public class Algorithm_1 {
    public Claw finger = new Claw();
    public Spin spin = new Spin();
    public Terrace terrace = new Terrace();
    public Arm arm_left = new Arm();
    public Arm arm_right = new Arm();
    public Wrist wrist = new Wrist();
    public Algorithm_1(HardwareMap hardwareMap){
        finger.Claw = hardwareMap.get(Servo.class,constant_1.FORWARD_CLAW_CONFIG_NAME);
        finger.ClosePosition = constant_1.CLAW_CLOSE_POSITION;
        finger.OpenPosition = constant_1.CLAW_OPEN_POSITION;
        finger.OpenMorePosition = constant_1.CLAW_OPEN_MORE_POSITION;

        spin.Spin = hardwareMap.get(Servo.class,constant_1.SPIN_CONFIG_NAME);
        terrace.Terrace = hardwareMap.get(CRServo.class,constant_1.TERRACE_CONFIG_NAME);

        arm_left.Arm = hardwareMap.get(Servo.class,constant_1.ARM_LEFT_CONFIG_NAME);
        arm_left.PreparePosition = constant_1.ARM_LEFT_PREPARE_POSITION;
        arm_left.CapturePosition = constant_1.ARM_LEFT_CAPTURE_POSITION;
        arm_left.PostCapturePosition = constant_1.ARM_LEFT_POST_CAPTURE_POSITION;
        arm_left.PostTerracePosition = constant_1.ARM_LEFT_POST_TERRACE_POSITION;
        arm_right.Arm = hardwareMap.get(Servo.class,constant_1.ARM_RIGHT_CONFIG_NAME);
        arm_right.PreparePosition = constant_1.ARM_RIGHT_PREPARE_POSITION;
        arm_right.CapturePosition = constant_1.ARM_RIGHT_CAPTURE_POSITION;
        arm_right.PostCapturePosition = constant_1.ARM_RIGHT_POST_CAPTURE_POSITION;
        arm_right.PostTerracePosition = constant_1.ARM_RIGHT_POST_TERRACE_POSITION;

        wrist.Wrist = hardwareMap.get(Servo.class,constant_1.WRIST_CONFIG_NAME);
    }


}
