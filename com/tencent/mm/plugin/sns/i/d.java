package com.tencent.mm.plugin.sns.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.rq;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import java.util.HashMap;

public final class d
{
  private static d qSX = null;
  private c<rq> ecA;
  public HashMap<Integer, String> qSY;

  private d()
  {
    AppMethodBeat.i(36876);
    this.qSY = null;
    this.ecA = new c()
    {
    };
    this.qSY = new HashMap();
    a.xxA.b(this.ecA);
    AppMethodBeat.o(36876);
  }

  public static d coE()
  {
    AppMethodBeat.i(36877);
    if (qSX == null)
      qSX = new d();
    d locald = qSX;
    AppMethodBeat.o(36877);
    return locald;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.i.d
 * JD-Core Version:    0.6.2
 */