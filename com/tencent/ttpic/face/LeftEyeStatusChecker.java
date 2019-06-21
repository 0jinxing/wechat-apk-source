package com.tencent.ttpic.face;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.StickerItem.ValueRange;

public class LeftEyeStatusChecker
  implements FaceStatusChecker
{
  private static LeftEyeStatusChecker instance;

  static
  {
    AppMethodBeat.i(81893);
    instance = new LeftEyeStatusChecker();
    AppMethodBeat.o(81893);
  }

  public static LeftEyeStatusChecker getInstance()
  {
    return instance;
  }

  public float getLevel(FaceRangeStatus paramFaceRangeStatus, StickerItem.ValueRange paramValueRange)
  {
    return paramFaceRangeStatus.leftEye;
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
      if (paramFaceRangeStatus.leftEye >= paramValueRange.min)
      {
        bool2 = bool1;
        if (paramFaceRangeStatus.leftEye <= paramValueRange.max)
          bool2 = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.face.LeftEyeStatusChecker
 * JD-Core Version:    0.6.2
 */