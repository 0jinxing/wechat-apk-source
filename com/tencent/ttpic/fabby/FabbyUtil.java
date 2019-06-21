package com.tencent.ttpic.fabby;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.GridSettingModel;
import java.util.Iterator;
import java.util.List;
import java.util.List<Landroid.util.Pair<Ljava.lang.Float;Ljava.lang.Double;>;>;

public class FabbyUtil
{
  public static int getDivideValue(float paramFloat, List<Pair<Float, Integer>> paramList, int paramInt)
  {
    AppMethodBeat.i(81883);
    if (paramList.size() <= 0)
      AppMethodBeat.o(81883);
    while (true)
    {
      return paramInt;
      Iterator localIterator = paramList.iterator();
      Pair localPair;
      for (paramList = null; localIterator.hasNext(); paramList = localPair)
      {
        localPair = (Pair)localIterator.next();
        if (((Float)localPair.first).floatValue() > paramFloat)
          break;
      }
      if (paramList == null)
      {
        paramInt = 0;
        AppMethodBeat.o(81883);
      }
      else
      {
        paramInt = ((Integer)paramList.second).intValue();
        AppMethodBeat.o(81883);
      }
    }
  }

  public static GridSettingModel getGridSetting(float paramFloat, List<Pair<Float, GridSettingModel>> paramList, GridSettingModel paramGridSettingModel)
  {
    AppMethodBeat.i(81885);
    if (paramList.size() <= 0)
    {
      AppMethodBeat.o(81885);
      paramList = paramGridSettingModel;
    }
    while (true)
    {
      return paramList;
      Iterator localIterator = paramList.iterator();
      Pair localPair;
      for (paramList = null; localIterator.hasNext(); paramList = localPair)
      {
        localPair = (Pair)localIterator.next();
        if (((Float)localPair.first).floatValue() > paramFloat)
          break;
      }
      if (paramList == null)
      {
        AppMethodBeat.o(81885);
        paramList = paramGridSettingModel;
      }
      else
      {
        paramList = (GridSettingModel)paramList.second;
        AppMethodBeat.o(81885);
      }
    }
  }

  public static double getRangeValue(int paramInt, float paramFloat, List<Pair<Float, Double>> paramList, double paramDouble)
  {
    AppMethodBeat.i(81882);
    if (paramList.size() <= 0)
      AppMethodBeat.o(81882);
    Object localObject1;
    Object localObject2;
    while (true)
    {
      return paramDouble;
      Iterator localIterator = paramList.iterator();
      for (paramList = null; localIterator.hasNext(); paramList = (List<Pair<Float, Double>>)localObject1)
      {
        localObject1 = (Pair)localIterator.next();
        localObject2 = localObject1;
        if (((Float)((Pair)localObject1).first).floatValue() > paramFloat)
          break label82;
      }
      localObject2 = null;
      label82: if ((paramList != null) || (localObject2 != null))
        break;
      paramDouble = 1.0D;
      AppMethodBeat.o(81882);
    }
    if (paramList == null)
      paramList = (List<Pair<Float, Double>>)localObject2;
    while (true)
    {
      if (((Float)((Pair)localObject2).first).equals(paramList.first))
      {
        paramDouble = ((Double)((Pair)localObject2).second).doubleValue();
        AppMethodBeat.o(81882);
        break;
        if (localObject2 != null)
          break label226;
        localObject2 = paramList;
        localObject1 = paramList;
        paramList = (List<Pair<Float, Double>>)localObject2;
        localObject2 = localObject1;
        continue;
      }
      paramDouble = getValue(paramInt, ((Double)((Pair)localObject2).second).doubleValue(), ((Float)((Pair)localObject2).first).floatValue(), ((Double)paramList.second).doubleValue(), ((Float)paramList.first).floatValue(), paramFloat);
      AppMethodBeat.o(81882);
      break;
      label226: localObject1 = localObject2;
      localObject2 = paramList;
      paramList = (List<Pair<Float, Double>>)localObject1;
    }
  }

  private static double getValue(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    AppMethodBeat.i(81884);
    paramDouble2 = (paramDouble5 - paramDouble2) / (paramDouble4 - paramDouble2);
    switch (paramInt)
    {
    default:
      paramDouble1 = paramDouble2 * (paramDouble3 - paramDouble1) + paramDouble1;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(81884);
      return paramDouble1;
      paramDouble1 = -(paramDouble3 - paramDouble1);
      paramDouble1 = Math.cos(paramDouble2 * 1.570796326794897D) * paramDouble1 + paramDouble3;
      continue;
      paramDouble1 = Math.sin(paramDouble2 * 1.570796326794897D) * (paramDouble3 - paramDouble1) + paramDouble1;
      continue;
      paramDouble3 = -(paramDouble3 - paramDouble1) / 2.0D;
      paramDouble1 = (Math.cos(paramDouble2 * 3.141592653589793D) - 1.0D) * paramDouble3 + paramDouble1;
    }
  }

  public static boolean isHorizon(int paramInt)
  {
    if ((paramInt == 90) || (paramInt == 270));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.fabby.FabbyUtil
 * JD-Core Version:    0.6.2
 */