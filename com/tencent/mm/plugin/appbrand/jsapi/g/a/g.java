package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@TargetApi(3)
public final class g
{
  private static Map<String, HashMap<String, b>> hOH;
  private static Set<b> hOI;
  public static g.a hOJ;
  public static SensorManager sensorManager;

  static
  {
    AppMethodBeat.i(93904);
    hOH = new HashMap();
    hOI = new HashSet();
    AppMethodBeat.o(93904);
  }

  public static void a(b paramb)
  {
    try
    {
      AppMethodBeat.i(93898);
      ab.i("MicroMsg.AppBrandMapManager", "registerListener map:%s", new Object[] { paramb });
      hOI.add(paramb);
      if (hOI.size() == 1)
        init();
      AppMethodBeat.o(93898);
      return;
    }
    finally
    {
    }
    throw paramb;
  }

  public static boolean a(String paramString1, String paramString2, b paramb)
  {
    try
    {
      AppMethodBeat.i(93901);
      boolean bool;
      if ("invalid_map_id".equals(paramString2))
      {
        ab.e("MicroMsg.AppBrandMapManager", "[createMapView]INVALID_MAP_ID");
        AppMethodBeat.o(93901);
        bool = false;
      }
      while (true)
      {
        return bool;
        HashMap localHashMap1 = (HashMap)hOH.get(paramString1);
        HashMap localHashMap2 = localHashMap1;
        if (localHashMap1 == null)
        {
          localHashMap2 = new java/util/HashMap;
          localHashMap2.<init>();
          hOH.put(paramString1, localHashMap2);
        }
        if (localHashMap2.containsKey(paramString2))
        {
          ab.w("MicroMsg.AppBrandMapManager", "map is exist, return");
          AppMethodBeat.o(93901);
          bool = false;
        }
        else
        {
          localHashMap2.put(paramString2, paramb);
          ab.i("MicroMsg.AppBrandMapManager", "initMapView appId:%s, mapId:%s", new Object[] { paramString1, paramString2 });
          AppMethodBeat.o(93901);
          bool = true;
        }
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  public static void b(b paramb)
  {
    try
    {
      AppMethodBeat.i(93900);
      ab.i("MicroMsg.AppBrandMapManager", "unregisterListener map:%s", new Object[] { paramb });
      hOI.remove(paramb);
      if (hOI.size() == 0)
        uninit();
      AppMethodBeat.o(93900);
      return;
    }
    finally
    {
    }
    throw paramb;
  }

  public static b cj(String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(93902);
      if ("invalid_map_id".equals(paramString2))
      {
        ab.e("MicroMsg.AppBrandMapManager", "[getMapView]INVALID_MAP_ID");
        AppMethodBeat.o(93902);
        paramString1 = null;
      }
      while (true)
      {
        return paramString1;
        paramString1 = (HashMap)hOH.get(paramString1);
        if (paramString1 == null)
        {
          AppMethodBeat.o(93902);
          paramString1 = null;
        }
        else
        {
          paramString1 = (b)paramString1.get(paramString2);
          AppMethodBeat.o(93902);
        }
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  public static boolean ck(String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(93903);
      HashMap localHashMap = (HashMap)hOH.get(paramString1);
      boolean bool;
      if (localHashMap == null)
      {
        AppMethodBeat.o(93903);
        bool = false;
      }
      while (true)
      {
        return bool;
        b localb = (b)localHashMap.get(paramString2);
        if (localb == null)
        {
          ab.e("MicroMsg.AppBrandMapManager", "[destroyMapView] mapview not exist, err");
          AppMethodBeat.o(93903);
          bool = false;
        }
        else
        {
          ab.i("MicroMsg.AppBrandMapManager", "destoryMapView map:%s", new Object[] { localb });
          localHashMap.remove(paramString2);
          b(localb);
          if (localHashMap.size() <= 0)
            hOH.remove(paramString1);
          localb.onDestroy();
          ab.i("MicroMsg.AppBrandMapManager", "[destroyMapView]appid:%s, map count:%d", new Object[] { paramString1, Integer.valueOf(localHashMap.size()) });
          AppMethodBeat.o(93903);
          bool = true;
        }
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  private static void init()
  {
    try
    {
      AppMethodBeat.i(93897);
      ab.i("MicroMsg.AppBrandMapManager", "init");
      if (hOJ == null)
      {
        Object localObject1 = new com/tencent/mm/plugin/appbrand/jsapi/g/a/g$a;
        ((g.a)localObject1).<init>();
        hOJ = (g.a)localObject1;
        localObject1 = (SensorManager)ah.getContext().getSystemService("sensor");
        sensorManager = (SensorManager)localObject1;
        localObject1 = ((SensorManager)localObject1).getDefaultSensor(3);
        sensorManager.registerListener(hOJ, (Sensor)localObject1, 1);
      }
      AppMethodBeat.o(93897);
      return;
    }
    finally
    {
    }
  }

  private static void uninit()
  {
    try
    {
      AppMethodBeat.i(93899);
      ab.i("MicroMsg.AppBrandMapManager", "uninit");
      if ((hOJ != null) && (sensorManager != null))
      {
        ab.i("MicroMsg.AppBrandMapManager", "sensorListener uninit");
        sensorManager.unregisterListener(hOJ);
        sensorManager = null;
        hOJ = null;
      }
      AppMethodBeat.o(93899);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.g
 * JD-Core Version:    0.6.2
 */