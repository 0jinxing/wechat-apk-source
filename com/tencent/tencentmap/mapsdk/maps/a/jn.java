package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.r;
import com.tencent.tencentmap.mapsdk.a.t;
import com.tencent.tencentmap.mapsdk.a.w;

public class jn
{
  private static boolean a = false;

  public static void a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(100071);
    if (w.a(paramContext).b("mapConfigStyle") != paramInt)
    {
      a = true;
      AppMethodBeat.o(100071);
    }
    while (true)
    {
      return;
      a = false;
      AppMethodBeat.o(100071);
    }
  }

  public static void a(Context paramContext, String paramString)
  {
    AppMethodBeat.i(100072);
    if (paramContext == null)
      AppMethodBeat.o(100072);
    while (true)
    {
      return;
      String str = r.a(paramContext).b(paramString);
      paramString = w.a(paramContext);
      a(paramString);
      int i = ic.b("4.2.2.1", paramString.a("sdkVersion"));
      t.a(paramContext, str, "mapconfig.dat", "mapconfig.dat");
      t.a(paramContext, str, "poi_icon@2x.png", "poi_icon@2x.png");
      t.a(paramContext, str, "poi_icon_nav@2x.png", "poi_icon_nav@2x.png");
      t.a(paramContext, str, "poi_icon_dark@2x.png", "poi_icon_dark@2x.png");
      t.a(paramContext, str, "rtt_config.json", "rtt_config.json");
      t.a(paramContext, str, "indoormap_config.dat", "indoormap_config.dat");
      t.a(paramContext, str, "poi_icon_indoor@2x.png", "poi_icon_indoor@2x.png");
      t.a(paramContext, str, "style_normalmode.xml", "style_normalmode.xml");
      t.a(paramContext, str, "style_trafficmode.xml", "style_trafficmode.xml");
      t.a(paramContext, str, "blockicon.png", "blockicon.png");
      if (i > 0)
        paramString.a("sdkVersion", "4.2.2.1");
      AppMethodBeat.o(100072);
    }
  }

  private static void a(w paramw)
  {
    AppMethodBeat.i(100073);
    if (ic.b(paramw.a("sdkVersion"), "4.0.9.1") < 0)
      paramw.a(new String[] { "mapConfigIndoorVersion", "mapPoiIconIndoorVersion" });
    AppMethodBeat.o(100073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jn
 * JD-Core Version:    0.6.2
 */