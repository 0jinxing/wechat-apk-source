package com.tencent.mm.plugin.subapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class i$1
  implements ap.a
{
  i$1(i parami)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(25292);
    String str = i.a(this.stm);
    g localg;
    if (str != null)
    {
      localg = d.cDE().abp(str);
      if (localg != null)
        break label85;
      ab.d("MicroMsg.VoiceRemindLogic", "startSend null record : ".concat(String.valueOf(str)));
    }
    while (true)
    {
      d.cDF().run();
      ab.d("MicroMsg.VoiceRemindRecorder", "Start Send fileName :" + i.a(this.stm));
      AppMethodBeat.o(25292);
      return false;
      label85: if (localg.field_status == 1)
      {
        localg.field_status = 2;
        localg.bJt = 64;
        h.a(localg);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.i.1
 * JD-Core Version:    0.6.2
 */