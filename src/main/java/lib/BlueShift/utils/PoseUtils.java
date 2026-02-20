package lib.BlueShift.utils;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;

public class PoseUtils {
  public static Pose2d toPose2d(Translation2d translation2d) {
    return new Pose2d(translation2d, new Rotation2d());
  }
}
