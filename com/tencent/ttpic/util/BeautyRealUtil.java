package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.config.BeautyRealConfig;
import com.tencent.ttpic.config.BeautyRealConfig.TYPE;
import com.tencent.ttpic.filter.BeautyParam;
import com.tencent.ttpic.model.DistortParam;
import com.tencent.ttpic.model.DistortionItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BeautyRealUtil
{
  public static final BeautyParam EMPTY_PARAM;

  static
  {
    AppMethodBeat.i(83808);
    EMPTY_PARAM = new BeautyParam(false);
    AppMethodBeat.o(83808);
  }

  public static Map<BeautyRealConfig.TYPE, Integer> getBeautyLevels(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(83806);
    HashMap localHashMap = new HashMap();
    localHashMap.put(BeautyRealConfig.TYPE.BEAUTY, Integer.valueOf(60));
    Object localObject;
    int i;
    if (paramInt == BeautyRealConfig.TYPE.NONE.value)
    {
      if (paramBoolean)
      {
        localHashMap.put(BeautyRealConfig.TYPE.BEAUTY, Integer.valueOf(0));
        localHashMap.put(BeautyRealConfig.TYPE.BASIC3, Integer.valueOf(0));
      }
      while (true)
      {
        localObject = BeautyRealConfig.SINGLE_TRANS_TYPE_574;
        i = localObject.length;
        for (paramInt = 0; paramInt < i; paramInt++)
          localHashMap.put(localObject[paramInt], Integer.valueOf(0));
        localHashMap.put(BeautyRealConfig.TYPE.BEAUTY, Integer.valueOf(50));
        localHashMap.put(BeautyRealConfig.TYPE.BASIC3, Integer.valueOf(65));
      }
    }
    if (paramInt == BeautyRealConfig.TYPE.NATURE.value)
    {
      localHashMap.put(BeautyRealConfig.TYPE.FACE_SHORTEN, Integer.valueOf(20));
      localHashMap.put(BeautyRealConfig.TYPE.FACE_V, Integer.valueOf(40));
      localHashMap.put(BeautyRealConfig.TYPE.FACE_THIN, Integer.valueOf(40));
      localHashMap.put(BeautyRealConfig.TYPE.EYE, Integer.valueOf(50));
    }
    while (true)
    {
      for (localObject : BeautyRealConfig.SINGLE_TRANS_TYPE_574)
        if (!localHashMap.containsKey(localObject))
          localHashMap.put(localObject, Integer.valueOf(0));
      if (paramInt == BeautyRealConfig.TYPE.CUTE.value)
      {
        localHashMap.put(BeautyRealConfig.TYPE.FACE_SHORTEN, Integer.valueOf(80));
        localHashMap.put(BeautyRealConfig.TYPE.CHIN, Integer.valueOf(-20));
        localHashMap.put(BeautyRealConfig.TYPE.FACE_V, Integer.valueOf(50));
        localHashMap.put(BeautyRealConfig.TYPE.EYE, Integer.valueOf(100));
        localHashMap.put(BeautyRealConfig.TYPE.NOSE, Integer.valueOf(40));
      }
      else if (paramInt == BeautyRealConfig.TYPE.MELON.value)
      {
        localHashMap.put(BeautyRealConfig.TYPE.CHIN, Integer.valueOf(10));
        localHashMap.put(BeautyRealConfig.TYPE.FACE_V, Integer.valueOf(80));
        localHashMap.put(BeautyRealConfig.TYPE.FACE_THIN, Integer.valueOf(80));
        localHashMap.put(BeautyRealConfig.TYPE.EYE, Integer.valueOf(60));
        localHashMap.put(BeautyRealConfig.TYPE.NOSE, Integer.valueOf(40));
      }
      else
      {
        localObject = BeautyRealConfig.TYPE.MELON;
      }
    }
    AppMethodBeat.o(83806);
    return localHashMap;
  }

  public static Map<BeautyRealConfig.TYPE, Integer> getBeautyLevels573(int paramInt)
  {
    AppMethodBeat.i(83807);
    HashMap localHashMap = new HashMap();
    localHashMap.put(BeautyRealConfig.TYPE.BEAUTY, Integer.valueOf(60));
    Object localObject1;
    int i;
    if (paramInt == BeautyRealConfig.TYPE.NONE.value)
    {
      localHashMap.put(BeautyRealConfig.TYPE.BEAUTY, Integer.valueOf(0));
      localObject1 = BeautyRealConfig.SINGLE_TRANS_TYPE_573;
      i = localObject1.length;
      for (paramInt = 0; paramInt < i; paramInt++)
        localHashMap.put(localObject1[paramInt], Integer.valueOf(0));
      localHashMap.put(BeautyRealConfig.TYPE.EYE_LIGHTEN, Integer.valueOf(0));
      localHashMap.put(BeautyRealConfig.TYPE.REMOVE_POUNCH, Integer.valueOf(0));
    }
    while (true)
    {
      for (Object localObject2 : BeautyRealConfig.SINGLE_TRANS_TYPE_573)
        if (!localHashMap.containsKey(localObject2))
          localHashMap.put(localObject2, Integer.valueOf(0));
      if (paramInt == BeautyRealConfig.TYPE.NATURE.value)
      {
        localHashMap.put(BeautyRealConfig.TYPE.FACE_SHORTEN, Integer.valueOf(20));
        localHashMap.put(BeautyRealConfig.TYPE.FACE_V, Integer.valueOf(40));
        localHashMap.put(BeautyRealConfig.TYPE.FACE_THIN, Integer.valueOf(40));
        localHashMap.put(BeautyRealConfig.TYPE.EYE, Integer.valueOf(50));
      }
      else if (paramInt == BeautyRealConfig.TYPE.CUTE.value)
      {
        localHashMap.put(BeautyRealConfig.TYPE.FACE_SHORTEN, Integer.valueOf(80));
        localHashMap.put(BeautyRealConfig.TYPE.CHIN, Integer.valueOf(-20));
        localHashMap.put(BeautyRealConfig.TYPE.FACE_V, Integer.valueOf(50));
        localHashMap.put(BeautyRealConfig.TYPE.EYE, Integer.valueOf(100));
        localHashMap.put(BeautyRealConfig.TYPE.NOSE, Integer.valueOf(40));
      }
      else if (paramInt == BeautyRealConfig.TYPE.MELON.value)
      {
        localHashMap.put(BeautyRealConfig.TYPE.CHIN, Integer.valueOf(10));
        localHashMap.put(BeautyRealConfig.TYPE.FACE_V, Integer.valueOf(80));
        localHashMap.put(BeautyRealConfig.TYPE.FACE_THIN, Integer.valueOf(80));
        localHashMap.put(BeautyRealConfig.TYPE.EYE, Integer.valueOf(60));
        localHashMap.put(BeautyRealConfig.TYPE.NOSE, Integer.valueOf(40));
      }
      else
      {
        localObject1 = BeautyRealConfig.TYPE.MELON;
      }
    }
    AppMethodBeat.o(83807);
    return localHashMap;
  }

  public static DistortParam getDistortParam(DistortParam paramDistortParam, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(83805);
    DistortParam localDistortParam = new DistortParam();
    if (paramDistortParam == null)
      AppMethodBeat.o(83805);
    while (true)
    {
      return localDistortParam;
      ArrayList localArrayList = new ArrayList();
      float f = paramInt1 / 100.0F;
      Iterator localIterator = paramDistortParam.getItems().iterator();
      if (localIterator.hasNext())
      {
        paramDistortParam = ((DistortionItem)localIterator.next()).clone();
        if (paramInt2 == BeautyRealConfig.TYPE.CHIN.value)
          if (paramInt1 < 0)
          {
            paramDistortParam.strength *= -f;
            paramDistortParam.direction = 2;
          }
        while (true)
        {
          localArrayList.add(paramDistortParam);
          break;
          paramDistortParam.strength *= f;
          paramDistortParam.direction = 4;
          continue;
          paramDistortParam.strength *= f;
        }
      }
      localDistortParam.setLevel(paramInt1);
      localDistortParam.setItems(localArrayList);
      AppMethodBeat.o(83805);
    }
  }

  public static boolean isCombinedType(int paramInt)
  {
    boolean bool1 = false;
    BeautyRealConfig.TYPE[] arrayOfTYPE = BeautyRealConfig.COMBINED_TYPE;
    int i = arrayOfTYPE.length;
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (arrayOfTYPE[j].value == paramInt)
          bool2 = true;
      }
      else
        return bool2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.BeautyRealUtil
 * JD-Core Version:    0.6.2
 */