package com.tencent.mm.plugin.abtest;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.a.a;
import com.tencent.mm.model.a.d;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.p;

public final class b extends q
  implements c
{
  private static b gpL;
  private d gpM;
  private a gpN;

  private b()
  {
    super(com.tencent.mm.model.a.g.class);
    AppMethodBeat.i(118188);
    this.gpM = new d();
    this.gpN = new a();
    AppMethodBeat.o(118188);
  }

  public static b aoM()
  {
    try
    {
      AppMethodBeat.i(118189);
      if (gpL == null)
      {
        localb = new com/tencent/mm/plugin/abtest/b;
        localb.<init>();
        gpL = localb;
      }
      b localb = gpL;
      AppMethodBeat.o(118189);
      return localb;
    }
    finally
    {
    }
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(118190);
    super.onAccountInitialized(paramc);
    e.d.a(Integer.valueOf(-1879048184), this.gpM);
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().a("abtest", this.gpN);
    AppMethodBeat.o(118190);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(118191);
    super.onAccountRelease();
    e.d.a(Integer.valueOf(-1879048184), this.gpM);
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().b("abtest", this.gpN);
    AppMethodBeat.o(118191);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.abtest.b
 * JD-Core Version:    0.6.2
 */