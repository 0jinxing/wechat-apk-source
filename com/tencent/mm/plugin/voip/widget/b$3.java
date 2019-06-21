package com.tencent.mm.plugin.voip.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.notification.b.a;
import com.tencent.mm.plugin.voip.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class b$3
  implements ap.a
{
  b$3(b paramb)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(5174);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "time out ,status is " + b.d(this.tcB));
    boolean bool;
    if ((b.d(this.tcB) == 8) || (b.d(this.tcB) == 262) || (!d.cLx()))
    {
      ((a)g.M(a.class)).getNotification().cancel(40);
      ab.i("MicroMsg.Voip.VoipSmallWindow", "showVoiceTalking...CALLING_STATE_FINISH state..cancel notification..");
      if ((b.f(this.tcB) != null) && (!b.f(this.tcB).doT()))
        b.f(this.tcB).stopTimer();
      AppMethodBeat.o(5174);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.Voip.VoipSmallWindow", "show voice talking, first timer trigger..");
      String str = b.g(this.tcB);
      this.tcB.g(str, s.mJ(b.c(this.tcB).field_username), str, false);
      bool = true;
      AppMethodBeat.o(5174);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.b.3
 * JD-Core Version:    0.6.2
 */