package org.firstinspires.ftc.teamcode.Subsystems;

import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.MotorEx;

public class DrivetrainMotors implements Subsystem {


    public static MotorEx frontLeftMotor = new MotorEx("frontLeft").reversed();
    public static MotorEx frontRightMotor = new MotorEx("frontRight");
    public static MotorEx backLeftMotor = new MotorEx("backLeft").reversed();
    public static MotorEx backRightMotor = new MotorEx("backRight");

    @Override
    public void initialize(){

    }





}
