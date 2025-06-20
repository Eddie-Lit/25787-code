package pedroPathing.ClassLibrary;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class OutTakeArm {
    public enum Action{
        Set,
        Reset
    }
    Servo Arm;
    String Config;
    boolean ArmFlag;
    double SetPosition;
    double ResetPosition;
    double InitPosition;
    public void Act(Action ArmAction){
        if(ArmAction==Action.Set){
            Arm.setPosition(SetPosition);
            ArmFlag=true;
        }
        if(ArmAction==Action.Reset){
            Arm.setPosition(ResetPosition);
            ArmFlag=false;
        }
    }
    public void Switch(){
        if(ArmFlag){
            Act(Action.Reset);
        }else {
            Act(Action.Set);
        }
    }
    public void Init(@NonNull HardwareMap hardwareMap){
        Arm = hardwareMap.get(Servo.class,Config);
        Arm.setPosition(InitPosition);
    }
}
