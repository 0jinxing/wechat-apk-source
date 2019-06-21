package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class v$a
  implements bz.a
{
  private static final a ham;

  static
  {
    AppMethodBeat.i(129671);
    ham = new a();
    AppMethodBeat.o(129671);
  }

  public static void axy()
  {
    AppMethodBeat.i(129667);
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("UpdateWxaUsageListNotify", ham, true);
    AppMethodBeat.o(129667);
  }

  public static void unregister()
  {
    AppMethodBeat.i(129668);
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("UpdateWxaUsageListNotify", ham, true);
    AppMethodBeat.o(129668);
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(129669);
    parama = aa.a(parama.eAB.vED);
    if (bo.isNullOrNil(parama))
      AppMethodBeat.o(129669);
    while (true)
    {
      return;
      e.aNS().aa(new v.a.1(this, parama));
      AppMethodBeat.o(129669);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.v.a
 * JD-Core Version:    0.6.2
 */