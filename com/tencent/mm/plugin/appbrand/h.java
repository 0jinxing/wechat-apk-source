package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.d;
import com.tencent.mm.sdk.b.c;

public final class h
{
  private static final c<d> gNw;

  static
  {
    AppMethodBeat.i(128954);
    gNw = new h.1();
    AppMethodBeat.o(128954);
  }

  public static void release()
  {
    AppMethodBeat.i(128953);
    gNw.dead();
    AppMethodBeat.o(128953);
  }

  public static void setup()
  {
    AppMethodBeat.i(128952);
    gNw.dnU();
    AppMethodBeat.o(128952);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h
 * JD-Core Version:    0.6.2
 */