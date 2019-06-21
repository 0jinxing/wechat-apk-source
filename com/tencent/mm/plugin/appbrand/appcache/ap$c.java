package com.tencent.mm.plugin.appbrand.appcache;

import android.os.StatFs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.y;
import com.tencent.mm.plugin.appbrand.appcache.a.a;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;

final class ap$c extends n.a<a>
{
  private static final ThreadLocal<ap.a> gUw;
  private String gUx;
  final z.a gUy;

  static
  {
    AppMethodBeat.i(59498);
    gUw = new ap.c.1();
    AppMethodBeat.o(59498);
  }

  ap$c(a parama)
  {
    super(parama);
    AppMethodBeat.i(59492);
    this.gUx = null;
    z.a locala = z.a(parama);
    parama = locala;
    if (locala == null)
      parama = m.gSB;
    this.gUy = parama;
    AppMethodBeat.o(59492);
  }

  public final com.tencent.mm.pluginsdk.g.a.c.m a(com.tencent.mm.pluginsdk.g.a.c.j paramj)
  {
    AppMethodBeat.i(59494);
    try
    {
      localObject1 = (a)super.awh();
      e.deleteFile(((a)localObject1).getFilePath());
      this.gUx = ((l)localObject1).url;
      localObject2 = this.gUy;
      this.gUx.startsWith("https");
      ((z.a)localObject2).avp();
      localObject2 = ((ap.a)gUw.get()).a(this);
      if (localObject2 != null)
        localObject3 = localObject2;
    }
    catch (Exception paramj)
    {
      try
      {
        Object localObject1;
        Object localObject3;
        if (((com.tencent.mm.pluginsdk.g.a.c.m)localObject2).status == 3)
        {
          localObject3 = localObject2;
          if (this.gUx.startsWith("http://"))
          {
            i = 1;
            if (localObject2 != null)
            {
              localObject3 = localObject2;
              if (((com.tencent.mm.pluginsdk.g.a.c.m)localObject2).status != 3)
                break label230;
            }
            localObject3 = localObject2;
            if (!this.gUx.startsWith("https"))
              break label230;
            localObject3 = localObject2;
            this.gUy.avr();
            localObject3 = localObject2;
            if (!(localObject1 instanceof ak))
              break label292;
            i = 0;
            if (i == 0)
              break label287;
            localObject3 = localObject2;
            this.gUx = this.gUx.replaceFirst("https", "http");
            localObject3 = localObject2;
            paramj = super.a(paramj);
            localObject1 = paramj;
            label186: localObject3 = localObject1;
            this.gUy.a((com.tencent.mm.pluginsdk.g.a.c.m)localObject1);
            paramj = (com.tencent.mm.pluginsdk.g.a.c.j)localObject1;
            label201: if (paramj != null)
              break label275;
            paramj = new com.tencent.mm.pluginsdk.g.a.c.m(this, null, -1, 3);
            AppMethodBeat.o(59494);
          }
        }
        while (true)
        {
          return paramj;
          i = 0;
          break;
          label230: if (localObject2 != null)
          {
            localObject1 = localObject2;
            if (i == 0)
              break label186;
          }
          localObject3 = localObject2;
          localObject1 = super.a(paramj);
          break label186;
          paramj = paramj;
          localObject3 = null;
          ab.printErrStackTrace("MicroMsg.AppBrandWxaPkgDownloadPerformer", paramj, "perform failed", new Object[0]);
          paramj = localObject3;
          break label201;
          label275: AppMethodBeat.o(59494);
        }
      }
      catch (Exception paramj)
      {
        while (true)
        {
          Object localObject2;
          continue;
          label287: paramj = (com.tencent.mm.pluginsdk.g.a.c.j)localObject2;
          continue;
          label292: int i = 1;
        }
      }
    }
  }

  protected final a avZ()
  {
    AppMethodBeat.i(59493);
    a locala = (a)super.awh();
    AppMethodBeat.o(59493);
    return locala;
  }

  public final String awa()
  {
    return "AppBrandWxaPkgDownloader";
  }

  public final boolean awb()
  {
    return true;
  }

  public final boolean awc()
  {
    return false;
  }

  public final boolean awd()
  {
    return true;
  }

  public final boolean awe()
  {
    return false;
  }

  public final boolean awf()
  {
    return true;
  }

  public final boolean awg()
  {
    boolean bool = false;
    AppMethodBeat.i(59496);
    switch (y.Me())
    {
    default:
      AppMethodBeat.o(59496);
    case 0:
    case 1:
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(59496);
      continue;
      bool = super.awg();
      AppMethodBeat.o(59496);
    }
  }

  public final String getURL()
  {
    return this.gUx;
  }

  public final boolean gh(long paramLong)
  {
    AppMethodBeat.i(59495);
    StatFs localStatFs = new StatFs(com.tencent.mm.vfs.j.w(new b(getFilePath()).dMC().dMD()));
    long l = localStatFs.getAvailableBlocks() * localStatFs.getBlockSize();
    boolean bool;
    if ((l < 0L) || (l > paramLong))
    {
      bool = true;
      AppMethodBeat.o(59495);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59495);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ap.c
 * JD-Core Version:    0.6.2
 */