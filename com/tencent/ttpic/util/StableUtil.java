package com.tencent.ttpic.util;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BaseUtils;
import java.util.ArrayList;
import java.util.List;

public class StableUtil
{
  public static List<Integer> getAvgAngles(List<List<Integer>> paramList)
  {
    int i = 0;
    AppMethodBeat.i(83976);
    if (BaseUtils.isEmpty(paramList))
    {
      paramList = VideoMaterialUtil.EMPTY_ANGLES_LIST;
      AppMethodBeat.o(83976);
    }
    while (true)
    {
      return paramList;
      ArrayList localArrayList = new ArrayList(((List)paramList.get(0)).size());
      int k;
      for (int j = 0; ; j++)
      {
        k = i;
        if (j >= paramList.size())
          break;
        for (k = 0; k < ((List)paramList.get(0)).size(); k++)
        {
          if (k >= localArrayList.size())
            localArrayList.add(Integer.valueOf(0));
          int m = ((Integer)localArrayList.get(k)).intValue();
          localArrayList.set(k, Integer.valueOf(((Integer)((List)paramList.get(j)).get(k)).intValue() + m));
        }
      }
      while (k < localArrayList.size())
      {
        localArrayList.set(k, Integer.valueOf(((Integer)localArrayList.get(k)).intValue() / paramList.size()));
        k++;
      }
      AppMethodBeat.o(83976);
      paramList = localArrayList;
    }
  }

  public static List<PointF> getAvgPoints(List<List<PointF>> paramList)
  {
    int i = 0;
    AppMethodBeat.i(83975);
    if (BaseUtils.isEmpty(paramList))
    {
      paramList = VideoMaterialUtil.EMPTY_POINTS_LIST;
      AppMethodBeat.o(83975);
    }
    while (true)
    {
      return paramList;
      ArrayList localArrayList = new ArrayList(((List)paramList.get(0)).size());
      int k;
      PointF localPointF;
      for (int j = 0; ; j++)
      {
        k = i;
        if (j >= paramList.size())
          break;
        for (k = 0; k < ((List)paramList.get(0)).size(); k++)
        {
          if (k >= localArrayList.size())
            localArrayList.add(new PointF());
          localPointF = (PointF)localArrayList.get(k);
          float f = localPointF.x;
          localPointF.x = (((PointF)((List)paramList.get(j)).get(k)).x + f);
          localPointF = (PointF)localArrayList.get(k);
          f = localPointF.y;
          localPointF.y = (((PointF)((List)paramList.get(j)).get(k)).y + f);
        }
      }
      while (k < localArrayList.size())
      {
        localPointF = (PointF)localArrayList.get(k);
        localPointF.x /= paramList.size();
        localPointF = (PointF)localArrayList.get(k);
        localPointF.y /= paramList.size();
        k++;
      }
      AppMethodBeat.o(83975);
      paramList = localArrayList;
    }
  }

  public static float getDistSquare(PointF paramPointF1, PointF paramPointF2)
  {
    if ((paramPointF1 == null) || (paramPointF2 == null));
    float f2;
    for (float f1 = 0.0F; ; f1 = f2 * f2 + f1 * f1)
    {
      return f1;
      f2 = paramPointF1.x - paramPointF2.x;
      f1 = paramPointF1.y - paramPointF2.y;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.StableUtil
 * JD-Core Version:    0.6.2
 */