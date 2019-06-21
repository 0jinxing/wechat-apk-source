package com.tencent.mm.plugin.wallet.pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static Map<String, List<Integer>> tnY;
  private static Map<String, Boolean> tnZ;
  private static Map<String, Integer> toa;

  static
  {
    AppMethodBeat.i(45918);
    tnY = new ConcurrentHashMap();
    tnZ = new ConcurrentHashMap();
    toa = new ConcurrentHashMap();
    AppMethodBeat.o(45918);
  }

  public static void acn(String paramString)
  {
    AppMethodBeat.i(45910);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(45910);
      return;
    }
    if (toa.containsKey(paramString))
    {
      localInteger = (Integer)toa.get(paramString);
      if (localInteger == null);
    }
    for (Integer localInteger = Integer.valueOf(localInteger.intValue() + 1); ; localInteger = Integer.valueOf(1))
    {
      toa.put(paramString, localInteger);
      AppMethodBeat.o(45910);
      break;
    }
  }

  public static void aco(String paramString)
  {
    AppMethodBeat.i(45911);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(45911);
    while (true)
    {
      return;
      toa.remove(paramString);
      AppMethodBeat.o(45911);
    }
  }

  private static boolean acp(String paramString)
  {
    AppMethodBeat.i(45913);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(45913);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (toa.containsKey(paramString))
      {
        paramString = (Integer)toa.get(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(45913);
          bool = false;
        }
        else if (paramString.intValue() > 1)
        {
          AppMethodBeat.o(45913);
          bool = true;
        }
      }
      else
      {
        AppMethodBeat.o(45913);
        bool = false;
      }
    }
  }

  public static void acq(String paramString)
  {
    AppMethodBeat.i(45916);
    if ((!bo.isNullOrNil(paramString)) && (!tnY.containsKey(paramString)))
      tnY.put(paramString, new ArrayList());
    AppMethodBeat.o(45916);
  }

  public static void acr(String paramString)
  {
    AppMethodBeat.i(45917);
    if (!bo.isNullOrNil(paramString))
    {
      tnY.remove(paramString);
      tnZ.remove(paramString);
    }
    AppMethodBeat.o(45917);
  }

  public static void bz(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(45915);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(45915);
    while (true)
    {
      return;
      tnZ.put(paramString, Boolean.valueOf(paramBoolean));
      AppMethodBeat.o(45915);
    }
  }

  public static void dr(String paramString, int paramInt)
  {
    AppMethodBeat.i(45912);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(45912);
    while (true)
    {
      return;
      Object localObject;
      if (!tnY.containsKey(paramString))
      {
        localObject = new ArrayList();
        ((ArrayList)localObject).add(Integer.valueOf(paramInt));
        tnY.put(paramString, localObject);
        AppMethodBeat.o(45912);
      }
      else
      {
        localObject = (List)tnY.get(paramString);
        ((List)localObject).add(Integer.valueOf(paramInt));
        tnY.put(paramString, localObject);
        AppMethodBeat.o(45912);
      }
    }
  }

  public static void r(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(45914);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(45914);
    while (true)
    {
      return;
      if ((tnY.containsKey(paramString)) && (((List)tnY.get(paramString)).size() > 0))
      {
        if (paramInt != 1)
          break label208;
        h.pYm.k(965L, 10L, 1L);
        h.pYm.k(965L, 30L, 1L);
        if (acp(paramString))
          h.pYm.k(965L, 25L, 1L);
        label101: if (acp(paramString))
          h.pYm.k(965L, 24L, 1L);
        h.pYm.k(965L, 29L, 1L);
        if (!paramBoolean)
          break label262;
        h.pYm.k(965L, 20L, 1L);
      }
      while (true)
        if (tnZ.containsKey(paramString))
        {
          paramString = (Boolean)tnZ.get(paramString);
          if (paramString != null)
          {
            if (paramString.booleanValue())
            {
              h.pYm.k(965L, 18L, 1L);
              AppMethodBeat.o(45914);
              break;
              label208: if (paramInt != 2)
                break label101;
              h.pYm.k(965L, 11L, 1L);
              h.pYm.k(965L, 31L, 1L);
              if (!acp(paramString))
                break label101;
              h.pYm.k(965L, 26L, 1L);
              break label101;
              label262: h.pYm.k(965L, 21L, 1L);
              continue;
            }
            h.pYm.k(965L, 19L, 1L);
          }
        }
      AppMethodBeat.o(45914);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.a.b
 * JD-Core Version:    0.6.2
 */