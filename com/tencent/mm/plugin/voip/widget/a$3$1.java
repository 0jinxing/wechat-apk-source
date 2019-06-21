package com.tencent.mm.plugin.voip.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.ui.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class a$3$1
  implements Runnable
{
  a$3$1(a.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5139);
    if ((this.tco.tcn.sVY != null) && (this.tco.tcn.sVY.get() != null))
      ab.i("MicroMsg.Voip.TalkingSmallView", "summerkick LogoutEvent ret[%b, %b, %b]", new Object[] { Boolean.valueOf(((c)this.tco.tcn.sVY.get()).cJs()), Boolean.valueOf(((c)this.tco.tcn.sVY.get()).cJr()), Boolean.valueOf(((c)this.tco.tcn.sVY.get()).cJk()) });
    AppMethodBeat.o(5139);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.a.3.1
 * JD-Core Version:    0.6.2
 */