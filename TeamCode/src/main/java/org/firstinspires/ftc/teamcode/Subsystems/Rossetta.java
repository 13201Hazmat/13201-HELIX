package org.firstinspires.ftc.teamcode.Subsystems;

import dev.nextftc.core.commands.Command;
import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.MotorEx;
import dev.nextftc.hardware.powerable.SetPower;

public class Rossetta implements Subsystem {

    private Rossetta(){}

    public static final Rossetta INSTANCE = new Rossetta();

    public MotorEx motorEx = new MotorEx("motor");

    public Command runMotorTest(){
        return new SetPower(motorEx, 1);
    }

    public Command stopMotorTest(){
        return new SetPower(motorEx, 0);
    }

}
