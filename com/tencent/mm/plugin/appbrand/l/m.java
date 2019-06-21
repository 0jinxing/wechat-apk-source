package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.l.a.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.net.ssl.SSLContext;
import org.json.JSONObject;

public final class m
{
  public static int FAILED = -1;
  public static int SUCCESS = 0;
  private final Map<String, ConcurrentLinkedQueue<b.a>> gVq;
  private c hvw;
  private final String ibJ;
  private int ioq;
  private String ior;
  private SSLContext ios;
  protected final ArrayList<String> iot;
  private final ArrayList<b> iov;
  private final ConcurrentLinkedQueue<b> ipg;

  public m(c paramc)
  {
    AppMethodBeat.i(108249);
    this.ior = (e.euQ + "appbrand/");
    this.iot = new ArrayList();
    this.iov = new ArrayList();
    this.ipg = new ConcurrentLinkedQueue();
    this.hvw = paramc;
    paramc = (a)paramc.aa(a.class);
    this.ioq = paramc.bQy;
    this.ibJ = paramc.ioo;
    this.ios = j.a(paramc);
    this.gVq = new Hashtable(10);
    AppMethodBeat.o(108249);
  }

  public final void a(JSONObject paramJSONObject, int paramInt1, Map<String, String> arg3, ArrayList<String> arg4, int paramInt2, b.a parama, String paramString1, String paramString2)
  {
    AppMethodBeat.i(108250);
    ??? = paramJSONObject.optString("url");
    paramJSONObject = this.ior + ag.ck((String)???) + "temp";
    String str = j.CS((String)???);
    ConcurrentLinkedQueue localConcurrentLinkedQueue;
    synchronized (this.gVq)
    {
      if (this.gVq.get(str) == null)
      {
        localConcurrentLinkedQueue = new java/util/concurrent/ConcurrentLinkedQueue;
        localConcurrentLinkedQueue.<init>();
        localConcurrentLinkedQueue.offer(parama);
        this.gVq.put(str, localConcurrentLinkedQueue);
        paramJSONObject = new b(this.hvw, str, paramJSONObject, this.ibJ, new m.1(this, paramString1, parama));
        paramJSONObject.ipC = ???;
        paramJSONObject.azs = paramInt1;
        paramJSONObject.isRunning = true;
        paramJSONObject.ioN = ???;
        paramJSONObject.ipD = paramInt2;
        paramJSONObject.ios = this.ios;
        paramJSONObject.hvr = paramString1;
        paramJSONObject.ioR = paramString2;
      }
    }
    while (true)
    {
      synchronized (this.iov)
      {
        while (true)
          if (this.iov.size() >= this.ioq)
            synchronized (this.ipg)
            {
              this.ipg.add(paramJSONObject);
              AppMethodBeat.o(108250);
              return;
              localConcurrentLinkedQueue = (ConcurrentLinkedQueue)this.gVq.get(str);
              localConcurrentLinkedQueue.offer(parama);
              ab.w("MicroMsg.AppBrandPreloadNetworkDownload", "predownload the same task is working url:%s,size:%d", new Object[] { str, Integer.valueOf(localConcurrentLinkedQueue.size()) });
              break;
              paramJSONObject = finally;
              AppMethodBeat.o(108250);
              throw paramJSONObject;
            }
      }
      this.iov.add(paramJSONObject);
      d.post(paramJSONObject, "appbrand_predownload_thread");
      AppMethodBeat.o(108250);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.m
 * JD-Core Version:    0.6.2
 */