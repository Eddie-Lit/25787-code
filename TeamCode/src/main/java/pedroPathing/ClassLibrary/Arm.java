package pedroPathing.ClassLibrary;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Arm {
    public enum Action{
        Prepare,
        Capture,
        PostCapture,
        PostTerrace
    }
    public Servo Arm;
    public int ArmFlag;
    public double PreparePosition;
    public double CapturePosition;
    public double PostCapturePosition;
    public double PostTerracePosition;
    public void Prepare(){
        Arm.setPosition(PreparePosition);
    }
    public void Capture(){
        Arm.setPosition(CapturePosition);
    }
    public void PostCapture(){
        Arm.setPosition(PostCapturePosition);
    }
    public void PostTerrace(){
        Arm.setPosition(PostTerracePosition);
    }

}
