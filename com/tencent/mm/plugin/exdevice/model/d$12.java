package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.c.a;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;

final class d$12 extends c.a
{
  d$12(d paramd, int paramInt1, int paramInt2)
  {
    super(paramInt1);
  }

  public final void onServiceConnected()
  {
    AppMethodBeat.i(19110);
    if (!u.bpy().lqX.b(this.lrv, d.e(this.lrk)))
      ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
    AppMethodBeat.o(19110);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d.12
 * JD-Core Version:    0.6.2
 */