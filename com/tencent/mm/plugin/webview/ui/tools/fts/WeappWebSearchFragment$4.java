package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class WeappWebSearchFragment$4
  implements Runnable
{
  WeappWebSearchFragment$4(WeappWebSearchFragment paramWeappWebSearchFragment, Bundle paramBundle, String paramString1, boolean paramBoolean, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8612);
    if (this.uCQ.getJsapi() != null)
      if ((this.uAA != null) && (this.uAA.getInt("isRefresh") == 1) && (this.uAA.getString("widgetId") != null))
      {
        this.uCQ.getJsapi().hj(this.uAA.getString("widgetId"), this.iIA);
        AppMethodBeat.o(8612);
      }
    while (true)
    {
      return;
      this.uCQ.getJsapi().h(this.iIA, this.uAB, this.ufX);
      AppMethodBeat.o(8612);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.WeappWebSearchFragment.4
 * JD-Core Version:    0.6.2
 */