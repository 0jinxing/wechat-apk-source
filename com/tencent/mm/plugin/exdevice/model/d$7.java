package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.c.a;

final class d$7 extends c.a
{
  d$7(d paramd, int paramInt, String paramString, long paramLong, boolean paramBoolean)
  {
    super(paramInt);
  }

  public final void onServiceConnected()
  {
    AppMethodBeat.i(19105);
    d.a(this.lrk).lwE = null;
    this.lrk.b(this.lrr, this.lrs, this.cxI, this.lrt);
    AppMethodBeat.o(19105);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d.7
 * JD-Core Version:    0.6.2
 */