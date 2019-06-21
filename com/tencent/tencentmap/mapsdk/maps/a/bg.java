package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class bg
{
  private static volatile boolean a = false;

  public static void a(bh parambh)
  {
    boolean bool1 = true;
    int i = 0;
    try
    {
      AppMethodBeat.i(98561);
      if (a)
      {
        AppMethodBeat.o(98561);
        return;
      }
      System.currentTimeMillis();
      SystemClock.elapsedRealtime();
      if (parambh == null)
      {
        parambh = new com/tencent/tencentmap/mapsdk/maps/a/bi;
        parambh.<init>("initParam null");
        AppMethodBeat.o(98561);
        throw parambh;
      }
    }
    finally
    {
    }
    Object localObject = parambh.a().getPackageName();
    String str = er.a(parambh.a());
    boolean bool2 = parambh.f();
    int j = parambh.g();
    if (parambh.d());
    for (int k = parambh.e(); k <= 0; k = er.a(parambh.a(), (String)localObject))
    {
      parambh = new com/tencent/tencentmap/mapsdk/maps/a/bi;
      parambh.<init>("appid illegal:".concat(String.valueOf(k)));
      AppMethodBeat.o(98561);
      throw parambh;
    }
    if ((bool2) && (j <= 0))
    {
      parambh = new com/tencent/tencentmap/mapsdk/maps/a/bi;
      parambh.<init>("testAppid illegal:".concat(String.valueOf(j)));
      AppMethodBeat.o(98561);
      throw parambh;
    }
    int m = i;
    if (!parambh.d())
    {
      er.a locala = er.a(k, parambh.a(), (String)localObject, "com.tencent.halley.common.platform.service.PlatformService");
      if (locala == null)
      {
        parambh = new com/tencent/tencentmap/mapsdk/maps/a/bi;
        parambh.<init>("need set PlatformService in manifest for halley");
        AppMethodBeat.o(98561);
        throw parambh;
      }
      if ((locala.d != null) && (locala.a != null))
        if (locala.d.equals(locala.a))
          break label289;
      while (true)
      {
        bt.f = bool1;
        if (!locala.c)
          break;
        parambh = new com/tencent/tencentmap/mapsdk/maps/a/bi;
        parambh.<init>("need set PlatformService exported to false");
        AppMethodBeat.o(98561);
        throw parambh;
        label289: bool1 = false;
      }
      if (!locala.b)
      {
        parambh = new com/tencent/tencentmap/mapsdk/maps/a/bi;
        parambh.<init>("need set PlatformService enabled to true");
        AppMethodBeat.o(98561);
        throw parambh;
      }
      localObject = er.a(k, parambh.a(), (String)localObject, "com.tencent.halley.common.platform.service.ActivateService");
      m = i;
      if (localObject != null)
      {
        if (!((er.a)localObject).c)
        {
          parambh = new com/tencent/tencentmap/mapsdk/maps/a/bi;
          parambh.<init>("need set ActivateService exported to true");
          AppMethodBeat.o(98561);
          throw parambh;
        }
        if (((er.a)localObject).e == null)
        {
          parambh = new com/tencent/tencentmap/mapsdk/maps/a/bi;
          parambh.<init>("need set security_version for ActivateService");
          AppMethodBeat.o(98561);
          throw parambh;
        }
        i = ((er.a)localObject).e.getInt("security_version");
        m = i;
        if (i <= 0)
        {
          parambh = new com/tencent/tencentmap/mapsdk/maps/a/bi;
          parambh.<init>("need set valid security_version for ActivateService");
          AppMethodBeat.o(98561);
          throw parambh;
        }
      }
    }
    if (bool2)
      k = j;
    while (true)
    {
      bt.a(bool2, k, parambh, str, m);
      bw.a();
      ce.a.a(parambh.h());
      en.d().g();
      a = true;
      SystemClock.elapsedRealtime();
      AppMethodBeat.o(98561);
      break;
    }
  }

  public static bk b(bh parambh)
  {
    AppMethodBeat.i(98562);
    if (!a)
      a(parambh);
    parambh = bn.a();
    AppMethodBeat.o(98562);
    return parambh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bg
 * JD-Core Version:    0.6.2
 */