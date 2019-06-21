package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class k$4$2
  implements Runnable
{
  k$4$2(k.4 param4, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32386);
    h localh = h.pYm;
    int i = this.yXK.yXH.yXF;
    if (this.qzt <= 0);
    for (int j = this.yXK.yXH.rbG * 1000; ; j = this.qzt)
    {
      localh.e(12084, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(this.ibq), Integer.valueOf(1), this.yXK.yXH.cEV, Integer.valueOf(this.yXK.yXH.yXG), this.yXK.yXH.fileId, Long.valueOf(this.yXK.yXH.createTime) });
      AppMethodBeat.o(32386);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.k.4.2
 * JD-Core Version:    0.6.2
 */