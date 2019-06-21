package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.c.a;

final class j$2$1
  implements c.a
{
  j$2$1(j.2 param2)
  {
  }

  public final void b(Addr paramAddr)
  {
    AppMethodBeat.i(9822);
    if ((this.uIV.uIU.uIM != null) && (this.uIV.uIU.uIQ != null))
    {
      this.uIV.uIU.uIM.uIW = paramAddr.agv();
      this.uIV.uIU.dcP();
    }
    AppMethodBeat.o(9822);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.j.2.1
 * JD-Core Version:    0.6.2
 */