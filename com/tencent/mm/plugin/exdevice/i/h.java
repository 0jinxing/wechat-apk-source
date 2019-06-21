package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.b.f;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends ae
{
  private f lqO;
  private a lxE;

  public h(f paramf)
  {
    this.lqO = paramf;
  }

  public final boolean a(m paramm, d paramd)
  {
    AppMethodBeat.i(19738);
    this.lxE = new a(this.lqO, paramd);
    boolean bool = this.lxE.b(paramm);
    ab.i("MicroMsg.exdevice.MMSendDataToDeviceExcuter", "send data to devide : %b", new Object[] { Boolean.valueOf(bool) });
    AppMethodBeat.o(19738);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.h
 * JD-Core Version:    0.6.2
 */