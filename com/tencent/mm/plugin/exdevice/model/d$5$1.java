package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.c.a;
import com.tencent.mm.plugin.exdevice.service.e;

final class d$5$1 extends c.a
{
  d$5$1(d.5 param5)
  {
    super(0);
  }

  public final void onServiceConnected()
  {
    AppMethodBeat.i(19101);
    d.a(this.lrq.lrk).lwE = null;
    e.bpo().aB(this.lrq.lro, this.lrq.lrp);
    AppMethodBeat.o(19101);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d.5.1
 * JD-Core Version:    0.6.2
 */