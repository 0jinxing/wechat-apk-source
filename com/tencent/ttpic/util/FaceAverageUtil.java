package com.tencent.ttpic.util;

import android.graphics.PointF;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public class FaceAverageUtil
{
  private static boolean checkFaceFeatureOutScreen(List<PointF> paramList, int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(83828);
    boolean bool;
    if ((paramList == null) || (paramList.isEmpty()))
    {
      AppMethodBeat.o(83828);
      bool = false;
    }
    while (true)
    {
      return bool;
      RectF localRectF = new RectF(0.0F, 0.0F, (float)(paramInt1 * paramDouble), (float)(paramInt2 * paramDouble));
      if (!localRectF.contains(((PointF)paramList.get(65)).x, ((PointF)paramList.get(65)).y))
      {
        AppMethodBeat.o(83828);
        bool = false;
      }
      else if (!localRectF.contains(((PointF)paramList.get(66)).x, ((PointF)paramList.get(66)).y))
      {
        AppMethodBeat.o(83828);
        bool = false;
      }
      else
      {
        float f1 = ((PointF)paramList.get(69)).x;
        f1 = (((PointF)paramList.get(9)).x + f1) / 2.0F;
        float f2 = ((PointF)paramList.get(69)).y;
        paramList = new PointF(f1, (((PointF)paramList.get(9)).y + f2) / 2.0F);
        bool = localRectF.contains(paramList.x, paramList.y);
        AppMethodBeat.o(83828);
      }
    }
  }

  public static boolean isPositiveFace(float[] paramArrayOfFloat, List<PointF> paramList, int paramInt1, int paramInt2, double paramDouble)
  {
    boolean bool = true;
    AppMethodBeat.i(83827);
    double d = Math.min(Math.abs(Math.cos(paramArrayOfFloat[0])), Math.abs(Math.cos(paramArrayOfFloat[1])));
    if ((!checkFaceFeatureOutScreen(paramList, paramInt1, paramInt2, paramDouble)) || (d < 0.94D))
    {
      AppMethodBeat.o(83827);
      bool = false;
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(83827);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.FaceAverageUtil
 * JD-Core Version:    0.6.2
 */