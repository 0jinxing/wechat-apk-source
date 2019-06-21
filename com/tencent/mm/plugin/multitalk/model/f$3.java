package com.tencent.mm.plugin.multitalk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.multitalk.ui.widget.e;
import com.tencent.mm.sdk.platformtools.al;
import java.util.TimerTask;

final class f$3 extends TimerTask
{
  f$3(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53944);
    if ((this.oGB.getTotalTime() >= 45000L) && (f.l(this.oGB) != e.oIG))
      al.d(new f.3.1(this));
    if (f.l(this.oGB) == e.oIG)
    {
      f.m(this.oGB);
      al.d(new f.3.2(this));
    }
    AppMethodBeat.o(53944);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.f.3
 * JD-Core Version:    0.6.2
 */