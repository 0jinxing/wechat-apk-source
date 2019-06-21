package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import android.annotation.SuppressLint;
import android.content.Context;
import com.tencent.luggage.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.page.a;
import com.tencent.mm.plugin.appbrand.jsapi.l;
import com.tencent.mm.plugin.appbrand.menu.n;
import com.tencent.mm.plugin.appbrand.page.aj;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.sdk.platformtools.al;
import java.util.List;

public final class i extends w
  implements m
{
  private String hsV;
  private volatile l ikr;
  private String ikx;

  @SuppressLint({"MissingSuperCall"})
  public final boolean AA(String paramString)
  {
    AppMethodBeat.i(132135);
    this.hsV = h.bO(paramString);
    this.ikx = paramString;
    al.d(new i.1(this));
    AppMethodBeat.o(132135);
    return true;
  }

  public final void M(int paramInt, String paramString)
  {
    AppMethodBeat.i(132136);
    ((j)super.getRuntime()).ikA.a(this, paramInt, paramString);
    AppMethodBeat.o(132136);
  }

  public final int a(com.tencent.mm.plugin.appbrand.h.i parami, int paramInt)
  {
    return paramInt;
  }

  public final String aBm()
  {
    return this.ikx;
  }

  public final l aCc()
  {
    AppMethodBeat.i(132134);
    l locall = new l(this);
    this.ikr = locall;
    AppMethodBeat.o(132134);
    return locall;
  }

  public final l aHR()
  {
    return this.ikr;
  }

  public final void aIb()
  {
  }

  public final void aL(List<n> paramList)
  {
  }

  public final aj cF(Context paramContext)
  {
    AppMethodBeat.i(132137);
    paramContext = new a();
    AppMethodBeat.o(132137);
    return paramContext;
  }

  public final String getURL()
  {
    return this.hsV;
  }

  public final void onCreate()
  {
  }

  public final void xN()
  {
    AppMethodBeat.i(132138);
    try
    {
      super.xN();
      AppMethodBeat.o(132138);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
        AppMethodBeat.o(132138);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.i
 * JD-Core Version:    0.6.2
 */