package com.tencent.mm.plugin.webview.luggage.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.ui.base.l;

public final class f extends a
{
  public f()
  {
    super(35);
  }

  public final void a(Context paramContext, d paramd)
  {
    AppMethodBeat.i(6434);
    paramContext = paramd.cWP();
    if (paramContext != null)
      if (!paramContext.dbd())
      {
        paramContext.nT(false);
        com.tencent.mm.plugin.report.service.h.pYm.k(982L, 4L, 1L);
        AppMethodBeat.o(6434);
      }
    while (true)
    {
      return;
      paramContext.nT(true);
      com.tencent.mm.plugin.report.service.h.pYm.k(982L, 5L, 1L);
      AppMethodBeat.o(6434);
    }
  }

  public final void a(Context paramContext, d paramd, l paraml)
  {
    AppMethodBeat.i(6433);
    com.tencent.mm.plugin.webview.ui.tools.bag.h localh = paramd.cWP();
    if ((paramd.cWO()) && (localh != null))
      if (!localh.dbd())
      {
        paraml.a(35, paramContext.getString(2131302148), 2131231022);
        AppMethodBeat.o(6433);
      }
    while (true)
    {
      return;
      paraml.a(35, paramContext.getString(2131302138), 2131231020);
      AppMethodBeat.o(6433);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.f
 * JD-Core Version:    0.6.2
 */