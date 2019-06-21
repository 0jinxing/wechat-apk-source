package com.tencent.mm.plugin.webview.luggage.b;

import android.content.Context;
import com.tencent.luggage.d.k;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.luggage.jsapi.ap;
import com.tencent.mm.plugin.webview.luggage.permission.c;
import com.tencent.mm.ui.base.l;

public final class j extends a
{
  public j()
  {
    super(1);
  }

  public final void a(Context paramContext, d paramd)
  {
    AppMethodBeat.i(6443);
    ap.IF(0);
    paramd.cWN().aen("sendAppMessage");
    paramd.bPN.a(new j.1(this));
    h.pYm.k(982L, 9L, 1L);
    AppMethodBeat.o(6443);
  }

  public final void a(Context paramContext, d paramd, l paraml)
  {
    AppMethodBeat.i(6442);
    if (paramd.wD(21))
      paraml.a(this.id, paramContext.getString(2131302133), 2131231019);
    AppMethodBeat.o(6442);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.j
 * JD-Core Version:    0.6.2
 */