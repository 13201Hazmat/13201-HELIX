package org.firstinspires.ftc.teamcode.Opmodes;

import static org.firstinspires.ftc.teamcode.Subsystems.DrivetrainMotors.backLeftMotor;
import static org.firstinspires.ftc.teamcode.Subsystems.DrivetrainMotors.backRightMotor;
import static org.firstinspires.ftc.teamcode.Subsystems.DrivetrainMotors.frontLeftMotor;
import static org.firstinspires.ftc.teamcode.Subsystems.DrivetrainMotors.frontRightMotor;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.Intake;
import org.firstinspires.ftc.teamcode.Subsystems.Launcher;
import org.firstinspires.ftc.teamcode.Subsystems.LauncherAngler;
import org.firstinspires.ftc.teamcode.Subsystems.Transfer;

import dev.nextftc.bindings.Bindings;
import dev.nextftc.core.components.BindingsComponent;
import dev.nextftc.core.components.SubsystemComponent;
import dev.nextftc.extensions.pedro.PedroComponent;
import dev.nextftc.extensions.pedro.PedroDriverControlled;
import dev.nextftc.ftc.Gamepads;
import dev.nextftc.ftc.NextFTCOpMode;
import dev.nextftc.ftc.components.BulkReadComponent;
import dev.nextftc.hardware.driving.DriverControlledCommand;
import dev.nextftc.hardware.driving.MecanumDriverControlled;

@TeleOp(name = "TestTeleop")
public class TestTeleop extends NextFTCOpMode {

    private DriverControlledCommand driverControlled;

    public TestTeleop() {}{
        addComponents(
                new SubsystemComponent(Intake.INSTANCE, Transfer.INSTANCE, Launcher.INSTANCE, LauncherAngler.INSTANCE),
                BulkReadComponent.INSTANCE,
                BindingsComponent.INSTANCE
        );

    }


    @Override
    public void onInit(){

    }


    @Override
    public void onStartButtonPressed(){

        //Adds driving
        driverControlled = new MecanumDriverControlled(
                frontLeftMotor,
                frontRightMotor,
                backLeftMotor,
                backRightMotor,
                Gamepads.gamepad1().leftStickY().negate(),
                Gamepads.gamepad1().leftStickX(),
                Gamepads.gamepad1().rightStickX()
        );
        driverControlled.schedule();


        //Intake controls
        Gamepads.gamepad1().leftBumper().toggleOnBecomesTrue()
                .whenBecomesTrue(Intake.INSTANCE.spinIntake)
                .whenBecomesFalse(Intake.INSTANCE.stopIntake);

        //Transfer controls
        Gamepads.gamepad1().a().toggleOnBecomesTrue()
                .whenBecomesTrue(Transfer.INSTANCE.startTransfer)
                .whenBecomesFalse(Transfer.INSTANCE.stopTransfer);

        //Launcher controls
        Gamepads.gamepad1().rightBumper().toggleOnBecomesTrue()
                .whenBecomesTrue(Launcher.INSTANCE.startLauncher)
                .whenBecomesFalse(Launcher.INSTANCE.stopLauncher);

        //Launcher Angler controls
        Gamepads.gamepad1().dpadUp().toggleOnBecomesTrue()
                .whenBecomesTrue(LauncherAngler.INSTANCE.goUp());
        Gamepads.gamepad1().dpadDown().toggleOnBecomesTrue()
                .whenBecomesTrue(LauncherAngler.INSTANCE.goDown());
    }
    @Override
    public void onUpdate(){
    }

}
