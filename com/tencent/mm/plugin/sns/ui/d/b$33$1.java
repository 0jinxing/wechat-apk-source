package com.tencent.mm.plugin.sns.ui.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.SnsTimeLineUI;
import com.tencent.mm.plugin.sns.ui.b.b.a;

final class b$33$1
  implements Runnable
{
  b$33$1(b.33 param33, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40291);
    if ((this.rKF.rKt.activity instanceof SnsTimeLineUI))
      ((SnsTimeLineUI)this.rKF.rKt.activity).lm(true);
    this.rKF.rKt.rJE.kM(this.nub);
    this.rKF.rKt.rJE.a(new b.33.1.1(this));
    AppMethodBeat.o(40291);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.33.1
 * JD-Core Version:    0.6.2
 */