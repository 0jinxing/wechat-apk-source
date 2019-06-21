package com.tencent.mm.plugin.websearch.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Info;
import com.tencent.mm.sdk.platformtools.al;

final class a$2
  implements Runnable
{
  a$2(a parama, WidgetData paramWidgetData, String paramString, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91392);
    if ((this.ucK == null) || (this.ucK.ubs == null) || (this.ucK.ubt == null))
      AppMethodBeat.o(91392);
    while (true)
    {
      return;
      d.cVP();
      if (!d.a(this.ucK))
      {
        u.i("FTSSearchWidgetMgr", "local forbidden widget %s", new Object[] { this.ucK.ubs.fpS });
        al.d(new a.2.1(this));
        AppMethodBeat.o(91392);
      }
      else
      {
        al.d(new a.2.2(this));
        AppMethodBeat.o(91392);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.2
 * JD-Core Version:    0.6.2
 */