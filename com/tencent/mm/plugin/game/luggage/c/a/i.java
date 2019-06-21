package com.tencent.mm.plugin.game.luggage.c.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.protocal.protobuf.bbb;
import com.tencent.mm.ui.widget.MMWebView;

public final class i extends a
{
  public i()
  {
    super(7);
  }

  public final void a(Context paramContext, d paramd, bbb parambbb)
  {
    AppMethodBeat.i(135909);
    if (paramd.getWebView() != null)
      paramd.getWebView().reload();
    AppMethodBeat.o(135909);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.a.i
 * JD-Core Version:    0.6.2
 */