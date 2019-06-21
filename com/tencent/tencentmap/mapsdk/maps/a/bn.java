package com.tencent.tencentmap.mapsdk.maps.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ThreadPoolExecutor;

public final class bn
  implements bk
{
  private static bn a;

  static
  {
    AppMethodBeat.i(98568);
    a = new bn();
    AppMethodBeat.o(98568);
  }

  public static bn a()
  {
    return a;
  }

  private bq a(boolean paramBoolean, bp parambp, bj parambj)
  {
    AppMethodBeat.i(98567);
    parambp.h = parambj;
    parambp.n = System.currentTimeMillis();
    ce.a.a("app_http_use_proxy", 0, 1, 1);
    parambj = new bs(parambp);
    parambp.i = parambj;
    int i;
    if (paramBoolean)
      if (parambp.k <= 0)
      {
        parambp.a(parambj.a());
        i = 0;
        parambj = parambp.c();
        if (i != 0)
          parambp.m = true;
        if (parambj != null)
          break label205;
      }
    label205: for (parambp = new cv(-14, "force return timeout:" + parambp.k, 0); ; parambp = parambj)
    {
      parambp = new bq(parambp);
      AppMethodBeat.o(98567);
      while (true)
      {
        return parambp;
        ch.a().b().execute(new bo(this, parambj, parambp));
        if (!parambp.a())
        {
          i = 1;
          break;
        }
        i = 0;
        break;
        parambj = new bq(parambj.a());
        if (!parambp.j)
          parambp.h.a(parambp, parambj);
        parambp = null;
        AppMethodBeat.o(98567);
      }
    }
  }

  public final bl a(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98565);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = new IllegalArgumentException("url is empty");
      AppMethodBeat.o(98565);
      throw paramString;
    }
    paramString = new bp(paramString, paramArrayOfByte);
    AppMethodBeat.o(98565);
    return paramString;
  }

  public final bm a(bl parambl)
  {
    AppMethodBeat.i(98566);
    if (parambl == null)
    {
      parambl = new RuntimeException("execute...IHttpRequest is null");
      AppMethodBeat.o(98566);
      throw parambl;
    }
    if (!(parambl instanceof bp))
    {
      parambl = new RuntimeException("execute...IHttpRequest should be create by API:createRequest");
      AppMethodBeat.o(98566);
      throw parambl;
    }
    parambl = a(true, (bp)parambl, null);
    AppMethodBeat.o(98566);
    return parambl;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bn
 * JD-Core Version:    0.6.2
 */