package com.tencent.ttpic.face;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.StickerItem.ValueRange;

public class EmptyStatusChecker
  implements FaceStatusChecker
{
  private static EmptyStatusChecker instance;

  static
  {
    AppMethodBeat.i(81886);
    instance = new EmptyStatusChecker();
    AppMethodBeat.o(81886);
  }

  public static EmptyStatusChecker getInstance()
  {
    return instance;
  }

  public float getLevel(FaceRangeStatus paramFaceRangeStatus, StickerItem.ValueRange paramValueRange)
  {
    return 0.0F;
  }

  public boolean isInRange(FaceRangeStatus paramFaceRangeStatus, StickerItem.ValueRange paramValueRange)
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.face.EmptyStatusChecker
 * JD-Core Version:    0.6.2
 */