package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.c;
import com.tencent.mm.plugin.appbrand.b.c.a;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.c;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.o;

public final class a extends p
{
  private static final int CTRL_INDEX = 460;
  private static final String NAME = "onH5Data";

  public static void k(o paramo)
  {
    AppMethodBeat.i(131087);
    String str = paramo.mAppId;
    a.1 local1 = new a.1();
    MMToClientEvent.a(str, local1);
    paramo.gNN.a(new c.a()
    {
      public final void a(String paramAnonymousString, b paramAnonymousb)
      {
        AppMethodBeat.i(131086);
        if (paramAnonymousb == b.gWw)
          MMToClientEvent.b(paramAnonymousString, this.hce);
        AppMethodBeat.o(131086);
      }
    });
    AppMethodBeat.o(131087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.h5_interact.a
 * JD-Core Version:    0.6.2
 */