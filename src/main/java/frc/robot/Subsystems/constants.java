package frc.robot.Subsystems;


import com.ctre.phoenix6.CANBus;
import com.ctre.phoenix6.configs.CurrentLimitsConfigs;
import com.ctre.phoenix6.configs.FeedbackConfigs;
import com.ctre.phoenix6.configs.MotorOutputConfigs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.configs.VoltageConfigs;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;


public class constants {

    public static final CANBus rio = new CANBus("rio");

    public static TalonFXConfiguration constantsConfig() {
    return new TalonFXConfiguration()
        .withCurrentLimits(
            new CurrentLimitsConfigs() // Configurate Stator (Corriente fulyendo por los cables) and Supply (Electricidad  de el robot 12Battery Buss) Curret limits for talon.
                .withStatorCurrentLimitEnable(true) // Limita el Stator Curret 
                .withStatorCurrentLimit(80.0) // Lo Restringe  por 80 Amps. 
                .withSupplyCurrentLimitEnable(true) // Limita el Supply  
                .withSupplyCurrentLimit(80.0) // Capacity form the Battery 
                .withSupplyCurrentLowerLimit(40) // Pone el Amps hasta 
                .withSupplyCurrentLowerTime(0.2) // Trigger the drop after 0.2 seconds of Maxing Out. 
              )
        .withVoltage(
            new VoltageConfigs()
            .withPeakForwardVoltage(12.0) // Output at Max of 12.0 volts
            .withPeakReverseVoltage(-12.0)// Ouput at Revers at -12.0 volts.
            
          ) 
        .withMotorOutput(
            new MotorOutputConfigs()
                .withInverted(InvertedValue.CounterClockwise_Positive) //The direction it will run
                .withNeutralMode(NeutralModeValue.Coast)//How it will end Coast free and Brake with resistance
              )
        .withFeedback(
          new FeedbackConfigs()
            .withSensorToMechanismRatio(1.0) // Cuates veces da el sensor por una vuelta al motor EJ (10:1 Por ejemplo el motor da 10 vueltas para que el )
            // .withRotorToSensorRatio(1) // Cuantas vueltas le da un motor por cada vuelta de un sensor externo (Cuando sensor es externo como un encoder
             );
  }

}


