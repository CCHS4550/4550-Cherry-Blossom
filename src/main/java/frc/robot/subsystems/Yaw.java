package frc.robot.subsystems;

import java.util.function.DoubleSupplier;

import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.helpers.CCSparkMax;
import frc.maps.Constants;


public class Yaw extends SubsystemBase{
    public CCSparkMax yaw1 = new CCSparkMax("yaw1", "y1", Constants.MotorConstants.YAW_1, MotorType.kBrushless, IdleMode.kBrake, Constants.MotorConstants.YAW_1_REVERSE);
    public CCSparkMax yaw2 = new CCSparkMax("yaw2", "y2", Constants.MotorConstants.YAW_2, MotorType.kBrushless, IdleMode.kBrake, Constants.MotorConstants.YAW_2_REVERSE);

    public void rotateYaw (double speed){
        yaw1.set(speed*0.25);
        yaw2.set(speed*0.25);

    }

    public Command doRotateYaw (double speed){
        return this.run(() - > rotateYaw(speed));
    }

}