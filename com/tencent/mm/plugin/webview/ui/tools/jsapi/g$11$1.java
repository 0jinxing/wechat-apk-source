package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.n;
import com.tencent.mm.protocal.protobuf.avx;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class g$11$1
  implements Runnable
{
  g$11$1(g.11 param11, avx paramavx)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9055);
    LinkedList localLinkedList = this.uHm.wlE;
    String str1 = this.uHm.ncH;
    String str2 = this.uHm.vDm;
    n localn = new n(g.i(this.uHn.uHd));
    g.11.1.1 local1 = new g.11.1.1(this);
    if ((localLinkedList != null) && (localLinkedList.size() > 0))
    {
      if (!localn.a(localLinkedList, str1, str2, local1))
        this.uHn.uHi.aCB();
      AppMethodBeat.o(9055);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MsgHandler", "scopeInfoList is empty!");
      g.a(this.uHn.uHd, this.uHn.uqf, "authorize:fail", null);
      this.uHn.uHi.aCB();
      AppMethodBeat.o(9055);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.11.1
 * JD-Core Version:    0.6.2
 */