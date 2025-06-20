package pedroPathing.ClassLibrary;


import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw {
    public enum Action{
        Open,
        Close
    }
    Servo Claw;
    String Config;
    boolean ClawFlag;
    double OpenPosition;
    double ClosePosition;
    public void Act(Action ActionFlag){
        if(ActionFlag==Action.Open){
            Claw.setPosition(OpenPosition);
            ClawFlag=true;
        }
        if(ActionFlag==Action.Close){
            Claw.setPosition(ClosePosition);
            ClawFlag=false;
        }

    }
    public void Init(@NonNull HardwareMap hardwareMap){
            Claw= hardwareMap.get(Servo.class,Config);
    }
    public void Switch(){
        if(ClawFlag){
            Act(Action.Close);
        }else {
            Act(Action.Open);
        }
    }
}