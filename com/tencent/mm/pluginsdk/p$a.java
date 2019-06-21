package com.tencent.mm.pluginsdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.a.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class p$a
{
  public static p.b vav;

  public static p.b dgQ()
  {
    AppMethodBeat.i(27227);
    if (vav == null)
    {
      ab.w("MicroMsg.IPluginEvent.Factory", "get shake mgr is null, new default");
      vav = new c();
    }
    p.b localb = vav;
    AppMethodBeat.o(27227);
    return localb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.p.a
 * JD-Core Version:    0.6.2
 */