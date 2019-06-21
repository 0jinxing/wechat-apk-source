package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.b.h;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends ae
{
  private a lxG;
  private h lxH;

  public j(int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(19741);
    this.lxH = new h(paramInt1, paramInt2, paramLong);
    AppMethodBeat.o(19741);
  }

  public final boolean a(m paramm, d paramd)
  {
    boolean bool = true;
    AppMethodBeat.i(19742);
    if (!u.bpx().hX(this.lxH.jJa))
    {
      ab.w("MicroMsg.exdevice.MMSwitchViewPushTaskExcuter", "push switchview event to device before it do auth, device id = %d", new Object[] { Long.valueOf(this.lxH.jJa) });
      AppMethodBeat.o(19742);
    }
    while (true)
    {
      return bool;
      this.lxG = new b(this.lxH, paramd);
      bool = this.lxG.b(paramm);
      AppMethodBeat.o(19742);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.j
 * JD-Core Version:    0.6.2
 */