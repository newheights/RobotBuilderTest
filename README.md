# The Wire Clippers - FRC 5902 Robot Code
2016 is our rookie year in the FIRST Robotics competition.


**DO NOT USE ROBOT BUILDER ANY MORE WITH THIS CODE - It will break it!**

We used Robot builder and followed along these videos from WPI 
https://www.youtube.com/playlist?list=PLYA9eZLlgz7t9Oleid2wtlgnvhGObeKzp

# Robot Subsystems

## DriveTrain - Robot Driving
- Left Motor
- Right Motor

## Intake - Method to Intake and Eject the Ball
- IntakeMotor - powers the intake system to intake the ball. It does have encoders but not sure how to interact with it.

## Sensor Base
- Ultrasonic Sensor - put the reading of inches away from the robot on the screen.

# Autonomous Mode

Using an autonomous command chooser in the code drivers are able to select which code is run during the autnomous mode.
- AutonomousLowGoal - A set of commands that drives from the center of the feild under the low bar, turns to the right, drives to the tower, and shoots the ball using the Pneumatic system
- AutnomousDoNothing - Do nothing in Autnomous

# Teleop Mode

During teleop mode our robot can run commands as well as having the driver drive around. On the drive station computer we have a SmartDashboard that will display informaiton from the robot to the drivers.

## Driver Station SmartDashboard

On the smart dashboard we have the following
- USB Camera Feed
- X & Y Axis of the Driver Xbox Controller
- Status of the Pnuematic Cylinder is displayed either Retracted & Extended


## Driver Controls

### Driver Xbox - Operator Interface Assignments

| Button  | Command |
| ------------- | ------------- |
| Left stick  | Regular ArcadeDrive  |
| Right Bumper (while held)  | Half Speed ArcadeDrive  |
| A Button  | Inverted ArcadeDrive  |
| Y Button  | Half Speed Inverted ArcadeDrive  |

### Driver Joystick - Operator Interface Assignments

| Button  | Command |
| ------------- | ------------- |
| Main joystick | Intake Flap |
| Button 3  | Retract Ball Kicker |
| Button 4  | Extend Ball Kicker  |
| Button 5  | 180 Intake Flap  |
