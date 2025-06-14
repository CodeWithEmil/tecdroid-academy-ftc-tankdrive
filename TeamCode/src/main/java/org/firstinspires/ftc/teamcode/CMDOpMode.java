package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.command.CommandScheduler;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;

import org.firstinspires.ftc.teamcode.subsystems.tankdrive.TankDrive;
import org.firstinspires.ftc.teamcode.subsystems.tankdrive.commands.DriveCommand;

@TeleOp(name="CMD", group="Op Mode")
public class CMDOpMode extends CommandOpMode {
    // Declaring useful variables
    GamepadEx controller;

    // Declaring subsystems
    TankDrive tankDrive;


    // Functional code //
    @Override
    public void initialize() {
        // Controller cannot be assigned at declaration or else it won't work
        controller = new GamepadEx(gamepad1);

        // Declaring subsystems & their default commands
        tankDrive = new TankDrive(hardwareMap, telemetry);
        tankDrive.setDefaultCommand(
                new DriveCommand(
                        tankDrive,
                        () -> controller.getLeftY(),
                        () -> controller.getRightX()
                )
        );

        // Configuring button bindings
        ConfigureBindings();
    }

    @Override
    public void runOpMode() {
        // Code executed at the very beginning, right after hitting the INIT Button
        initialize();

        // Pauses OpMode until the START button is pressed on the Driver Hub
        waitForStart();

        // Run the scheduler
        while (opModeIsActive()) {
            // Command for actually running the scheduler
            CommandScheduler.getInstance().run();

            // Updating the telemetry
            telemetry.update();
        }
    }

    // Button bindings
    private void ConfigureBindings() {
        // Still waiting to declare button bindings according to the rest of the subsystems
    }
}

// Emilio Nájera — June 14th, 2025