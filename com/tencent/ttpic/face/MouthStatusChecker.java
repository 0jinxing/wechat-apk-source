package com.tencent.ttpic.face;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.StickerItem.ValueRange;

public class MouthStatusChecker
  implements FaceStatusChecker
{
  private static MouthStatusChecker instance;

  static
  {
    AppMethodBeat.i(81899);
    instance = new MouthStatusChecker();
    AppMethodBeat.o(81899);
  }

  public static MouthStatusChecker getInstance()
  {
    return instance;
  }

  public float getLevel(FaceRangeStatus paramFaceRangeStatus, StickerItem.ValueRange paramValueRange)
  {
    return paramFaceRangeStatus.mouth;
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
      if (paramFaceRangeStatus.mouth >= paramValueRange.min)
      {
        bool2 = bool1;
        if (paramFaceRangeStatus.mouth <= paramValueRange.max)
          bool2 = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.face.MouthStatusChecker
 * JD-Core Version:    0.6.2
 */