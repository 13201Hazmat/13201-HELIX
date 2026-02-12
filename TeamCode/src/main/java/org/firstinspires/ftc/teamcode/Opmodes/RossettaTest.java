package org.firstinspires.ftc.teamcode.Opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.Intake;
import org.firstinspires.ftc.teamcode.Subsystems.Launcher;
import org.firstinspires.ftc.teamcode.Subsystems.LauncherAngler;
import org.firstinspires.ftc.teamcode.Subsystems.Rossetta;
import org.firstinspires.ftc.teamcode.Subsystems.Transfer;

import dev.nextftc.core.components.BindingsComponent;
import dev.nextftc.core.components.SubsystemComponent;
import dev.nextftc.ftc.Gamepads;
import dev.nextftc.ftc.NextFTCOpMode;
import dev.nextftc.ftc.components.BulkReadComponent;

@TeleOp(name = "RossettaMotorTest")
public class RossettaTest extends NextFTCOpMode {
    public RossettaTest() {}{
        addComponents(
                new SubsystemComponent(Rossetta.INSTANCE),
                BulkReadComponent.INSTANCE,
                BindingsComponent.INSTANCE
        );

    }


    @Override
    public void onStartButtonPressed(){
        Gamepads.gamepad1().a().toggleOnBecomesTrue()
                .whenBecomesTrue(Launcher.INSTANCE.startLauncher)
                .whenBecomesFalse(Launcher.INSTANCE.stopLauncher);
    }

    @Override
    public void onUpdate(){
    }
}
