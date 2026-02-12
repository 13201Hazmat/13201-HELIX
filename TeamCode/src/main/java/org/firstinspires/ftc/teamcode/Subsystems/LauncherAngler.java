package org.firstinspires.ftc.teamcode.Subsystems;

import java.util.Set;

import dev.nextftc.core.commands.Command;
import dev.nextftc.core.components.Component;
import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.ServoEx;
import dev.nextftc.hardware.positionable.SetPosition;

public class LauncherAngler implements Subsystem, Component {

    public LauncherAngler(){}

    public static final LauncherAngler INSTANCE = new LauncherAngler();

    public static final String LAUNCHERANGLERNAME = "launcherHoodServo";

    public ServoEx launcherAnglerServo = new ServoEx(LAUNCHERANGLERNAME);

    public Command zeroServo = new SetPosition(launcherAnglerServo, 0).requires(this);

    public Command shootAngle = new SetPosition(launcherAnglerServo, 0.05).requires(this);


    public Command goUp() {
        double before = launcherAnglerServo.getPosition();
        double after = (before + 1);
        return new SetPosition(launcherAnglerServo, after).requires(this);
    }

    public Command goDown(){
        double before = launcherAnglerServo.getPosition();
        double after = (before - 1);
        return new SetPosition(launcherAnglerServo, after).requires(this);
    }

}
