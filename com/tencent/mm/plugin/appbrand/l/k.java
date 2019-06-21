package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.websocket.d.a;
import com.tencent.mm.plugin.appbrand.jsapi.websocket.e;
import com.tencent.mm.plugin.appbrand.s.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

public final class k
  implements com.tencent.mm.plugin.appbrand.jsapi.websocket.d
{
  private SSLSocketFactory hkw;
  private final String ibJ;
  private int ibK;
  protected final ArrayList<e> ich;
  private boolean ipd;

  public k(a parama)
  {
    AppMethodBeat.i(108223);
    this.ich = new ArrayList();
    SSLContext localSSLContext = j.a(parama);
    if (localSSLContext != null)
      this.hkw = localSSLContext.getSocketFactory();
    this.ibJ = parama.ioo;
    this.ibK = parama.iok;
    this.ipd = parama.bQC;
    ab.i("MicroMsg.AppBrandNetworkWebSocket", "mTLSSkipHostnameCheck is %b", new Object[] { Boolean.valueOf(this.ipd) });
    AppMethodBeat.o(108223);
  }

  private void c(e parame)
  {
    AppMethodBeat.i(108225);
    synchronized (this.ich)
    {
      if ("0".equals(parame.aBA()))
        this.ich.clear();
      this.ich.add(parame);
      AppMethodBeat.o(108225);
      return;
    }
  }

  // ERROR //
  private void d(e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 119
    //   4: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: ifnonnull +11 -> 19
    //   11: ldc 119
    //   13: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: aload_0
    //   20: getfield 40	com/tencent/mm/plugin/appbrand/l/k:ich	Ljava/util/ArrayList;
    //   23: astore_2
    //   24: aload_2
    //   25: monitorenter
    //   26: aload_0
    //   27: getfield 40	com/tencent/mm/plugin/appbrand/l/k:ich	Ljava/util/ArrayList;
    //   30: aload_1
    //   31: invokevirtual 122	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   34: pop
    //   35: aload_2
    //   36: monitorexit
    //   37: ldc 119
    //   39: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   42: goto -26 -> 16
    //   45: astore_1
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: monitorexit
    //   53: ldc 119
    //   55: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: aload_1
    //   59: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   2	7	45	finally
    //   11	16	45	finally
    //   19	26	45	finally
    //   37	42	45	finally
    //   53	60	45	finally
    //   26	37	50	finally
    //   51	53	50	finally
  }

  private static void e(e parame)
  {
    AppMethodBeat.i(108233);
    if (parame == null)
      AppMethodBeat.o(108233);
    while (true)
    {
      return;
      Timer localTimer = parame.aGo();
      ab.i("MicroMsg.AppBrandNetworkWebSocket", "try to stop connectTimer");
      if (localTimer != null)
      {
        localTimer.cancel();
        parame.a(null);
      }
      AppMethodBeat.o(108233);
    }
  }

  public final e BS(String paramString)
  {
    AppMethodBeat.i(108234);
    if (paramString == null)
    {
      AppMethodBeat.o(108234);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      synchronized (this.ich)
      {
        Iterator localIterator = this.ich.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            e locale = (e)localIterator.next();
            if (paramString.equals(locale.aBA()))
            {
              AppMethodBeat.o(108234);
              paramString = locale;
              break;
            }
          }
        AppMethodBeat.o(108234);
        paramString = null;
      }
    }
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(108227);
    if (parame != null);
    try
    {
      ab.i("MicroMsg.AppBrandNetworkWebSocket", "try to close socket");
      parame.close();
      d(parame);
      AppMethodBeat.o(108227);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", localException, "Exception: send error", new Object[0]);
        e(parame);
      }
    }
  }

  public final void a(e parame, int paramInt, String paramString)
  {
    AppMethodBeat.i(108228);
    if (parame != null);
    try
    {
      ab.i("MicroMsg.AppBrandNetworkWebSocket", "try to close socket");
      parame.bk(paramString, paramInt);
      d(parame);
      AppMethodBeat.o(108228);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", paramString, "Exception: send error", new Object[0]);
    }
  }

  public final void a(e parame, String paramString)
  {
    AppMethodBeat.i(108230);
    if (parame != null)
      parame.BU(paramString);
    AppMethodBeat.o(108230);
  }

  public final void a(e parame, ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(108231);
    parame.p(paramByteBuffer);
    AppMethodBeat.o(108231);
  }

  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, JSONObject paramJSONObject, Map<String, String> paramMap, d.a parama)
  {
    AppMethodBeat.i(108224);
    while (true)
    {
      synchronized (this.ich)
      {
        if (this.ich.size() >= this.ibK)
        {
          parama.zK("max connected");
          ab.i("MicroMsg.AppBrandNetworkWebSocket", "max connected mTaskList.size():%d,mMaxWebsocketConnect:%d", new Object[] { Integer.valueOf(this.ich.size()), Integer.valueOf(this.ibK) });
          AppMethodBeat.o(108224);
          return;
        }
        ??? = paramJSONObject.optString("url");
      }
      try
      {
        URI localURI = new java/net/URI;
        localURI.<init>((String)???);
        boolean bool = paramJSONObject.optBoolean("tcpNoDelay", false);
        ab.i("MicroMsg.AppBrandNetworkWebSocket", "connectSocket, url= %s, timeout = %d, tcpNoDelay = %b, taskId=%s", new Object[] { ???, Integer.valueOf(paramInt2), Boolean.valueOf(bool), paramString2 });
        paramMap.put("User-Agent", this.ibJ);
        paramJSONObject = j.G(paramJSONObject);
        if (!bo.isNullOrNil(paramJSONObject))
        {
          ab.i("MicroMsg.AppBrandNetworkWebSocket", "protocols %s", new Object[] { paramJSONObject });
          paramMap.put("Sec-WebSocket-Protocol", paramJSONObject);
        }
        paramJSONObject = j.a(localURI);
        if (!bo.isNullOrNil(paramJSONObject))
        {
          ab.i("MicroMsg.AppBrandNetworkWebSocket", "Origin %s", new Object[] { paramJSONObject });
          paramMap.put("Origin", paramJSONObject);
        }
        try
        {
          paramJSONObject = new com/tencent/mm/plugin/appbrand/l/k$1;
          com.tencent.mm.plugin.appbrand.t.b.d locald = new com/tencent/mm/plugin/appbrand/t/b/d;
          locald.<init>();
          paramJSONObject.<init>(this, localURI, locald, paramMap, paramInt2, (String)???, paramString2, parama);
          paramJSONObject.BT(paramString2);
          paramJSONObject.setTcpNoDelay(bool);
          if (!r.t((String)???, "ws://"))
            break label491;
          ab.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,user ws connect", new Object[] { ??? });
          paramString1 = new java/net/Socket;
          paramString1.<init>(Proxy.NO_PROXY);
          paramJSONObject.a(paramString1);
          paramJSONObject.connect();
          c(paramJSONObject);
          paramString1 = new java/util/Timer;
          paramString1.<init>();
          paramString2 = new com/tencent/mm/plugin/appbrand/l/k$2;
          paramString2.<init>(this, paramJSONObject, parama, paramString1);
          paramJSONObject.a(paramString1);
          paramString1.schedule(paramString2, paramInt2);
          AppMethodBeat.o(108224);
        }
        catch (Exception paramString1)
        {
          ab.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", paramString1, "Exception: url %s", new Object[] { ??? });
          parama.zJ(paramString1.getMessage());
          AppMethodBeat.o(108224);
        }
        continue;
        paramString1 = finally;
        AppMethodBeat.o(108224);
        throw paramString1;
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", paramString1, "Exception: connect fail", new Object[0]);
        parama.zK("url not well format");
        AppMethodBeat.o(108224);
      }
      continue;
      label491: if (r.t((String)???, "wss://"))
      {
        ab.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,user wss connect", new Object[] { ??? });
        if (this.hkw != null);
        for (paramString2 = this.hkw; ; paramString2 = (SSLSocketFactory)SSLSocketFactory.getDefault())
        {
          paramJSONObject.a(paramString2.createSocket());
          if ((paramString1.equals("wx577c74fb940daaea")) || (paramString1.equals("wx850d691fd02de8a1")))
          {
            paramString1 = (SSLSocket)paramJSONObject.getSocket();
            paramString2 = paramString1.getSupportedCipherSuites();
            if (paramString2 != null)
              paramString1.setEnabledCipherSuites(paramString2);
          }
          paramJSONObject.connect();
          c(paramJSONObject);
          paramString2 = new java/util/Timer;
          paramString2.<init>();
          paramString1 = new com/tencent/mm/plugin/appbrand/l/k$3;
          paramString1.<init>(this, paramJSONObject, parama, paramString2);
          paramJSONObject.a(paramString2);
          paramString2.schedule(paramString1, paramInt2);
          AppMethodBeat.o(108224);
          break;
        }
      }
      ab.i("MicroMsg.AppBrandNetworkWebSocket", "url error: %s not ws:// or wss://", new Object[] { ??? });
      parama.zK("url not ws or wss");
      AppMethodBeat.o(108224);
    }
  }

  public final boolean b(e parame)
  {
    AppMethodBeat.i(108229);
    boolean bool;
    if (parame != null)
    {
      bool = parame.isOpen();
      AppMethodBeat.o(108229);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(108229);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(108232);
    a(BS("0"));
    AppMethodBeat.o(108232);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.k
 * JD-Core Version:    0.6.2
 */