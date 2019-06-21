package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMSlideDelView$2
  implements Runnable
{
  MMSlideDelView$2(MMSlideDelView paramMMSlideDelView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106774);
    this.yxi.setPressed(false);
    ab.v("MicroMsg.MMSlideDelView", "onClick");
    MMSlideDelView.b(this.yxi).q(this.yxi, MMSlideDelView.a(this.yxi), 0);
    this.yxi.dzY();
    AppMethodBeat.o(106774);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMSlideDelView.2
 * JD-Core Version:    0.6.2
 */