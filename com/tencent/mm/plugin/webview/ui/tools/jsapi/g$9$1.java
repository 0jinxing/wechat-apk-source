package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.n;
import com.tencent.mm.protocal.protobuf.awb;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class g$9$1
  implements Runnable
{
  g$9$1(g.9 param9, awb paramawb, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9051);
    LinkedList localLinkedList = this.uHj.wlE;
    String str1 = this.uHj.ncH;
    String str2 = this.uHj.vDm;
    ab.d("MicroMsg.MsgHandler", "appName %s, appIconUrl %s", new Object[] { str1, str2 });
    n localn = new n(g.i(this.uHk.uHd));
    g.9.1.1 local1 = new g.9.1.1(this);
    if ((localLinkedList != null) && (localLinkedList.size() > 0))
    {
      if (!localn.a(localLinkedList, str1, str2, local1))
        this.uHk.uHi.aCB();
      AppMethodBeat.o(9051);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MsgHandler", "scopeInfoList is empty!");
      g.a(this.uHk.uHd, this.uHk.uqf, "login:fail", null);
      this.uHk.uHi.aCB();
      AppMethodBeat.o(9051);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.9.1
 * JD-Core Version:    0.6.2
 */