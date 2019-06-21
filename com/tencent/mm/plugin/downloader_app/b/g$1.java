package com.tencent.mm.plugin.downloader_app.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.sdk.platformtools.ab;

final class g$1
  implements w.a
{
  public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, m paramm)
  {
    AppMethodBeat.i(136141);
    ab.i("MicroMsg.PbAppInfoManager", "errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      g.kOY = new f((com.tencent.mm.plugin.downloader.c.a.a.b)paramb.fsH.fsP);
      if (g.kOX != null)
        g.kOX.gd(true);
    }
    while (true)
    {
      AppMethodBeat.o(136141);
      return 0;
      if (g.kOX != null)
        g.kOX.gd(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.g.1
 * JD-Core Version:    0.6.2
 */