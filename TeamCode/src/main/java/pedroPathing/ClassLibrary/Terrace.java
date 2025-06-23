package pedroPathing.ClassLibrary;


import static pedroPathing.constants.constant_1.TERRACE_FORWARD_POSITION;
import static pedroPathing.constants.constant_1.TERRACE_SIDE_POSITION;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;

public class Terrace {
    public enum Action{
        Forward,
        Side
    }
    public CRServo Terrace;
    public boolean TerraceFlag;

    public void Act(Action ActionFlag) {
        if (ActionFlag == Action.Forward) {
            Terrace.setPower(TERRACE_FORWARD_POSITION);
            TerraceFlag = false;
        }
        if (ActionFlag == Action.Side) {
            Terrace.setPower(TERRACE_SIDE_POSITION);
            TerraceFlag = true;
        }
    }
    public void Switch(){
        if(!TerraceFlag){
            Act(Action.Forward);
        }else {
            Act(Action.Side);
        }

    }
    public void Forward(){
        Act(Action.Forward);
    }

}
