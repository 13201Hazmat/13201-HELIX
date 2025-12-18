package org.firstinspires.ftc.teamcode.Subsystems;


import dev.nextftc.core.commands.Command;
import dev.nextftc.core.components.Component;
import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.controllable.MotorGroup;
import dev.nextftc.hardware.impl.MotorEx;
import dev.nextftc.hardware.powerable.SetPower;

public class Launcher implements Subsystem, Component {

    public Launcher(){}

    public static final Launcher INSTANCE = new Launcher();

    public static final String RIGHTLAUNCHERNAME = "rightLauncher";
    public static final String LEFTLAUNCHERNAME = "leftLauncher";

    public MotorEx rightLauncherMotor = new MotorEx(RIGHTLAUNCHERNAME);
    public MotorEx leftlauncherMotor = new MotorEx(LEFTLAUNCHERNAME);
    public MotorGroup launcherMotor = new MotorGroup(rightLauncherMotor, leftlauncherMotor);

    public static boolean isLaunching = false;

    public Command stopLauncher = new SetPower(launcherMotor, 0);
    public Command startLauncher = new SetPower(launcherMotor, 1);


    @Override
    public void initialize(){

    }

}
