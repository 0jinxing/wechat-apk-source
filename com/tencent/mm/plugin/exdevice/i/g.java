package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.b.i;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;

public final class g extends ae
{
  private c lxC;
  private a lxD;

  public g(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    AppMethodBeat.i(19736);
    this.lxC = new i(paramArrayOfByte, paramInt, paramLong);
    AppMethodBeat.o(19736);
  }

  public final boolean a(m paramm, d paramd)
  {
    boolean bool = true;
    AppMethodBeat.i(19737);
    if (!u.bpx().hX(this.lxC.jJa))
    {
      ab.w("MicroMsg.exdevice.MMPushManufacturerSvrSendDataLogic", "Service push data to device before it do auth, device id = %d", new Object[] { Long.valueOf(this.lxC.jJa) });
      AppMethodBeat.o(19737);
    }
    while (true)
    {
      return bool;
      this.lxD = new a(this.lxC, paramd);
      bool = this.lxD.b(paramm);
      AppMethodBeat.o(19737);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.g
 * JD-Core Version:    0.6.2
 */