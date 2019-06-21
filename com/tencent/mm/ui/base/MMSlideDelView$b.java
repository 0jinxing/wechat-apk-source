package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMSlideDelView$b
  implements Runnable
{
  MMSlideDelView$b(MMSlideDelView paramMMSlideDelView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106776);
    ab.v("MicroMsg.MMSlideDelView", "checkfortap");
    this.yxi.setPressed(true);
    AppMethodBeat.o(106776);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMSlideDelView.b
 * JD-Core Version:    0.6.2
 */