package org.firstinspires.ftc.teamcode.Subsystems;

import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.MotorEx;

public class DrivetrainMotors implements Subsystem {


    public static MotorEx frontLeftMotor = new MotorEx("front_left").reversed();
    public static MotorEx frontRightMotor = new MotorEx("front_right");
    public static MotorEx backLeftMotor = new MotorEx("back_left").reversed();
    public static MotorEx backRightMotor = new MotorEx("back_right");

    @Override
    public void initialize(){

    }





}
