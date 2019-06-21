package com.tencent.mm.plugin.appbrand.game.c;

import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.handler.image.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;

public final class b
{
  public static void a(MBRuntime paramMBRuntime, i parami, boolean paramBoolean)
  {
    AppMethodBeat.i(130136);
    paramMBRuntime = (a)paramMBRuntime.getImageHandler();
    paramMBRuntime.a(new b.b(parami, paramMBRuntime, (byte)0), true);
    new c();
    paramMBRuntime.bUf = new b.a(paramBoolean);
    AppMethodBeat.o(130136);
  }

  static final class c
  {
    private int hro = -1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.c.b
 * JD-Core Version:    0.6.2
 */