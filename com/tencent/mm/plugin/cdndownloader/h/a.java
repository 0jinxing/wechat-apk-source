package com.tencent.mm.plugin.cdndownloader.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.g;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.t.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a
  implements com.tencent.mm.t.a
{
  private static a ktB = null;
  private Map<String, a> ktC;
  private g.a ktz;

  public a()
  {
    AppMethodBeat.i(967);
    this.ktC = new ConcurrentHashMap();
    this.ktz = new a.1(this);
    AppMethodBeat.o(967);
  }

  public static a bfc()
  {
    try
    {
      AppMethodBeat.i(968);
      if (ktB == null)
      {
        locala = new com/tencent/mm/plugin/cdndownloader/h/a;
        locala.<init>();
        ktB = locala;
      }
      com.tencent.mm.plugin.cdndownloader.c.a.beU();
      a locala = ktB;
      AppMethodBeat.o(968);
      return locala;
    }
    finally
    {
    }
  }

  public final int a(String paramString1, String paramString2, b paramb)
  {
    AppMethodBeat.i(969);
    ab.i("FileDownloaderWAGameProxy", "addDownloadTask: %s filepath:%s", new Object[] { paramString1, paramString2 });
    g localg = new g();
    localg.field_mediaId = paramString1;
    localg.field_fullpath = paramString2;
    localg.egm = paramString1;
    localg.field_fileType = com.tencent.mm.i.a.efV;
    localg.egl = this.ktz;
    localg.egn = 60;
    localg.ego = 600;
    localg.egq = false;
    a locala = new a((byte)0);
    locala.ktE = paramb;
    locala.ktF = paramString2;
    this.ktC.put(paramString1, locala);
    int i = com.tencent.mm.plugin.cdndownloader.c.a.beU().f(localg);
    ab.i("FileDownloaderWAGameProxy", "addDownloadTask: ".concat(String.valueOf(i)));
    AppMethodBeat.o(969);
    return i;
  }

  final class a
  {
    public b ktE = null;
    public String ktF = null;

    private a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.h.a
 * JD-Core Version:    0.6.2
 */