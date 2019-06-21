package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;

public final class k extends j<b>
{
  public static final String[] fjY;
  public final e gTC;

  static
  {
    AppMethodBeat.i(129556);
    fjY = new String[] { j.a(b.fjX, "AppBrandAppLaunchUsernameDuplicateRecord") };
    AppMethodBeat.o(129556);
  }

  public k(e parame)
  {
    super(parame, b.fjX, "AppBrandAppLaunchUsernameDuplicateRecord", b.diI);
    this.gTC = parame;
  }

  public final boolean x(String paramString, long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(129555);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(129555);
    while (true)
    {
      return bool;
      b localb = new b();
      localb.field_username = paramString;
      bool = b(localb, new String[0]);
      localb.field_updateTime = paramLong;
      if (bool)
      {
        bool = c(localb, new String[0]);
        AppMethodBeat.o(129555);
      }
      else
      {
        bool = b(localb);
        AppMethodBeat.o(129555);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.k
 * JD-Core Version:    0.6.2
 */