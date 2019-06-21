package com.tencent.mm.plugin.appbrand.t.a;

import com.tencent.mm.plugin.appbrand.t.c;
import com.tencent.mm.plugin.appbrand.t.e.f;
import com.tencent.mm.plugin.appbrand.t.e.h;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

public abstract class a extends com.tencent.mm.plugin.appbrand.t.b
  implements com.tencent.mm.plugin.appbrand.t.a, Runnable
{
  private Map<String, String> headers;
  private String hvr;
  private com.tencent.mm.plugin.appbrand.t.b.a iSE;
  protected URI iSN = null;
  public c iSO = null;
  private Socket iSP = null;
  private InputStream iSQ;
  OutputStream iSR;
  private Proxy iSS = Proxy.NO_PROXY;
  private Runnable iST;
  private CountDownLatch iSU = new CountDownLatch(1);
  private CountDownLatch iSV = new CountDownLatch(1);
  private int iSW = 0;
  private Timer mTimer = null;

  public a(URI paramURI, com.tencent.mm.plugin.appbrand.t.b.a parama, Map<String, String> paramMap, int paramInt)
  {
    if (paramURI == null)
      throw new IllegalArgumentException();
    if (parama == null)
      throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    this.iSN = paramURI;
    this.iSE = parama;
    this.headers = paramMap;
    this.iSW = paramInt;
    this.iSO = new c(this, parama);
    this.iSt = false;
  }

  private void aOk()
  {
    Object localObject1 = this.iSN.getRawPath();
    Object localObject2 = this.iSN.getRawQuery();
    if (localObject1 != null)
    {
      localObject3 = localObject1;
      if (((String)localObject1).length() != 0);
    }
    else
    {
      localObject3 = "/";
    }
    localObject1 = localObject3;
    if (localObject2 != null)
      localObject1 = (String)localObject3 + "?" + (String)localObject2;
    int i = getPort();
    localObject2 = new StringBuilder().append(this.iSN.getHost());
    if (i != 80);
    for (Object localObject3 = ":".concat(String.valueOf(i)); ; localObject3 = "")
    {
      localObject2 = (String)localObject3;
      localObject3 = new com.tencent.mm.plugin.appbrand.t.e.d();
      ((com.tencent.mm.plugin.appbrand.t.e.d)localObject3).Eo((String)localObject1);
      ((com.tencent.mm.plugin.appbrand.t.e.d)localObject3).put("Host", (String)localObject2);
      if (this.headers == null)
        break;
      localObject1 = this.headers.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        ((com.tencent.mm.plugin.appbrand.t.e.d)localObject3).put((String)((Map.Entry)localObject2).getKey(), (String)((Map.Entry)localObject2).getValue());
      }
    }
    localObject1 = this.iSO;
    ((c)localObject1).iSI = ((c)localObject1).iSE.a((com.tencent.mm.plugin.appbrand.t.e.b)localObject3);
    ((c)localObject1).iSM = ((com.tencent.mm.plugin.appbrand.t.e.b)localObject3).aOu();
    if (((c)localObject1).iSM != null);
    try
    {
      ((c)localObject1).iSC.b(((c)localObject1).iSI);
      ((c)localObject1).aQ(com.tencent.mm.plugin.appbrand.t.b.a.e(((c)localObject1).iSI));
      return;
    }
    catch (com.tencent.mm.plugin.appbrand.t.c.b localb)
    {
      throw new com.tencent.mm.plugin.appbrand.t.c.d("Handshake data rejected by client.");
    }
    catch (RuntimeException localRuntimeException)
    {
      ((c)localObject1).iSC.f(localRuntimeException);
      throw new com.tencent.mm.plugin.appbrand.t.c.d("rejected because of".concat(String.valueOf(localRuntimeException)));
    }
  }

  private int getPort()
  {
    int i = this.iSN.getPort();
    int j = i;
    String str;
    if (i == -1)
    {
      str = this.iSN.getScheme();
      if (!str.equals("wss"))
        break label39;
    }
    for (j = 443; ; j = 80)
    {
      return j;
      label39: if (!str.equals("ws"))
        break;
    }
    throw new RuntimeException("unkonow scheme".concat(String.valueOf(str)));
  }

  public final void BT(String paramString)
  {
    this.hvr = paramString;
  }

  public final void BU(String paramString)
  {
    this.iSO.BU(paramString);
  }

  public final void Em(String paramString)
  {
    zO(paramString);
  }

  public abstract void N(int paramInt, String paramString);

  public void a(com.tencent.mm.plugin.appbrand.t.d.d paramd)
  {
  }

  public abstract void a(h paramh);

  public final void a(Socket paramSocket)
  {
    if (this.iSP != null)
      ab.i("MicroMsg.AppBrandNetWork.WebSocketClient", "socket has already been set");
    while (true)
    {
      return;
      this.iSP = paramSocket;
    }
  }

  public final void a(Timer paramTimer)
  {
    this.mTimer = paramTimer;
  }

  public final String aBA()
  {
    return this.hvr;
  }

  public final Timer aGo()
  {
    return this.mTimer;
  }

  public final void ag(int paramInt, String paramString)
  {
    this.iSU.countDown();
    this.iSV.countDown();
    com.tencent.mm.sdk.g.d.xDG.remove(this.iST);
    if ((this.iST != null) && ((this.iST instanceof a.a)))
      ((a.a)this.iST).isStop = true;
    try
    {
      if (this.iSP != null)
        this.iSP.close();
      N(paramInt, paramString);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        onError(localIOException);
    }
  }

  public final void ah(int paramInt, String paramString)
  {
    this.iSO.d(paramInt, paramString, false);
  }

  public final void b(com.tencent.mm.plugin.appbrand.t.d.d paramd)
  {
    this.iSO.b(paramd);
  }

  public final void bk(String paramString, int paramInt)
  {
    if (this.iST != null)
      ah(paramInt, paramString);
  }

  public final void c(com.tencent.mm.plugin.appbrand.t.d.d paramd)
  {
    a(paramd);
  }

  public final void close()
  {
    if (this.iST != null)
      this.iSO.d(1000, "", false);
  }

  public final void connect()
  {
    if (this.iST != null)
      ab.i("MicroMsg.AppBrandNetWork.WebSocketClient", "WebSocketClient objects are not reuseable");
    while (true)
    {
      return;
      this.iST = this;
      com.tencent.mm.sdk.g.d.post(this.iST, "WebsocketWriteThread");
    }
  }

  public final void d(f paramf)
  {
    this.iSU.countDown();
    a((h)paramf);
  }

  public final void f(Exception paramException)
  {
    onError(paramException);
  }

  public final Socket getSocket()
  {
    return this.iSP;
  }

  public final boolean isOpen()
  {
    return this.iSO.isOpen();
  }

  public void m(ByteBuffer paramByteBuffer)
  {
  }

  public abstract void onError(Exception paramException);

  public final void p(ByteBuffer paramByteBuffer)
  {
    this.iSO.p(paramByteBuffer);
  }

  public void run()
  {
    try
    {
      if (this.iSP == null)
      {
        localObject = new java/net/Socket;
        ((Socket)localObject).<init>(this.iSS);
        this.iSP = ((Socket)localObject);
        this.iSP.setTcpNoDelay(this.iSt);
        if (!this.iSP.isBound())
        {
          Socket localSocket = this.iSP;
          localObject = new java/net/InetSocketAddress;
          ((InetSocketAddress)localObject).<init>(this.iSN.getHost(), getPort());
          localSocket.connect((SocketAddress)localObject, this.iSW);
        }
        this.iSQ = this.iSP.getInputStream();
        this.iSR = this.iSP.getOutputStream();
        aOk();
        this.iST = new a.a(this, (byte)0);
        com.tencent.mm.sdk.g.d.post(this.iST, "WebsocketWriteThread");
        localObject = new byte[c.iSu];
      }
    }
    catch (Exception localException)
    {
      try
      {
        Object localObject;
        while ((!this.iSO.aOj()) && (!this.iSO.isClosed()))
        {
          int i = this.iSQ.read((byte[])localObject);
          if (i == -1)
            break;
          this.iSO.r(ByteBuffer.wrap((byte[])localObject, 0, i));
        }
      }
      catch (IOException localIOException1)
      {
        this.iSO.aOi();
        while (true)
        {
          return;
          if (!this.iSP.isClosed())
            break;
          IOException localIOException2 = new java/io/IOException;
          localIOException2.<init>();
          throw localIOException2;
          localException = localException;
          this.iSO.af(-1, localException.getMessage());
          continue;
          this.iSO.aOi();
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        while (true)
        {
          onError(localRuntimeException);
          this.iSO.af(1006, localRuntimeException.getMessage());
        }
      }
    }
  }

  public final void v(ByteBuffer paramByteBuffer)
  {
    m(paramByteBuffer);
  }

  public abstract void zO(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.a.a
 * JD-Core Version:    0.6.2
 */