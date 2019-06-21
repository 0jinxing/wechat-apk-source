package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class ab$4
  implements ab.d
{
  ab$4(ab paramab)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(68040);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ShareModeMailAppService", "finishedSendOneFile, currentFileCount: %d, totalFileNum: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.pvy.pvk.put(paramString1, paramString2);
    this.pvy.Br((int)(10.0F + 80.0F * (paramInt1 / paramInt2)));
    AppMethodBeat.o(68040);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.ab.4
 * JD-Core Version:    0.6.2
 */