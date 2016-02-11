# RobotBuilderTest

This is a test of building code using the WPI robot Builder. 

We are watching and following along these videos from WPI 
https://www.youtube.com/playlist?list=PLYA9eZLlgz7t9Oleid2wtlgnvhGObeKzp

Todo List
- Test ArcadeDrive and make sure it works
- Figure out button numbers for each button on Driver Xbox
- Figure out button numbers for each button on Driver Joystick
- - Map Joystick forward and back to manual control of the intake motor.
- Add in and build out commands for different drive speeds
- Add in and build out an invert controls command
- Figure out how to read the limit switch for the intake mech
- Figure out how to read the encoder on the intakeMotor
- Learn about Servos and see if we can hook one up
- Decide what we would like to do for Autonomous
- Wire up and test an Ultrasonic Sensor

# Subsystems

DriveTrain - Robot Driving
- Left Motor
- Right Motor

Intake - Method to Intake and Eject the Ball
- IntakeMotor - powers the intake system to intake and eject the ball. It does have encoders on it but not sure how to interact with them yet.
- LimitSwitch - a small limit switch to determine if the ball is in our holding area
- IntakeKicker - a little servo that can be triggered to push the ball into eject position.

# Commands 

Autonomous Command

Intake
- IntakeBall
- EjectBall
- IntakeDoNothing


