// package frc.robot.subsystems;

// import java.util.function.DoubleSupplier;

// import com.revrobotics.CANSparkBase.IdleMode;
// import com.revrobotics.CANSparkLowLevel.MotorType;

// import edu.wpi.first.wpilibj2.command.Command;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import frc.helpers.CCSparkMax;
// import frc.maps.Constants;


// public class Pitch extends SubsystemBase {
//     public CCSparkMax pitch = new CCSparkMax ("pitch" , "p", Constants.MotorConstants.PITCH, MotorType.kBrushless, IdleMode.kBrake, Constants.MotorConstants.PITCH_REVERSE);

//     public void doPitch(double speed){
//         pitch.set(speed*0.25);
//     }

//     public Command executePitch (double speed){
//         return this.run(()-> {doPitch(speed);});
//     }

// }