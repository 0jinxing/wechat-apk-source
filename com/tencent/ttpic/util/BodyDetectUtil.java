package com.tencent.ttpic.util;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.util.youtu.bodydetector.BodyDetectResult;
import java.util.Iterator;
import java.util.List;

public class BodyDetectUtil
{
  private static final int WAISTLINE_LEFT_POINT = 15;
  private static final int WAISTLINE_RIGHT_POINT = 43;

  public static float calcWaistLine(List<PointF> paramList, double paramDouble, int paramInt)
  {
    AppMethodBeat.i(83823);
    float f1 = -1.0F;
    float f2 = f1;
    if (paramList != null)
    {
      f2 = f1;
      if (!paramList.isEmpty())
      {
        f2 = f1;
        if (paramInt > 0)
        {
          f2 = (float)(((PointF)paramList.get(15)).y / paramDouble);
          f2 = ((float)(((PointF)paramList.get(43)).y / paramDouble) + f2) / 2.0F / paramInt;
        }
      }
    }
    AppMethodBeat.o(83823);
    return f2;
  }

  public static void updateBodyPositionsAlterLongLeg(List<BodyDetectResult> paramList, float paramFloat)
  {
    AppMethodBeat.i(83824);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(83824);
    while (true)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        List localList = ((BodyDetectResult)paramList.next()).bodyPoints;
        float f = ((PointF)localList.get(15)).y;
        f = (((PointF)localList.get(43)).y + f) / 2.0F;
        for (int i = 16; i < 43; i++)
        {
          PointF localPointF = (PointF)localList.get(i);
          localPointF.y += (localPointF.y - f) * (paramFloat * 0.2F);
        }
      }
      AppMethodBeat.o(83824);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.BodyDetectUtil
 * JD-Core Version:    0.6.2
 */