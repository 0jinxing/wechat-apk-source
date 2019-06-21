package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vi;
import com.tencent.mm.g.a.vi.a;
import com.tencent.mm.sdk.platformtools.ab;

final class af$1$1
  implements i.a
{
  af$1$1(af.1 param1, vi paramvi)
  {
  }

  public final void gM(boolean paramBoolean)
  {
    AppMethodBeat.i(19406);
    if (!paramBoolean)
    {
      ab.e("MicroMsg.WearHardDeviceLogic", "GetBoundDeviceLogic Fail, deviceId=%s|deviceType=%s", new Object[] { this.luD.cSq.ceI, this.luD.cSq.cws });
      af.aA(this.luD.cSq.ceI, false);
      AppMethodBeat.o(19406);
    }
    while (true)
    {
      return;
      af.aA(this.luD.cSq.ceI, true);
      AppMethodBeat.o(19406);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.af.1.1
 * JD-Core Version:    0.6.2
 */