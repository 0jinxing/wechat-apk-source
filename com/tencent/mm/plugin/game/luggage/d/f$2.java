package com.tencent.mm.plugin.game.luggage.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;

final class f$2
  implements Runnable
{
  f$2(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135995);
    if (this.mVf.getWebView() != null)
    {
      String str = this.mVf.getWebView().getTitle();
      if (!bo.isNullOrNil(str))
        this.mVf.cl(str, 0);
    }
    AppMethodBeat.o(135995);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.f.2
 * JD-Core Version:    0.6.2
 */