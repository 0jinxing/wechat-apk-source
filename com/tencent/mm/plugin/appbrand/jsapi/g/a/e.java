package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.n.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  private static final Map<String, Integer> hOz;

  static
  {
    AppMethodBeat.i(93885);
    HashMap localHashMap = new HashMap();
    hOz = localHashMap;
    localHashMap.put("addMapCircles", Integer.valueOf(0));
    hOz.put("addMapMarkers", Integer.valueOf(1));
    hOz.put("removeMapMarkers", Integer.valueOf(2));
    hOz.put("addMapLines", Integer.valueOf(3));
    hOz.put("removeMapLines", Integer.valueOf(4));
    hOz.put("includeMapPoints", Integer.valueOf(5));
    hOz.put("addMapControls", Integer.valueOf(6));
    hOz.put("addMapPolygons", Integer.valueOf(7));
    hOz.put("getMapCenterLocation", Integer.valueOf(8));
    hOz.put("moveToMapLocation", Integer.valueOf(9));
    hOz.put("translateMapMarker", Integer.valueOf(10));
    hOz.put("getMapScale", Integer.valueOf(11));
    hOz.put("getMapRegion", Integer.valueOf(12));
    hOz.put("getMapRotate", Integer.valueOf(13));
    hOz.put("getMapSkew", Integer.valueOf(14));
    hOz.put("getMapIndoorFloor", Integer.valueOf(15));
    hOz.put("setMapIndoorFloor", Integer.valueOf(16));
    hOz.put("eraseMapLines", Integer.valueOf(17));
    AppMethodBeat.o(93885);
  }

  public static void Bj(String paramString)
  {
    AppMethodBeat.i(93882);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(93882);
      return;
    }
    label56: int i;
    switch (paramString.hashCode())
    {
    default:
      i = -1;
      switch (i)
      {
      default:
        label58: if (hOz.containsKey(paramString))
          i = ((Integer)hOz.get(paramString)).intValue() * 5 + 20 + 0;
        break;
      case 0:
      case 1:
      case 2:
      }
      break;
    case -384482333:
    case -1949215789:
    case 1282356792:
    }
    while (true)
    {
      if (i == -1)
      {
        d.e("Luggage.MapReporter", "key is -1, may be err");
        AppMethodBeat.o(93882);
        break;
        if (!paramString.equals("insertMap"))
          break label56;
        i = 0;
        break label58;
        if (!paramString.equals("updateMap"))
          break label56;
        i = 1;
        break label58;
        if (!paramString.equals("removeMap"))
          break label56;
        i = 2;
        break label58;
        i = 0;
        continue;
        i = 3;
        continue;
        i = 6;
        continue;
      }
      oq(i);
      d.v("Luggage.MapReporter", "name:%s invoke key:%d", new Object[] { paramString, Integer.valueOf(i) });
      AppMethodBeat.o(93882);
      break;
      i = -1;
    }
  }

  public static void d(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(93883);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(93883);
      return;
    }
    label56: int i;
    switch (paramString.hashCode())
    {
    default:
      i = -1;
      switch (i)
      {
      default:
        label58: if (hOz.containsKey(paramString))
        {
          int j = ((Integer)hOz.get(paramString)).intValue();
          if (paramBoolean2)
            if (paramBoolean1)
            {
              i = 3;
              label123: i += j * 5 + 20;
            }
        }
        break;
      case 0:
      case 1:
      case 2:
      }
      break;
    case -384482333:
    case -1949215789:
    case 1282356792:
    }
    while (true)
    {
      if (i == -1)
      {
        d.e("Luggage.MapReporter", "key is -1, may be err");
        AppMethodBeat.o(93883);
        break;
        if (!paramString.equals("insertMap"))
          break label56;
        i = 0;
        break label58;
        if (!paramString.equals("updateMap"))
          break label56;
        i = 1;
        break label58;
        if (!paramString.equals("removeMap"))
          break label56;
        i = 2;
        break label58;
        if (paramBoolean1)
        {
          i = 1;
          continue;
        }
        i = 2;
        continue;
        if (paramBoolean1)
        {
          i = 4;
          continue;
        }
        i = 5;
        continue;
        if (paramBoolean1)
        {
          i = 7;
          continue;
        }
        i = 8;
        continue;
        i = 4;
        break label123;
        if (paramBoolean1)
        {
          i = 1;
          break label123;
        }
        i = 2;
        break label123;
      }
      oq(i);
      d.v("Luggage.MapReporter", "name:%s, isOk:%b, isOtherMap:%b, key:%d", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(i) });
      AppMethodBeat.o(93883);
      break;
      i = -1;
    }
  }

  public static void oq(int paramInt)
  {
    AppMethodBeat.i(93884);
    d.v("Luggage.MapReporter", "reportKey:%d", new Object[] { Integer.valueOf(paramInt) });
    ((a)com.tencent.luggage.a.e.C(a.class)).f(1020L, paramInt, 1L);
    AppMethodBeat.o(93884);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.e
 * JD-Core Version:    0.6.2
 */