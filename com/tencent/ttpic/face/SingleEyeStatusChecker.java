package com.tencent.ttpic.face;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.StickerItem.ValueRange;

public class SingleEyeStatusChecker
  implements FaceStatusChecker
{
  private static SingleEyeStatusChecker instance;

  static
  {
    AppMethodBeat.i(81907);
    instance = new SingleEyeStatusChecker();
    AppMethodBeat.o(81907);
  }

  public static SingleEyeStatusChecker getInstance()
  {
    return instance;
  }

  public float getLevel(FaceRangeStatus paramFaceRangeStatus, StickerItem.ValueRange paramValueRange)
  {
    AppMethodBeat.i(81906);
    float f = Math.max(paramFaceRangeStatus.leftEye, paramFaceRangeStatus.rightEye);
    AppMethodBeat.o(81906);
    return f;
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
      label19: if ((paramFaceRangeStatus.leftEye < paramValueRange.min) || (paramFaceRangeStatus.leftEye > paramValueRange.max))
      {
        bool2 = bool1;
        if (paramFaceRangeStatus.rightEye >= paramValueRange.min)
        {
          bool2 = bool1;
          if (paramFaceRangeStatus.rightEye > paramValueRange.max);
        }
      }
      else
      {
        bool2 = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.face.SingleEyeStatusChecker
 * JD-Core Version:    0.6.2
 */