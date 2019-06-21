package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;

public final class i
  implements a
{
  public static i hVW;
  private a hVX;

  static
  {
    AppMethodBeat.i(126396);
    hVW = new i();
    AppMethodBeat.o(126396);
  }

  public i()
  {
    AppMethodBeat.i(126391);
    this.hVX = new i.1(this);
    AppMethodBeat.o(126391);
  }

  private a aEQ()
  {
    AppMethodBeat.i(126392);
    a locala;
    if (e.B(a.class) != null)
    {
      locala = (a)e.B(a.class);
      AppMethodBeat.o(126392);
    }
    while (true)
    {
      return locala;
      locala = this.hVX;
      AppMethodBeat.o(126392);
    }
  }

  public final boolean a(c paramc, ah paramah)
  {
    AppMethodBeat.i(126395);
    boolean bool = aEQ().a(paramc, paramah);
    AppMethodBeat.o(126395);
    return bool;
  }

  public final int aEN()
  {
    AppMethodBeat.i(126393);
    int i = aEQ().aEN();
    AppMethodBeat.o(126393);
    return i;
  }

  public final int aEO()
  {
    AppMethodBeat.i(126394);
    int i = aEQ().aEO();
    AppMethodBeat.o(126394);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.i
 * JD-Core Version:    0.6.2
 */