package com.tencent.mm.plugin.webview.luggage;

import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.b.l;

public class n
{
  d uiI;
  l ujb;
  com.tencent.mm.ui.widget.d ujs;

  public n(d paramd, l paraml)
  {
    AppMethodBeat.i(6221);
    this.uiI = paramd;
    this.ujb = paraml;
    this.ujs = new com.tencent.mm.ui.widget.d(this.uiI.mContext, 0, false);
    this.ujs.rBl = new n.1(this);
    this.ujs.rBm = new n.2(this);
    this.ujs.cpD();
    AppMethodBeat.o(6221);
  }

  public final void cXg()
  {
    AppMethodBeat.i(6222);
    if (this.ujs != null)
      this.ujs.cpE();
    AppMethodBeat.o(6222);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.n
 * JD-Core Version:    0.6.2
 */