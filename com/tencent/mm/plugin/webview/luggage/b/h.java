package com.tencent.mm.plugin.webview.luggage.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.ui.base.l;

public final class h extends a
{
  public h()
  {
    super(28);
  }

  public final void a(Context paramContext, d paramd)
  {
    AppMethodBeat.i(6439);
    paramd.reload();
    com.tencent.mm.plugin.report.service.h.pYm.k(982L, 7L, 1L);
    AppMethodBeat.o(6439);
  }

  public final void a(Context paramContext, d paramd, l paraml)
  {
    AppMethodBeat.i(6438);
    paraml.a(28, paramContext.getString(2131305533), 2131231013);
    AppMethodBeat.o(6438);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.h
 * JD-Core Version:    0.6.2
 */