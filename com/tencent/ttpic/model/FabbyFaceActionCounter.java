package com.tencent.ttpic.model;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public class FabbyFaceActionCounter extends FaceActionCounter
{
  public Map<Integer, PointF> scaleMap;

  public FabbyFaceActionCounter(int paramInt, long paramLong)
  {
    super(paramInt, paramLong);
    AppMethodBeat.i(83481);
    this.scaleMap = new HashMap();
    AppMethodBeat.o(83481);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.FabbyFaceActionCounter
 * JD-Core Version:    0.6.2
 */