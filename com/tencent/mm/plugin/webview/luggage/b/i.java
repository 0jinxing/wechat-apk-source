package com.tencent.mm.plugin.webview.luggage.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.ui.base.l;

public final class i extends a
{
  public i()
  {
    super(31);
  }

  public final void a(Context paramContext, d paramd)
  {
    AppMethodBeat.i(6441);
    if (!paramd.uhW.isShown())
    {
      paramd.uhW.reset();
      paramd.uhW.dcX();
      paramd.uhW.show();
    }
    h.pYm.k(982L, 8L, 1L);
    AppMethodBeat.o(6441);
  }

  public final void a(Context paramContext, d paramd, l paraml)
  {
    AppMethodBeat.i(6440);
    paraml.a(31, paramContext.getString(2131305721), 2131231015);
    AppMethodBeat.o(6440);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.i
 * JD-Core Version:    0.6.2
 */