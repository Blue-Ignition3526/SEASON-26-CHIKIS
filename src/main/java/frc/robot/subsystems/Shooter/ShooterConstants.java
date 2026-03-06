package frc.robot.subsystems.Shooter;

import java.util.TreeMap;

import edu.wpi.first.units.measure.Distance;

import static edu.wpi.first.units.Units.*;

public class ShooterConstants {
  public static final int kLeftMotorId = 30;
  public static final int kRightMotorID = 31;

  public static final int kCurrentLimit = 40;
  public static final double kRampRate = 0.2;

  public static final double kS = 0.0;
  public static final double kV = 0.125;
  public static final double kA = 0.0;
  public static final double kP = 0.0;
  public static final double kI = 0.0;
  public static final double kD = 0.0;

  // TODO: set manual speeds (RPS)
  public static final double manual1 = 30;
  public static final double manual2 = 48;
  public static final double manual3 = 62;
  public static final double manual4 = 75;

  public static final double kIdleSpeed = manual1;

  // TODO: calibrate automatic speeds (RPS)
  public static final TreeMap<Distance, Double> kSpeedsMap = new TreeMap<>();
  static {
    kSpeedsMap.put(Meters.of(0), 60.0);
    kSpeedsMap.put(Meters.of(10), 83.3);
  }

  public static final double kEpsilon = 7;
}
