package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.b.g;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends ae
{
  private a lxD;
  private g lxF;

  public i(int paramInt)
  {
    AppMethodBeat.i(19739);
    this.lxF = new g(paramInt);
    AppMethodBeat.o(19739);
  }

  public final boolean a(m paramm, d paramd)
  {
    boolean bool = true;
    AppMethodBeat.i(19740);
    if (!u.bpx().hX(this.lxF.jJa))
    {
      ab.w("MicroMsg.exdevice.MMSwitchBackGroudTaskExcuter", "push switch backgroud event to device before it do auth, device id = %d", new Object[] { Long.valueOf(this.lxF.jJa) });
      AppMethodBeat.o(19740);
    }
    while (true)
    {
      return bool;
      this.lxD = new a(this.lxF, paramd);
      bool = this.lxD.b(paramm);
      AppMethodBeat.o(19740);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.i
 * JD-Core Version:    0.6.2
 */