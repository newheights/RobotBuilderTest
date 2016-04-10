package org.usfirst.frc5902.RobotBuilderTest.commands;

import org.usfirst.frc5902.RobotBuilderTest.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 Drives the robot to the base of the tower during autonomous
 */
public class DriveCloserToTower extends Command {

    public DriveCloserToTower() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.driveStraight(.50,  .538);
    	setTimeout(1.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.driveStraight(0);
    	}

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
