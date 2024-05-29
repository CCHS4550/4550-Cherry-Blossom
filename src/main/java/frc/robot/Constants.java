// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static class MotorConstants{
    /* MAKE SURE THE MOTOR NUMBERS ARE CORRECT */
    //ASSUMING THAT IT WOULD GO FR, FL, BR, BL, LIKE IN OTHER SWERVE STUFF
    //ENCODERS ARE 1, CHECK THAT
    public static final int FRONT_RIGHT_DRIVE = 1;
    public static final boolean FRONT_RIGHT_DRIVE_REVERSE = false;
    public static final double FRONT_RIGHT_DRIVE_ENCODER = 1;
    public static final int FRONT_RIGHT_TURN = 2;
    public static final boolean FRONT_RIGHT_TURN_REVERSE = false;
    public static final double FRONT_RIGHT_TURN_ENCODER = 1;

     public static final int FRONT_LEFT_DRIVE = 3;
    public static final boolean FRONT_LEFT_DRIVE_REVERSE = false;
    public static final double FRONT_LEFT_DRIVE_ENCODER = 1;
    public static final int FRONT_LEFT_TURN = 4;
    public static final boolean FRONT_LEFT_TURN_REVERSE = false;
    public static final double FRONT_LEFT_TURN_ENCODER = 1;

     public static final int BACK_RIGHT_DRIVE = 5;
    public static final boolean BACK_RIGHT_DRIVE_REVERSE = false;
    public static final double BACK_RIGHT_DRIVE_ENCODER = 1;
    public static final int BACK_RIGHT_TURN = 6;
    public static final boolean BACK_RIGHT_TURN_REVERSE = false;
    public static final double BACK_RIGHT_TURN_ENCODER = 1;

     public static final int BACK_LEFT_DRIVE = 7;
    public static final boolean BACK_LEFT_DRIVE_REVERSE = false;
    public static final double BACK_LEFT_DRIVE_ENCODER = 1;
    public static final int BACK_LEFT_TURN = 8;
    public static final boolean BACK_LEFT_TURN_REVERSE = false;
    public static final double BACK_LEFT_TURN_ENCODER = 1;

    //CHECK MOTOR IDs, probably wrong
    public static final int YAW_1 = 9;
    public static final boolean YAW_1_REVERSE = false;
    public static final int YAW_2 = 10;
    public static final boolean YAW_2_REVERSE = false;

    public static final int ROLL = 11; 
    public static final boolean ROLL_REVERSE = false;

    public static final int PITCH = 12;
    public static final boolean PITCH_REVERSE = false;

  }
}
