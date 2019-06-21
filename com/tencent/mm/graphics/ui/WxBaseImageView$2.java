package com.tencent.mm.graphics.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.b.b;
import com.tencent.mm.graphics.b.d;
import com.tencent.mm.graphics.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class WxBaseImageView$2
  implements Runnable
{
  WxBaseImageView$2(WxBaseImageView paramWxBaseImageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57103);
    try
    {
      ab.i("MicroMsg.WxBaseImageView", "alvinluo reportPerformanceInfo threadId: %d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
      b localb = d.eCO.Py();
      a locala = a.eCU;
      a.a(localb);
      WxBaseImageView.b(this.eDu);
      WxBaseImageView.c(this.eDu);
      return;
    }
    finally
    {
      AppMethodBeat.o(57103);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.graphics.ui.WxBaseImageView.2
 * JD-Core Version:    0.6.2
 */