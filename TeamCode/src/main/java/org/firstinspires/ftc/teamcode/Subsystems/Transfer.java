package org.firstinspires.ftc.teamcode.Subsystems;

import dev.nextftc.core.commands.Command;
import dev.nextftc.core.commands.groups.SequentialGroup;
import dev.nextftc.core.commands.utility.InstantCommand;
import dev.nextftc.core.components.Component;
import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.MotorEx;
import dev.nextftc.hardware.powerable.SetPower;

public class Transfer implements Subsystem, Component {

    public Transfer (){}

    public static final Transfer INSTANCE = new Transfer();

    public static final String TRANSFERNAME = "spindexerMotor";

    public MotorEx transferMotor = new MotorEx(TRANSFERNAME).reversed();

    public static boolean isTransferring = false;

    public Command startTransfer = new SequentialGroup(
            new SetPower(transferMotor, 0.8),
            (new InstantCommand(() -> isTransferring = true))
    );

    public Command stopTransfer = new SequentialGroup(
            new SetPower(transferMotor, 0),
            (new InstantCommand(() -> isTransferring = false))
    );

}
