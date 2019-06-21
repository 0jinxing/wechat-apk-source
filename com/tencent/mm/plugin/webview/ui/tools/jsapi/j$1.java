package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelgeo.d;

final class j$1
  implements Runnable
{
  j$1(j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9821);
    if ((this.uIU.uIS == null) || (this.uIU.fwu == null))
      AppMethodBeat.o(9821);
    while (true)
    {
      return;
      this.uIU.nOO.a(this.uIU.uIQ);
      this.uIU.fwu.c(this.uIU.uIS);
      this.uIU.uIS.a(false, 0.0F, 0.0F, 0, 0.0D, 0.0D, 0.0D);
      AppMethodBeat.o(9821);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.j.1
 * JD-Core Version:    0.6.2
 */