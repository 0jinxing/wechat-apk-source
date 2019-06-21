package com.tencent.mm.plugin.account.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
  implements o
{
  public static volatile n gkE;
  public static volatile m gkF;

  public final void a(m paramm)
  {
    AppMethodBeat.i(73678);
    ab.i("MicroMsg.AccountSyncApplication", "regitMMModelCallback %s", new Object[] { paramm });
    gkF = paramm;
    AppMethodBeat.o(73678);
  }

  public final void a(n paramn)
  {
    gkE = paramn;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.a.a
 * JD-Core Version:    0.6.2
 */