package com.tencent.mm.plugin.shake.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ak;

final class c$1
  implements Runnable
{
  c$1(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24417);
    if ((this.qrL.qrJ != null) && (this.qrL.qrK != null))
      this.qrL.qrJ.removeCallbacks(this.qrL.qrK);
    if (this.qrL.qrH != null)
      aw.Rg().c(this.qrL.qrH);
    if ((this.qrL.qrG != null) && (this.qrL.qrG.cQr != null))
      this.qrL.qrH = new a(this.qrL.qrG.cQr);
    if (this.qrL.qrH != null)
      aw.Rg().a(this.qrL.qrH, 0);
    AppMethodBeat.o(24417);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.c.1
 * JD-Core Version:    0.6.2
 */