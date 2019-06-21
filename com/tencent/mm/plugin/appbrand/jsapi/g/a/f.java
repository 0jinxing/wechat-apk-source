package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import java.util.Map;
import org.json.JSONObject;

public final class f
{
  private static double hOA = -85.0D;
  private static double hOB = -1000.0D;
  private static double hOC = -85.0D;
  private static double hOD = -1000.0D;

  public static int B(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(93892);
    try
    {
      i = paramJSONObject.optInt("mapId");
      AppMethodBeat.o(93892);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        int i = -1;
        AppMethodBeat.o(93892);
      }
    }
  }

  public static int a(Map<String, Object> paramMap, String paramString, int paramInt)
  {
    AppMethodBeat.i(93894);
    paramMap = bv(paramMap.get(paramString));
    if (paramMap != null)
    {
      paramInt = paramMap.intValue();
      AppMethodBeat.o(93894);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(93894);
    }
  }

  public static String a(Map<String, Object> paramMap, String paramString1, String paramString2)
  {
    AppMethodBeat.i(93893);
    paramMap = paramMap.get(paramString1);
    if ((paramMap instanceof String))
    {
      paramMap = (String)paramMap;
      if (paramMap == null)
        break label55;
      AppMethodBeat.o(93893);
      paramString2 = paramMap;
    }
    while (true)
    {
      return paramString2;
      if (paramMap != null)
      {
        paramMap = String.valueOf(paramMap);
        break;
      }
      paramMap = null;
      break;
      label55: AppMethodBeat.o(93893);
    }
  }

  public static boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, String paramString, double paramDouble5)
  {
    AppMethodBeat.i(93889);
    boolean bool = false;
    if (a.hOE.name().equalsIgnoreCase(paramString))
    {
      if (paramDouble5 == 0.0D)
        bool = false;
      while (paramDouble5 <= 0.0D)
      {
        AppMethodBeat.o(93889);
        return bool;
      }
    }
    label246: 
    while (true)
    {
      bool = true;
      break;
      if (!a.hOF.name().equalsIgnoreCase(paramString))
        break;
      int i;
      if ((paramDouble2 == -85.0D) || (paramDouble1 == -1000.0D))
        i = 0;
      while (true)
      {
        if (i != 0)
          break label246;
        bool = false;
        break;
        if ((paramDouble3 == -1000.0D) || (paramDouble4 == -85.0D))
        {
          i = 0;
        }
        else
        {
          paramDouble2 = 3.141592653589793D * paramDouble2 / 180.0D;
          paramDouble4 = 3.141592653589793D * paramDouble4 / 180.0D;
          paramDouble3 = (paramDouble1 - paramDouble3) * 3.141592653589793D / 180.0D;
          paramDouble1 = Math.pow(Math.sin((paramDouble2 - paramDouble4) / 2.0D), 2.0D);
          if (Math.round(Math.asin(Math.sqrt(Math.cos(paramDouble2) * Math.cos(paramDouble4) * Math.pow(Math.sin(paramDouble3 / 2.0D), 2.0D) + paramDouble1)) * 2.0D * 6378137.0D * 10000.0D) / 10000L >= 5.0D)
            i = 1;
          else
            i = 0;
        }
      }
    }
  }

  public static float ap(float paramFloat)
  {
    if (paramFloat > 0.0F);
    for (paramFloat %= 360.0F; ; paramFloat = (((int)paramFloat * -1 / 360 + 1) * 360 + paramFloat) % 360.0F)
      return paramFloat;
  }

  private static Integer bv(Object paramObject)
  {
    AppMethodBeat.i(93895);
    if ((paramObject instanceof Integer))
    {
      paramObject = (Integer)paramObject;
      AppMethodBeat.o(93895);
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof Number))
      {
        paramObject = Integer.valueOf(((Number)paramObject).intValue());
        AppMethodBeat.o(93895);
      }
      else if ((paramObject instanceof String))
      {
        try
        {
          int i = (int)Double.parseDouble((String)paramObject);
          paramObject = Integer.valueOf(i);
          AppMethodBeat.o(93895);
        }
        catch (NumberFormatException paramObject)
        {
        }
      }
      else
      {
        paramObject = null;
        AppMethodBeat.o(93895);
      }
    }
  }

  public static String g(c paramc, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(93891);
    int i = B(paramJSONObject);
    if (i == -1)
    {
      paramc = "invalid_map_id";
      AppMethodBeat.o(93891);
    }
    while (true)
    {
      return paramc;
      paramc = paramc.aBw() + "&" + i;
      AppMethodBeat.o(93891);
    }
  }

  public static double h(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(93890);
    hOC = paramDouble1;
    hOD = paramDouble2;
    if ((hOA == -85.0D) || (hOB == -1000.0D));
    for (paramDouble1 = 0.0D; ; paramDouble1 = Math.atan2(hOD - hOB, hOC - hOA) * 180.0D / 3.141592D)
    {
      hOA = hOC;
      hOB = hOD;
      AppMethodBeat.o(93890);
      return paramDouble1;
    }
  }

  static enum a
  {
    static
    {
      AppMethodBeat.i(93888);
      hOE = new a("GPS", 0);
      hOF = new a("NETWORK", 1);
      hOG = new a[] { hOE, hOF };
      AppMethodBeat.o(93888);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.f
 * JD-Core Version:    0.6.2
 */