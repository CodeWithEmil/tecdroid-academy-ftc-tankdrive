package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.command.CommandScheduler;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;

@TeleOp(name="CMD", group="Op Mode")
public class CMDOpMode extends CommandOpMode {
    // Declaring subsystems & useful variables
    GamepadEx controller;



    @Override
    public void initialize() {
        // Controller cannot be assigned at declaration or else it won't work
        controller = new GamepadEx(gamepad1);

        // Declaring subsystems & their default commands


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
        }
    }

    private void ConfigureBindings() {
        // Still waiting to declare button bindings according to the rest of the subsystems
    }
}

// Emilio Nájera — June 14th, 2025