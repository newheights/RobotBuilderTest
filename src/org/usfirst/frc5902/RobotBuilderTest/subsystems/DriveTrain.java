// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5902.RobotBuilderTest.subsystems;

import org.usfirst.frc5902.RobotBuilderTest.RobotMap;
import org.usfirst.frc5902.RobotBuilderTest.commands.*;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController leftMotor = RobotMap.driveTrainLeftMotor;
    private final SpeedController rightMotor = RobotMap.driveTrainRightMotor;
    private final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;
    private final Ultrasonic ultrasonic = RobotMap.driveTrainUltrasonic;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new ArcadeDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void arcadeDrive(Joystick stick) {
    	robotDrive.arcadeDrive(-stick.getY(),-stick.getX());
    }
    public void invertArcadeDrive(Joystick stick) {
    	robotDrive.arcadeDrive(stick.getY(),-stick.getX()); 
    }
    public void halfArcadeDrive(Joystick stick) {
    	robotDrive.arcadeDrive(-0.50*stick.getY(),-0.50*stick.getX()); // May have to change this back if needed
    }
    public void halfInvertedArcadeDrive(Joystick stick) {
    	robotDrive.arcadeDrive(0.50*stick.getY(),0.50*stick.getX());
    }
	
    public void driveStraight(double speed) {
		robotDrive.tankDrive(speed, speed);
	}
	
	}

