package com.tencent.mm.plugin.sns.ui.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.b.b.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$23$1$1
  implements b.a
{
  b$23$1$1(b.23.1 param1)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(40272);
    ab.i("MicroMsg.TimelineClickListener", "timeline click animation end");
    this.rKz.rKy.rKt.rJD = null;
    AppMethodBeat.o(40272);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.23.1.1
 * JD-Core Version:    0.6.2
 */