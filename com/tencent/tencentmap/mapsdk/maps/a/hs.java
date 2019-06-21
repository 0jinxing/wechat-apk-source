package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.aj;

public class hs
{
  public static String a()
  {
    AppMethodBeat.i(99572);
    String str = e();
    if (str.equals("didi"))
      if (aj.a() == 1)
      {
        str = "https://ddsdk.vectors.map.qq.com";
        AppMethodBeat.o(99572);
      }
    while (true)
    {
      return str;
      str = "https://ddsdk.vectors2.map.qq.com";
      AppMethodBeat.o(99572);
      continue;
      if (str.equals("tencentmap"))
      {
        str = "https://mapvectors.map.qq.com";
        AppMethodBeat.o(99572);
      }
      else
      {
        str = "https://vectorsdk.map.qq.com";
        AppMethodBeat.o(99572);
      }
    }
  }

  public static String a(String paramString)
  {
    AppMethodBeat.i(99574);
    String str = e();
    if ((!str.equals("didi")) && (!str.equals("tencentmap")) && (paramString.contains("indoor_map")))
    {
      paramString = paramString.replace("https://vectorsdk.map.qq.com/indoor_map?", "https://mapvectors.map.qq.com/indoormap2?");
      paramString = paramString + "&apiKey=" + ic.a;
      AppMethodBeat.o(99574);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(99574);
    }
  }

  public static String b()
  {
    AppMethodBeat.i(99573);
    String str;
    if (e().equals("didi"))
    {
      str = "/mobile_newmap";
      AppMethodBeat.o(99573);
    }
    while (true)
    {
      return str;
      str = "/mvd_map";
      AppMethodBeat.o(99573);
    }
  }

  public static String c()
  {
    AppMethodBeat.i(99575);
    String str;
    if (e().equals("didi"))
    {
      str = "1HV13IK65T1XH392";
      AppMethodBeat.o(99575);
    }
    while (true)
    {
      return str;
      str = "0M3009PNO62FLOQC";
      AppMethodBeat.o(99575);
    }
  }

  public static String d()
  {
    AppMethodBeat.i(99576);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("https://closedroadvector.map.qq.com/closed_road_v2?");
    ((StringBuilder)localObject).append("iszip=true");
    ((StringBuilder)localObject).append("&imei=" + ic.a());
    ((StringBuilder)localObject).append("&pf=android");
    ((StringBuilder)localObject).append("&sdkversion=4.2.2");
    ((StringBuilder)localObject).append("&p=sdk");
    ((StringBuilder)localObject).append("&nettype=" + ic.b());
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(99576);
    return localObject;
  }

  private static String e()
  {
    return "wechat";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hs
 * JD-Core Version:    0.6.2
 */