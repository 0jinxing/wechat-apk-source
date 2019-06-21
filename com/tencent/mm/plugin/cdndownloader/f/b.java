package com.tencent.mm.plugin.cdndownloader.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  public static void HF(String paramString)
  {
    AppMethodBeat.i(960);
    c localc = beQ();
    if (localc != null)
      ab.i("MicroMsg.CdnDownloadInfoDBHelp", "removeDownloadInfoByDownloadUrl: ".concat(String.valueOf(localc.HG(paramString))));
    AppMethodBeat.o(960);
  }

  public static void a(a parama)
  {
    AppMethodBeat.i(959);
    c localc = beQ();
    if (localc != null)
      ab.i("MicroMsg.CdnDownloadInfoDBHelp", "insert: ".concat(String.valueOf(localc.b(parama))));
    AppMethodBeat.o(959);
  }

  public static c beQ()
  {
    AppMethodBeat.i(961);
    c localc = ((com.tencent.mm.plugin.cdndownloader.b.a)g.K(com.tencent.mm.plugin.cdndownloader.b.a.class)).beQ();
    AppMethodBeat.o(961);
    return localc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.f.b
 * JD-Core Version:    0.6.2
 */