package org.firstinspires.ftc.teamcode.Subsystems;

import dev.nextftc.core.commands.Command;
import dev.nextftc.core.components.Component;
import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.ServoEx;
import dev.nextftc.hardware.positionable.SetPosition;

public class LauncherAngler implements Subsystem, Component {

    public LauncherAngler(){}

    public static final LauncherAngler INSTANCE = new LauncherAngler();

    public static final String LAUNCHERANGLERNAME = "launcherAngler";

    public ServoEx launcherAnglerServo = new ServoEx(LAUNCHERANGLERNAME);

    public Command goUp() {
        double before = launcherAnglerServo.getPosition();
        double after = (before + 100);
        return new SetPosition(launcherAnglerServo, after).requires(this);
    }

    public Command goDown(){
        double before = launcherAnglerServo.getPosition();
        double after = (before - 100);
        return new SetPosition(launcherAnglerServo, after).requires(this);
    }

}
