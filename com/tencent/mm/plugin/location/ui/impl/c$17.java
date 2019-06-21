package com.tencent.mm.plugin.location.ui.impl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.ActionBarSearchView.a;

final class c$17
  implements ActionBarSearchView.a
{
  c$17(c paramc)
  {
  }

  public final void bKv()
  {
    AppMethodBeat.i(113613);
    ab.d("MicroMsg.MMPoiMapUI", "back pressed");
    c.a(this.nQa, c.bKs(), c.v(this.nQa).llU, true);
    c.a(this.nQa, null);
    AppMethodBeat.o(113613);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c.17
 * JD-Core Version:    0.6.2
 */