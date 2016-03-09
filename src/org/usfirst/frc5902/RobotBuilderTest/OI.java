// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5902.RobotBuilderTest;

import org.usfirst.frc5902.RobotBuilderTest.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton rightBumper;
    public JoystickButton buttonA;
    public JoystickButton buttonY;
    public Joystick driverXbox;
    public JoystickButton button5;
    public JoystickButton button4;
    public JoystickButton button3;
    public Joystick driverJoystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        driverJoystick = new Joystick(1);
        
        button3 = new JoystickButton(driverJoystick, 3);
        button3.whileHeld(new RetractBallPusher());
        
        button4 = new JoystickButton(driverJoystick, 4);
        button4.whenPressed(new OneEightyIntake());
        
        button5 = new JoystickButton(driverJoystick, 5);
        button5.whileHeld(new ExtendBallKicker());

        
        driverXbox = new Joystick(0);
        buttonY = new JoystickButton(driverXbox, 4);
        buttonY.whileHeld(new HalfInvertArcadeDrive());
        buttonA = new JoystickButton(driverXbox, 1);
        buttonA.whileHeld(new InvertArcadeDrive());
        rightBumper = new JoystickButton(driverXbox, 6);
        rightBumper.whileHeld(new HalfArcadeDrive());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Intake Ball", new IntakeBall());
        SmartDashboard.putData("Eject Ball", new EjectBall());
        SmartDashboard.putData("Intake Do Nothing", new IntakeDoNothing());
        SmartDashboard.putData("Arcade Drive", new ArcadeDrive());
        SmartDashboard.putData("Drive To Defense", new DriveToDefense());
        SmartDashboard.putData("Drive Reverse", new DriveReverse());
        SmartDashboard.putData("HalfArcadeDrive", new HalfArcadeDrive());
        SmartDashboard.putData("InvertArcadeDrive", new InvertArcadeDrive());
        SmartDashboard.putData("HalfInvertArcadeDrive", new HalfInvertArcadeDrive());
        SmartDashboard.putData("IntakeBallUntilLimit", new IntakeBallUntilLimit());
        SmartDashboard.putData("DriverIntakeBall", new DriverIntakeBall());
        SmartDashboard.putData("ExtendBallKicker", new ExtendBallKicker());
        SmartDashboard.putData("RetractBallPusher", new RetractBallPusher());
        SmartDashboard.putData("SolenoidDoNothing", new SolenoidDoNothing());
        SmartDashboard.putData("GetUltrasonic", new GetUltrasonic());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        SmartDashboard.putData("Drive till 36inches away", new DriveTillUltrasonicValue());
        SmartDashboard.putData("Right 45", new TurnRight());
        SmartDashboard.putData("Test Autonomous Command Group", new AutonomousLowGoal());
        SmartDashboard.putData("Auto Shoot Ball", new AutoShootBall());

        // SmartDashboard.putNumber("GetUltrasonic", new ());
        //SmartDashboard.putData("ArcadeDrive", new GetX());

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriverXbox() {
        return driverXbox;
    }

    public Joystick getDriverJoystick() {
        return driverJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

