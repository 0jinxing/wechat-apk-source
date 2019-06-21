package com.tencent.mm.plugin.cdndownloader.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.g;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.b.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a
  implements com.tencent.xweb.b.a
{
  private static a ktG = null;
  private Map<String, a> ktC;
  private g.a ktz;

  public a()
  {
    AppMethodBeat.i(973);
    this.ktC = new ConcurrentHashMap();
    this.ktz = new a.1(this);
    AppMethodBeat.o(973);
  }

  public static a bfd()
  {
    try
    {
      AppMethodBeat.i(974);
      if (ktG == null)
      {
        locala = new com/tencent/mm/plugin/cdndownloader/i/a;
        locala.<init>();
        ktG = locala;
      }
      com.tencent.mm.plugin.cdndownloader.c.a.beU();
      a locala = ktG;
      AppMethodBeat.o(974);
      return locala;
    }
    finally
    {
    }
  }

  public final int a(String paramString1, String paramString2, b paramb)
  {
    AppMethodBeat.i(975);
    ab.i("FileDownloaderXWEBProxy", "addDownloadTask: %s filepath:%s", new Object[] { paramString1, paramString2 });
    g localg = new g();
    localg.field_mediaId = paramString1;
    localg.field_fullpath = paramString2;
    localg.egm = paramString1;
    localg.field_fileType = com.tencent.mm.i.a.efS;
    localg.egl = this.ktz;
    localg.egn = 60;
    localg.ego = 600;
    localg.egq = false;
    a locala = new a((byte)0);
    locala.ktI = paramb;
    locala.ktF = paramString2;
    this.ktC.put(paramString1, locala);
    int i = com.tencent.mm.plugin.cdndownloader.c.a.beU().f(localg);
    ab.i("FileDownloaderXWEBProxy", "addDownloadTask: ".concat(String.valueOf(i)));
    AppMethodBeat.o(975);
    return i;
  }

  final class a
  {
    public String ktF = null;
    public b ktI = null;

    private a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.i.a
 * JD-Core Version:    0.6.2
 */