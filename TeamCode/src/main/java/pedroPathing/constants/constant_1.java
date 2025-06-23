package pedroPathing.constants;

import com.sun.tools.javac.code.Symbol;

public class constant_1 {
    public static final double CLAW_CLOSE_POSITION = 0.185;
    public static final double CLAW_OPEN_POSITION = 0.25;
    public static final double CLAW_OPEN_MORE_POSITION = 0.35;
    public static final String FORWARD_CLAW_CONFIG_NAME = "Finger";
    public static final double SPIN_CHANGE = 0.16;
    public static final double SPIN_INITIAL_POSITION = 0.5;
    public static final String SPIN_CONFIG_NAME = "Spin";
    public static final double TERRACE_FORWARD_POSITION = 0;
    public static final double TERRACE_SIDE_POSITION = -0.7;
    public static final String TERRACE_CONFIG_NAME = "Terrace";
    public static final double ARM_LEFT_PREPARE_POSITION = 0.07;
    public static final double ARM_LEFT_CAPTURE_POSITION = 0.0;
    public static final double ARM_LEFT_POST_CAPTURE_POSITION = 0.15;
    public static final double ARM_LEFT_POST_TERRACE_POSITION = 0.1;
    public static final double ARM_RIGHT_PREPARE_POSITION = 1 - ARM_LEFT_PREPARE_POSITION;
    public static final double ARM_RIGHT_CAPTURE_POSITION = 1 - ARM_LEFT_CAPTURE_POSITION;
    public static final double ARM_RIGHT_POST_CAPTURE_POSITION = 1-ARM_LEFT_POST_CAPTURE_POSITION;
    public static final double ARM_RIGHT_POST_TERRACE_POSITION = 1-ARM_LEFT_POST_TERRACE_POSITION;
    public static final String ARM_LEFT_CONFIG_NAME = "intakeLeftServo";
    public static final String ARM_RIGHT_CONFIG_NAME = "intakeRightServo";
    public static final double WRIST_TERRACE_POSITION = 0.13;
    public static final double WRIST_NORMAL_POSITION = 0;
    public static final String WRIST_CONFIG_NAME = "Wrist";
}