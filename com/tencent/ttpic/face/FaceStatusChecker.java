package com.tencent.ttpic.face;

import com.tencent.ttpic.model.StickerItem.ValueRange;

public abstract interface FaceStatusChecker
{
  public abstract float getLevel(FaceRangeStatus paramFaceRangeStatus, StickerItem.ValueRange paramValueRange);

  public abstract boolean isInRange(FaceRangeStatus paramFaceRangeStatus, StickerItem.ValueRange paramValueRange);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.face.FaceStatusChecker
 * JD-Core Version:    0.6.2
 */