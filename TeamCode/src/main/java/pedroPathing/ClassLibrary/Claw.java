package pedroPathing.ClassLibrary;


import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw {
    public enum Action{
        Open,
        Close,
        OpenMore
    }
    public Servo Claw;
    public int ClawFlag;
    public double OpenPosition;
    public double ClosePosition;
    public double OpenMorePosition;
    public void Act(Action ActionFlag){
        if(ActionFlag==Action.Open){
            Claw.setPosition(OpenPosition);
            ClawFlag=1;
        }
        if(ActionFlag==Action.Close){
            Claw.setPosition(ClosePosition);
            ClawFlag=0;
        }
        if(ActionFlag==Action.OpenMore){
            Claw.setPosition(OpenMorePosition);
            ClawFlag=2;
        }

    }
    public void Switch(){
        if(ClawFlag==0){
            Act(Action.Open);
        }else {
            Act(Action.Close);
        }
    }
    public void TerraceSwitch(){
        if(ClawFlag!=2){
            Act(Action.OpenMore);
        }else{
            Act(Action.Open);
        }
    }
}