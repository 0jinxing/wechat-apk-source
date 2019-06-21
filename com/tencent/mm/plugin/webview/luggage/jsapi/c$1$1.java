package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.ui.tools.widget.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class c$1$1
  implements Runnable
{
  c$1$1(c.1 param1, LinkedList paramLinkedList, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6278);
    n localn = new n(((d)this.ujU.mUf.bOZ).mContext);
    c.1.1.1 local1 = new c.1.1.1(this);
    if ((this.hCi != null) && (this.hCi.size() > 0))
    {
      if (!localn.a(this.hCi, this.ujS, this.ujT, local1))
        this.ujU.mUf.a("fail", null);
      AppMethodBeat.o(6278);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.JsApiAuthorize", "scopeInfoList is empty!");
      this.ujU.mUf.a("fail", null);
      AppMethodBeat.o(6278);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.c.1.1
 * JD-Core Version:    0.6.2
 */