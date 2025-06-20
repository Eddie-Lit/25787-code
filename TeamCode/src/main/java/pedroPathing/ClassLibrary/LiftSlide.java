package pedroPathing.ClassLibrary;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class LiftSlide {
    public enum Action{
        ClimbUp,
        ChamberUp
        ,Reset
    }
    DcMotorEx Left_Hanging_Motor,Right_Hanging_Motor;
    String ConfigL,ConfigR;
    public int LiftFlag;
    public int ClimbPosition;
    public int ResetPosition;
    public int ChamberPosition;
    public void Act(Action LiftAction){
        if(LiftAction==Action.ChamberUp){
            Left_Hanging_Motor.setTargetPosition(ChamberPosition);
            Left_Hanging_Motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Right_Hanging_Motor.setTargetPosition(ChamberPosition);
            Right_Hanging_Motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Left_Hanging_Motor.setPower(1);
            Left_Hanging_Motor.setPower(1);
            LiftFlag = 1;
        }
        if(LiftAction==Action.ClimbUp){
            Left_Hanging_Motor.setTargetPosition(ClimbPosition);
            Left_Hanging_Motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Right_Hanging_Motor.setTargetPosition(ClimbPosition);
            Right_Hanging_Motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Left_Hanging_Motor.setPower(1);
            Left_Hanging_Motor.setPower(1);
            LiftFlag=2;
        }
        if(LiftAction==Action.Reset){
            Left_Hanging_Motor.setTargetPosition(ResetPosition);
            Left_Hanging_Motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Right_Hanging_Motor.setTargetPosition(ResetPosition);
            Right_Hanging_Motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Left_Hanging_Motor.setPower(1);
            Left_Hanging_Motor.setPower(1);
            LiftFlag=0;
        }
    }
    public void Switch(){
        if(LiftFlag==0){
            Act(Action.ChamberUp);
        }else {
            Act(Action.Reset);
        }
    }
    public void Init(@NonNull HardwareMap hardwareMap){
        Left_Hanging_Motor=hardwareMap.get(DcMotorEx.class,ConfigL);
        Right_Hanging_Motor=hardwareMap.get(DcMotorEx.class,ConfigR);
        Left_Hanging_Motor.setDirection(DcMotorSimple.Direction.REVERSE);
        Right_Hanging_Motor.setDirection(DcMotorSimple.Direction.FORWARD);
        Left_Hanging_Motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Right_Hanging_Motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        Left_Hanging_Motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Right_Hanging_Motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Left_Hanging_Motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Right_Hanging_Motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
}
