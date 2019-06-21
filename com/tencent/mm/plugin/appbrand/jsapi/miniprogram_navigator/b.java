package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public enum b
{
  public final int har;

  static
  {
    AppMethodBeat.i(101978);
    hQB = new b("RELEASE", 0, 0);
    hQC = new b("DEVELOP", 1, 1);
    hQD = new b("TRIAL", 2, 2);
    hQE = new b[] { hQB, hQC, hQD };
    AppMethodBeat.o(101978);
  }

  private b(int paramInt)
  {
    this.har = paramInt;
  }

  public static b a(String paramString, b paramb)
  {
    AppMethodBeat.i(101976);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(101976);
    while (true)
    {
      return paramb;
      b[] arrayOfb = values();
      int i = arrayOfb.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label73;
        b localb = arrayOfb[j];
        if (localb.name().toLowerCase().equals(paramString))
        {
          AppMethodBeat.o(101976);
          paramb = localb;
          break;
        }
      }
      label73: AppMethodBeat.o(101976);
    }
  }

  public static b ot(int paramInt)
  {
    AppMethodBeat.i(101977);
    b[] arrayOfb = values();
    int i = arrayOfb.length;
    int j = 0;
    b localb;
    if (j < i)
    {
      localb = arrayOfb[j];
      if (localb.har == paramInt)
        AppMethodBeat.o(101977);
    }
    while (true)
    {
      return localb;
      j++;
      break;
      localb = hQB;
      AppMethodBeat.o(101977);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b
 * JD-Core Version:    0.6.2
 */