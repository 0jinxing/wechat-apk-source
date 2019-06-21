package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class g
{
  private static HashMap<String, g> uDS;
  public long startTime;
  public long uDL;
  public long uDM;
  public long uDN;
  public long uDO;
  public long uDP;
  public long uDQ;
  public long uDR;
  public String url;

  static
  {
    AppMethodBeat.i(8719);
    uDS = new HashMap();
    AppMethodBeat.o(8719);
  }

  private static Bundle a(int paramInt, String paramString, long paramLong)
  {
    AppMethodBeat.i(8718);
    Bundle localBundle = new Bundle();
    localBundle.putInt("type", paramInt);
    localBundle.putString("url", paramString);
    localBundle.putLong("time", paramLong);
    AppMethodBeat.o(8718);
    return localBundle;
  }

  public static void aA(String paramString, long paramLong)
  {
    AppMethodBeat.i(8711);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(8711);
    while (true)
    {
      return;
      if (ah.doF())
      {
        agh(paramString).uDL = paramLong;
        AppMethodBeat.o(8711);
      }
      else
      {
        f.a("com.tencent.mm:tools", a(2, paramString, paramLong), g.a.class, null);
        AppMethodBeat.o(8711);
      }
    }
  }

  public static void aB(String paramString, long paramLong)
  {
    AppMethodBeat.i(8712);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(8712);
    while (true)
    {
      return;
      if (ah.doF())
      {
        agh(paramString).uDM = paramLong;
        AppMethodBeat.o(8712);
      }
      else
      {
        f.a("com.tencent.mm:tools", a(3, paramString, paramLong), g.a.class, null);
        AppMethodBeat.o(8712);
      }
    }
  }

  public static void aC(String paramString, long paramLong)
  {
    AppMethodBeat.i(8713);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(8713);
    while (true)
    {
      return;
      if (ah.doF())
      {
        agh(paramString).uDN = paramLong;
        AppMethodBeat.o(8713);
      }
      else
      {
        f.a("com.tencent.mm:tools", a(4, paramString, paramLong), g.a.class, null);
        AppMethodBeat.o(8713);
      }
    }
  }

  public static void aD(String paramString, long paramLong)
  {
    AppMethodBeat.i(8714);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(8714);
    while (true)
    {
      return;
      if (ah.doF())
      {
        agh(paramString).uDO = paramLong;
        AppMethodBeat.o(8714);
      }
      else
      {
        f.a("com.tencent.mm:tools", a(5, paramString, paramLong), g.a.class, null);
        AppMethodBeat.o(8714);
      }
    }
  }

  public static void aE(String paramString, long paramLong)
  {
    AppMethodBeat.i(8715);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(8715);
    while (true)
    {
      return;
      if (ah.doF())
      {
        agh(paramString).uDP = paramLong;
        AppMethodBeat.o(8715);
      }
      else
      {
        f.a("com.tencent.mm:tools", a(6, paramString, paramLong), g.a.class, null);
        AppMethodBeat.o(8715);
      }
    }
  }

  public static void aF(String paramString, long paramLong)
  {
    AppMethodBeat.i(8716);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(8716);
    while (true)
    {
      return;
      if (ah.doF())
      {
        agh(paramString).uDQ = paramLong;
        AppMethodBeat.o(8716);
      }
      else
      {
        f.a("com.tencent.mm:tools", a(7, paramString, paramLong), g.a.class, null);
        AppMethodBeat.o(8716);
      }
    }
  }

  public static void aG(String paramString, long paramLong)
  {
    AppMethodBeat.i(8717);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(8717);
    while (true)
    {
      return;
      if (ah.doF())
      {
        agh(paramString).uDR = paramLong;
        AppMethodBeat.o(8717);
      }
      else
      {
        f.a("com.tencent.mm:tools", a(8, paramString, paramLong), g.a.class, null);
        AppMethodBeat.o(8717);
      }
    }
  }

  public static g agg(String paramString)
  {
    AppMethodBeat.i(8707);
    if (uDS.containsKey(paramString))
      uDS.remove(paramString);
    g localg = new g();
    localg.url = paramString;
    uDS.put(paramString, localg);
    AppMethodBeat.o(8707);
    return localg;
  }

  public static g agh(String paramString)
  {
    AppMethodBeat.i(8708);
    if (uDS.containsKey(paramString))
    {
      paramString = (g)uDS.get(paramString);
      AppMethodBeat.o(8708);
    }
    while (true)
    {
      return paramString;
      g localg = new g();
      localg.url = paramString;
      uDS.put(paramString, localg);
      AppMethodBeat.o(8708);
      paramString = localg;
    }
  }

  public static g agi(String paramString)
  {
    AppMethodBeat.i(8709);
    paramString = (g)uDS.remove(paramString);
    AppMethodBeat.o(8709);
    return paramString;
  }

  public static void az(String paramString, long paramLong)
  {
    AppMethodBeat.i(8710);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(8710);
    while (true)
    {
      return;
      if (ah.doF())
      {
        agh(paramString).startTime = paramLong;
        AppMethodBeat.o(8710);
      }
      else
      {
        f.a("com.tencent.mm:tools", a(1, paramString, paramLong), g.a.class, null);
        AppMethodBeat.o(8710);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.g
 * JD-Core Version:    0.6.2
 */