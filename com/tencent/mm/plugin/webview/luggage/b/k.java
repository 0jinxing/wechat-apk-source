package com.tencent.mm.plugin.webview.luggage.b;

import android.content.Context;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.ui.base.l;
import org.json.JSONObject;

public final class k extends a
{
  public k()
  {
    super(2);
  }

  public final void a(Context paramContext, d paramd)
  {
    AppMethodBeat.i(6445);
    paramd.cWN().aen("shareTimeline");
    paramd.bPN.a(new com.tencent.luggage.d.c()
    {
      public final String name()
      {
        return "menu:share:timeline";
      }

      public final JSONObject wQ()
      {
        return null;
      }
    });
    h.pYm.k(982L, 10L, 1L);
    AppMethodBeat.o(6445);
  }

  public final void a(Context paramContext, d paramd, l paraml)
  {
    AppMethodBeat.i(6444);
    if (paramd.wD(23))
      paraml.a(2, paramContext.getString(2131302134), 2131231005);
    AppMethodBeat.o(6444);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.k
 * JD-Core Version:    0.6.2
 */