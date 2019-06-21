package com.tencent.mm.plugin.appbrand.debugger;

import android.util.Log;
import com.tencent.luggage.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.l.j;
import com.tencent.mm.plugin.appbrand.l.k.b;
import com.tencent.mm.plugin.appbrand.t.b.d;
import com.tencent.mm.plugin.appbrand.t.c;
import com.tencent.mm.protocal.protobuf.cqs;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public final class s
{
  com.tencent.mm.plugin.appbrand.t.a.a hkv;
  private SSLSocketFactory hkw;

  public s(com.tencent.mm.plugin.appbrand.l.a parama)
  {
    AppMethodBeat.i(101902);
    parama = j.a(parama);
    if (parama != null)
      this.hkw = parama.getSocketFactory();
    AppMethodBeat.o(101902);
  }

  public final void a(String paramString, k.b paramb)
  {
    AppMethodBeat.i(101903);
    ab.i("MicroMsg.RemoteDebugSocket", "connectSocket url is %s", new Object[] { paramString });
    try
    {
      localURI = new java/net/URI;
      localURI.<init>(paramString);
      localHashMap = new HashMap();
      if (paramString.startsWith("ws://localhost:"))
        localHashMap.put("Sec-WebSocket-Protocol", "client");
    }
    catch (Exception paramString)
    {
      try
      {
        URI localURI;
        HashMap localHashMap;
        s.1 local1 = new com/tencent/mm/plugin/appbrand/debugger/s$1;
        d locald = new com/tencent/mm/plugin/appbrand/t/b/d;
        locald.<init>();
        local1.<init>(this, localURI, locald, localHashMap, paramb);
        this.hkv = local1;
        if (h.t(paramString, "ws://"))
        {
          paramString = new java/net/Socket;
          paramString.<init>(Proxy.NO_PROXY);
          this.hkv.a(paramString);
          this.hkv.connect();
          AppMethodBeat.o(101903);
          while (true)
          {
            return;
            paramString = paramString;
            ab.e("MicroMsg.RemoteDebugSocket", "connect fail : %s ", new Object[] { paramString.toString() });
            paramb.zK("url not well format");
            AppMethodBeat.o(101903);
          }
        }
        if (this.hkw != null);
        for (paramString = this.hkw; ; paramString = (SSLSocketFactory)SSLSocketFactory.getDefault())
        {
          paramString = paramString.createSocket();
          this.hkv.a(paramString);
          this.hkv.connect();
          AppMethodBeat.o(101903);
          break;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.RemoteDebugSocket", "onSocketMessage %s", new Object[] { Log.getStackTraceString(paramString) });
          AppMethodBeat.o(101903);
        }
      }
    }
  }

  public final boolean a(cqs paramcqs)
  {
    boolean bool = false;
    AppMethodBeat.i(101905);
    ab.d("MicroMsg.RemoteDebugSocket", "sendSocketMsg");
    if (!isOpen())
    {
      ab.w("MicroMsg.RemoteDebugSocket", "sendSocketMsg fail, not open");
      AppMethodBeat.o(101905);
    }
    while (true)
    {
      return bool;
      if (paramcqs == null)
      {
        ab.w("MicroMsg.RemoteDebugSocket", "sendSocketMsg fail");
        AppMethodBeat.o(101905);
      }
      else
      {
        paramcqs = t.c(paramcqs);
        this.hkv.p(paramcqs);
        bool = true;
        AppMethodBeat.o(101905);
      }
    }
  }

  public final boolean isOpen()
  {
    AppMethodBeat.i(101904);
    boolean bool;
    if (this.hkv == null)
    {
      bool = false;
      AppMethodBeat.o(101904);
    }
    while (true)
    {
      return bool;
      bool = this.hkv.iSO.isOpen();
      AppMethodBeat.o(101904);
    }
  }

  public final boolean zN(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(101906);
    if (this.hkv == null)
    {
      ab.w("MicroMsg.RemoteDebugSocket", "client is null");
      AppMethodBeat.o(101906);
    }
    while (true)
    {
      return bool;
      this.hkv.ah(1000, paramString);
      ab.d("MicroMsg.RemoteDebugSocket", "closeSocket code %d, reason %s", new Object[] { Integer.valueOf(1000), paramString });
      AppMethodBeat.o(101906);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.s
 * JD-Core Version:    0.6.2
 */