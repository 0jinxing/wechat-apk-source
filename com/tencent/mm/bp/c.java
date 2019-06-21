package com.tencent.mm.bp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.model.q.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
{
  public static n vwA;
  public static m vwB;

  public static void aks(String paramString)
  {
    AppMethodBeat.i(114682);
    if (((h)g.RM().Rn()).SG())
      d.a(paramString, vwA, vwB);
    AppMethodBeat.o(114682);
  }

  public static q.a akt(String paramString)
  {
    AppMethodBeat.i(114684);
    c.2 local2 = new c.2(paramString);
    ab.i("MicroMsg.PluginCompatHelper", "CompatSubCore creator %s for plugin %s", new Object[] { local2, paramString });
    AppMethodBeat.o(114684);
    return local2;
  }

  public static void b(String paramString, q paramq)
  {
    AppMethodBeat.i(114683);
    new c.1(paramString, paramq).alone();
    AppMethodBeat.o(114683);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bp.c
 * JD-Core Version:    0.6.2
 */