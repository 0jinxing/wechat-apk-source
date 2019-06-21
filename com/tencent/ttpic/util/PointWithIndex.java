package com.tencent.ttpic.util;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PointWithIndex
{
  public int index;
  public PointF point;

  public PointWithIndex(float paramFloat1, float paramFloat2, int paramInt)
  {
    AppMethodBeat.i(83941);
    this.point = new PointF(paramFloat1, paramFloat2);
    this.index = paramInt;
    AppMethodBeat.o(83941);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.PointWithIndex
 * JD-Core Version:    0.6.2
 */