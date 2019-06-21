package com.tencent.mm.plugin.appbrand.jsapi.websocket;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.l.j;
import com.tencent.mm.plugin.appbrand.s.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import org.json.JSONObject;

public final class a
  implements d
{
  private final String ibJ;
  private int ibK;
  private com.tencent.mm.plugin.appbrand.l.a ibL;

  public a(com.tencent.mm.plugin.appbrand.l.a parama)
  {
    this.ibJ = parama.ioo;
    this.ibK = parama.iok;
    this.ibL = parama;
  }

  private static void c(e parame)
  {
    AppMethodBeat.i(108094);
    synchronized (ich)
    {
      if ("0".equals(parame.aBA()))
        ich.clear();
      ich.add(parame);
      AppMethodBeat.o(108094);
      return;
    }
  }

  // ERROR //
  private void d(e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 77
    //   4: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: ifnonnull +11 -> 19
    //   11: ldc 77
    //   13: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: getstatic 54	com/tencent/mm/plugin/appbrand/jsapi/websocket/a:ich	Ljava/util/ArrayList;
    //   22: astore_2
    //   23: aload_2
    //   24: monitorenter
    //   25: getstatic 54	com/tencent/mm/plugin/appbrand/jsapi/websocket/a:ich	Ljava/util/ArrayList;
    //   28: aload_1
    //   29: invokevirtual 80	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   32: pop
    //   33: aload_2
    //   34: monitorexit
    //   35: ldc 77
    //   37: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: goto -24 -> 16
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    //   48: astore_1
    //   49: aload_2
    //   50: monitorexit
    //   51: ldc 77
    //   53: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: aload_1
    //   57: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   2	7	43	finally
    //   11	16	43	finally
    //   19	25	43	finally
    //   35	40	43	finally
    //   51	58	43	finally
    //   25	35	48	finally
    //   49	51	48	finally
  }

  private static void e(e parame)
  {
    AppMethodBeat.i(108096);
    if (parame == null)
      AppMethodBeat.o(108096);
    while (true)
    {
      return;
      Timer localTimer = parame.aGo();
      ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "try to stop connectTimer");
      if (localTimer != null)
      {
        localTimer.cancel();
        parame.a(null);
      }
      AppMethodBeat.o(108096);
    }
  }

  public final e BS(String paramString)
  {
    AppMethodBeat.i(108093);
    if (paramString == null)
    {
      AppMethodBeat.o(108093);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      synchronized (ich)
      {
        Iterator localIterator = ich.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            e locale = (e)localIterator.next();
            if (paramString.equals(locale.aBA()))
            {
              AppMethodBeat.o(108093);
              paramString = locale;
              break;
            }
          }
        AppMethodBeat.o(108093);
        paramString = null;
      }
    }
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(108088);
    if (parame != null);
    try
    {
      ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "try to close socket");
      parame.close();
      d(parame);
      AppMethodBeat.o(108088);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandNetworkWcWssSocket", localException, "send error Exception", new Object[0]);
        e(parame);
      }
    }
  }

  public final void a(e parame, int paramInt, String paramString)
  {
    AppMethodBeat.i(108089);
    if (parame != null);
    try
    {
      ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "try to close socket code:%d,reason:%s", new Object[] { Integer.valueOf(paramInt), paramString });
      parame.bk(paramString, paramInt);
      d(parame);
      AppMethodBeat.o(108089);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.AppBrandNetworkWcWssSocket", paramString, "send error Exception", new Object[0]);
    }
  }

  public final void a(e parame, String paramString)
  {
    AppMethodBeat.i(108091);
    if (parame != null)
      parame.BU(paramString);
    AppMethodBeat.o(108091);
  }

  public final void a(e parame, ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(108092);
    if (parame != null)
      parame.p(paramByteBuffer);
    AppMethodBeat.o(108092);
  }

  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, JSONObject paramJSONObject, Map<String, String> paramMap, d.a parama)
  {
    AppMethodBeat.i(108087);
    while (true)
    {
      synchronized (ich)
      {
        if (ich.size() >= this.ibK)
        {
          parama.zK("max connected");
          ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "max connected mTaskList.size():%d,mMaxWebsocketConnect:%d", new Object[] { Integer.valueOf(ich.size()), Integer.valueOf(this.ibK) });
          AppMethodBeat.o(108087);
          return;
        }
        ??? = paramJSONObject.optString("url");
      }
      try
      {
        URI localURI = new java/net/URI;
        localURI.<init>((String)???);
        boolean bool1 = paramJSONObject.optBoolean("tcpNoDelay", false);
        ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "connectSocket, url= %s, appType = %d, timeout = %d, tcpNoDelay = %b", new Object[] { ???, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool1) });
        paramMap.put("User-Agent", this.ibJ);
        paramJSONObject = j.G(paramJSONObject);
        if (!bo.isNullOrNil(paramJSONObject))
        {
          ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "protocols %s", new Object[] { paramJSONObject });
          paramMap.put("Sec-WebSocket-Protocol", paramJSONObject);
        }
        paramJSONObject = j.a(localURI);
        if (!bo.isNullOrNil(paramJSONObject))
        {
          ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "Origin %s", new Object[] { paramJSONObject });
          paramMap.put("Origin", paramJSONObject);
        }
        boolean bool2 = false;
        if (r.t((String)???, "ws://"))
          bool2 = true;
        ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "connectSocket, taskId=%s, url= %s, appType = %d, timeout = %d, tcpNoDelay = %b, skipDimain = %b", new Object[] { paramString2, ???, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        try
        {
          WssConfig localWssConfig = new com/tencent/mm/plugin/appbrand/jsapi/websocket/WssConfig;
          localWssConfig.<init>(paramInt2, paramInt2, bool1, bool2, paramInt1);
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          paramJSONObject = new com/tencent/mm/plugin/appbrand/jsapi/websocket/b;
          paramJSONObject.<init>(paramString1, (String)???, localURI, paramMap, localWssConfig, localArrayList, this.ibL);
          paramString1 = new com/tencent/mm/plugin/appbrand/jsapi/websocket/a$1;
          paramString1.<init>(this, paramString2, paramJSONObject, parama, (String)???);
          paramJSONObject.a(paramString1);
          paramJSONObject.BT(paramString2);
          if ((!r.t((String)???, "ws://")) && (!r.t((String)???, "wss://")))
            break label564;
          paramJSONObject.connect();
          c(paramJSONObject);
          paramString1 = new java/util/Timer;
          paramString1.<init>();
          paramString2 = new com/tencent/mm/plugin/appbrand/jsapi/websocket/a$2;
          paramString2.<init>(this, paramJSONObject, parama, paramString1);
          paramJSONObject.a(paramString1);
          paramString1.schedule(paramString2, paramInt2);
          AppMethodBeat.o(108087);
        }
        catch (Exception paramString1)
        {
          ab.printErrStackTrace("MicroMsg.AppBrandNetworkWcWssSocket", paramString1, "Exception: url %s", new Object[] { ??? });
          parama.zJ(paramString1.getMessage());
          AppMethodBeat.o(108087);
        }
        continue;
        paramString1 = finally;
        AppMethodBeat.o(108087);
        throw paramString1;
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandNetworkWcWssSocket", paramString1, "connect fail Exception", new Object[0]);
        parama.zK("url not well format");
        AppMethodBeat.o(108087);
      }
      continue;
      label564: ab.w("MicroMsg.AppBrandNetworkWcWssSocket", "url error: %s not ws:// or wss://", new Object[] { ??? });
      parama.zK("url not ws or wss");
      AppMethodBeat.o(108087);
    }
  }

  public final boolean b(e parame)
  {
    AppMethodBeat.i(108090);
    boolean bool;
    if (parame != null)
    {
      bool = parame.isOpen();
      AppMethodBeat.o(108090);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(108090);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(108086);
    a(BS("0"));
    AppMethodBeat.o(108086);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.websocket.a
 * JD-Core Version:    0.6.2
 */