package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.ui.tools.widget.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class ad$1$1
  implements Runnable
{
  ad$1$1(ad.1 param1, String paramString1, LinkedList paramLinkedList, String paramString2, String paramString3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6333);
    n localn = new n(((d)this.ukl.mUf.bOZ).mContext);
    ad.1.1.1 local1 = new ad.1.1.1(this);
    if ((this.hCi != null) && (this.hCi.size() > 0))
    {
      if (!localn.a(this.hCi, this.ujS, this.ujT, local1))
        this.ukl.mUf.a("fail", null);
      AppMethodBeat.o(6333);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.JsApiLogin", "scopeInfoList is empty!");
      this.ukl.mUf.a("fail", null);
      AppMethodBeat.o(6333);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ad.1.1
 * JD-Core Version:    0.6.2
 */