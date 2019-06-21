package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.c.a;
import com.tencent.mm.plugin.exdevice.service.k;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;

final class d$3 extends c.a
{
  d$3(d paramd, long paramLong, k paramk)
  {
    super(0);
  }

  public final void onServiceConnected()
  {
    AppMethodBeat.i(19099);
    if (!u.bpy().lqX.a(this.jGq, this.lrm))
      ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "connect failed!!!");
    AppMethodBeat.o(19099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d.3
 * JD-Core Version:    0.6.2
 */