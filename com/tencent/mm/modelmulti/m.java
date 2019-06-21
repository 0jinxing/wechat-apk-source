package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.g;
import com.tencent.mm.plugin.messenger.foundation.a.q;
import com.tencent.mm.storage.bi;

public final class m
  implements q
{
  private final m.a fJa;
  private g fJb;

  public m()
  {
    AppMethodBeat.i(980);
    this.fJa = new m.a((byte)0);
    AppMethodBeat.o(980);
  }

  public final String B(bi parambi)
  {
    AppMethodBeat.i(981);
    if (this.fJb != null)
    {
      parambi = this.fJb.B(parambi);
      AppMethodBeat.o(981);
    }
    while (true)
    {
      return parambi;
      parambi = null;
      AppMethodBeat.o(981);
    }
  }

  public final void a(g paramg)
  {
    this.fJb = paramg;
  }

  public final void a(com.tencent.mm.plugin.messenger.foundation.a.m paramm)
  {
    AppMethodBeat.i(982);
    this.fJa.aD(paramm);
    AppMethodBeat.o(982);
  }

  public final com.tencent.mm.plugin.messenger.foundation.a.m ahU()
  {
    return this.fJa;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.m
 * JD-Core Version:    0.6.2
 */