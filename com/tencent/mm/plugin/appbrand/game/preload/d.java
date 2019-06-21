package com.tencent.mm.plugin.appbrand.game.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.j.f;
import com.tencent.mm.plugin.appbrand.j.f.b;
import com.tencent.mm.plugin.appbrand.l.j;
import com.tencent.mm.plugin.appbrand.l.m;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class d
{
  private static volatile d htm;
  public boolean hasInit;
  public o htn;
  public m hto;
  public com.tencent.mm.plugin.appbrand.l.a htp;
  public p htq;
  public c htr;
  public CopyOnWriteArrayList<String> hts;
  public boolean htt;
  public AtomicInteger htu;
  public AtomicInteger htv;
  public AtomicInteger htw;
  public AtomicInteger htx;

  private d()
  {
    AppMethodBeat.i(130297);
    this.hasInit = false;
    this.hts = new CopyOnWriteArrayList();
    this.htt = false;
    AppMethodBeat.o(130297);
  }

  public static boolean a(com.tencent.mm.plugin.appbrand.l.a parama, String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(130300);
    if (parama.ioe)
    {
      bool2 = false;
      if ((!bool2) || (j.c(parama.bQI, paramString)))
        break label63;
      ab.i("MicroMsg.WAGamePreloadManager", "not in domain url %s", new Object[] { paramString });
      AppMethodBeat.o(130300);
    }
    for (boolean bool2 = bool1; ; bool2 = true)
    {
      return bool2;
      bool2 = parama.iof;
      break;
      label63: AppMethodBeat.o(130300);
    }
  }

  public static String aBA()
  {
    AppMethodBeat.i(130301);
    Object localObject = new StringBuilder();
    com.tencent.mm.plugin.appbrand.l.c.aIB();
    localObject = com.tencent.mm.plugin.appbrand.l.c.aIA();
    AppMethodBeat.o(130301);
    return localObject;
  }

  public static d aBz()
  {
    AppMethodBeat.i(130298);
    if (htm == null);
    try
    {
      if (htm == null)
      {
        locald = new com/tencent/mm/plugin/appbrand/game/preload/d;
        locald.<init>();
        htm = locald;
      }
      d locald = htm;
      AppMethodBeat.o(130298);
      return locald;
    }
    finally
    {
      AppMethodBeat.o(130298);
    }
  }

  public static void dQ(boolean paramBoolean)
  {
    AppMethodBeat.i(130303);
    e.aBD().htH = paramBoolean;
    AppMethodBeat.o(130303);
  }

  public final void aBB()
  {
    AppMethodBeat.i(130302);
    if ((this.hts != null) && (this.hts.size() == 0))
      if ((this.htn == null) || (this.htn.getAppConfig() == null))
      {
        ab.e("MicroMsg.WAGamePreloadManager", "hy: unexpected null app config");
        AppMethodBeat.o(130302);
      }
    while (true)
    {
      return;
      Object localObject1 = this.htn.getAppConfig().hfd;
      int i;
      if (localObject1 == null)
      {
        i = 0;
        ab.i("MicroMsg.WAGamePreloadManager", "predownload subPackage size:%d", new Object[] { Integer.valueOf(i) });
        if (localObject1 != null)
          localObject1 = ((ArrayList)localObject1).iterator();
      }
      else
      {
        while (true)
        {
          if (!((Iterator)localObject1).hasNext())
            break label215;
          String str = (String)((Iterator)localObject1).next();
          ab.i("MicroMsg.WAGamePreloadManager", "predownload subPackage name:%s", new Object[] { str });
          Object localObject2 = this.htn.atH().hhd.xL(str);
          g.cz(str);
          if (f.b.inO == null)
          {
            ab.e("MicroMsg.WAGamePreloadManager", "downloadSubPackage fail!");
            continue;
            i = ((ArrayList)localObject1).size();
            break;
          }
          localObject2 = f.b.inO.i(this.htn, (String)localObject2);
          ((f)localObject2).a(new d.1(this, str));
          ((f)localObject2).start();
        }
      }
      label215: AppMethodBeat.o(130302);
    }
  }

  public final void aBC()
  {
    AppMethodBeat.i(130304);
    long l1 = bo.anU();
    long l2 = this.htn.atI().startTime;
    e.aBD().cY(2002, (int)(l1 - l2));
    e.aBD().cY(3002, this.htv.intValue());
    e.aBD().cY(3004, this.htu.intValue());
    e.aBD().cY(4002, this.htw.intValue());
    e.aBD().cY(3005, this.htx.intValue());
    AppMethodBeat.o(130304);
  }

  public final boolean isDownloading(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(130299);
    synchronized (this.hts)
    {
      if (this.hts != null)
      {
        if (this.hts.contains(paramString))
        {
          ab.i("MicroMsg.WAGamePreloadManager", "predownloadingList has url:%s,size:%d", new Object[] { paramString, Integer.valueOf(this.hts.size()) });
          this.htx.addAndGet(1);
          AppMethodBeat.o(130299);
        }
        while (true)
        {
          return bool;
          AppMethodBeat.o(130299);
          bool = false;
        }
      }
      AppMethodBeat.o(130299);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.preload.d
 * JD-Core Version:    0.6.2
 */