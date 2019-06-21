package com.tencent.ttpic.face;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.StickerItem.ValueRange;

public class RightEyeStatusChecker
  implements FaceStatusChecker
{
  private static RightEyeStatusChecker instance;

  static
  {
    AppMethodBeat.i(81905);
    instance = new RightEyeStatusChecker();
    AppMethodBeat.o(81905);
  }

  public static RightEyeStatusChecker getInstance()
  {
    return instance;
  }

  public float getLevel(FaceRangeStatus paramFaceRangeStatus, StickerItem.ValueRange paramValueRange)
  {
    return paramFaceRangeStatus.rightEye;
  }

  public boolean isInRange(FaceRangeStatus paramFaceRangeStatus, StickerItem.ValueRange paramValueRange)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramFaceRangeStatus != null)
    {
      if (paramValueRange != null)
        break label19;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label19: bool2 = bool1;
      if (paramFaceRangeStatus.rightEye >= paramValueRange.min)
      {
        bool2 = bool1;
        if (paramFaceRangeStatus.rightEye <= paramValueRange.max)
          bool2 = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.face.RightEyeStatusChecker
 * JD-Core Version:    0.6.2
 */