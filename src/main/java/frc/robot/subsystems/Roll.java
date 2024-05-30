package frc.robot.subsystems;

import java.util.function.DoubleSupplier;

import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.helpers.CCSparkMax;
import frc.maps.Constants;

public class Roll extends SubsystemBase{
    //probably would want to add something regarding to roll for a certain distance so that the barrel lines up with the pneumatics
    CCSparkMax roll = new CCSparkMax("Roll", "r", Constants.MotorConstants.ROLL, MotorType.kBrushless, IdleMode.kBrake, Constants.MotorConstants.ROLL_REVERSE);
    
    public void rolling (double speed){
        roll.set(speed*.25);
    }
    
    public Command doRoll (double speed){
        return this.run(()-> rolling(speed));
    }
}