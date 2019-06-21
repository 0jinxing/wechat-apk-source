package com.tencent.mm.plugin.voip.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.plugin.notification.b.a;
import com.tencent.mm.plugin.voip.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class b$6
  implements ap.a
{
  private int mCount = 0;

  b$6(b paramb, String paramString1, String paramString2, String paramString3)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(5178);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "time out ,status is " + b.d(this.tcB));
    this.mCount += 1;
    boolean bool;
    if ((b.d(this.tcB) == 8) || (b.d(this.tcB) == 262) || (!d.cLx()))
    {
      ab.i("MicroMsg.Voip.VoipSmallWindow", "CALLING_STATE_FINISH state..cancel notification..");
      ((a)g.M(a.class)).getNotification().cancel(40);
      if ((b.f(this.tcB) != null) && (!b.f(this.tcB).doT()))
        b.f(this.tcB).stopTimer();
      AppMethodBeat.o(5178);
      bool = false;
      return bool;
    }
    b localb = this.tcB;
    StringBuilder localStringBuilder = new StringBuilder().append(this.tcC);
    if (this.mCount % 2 == 1);
    for (String str = " "; ; str = "")
    {
      localb.g(str, this.chV, this.fOH, false);
      AppMethodBeat.o(5178);
      bool = true;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.b.6
 * JD-Core Version:    0.6.2
 */