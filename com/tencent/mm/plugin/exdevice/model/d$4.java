package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.c.a;

final class d$4 extends c.a
{
  d$4(d paramd, Runnable paramRunnable)
  {
    super(0);
  }

  public final void onServiceConnected()
  {
    AppMethodBeat.i(19100);
    this.lrn.run();
    AppMethodBeat.o(19100);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d.4
 * JD-Core Version:    0.6.2
 */