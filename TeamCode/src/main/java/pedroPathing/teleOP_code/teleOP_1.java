package pedroPathing.teleOP_code;



import static android.os.SystemClock.sleep;

import com.pedropathing.follower.Follower;
import com.pedropathing.localization.Pose;
import com.pedropathing.util.Constants;
import  com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


import pedroPathing.constants.Algorithm_1;
import pedroPathing.constants.FConstants;
import pedroPathing.constants.LConstants;


/**
 * This is an example teleop that showcases movement and robot-centric driving.
 *
 * @author Baron Henderson - 20077 The Indubitables
 * @version 2.0, 12/30/2024
 */

@TeleOp(name = "Teleop_1", group = "Examples")
public class teleOP_1 extends OpMode {
    private Follower follower;
    private Algorithm_1 Algorihthm;
    private boolean GP1_X_Flag = false;
    private boolean GP1_A_Flag = false;
    private boolean GP1_Y_Flag = false;
    private boolean GP1_B_Flag = false;

    private final Pose startPose = new Pose(0,0,0);

    /** This method is call once when init is played, it initializes the follower **/
    @Override
    public void init() {
        follower = new Follower(hardwareMap, FConstants.class, LConstants.class);
        follower.setStartingPose(startPose);
        Algorihthm = new Algorithm_1(hardwareMap);
    }

    /** This method is called continuously after Init while waiting to be started. **/
    @Override
    public void init_loop() {
    }

    /** This method is called once at the start of the OpMode. **/
    @Override
    public void start() {
        follower.startTeleopDrive();
    }

    /** This is the main loop of the opmode and runs continuously after play **/
    @Override
    public void loop() {

        /* Update Pedro to move the robot based on:
        - Forward/Backward Movement: -gamepad1.left_stick_y
        - Left/Right Movement: -gamepad1.left_stick_x
        - Turn Left/Right Movement: -gamepad1.right_stick_x
        - Robot-Centric Mode: true
        */

        follower.setTeleOpMovementVectors(-gamepad1.left_stick_y, -gamepad1.left_stick_x, gamepad1.right_stick_x, false);
        follower.update();
        FingerController();
        SpinController();
        TerraceController();
        PrepareCapture();
        Test();
        /* Telemetry Outputs of our Follower */
        telemetry.addData("X", follower.getPose().getX());
        telemetry.addData("Y", follower.getPose().getY());
        telemetry.addData("Heading in Degrees", Math.toDegrees(follower.getPose().getHeading()));

        /* Update Telemetry to the Driver Hub */
        telemetry.update();

        double power = -gamepad2.right_stick_y;
        double safePower = Algorithm_1.applyPositionLimit(power);
        Algorithm_1.slideMotor.setPower(safePower);
    }


    private void Test() {
        if(gamepad1.b && ! GP1_B_Flag){
            Algorihthm.finger.Open();
        }
        GP1_B_Flag = gamepad1.b;
    }

    private void PrepareCapture() {
        if(gamepad1.y && ! GP1_Y_Flag){
            Algorihthm.terrace.Forward();
            sleep(100);
            Algorihthm.arm_right.PostCapture();
            Algorihthm.arm_left.PostCapture();
            Algorihthm.spin.SpinInitial();
            Algorihthm.wrist.NormalPosition();
            Algorihthm.finger.Open();
        }
        GP1_Y_Flag = gamepad1.y;
    }

    private void TerraceController() {
        if(gamepad1.a && !GP1_A_Flag && !Algorihthm.terrace.TerraceFlag){
            Algorihthm.spin.SpinInitial();
            Algorihthm.arm_right.PostTerrace();
            Algorihthm.arm_left.PostTerrace();
            Algorihthm.finger.Open();
            Algorihthm.wrist.Terrace();
            Algorihthm.terrace.Side();
        }
        GP1_A_Flag = gamepad1.a;
    }

    private void SpinController() {
        if(gamepad1.dpad_right){
            Algorihthm.spin.SpinRight();
        }if(gamepad1.dpad_left){
            Algorihthm.spin.SpinLeft();
        }
    }

    private void FingerController(){
        if(gamepad1.x&&!GP1_X_Flag){
            Algorihthm.arm_left.Capture();
            Algorihthm.arm_right.Capture();
            sleep(100);
            Algorihthm.wrist.NormalPosition();
            Algorihthm.finger.Capture();
            sleep(300);
            Algorihthm.arm_left.PostCapture();
            Algorihthm.arm_right.PostCapture();
        }
        GP1_X_Flag = gamepad1.x;



    }
    /** We do not use this because everything automatically should disable **/
    @Override
    public void stop() {
    }
}