package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.Iterator;

public final class q
{
  private volatile al ftB;
  public final ak handler;
  public final boolean hrm;
  public final t vfx;
  public final n vfy;
  public final i vfz;

  private q()
  {
    AppMethodBeat.i(79615);
    this.ftB = null;
    r.init();
    this.vfx = t.diA();
    if (this.vfx == null)
    {
      this.hrm = false;
      this.vfy = null;
      this.handler = null;
      this.vfz = null;
      AppMethodBeat.o(79615);
    }
    while (true)
    {
      return;
      this.hrm = true;
      u localu = new u();
      this.handler = new al("ResDownloader-EventThread").doN();
      this.vfz = new i(aNS().doN());
      this.vfy = new n(localu, this.vfz);
      AppMethodBeat.o(79615);
    }
  }

  static n.a c(l paraml)
  {
    AppMethodBeat.i(79619);
    ab.d("MicroMsg.ResDownloaderCore", "getNetworkRequestHandler");
    int i = paraml.awa().hashCode();
    Iterator localIterator = r.diz().iterator();
    while (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      ab.i("MicroMsg.ResDownloaderCore", "plugin = %s, groupId = %s", new Object[] { localg.getClass().getSimpleName(), localg.awa() });
      if (localg.awa().hashCode() == i)
      {
        paraml = localg.c(paraml);
        AppMethodBeat.o(79619);
      }
    }
    while (true)
    {
      return paraml;
      paraml = null;
      AppMethodBeat.o(79619);
    }
  }

  public final void AH(String paramString)
  {
    AppMethodBeat.i(79624);
    if (this.hrm)
      this.vfy.ajf(paramString);
    AppMethodBeat.o(79624);
  }

  public final void R(Runnable paramRunnable)
  {
    AppMethodBeat.i(79616);
    aNS().aa(new q.b(paramRunnable, (byte)0));
    AppMethodBeat.o(79616);
  }

  final al aNS()
  {
    AppMethodBeat.i(79617);
    if (this.ftB == null)
      this.ftB = new al("ResDownloader-WorkerThread");
    al localal = this.ftB;
    AppMethodBeat.o(79617);
    return localal;
  }

  public final s ajg(String paramString)
  {
    AppMethodBeat.i(79621);
    s locals;
    if (this.hrm)
    {
      long l = bo.anU();
      locals = this.vfx.ajg(paramString);
      if (locals == null)
      {
        paramString = "null";
        ab.i("MicroMsg.ResDownloaderCore", "doQuery: urlKey = %s, cost = %d", new Object[] { paramString, Long.valueOf(bo.gb(l)) });
        AppMethodBeat.o(79621);
        paramString = locals;
      }
    }
    while (true)
    {
      return paramString;
      paramString = locals.field_urlKey;
      break;
      paramString = null;
      AppMethodBeat.o(79621);
    }
  }

  public final boolean ajh(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(79623);
    if (this.hrm)
      if ((this.vfy.ajc(paramString)) || (this.vfy.ajd(paramString)))
      {
        bool = true;
        AppMethodBeat.o(79623);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(79623);
      continue;
      AppMethodBeat.o(79623);
    }
  }

  public final void b(String paramString, d paramd)
  {
    AppMethodBeat.i(79618);
    ab.d("MicroMsg.ResDownloaderCore", "addNetworkEventLister, groupId = %s, listener = %s", new Object[] { paramString, paramd });
    if (this.hrm)
      this.vfz.a(paramString, paramd);
    AppMethodBeat.o(79618);
  }

  public final int d(l paraml)
  {
    AppMethodBeat.i(79622);
    int i;
    if (this.hrm)
      if (bo.isNullOrNil(paraml.url))
      {
        ab.i("MicroMsg.ResDownloaderCore", "request#%s with null url, ignore", new Object[] { paraml.vdC });
        i = 3;
        AppMethodBeat.o(79622);
      }
    while (true)
    {
      return i;
      ab.i("MicroMsg.ResDownloaderCore", "request#%s post to network worker", new Object[] { paraml.vdC });
      i = this.vfy.b(paraml);
      AppMethodBeat.o(79622);
      continue;
      i = -1;
      AppMethodBeat.o(79622);
    }
  }

  public final void h(s params)
  {
    AppMethodBeat.i(79620);
    long l;
    if (this.hrm)
    {
      l = bo.anU();
      if (this.vfx.ajg(params.field_urlKey) == null)
        break label84;
      this.vfx.i(params);
    }
    for (boolean bool = false; ; bool = true)
    {
      ab.i("MicroMsg.ResDownloaderCore", "doUpdate: urlKey = %s, opIsInsert(%b) cost = %d", new Object[] { params.field_urlKey, Boolean.valueOf(bool), Long.valueOf(bo.gb(l)) });
      AppMethodBeat.o(79620);
      return;
      label84: this.vfx.j(params);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.q
 * JD-Core Version:    0.6.2
 */