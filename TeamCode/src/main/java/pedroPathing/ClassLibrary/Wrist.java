package pedroPathing.ClassLibrary;
import static pedroPathing.constants.constant_1.WRIST_NORMAL_POSITION;
import static pedroPathing.constants.constant_1.WRIST_TERRACE_POSITION;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Wrist {
    public enum Action{
        Terrace,
        Normal
    }
    public Servo Wrist;
    public boolean WristFlag;
    public void Act(Action ActionFlag){
        if(ActionFlag==Action.Terrace){
            Wrist.setPosition(WRIST_TERRACE_POSITION);
            WristFlag = true;
        }if(ActionFlag==Action.Normal){
            Wrist.setPosition(WRIST_NORMAL_POSITION);
            WristFlag = false;
        }
    }
    public void Switch(){
        if(!WristFlag){
            Act(Action.Terrace);
        }else{
            Act(Action.Normal);
        }
    }
    public void NormalPosition(){
        Act(Action.Normal);
    }
    public void Terrace(){
        Act(Action.Terrace);
    }
}
