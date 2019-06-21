package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMSlideDelView$a extends MMSlideDelView.h
  implements Runnable
{
  private MMSlideDelView$a(MMSlideDelView paramMMSlideDelView)
  {
    super(paramMMSlideDelView, (byte)0);
  }

  public final void run()
  {
    AppMethodBeat.i(106775);
    if ((this.yxi.hasWindowFocus()) && (MMSlideDelView.c(this.yxi) == this.yxj));
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) && (!MMSlideDelView.d(this.yxi)))
      {
        ab.i("MicroMsg.MMSlideDelView", "is long press");
        if (this.yxi.getParent() != null)
        {
          MMSlideDelView.e(this.yxi);
          this.yxi.performLongClick();
        }
      }
      AppMethodBeat.o(106775);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMSlideDelView.a
 * JD-Core Version:    0.6.2
 */