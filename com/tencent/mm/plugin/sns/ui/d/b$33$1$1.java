package com.tencent.mm.plugin.sns.ui.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.SnsTimeLineUI;
import com.tencent.mm.plugin.sns.ui.b.b.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$33$1$1
  implements b.a
{
  b$33$1$1(b.33.1 param1)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(40290);
    ab.i("MicroMsg.TimelineClickListener", "timeline back animation end");
    this.rKG.rKF.rKt.rJE = null;
    ((SnsTimeLineUI)this.rKG.rKF.rKt.activity).lm(false);
    AppMethodBeat.o(40290);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.33.1.1
 * JD-Core Version:    0.6.2
 */