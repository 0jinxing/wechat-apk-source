package com.tencent.mm.plugin.voip_cs.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.b.g.a;
import com.tencent.mm.plugin.voip_cs.b.a.c;
import com.tencent.mm.sdk.platformtools.ab;

final class VoipCSMainUI$2
  implements g.a
{
  VoipCSMainUI$2(VoipCSMainUI paramVoipCSMainUI)
  {
  }

  public final void gE(int paramInt)
  {
    AppMethodBeat.i(135390);
    ab.d("MicroMsg.voipcs.VoipCSMainUI", "onBluetoothHeadsetStateChange status: %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
    case 3:
    case 4:
    case 1:
    case 2:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(135390);
      while (true)
      {
        return;
        g.KK().KM();
        AppMethodBeat.o(135390);
        continue;
        g.KK().KN();
        VoipCSMainUI.c(this.teJ).mr(true);
        AppMethodBeat.o(135390);
        continue;
        VoipCSMainUI.c(this.teJ).mr(false);
        AppMethodBeat.o(135390);
        continue;
        g.KK().KN();
        VoipCSMainUI.c(this.teJ).mr(true);
        AppMethodBeat.o(135390);
      }
      g.KK().KM();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI.2
 * JD-Core Version:    0.6.2
 */