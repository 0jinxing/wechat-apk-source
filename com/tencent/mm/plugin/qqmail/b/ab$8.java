package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.g;
import com.tencent.mm.ai.m;

final class ab$8
  implements g
{
  ab$8(ab paramab, ab.a parama)
  {
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(68044);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "composeSend, offset: %d, totalLen: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 >= paramInt2)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "finish send");
      if (this.pvz != null)
        this.pvz.ccA();
    }
    AppMethodBeat.o(68044);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.ab.8
 * JD-Core Version:    0.6.2
 */