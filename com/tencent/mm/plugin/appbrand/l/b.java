package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.net.ssl.SSLContext;

public final class b
{
  public static int FAILED = -1;
  public static int SUCCESS = 0;
  public c hvw;
  public final String ibJ;
  public int ioq;
  public String ior;
  public SSLContext ios;
  protected final ArrayList<String> iot;
  public final Map<String, ConcurrentLinkedQueue<Runnable>> iou;
  public final ArrayList<com.tencent.mm.plugin.appbrand.l.a.b> iov;

  public b(c paramc)
  {
    AppMethodBeat.i(108134);
    this.ior = (e.euQ + "appbrand/");
    this.iot = new ArrayList();
    this.iov = new ArrayList();
    this.hvw = paramc;
    paramc = (a)paramc.aa(a.class);
    this.ioq = paramc.bQy;
    this.ibJ = paramc.ioo;
    this.ios = j.a(paramc);
    this.iou = new Hashtable(10);
    AppMethodBeat.o(108134);
  }

  private void kP(String paramString)
  {
    AppMethodBeat.i(108136);
    if (paramString == null)
      AppMethodBeat.o(108136);
    while (true)
    {
      return;
      synchronized (this.iov)
      {
        Iterator localIterator = this.iov.iterator();
        while (localIterator.hasNext())
        {
          com.tencent.mm.plugin.appbrand.l.a.b localb = (com.tencent.mm.plugin.appbrand.l.a.b)localIterator.next();
          if (paramString.equals(localb.hvr))
            this.iov.remove(localb);
        }
        AppMethodBeat.o(108136);
      }
    }
  }

  public final void CF(final String paramString)
  {
    AppMethodBeat.i(108135);
    d.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(108133);
        synchronized (b.a(b.this))
        {
          ConcurrentLinkedQueue localConcurrentLinkedQueue = (ConcurrentLinkedQueue)b.a(b.this).get(paramString);
          ab.d("MicroMsg.AppBrandNetworkDownload", "hy: url %s queue size %d", new Object[] { paramString, Integer.valueOf(localConcurrentLinkedQueue.size()) });
          Runnable localRunnable = (Runnable)localConcurrentLinkedQueue.peek();
          if (localRunnable != null)
          {
            localRunnable.run();
            localConcurrentLinkedQueue.poll();
            if (localConcurrentLinkedQueue.size() > 0)
            {
              ab.i("MicroMsg.AppBrandNetworkDownload", "hy: need execute more");
              b.b(b.this, paramString);
            }
          }
          AppMethodBeat.o(108133);
          return;
        }
      }
    }
    , "appbrand_download_thread");
    AppMethodBeat.o(108135);
  }

  public final com.tencent.mm.plugin.appbrand.l.a.b CG(String paramString)
  {
    AppMethodBeat.i(108137);
    if (paramString == null)
    {
      AppMethodBeat.o(108137);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      synchronized (this.iov)
      {
        Iterator localIterator = this.iov.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            com.tencent.mm.plugin.appbrand.l.a.b localb = (com.tencent.mm.plugin.appbrand.l.a.b)localIterator.next();
            if (paramString.equals(localb.hvr))
            {
              AppMethodBeat.o(108137);
              paramString = localb;
              break;
            }
          }
        AppMethodBeat.o(108137);
        paramString = null;
      }
    }
  }

  public final boolean CH(String paramString)
  {
    AppMethodBeat.i(108139);
    boolean bool = this.iot.contains(paramString);
    AppMethodBeat.o(108139);
    return bool;
  }

  public final void a(com.tencent.mm.plugin.appbrand.l.a.b paramb)
  {
    AppMethodBeat.i(108138);
    if (paramb == null)
      AppMethodBeat.o(108138);
    while (true)
    {
      return;
      this.iot.add(paramb.hvr);
      kP(paramb.hvr);
      paramb.aIP();
      AppMethodBeat.o(108138);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.b
 * JD-Core Version:    0.6.2
 */