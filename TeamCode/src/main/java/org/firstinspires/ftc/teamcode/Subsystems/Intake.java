package org.firstinspires.ftc.teamcode.Subsystems;

import dev.nextftc.core.commands.Command;
import dev.nextftc.core.components.Component;
import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.MotorEx;
import dev.nextftc.hardware.powerable.SetPower;

public class Intake implements Subsystem, Component {

    public Intake(){}

    public static final Intake INSTANCE = new Intake();

    public static final String INTAKENAME = "intakeMotor";
    public MotorEx intakeMotor = new MotorEx(INTAKENAME);

    public static final double intakeMaxPower = 0.8;
    public static boolean isIntaking = false;

    public Command spinIntake = new SetPower(intakeMotor, intakeMaxPower);

    public Command stopIntake = new SetPower(intakeMotor, 0);


    @Override
    public void initialize(){

    }

    @Override
    public void periodic(){

    }

}
