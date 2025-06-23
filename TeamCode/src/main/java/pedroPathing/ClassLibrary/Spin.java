package pedroPathing.ClassLibrary;

import static pedroPathing.constants.constant_1.SPIN_CHANGE;
import static pedroPathing.constants.constant_1.SPIN_INITIAL_POSITION;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Spin {

    public Servo Spin;
    public double SpinPosition;

    public void SpinRight(){
        SpinPosition += SPIN_CHANGE;
        Spin.setPosition(SpinPosition);
    }
    public void SpinLeft(){
        SpinPosition -= SPIN_CHANGE;
        Spin.setPosition(SpinPosition);
    }
    public void SpinInitial(){
        Spin.setPosition(SPIN_INITIAL_POSITION);
    }
}
