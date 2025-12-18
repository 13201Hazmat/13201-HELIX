package org.firstinspires.ftc.teamcode.Subsystems;

import dev.nextftc.core.commands.Command;
import dev.nextftc.core.commands.groups.SequentialGroup;
import dev.nextftc.core.commands.utility.InstantCommand;
import dev.nextftc.core.components.Component;
import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.MotorEx;
import dev.nextftc.hardware.powerable.SetPower;

public class Intake implements Subsystem {

    public Intake(){}

    public static final Intake INSTANCE = new Intake();

    public static final String INTAKENAME = "intakeMotor";
    public MotorEx intakeMotor = new MotorEx(INTAKENAME).reversed();

    public static final double intakeMaxPower = 0.8;

    public Command spinIntake = new SetPower(intakeMotor, intakeMaxPower).requires(this);

//    public Command spinIntake = new SequentialGroup(
//            new SetPower(intakeMotor, intakeMaxPower),
//            (new InstantCommand(() -> isIntaking = true))
//    ).requires(this);

    public Command stopIntake = new SetPower(intakeMotor, 0).requires(this);

//    public Command stopIntake = new SequentialGroup(
//            new SetPower(intakeMotor, 0),
//            (new InstantCommand(() -> isIntaking = true))
//    ).requires(this);


//    @Override
//    public void initialize(){
//
//    }
//
//    @Override
//    public void periodic(){
//
//    }

}
