package com.tencent.mm.plugin.appbrand.jsapi.websocket;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.l.a;
import com.tencent.mm.plugin.appbrand.l.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Timer;
import javax.net.ssl.X509TrustManager;

public final class b
  implements e
{
  private String hvr;
  private String ibQ;
  private URI ibR;
  private ArrayList ibS;
  private ArrayList ibT;
  private WssConfig ibU;
  private int ibV;
  private ArrayList<String> ibW;
  private e.a ibX;
  private WcWss.a ibY;
  private b.a ibZ;
  private Map<String, String> mHeaders;
  private Timer mTimer;
  private X509TrustManager mTrustManager;
  private String mUrl;

  public b(String paramString1, String paramString2, URI paramURI, Map<String, String> paramMap, WssConfig paramWssConfig, ArrayList<String> paramArrayList, a parama)
  {
    AppMethodBeat.i(108107);
    this.ibS = new ArrayList();
    this.ibT = new ArrayList();
    this.ibV = -1;
    this.mTimer = null;
    this.ibZ = b.a.icb;
    this.ibQ = paramString1;
    this.mUrl = paramString2;
    this.ibR = paramURI;
    this.mHeaders = paramMap;
    this.ibU = paramWssConfig;
    this.ibW = paramArrayList;
    this.mTrustManager = j.b(parama);
    if (this.mHeaders == null)
    {
      ab.e("MicroMsg.AppBrandWcWssSocket", "header is null");
      AppMethodBeat.o(108107);
    }
    while (true)
    {
      return;
      paramString2 = this.mHeaders.entrySet().iterator();
      while (paramString2.hasNext())
      {
        paramString1 = (Map.Entry)paramString2.next();
        this.ibS.add(paramString1.getKey());
        this.ibT.add(paramString1.getValue());
      }
      AppMethodBeat.o(108107);
    }
  }

  public final void BT(String paramString)
  {
    this.hvr = paramString;
  }

  public final void BU(String paramString)
  {
    AppMethodBeat.i(108111);
    ab.i("MicroMsg.AppBrandWcWssSocket", "send text");
    if (this.ibV < 0)
    {
      this.ibX.zJ("error socket id");
      AppMethodBeat.o(108111);
    }
    while (true)
    {
      return;
      try
      {
        paramString = ByteBuffer.wrap(paramString.getBytes("UTF8"));
        byte[] arrayOfByte = new byte[paramString.remaining()];
        paramString.get(arrayOfByte);
        WcWss.sendBuffer(this.ibQ, this.ibV, arrayOfByte, true);
        AppMethodBeat.o(108111);
      }
      catch (UnsupportedEncodingException paramString)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandWcWssSocket", paramString, "unsupport encoding UnsupportedEncodingException", new Object[0]);
        this.ibX.zJ("unsupport encoding");
        AppMethodBeat.o(108111);
      }
    }
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(108108);
    ab.i("MicroMsg.AppBrandWcWssSocket", "setCallBack");
    this.ibX = parama;
    this.ibY = new b.1(this);
    AppMethodBeat.o(108108);
  }

  public final void a(Socket paramSocket)
  {
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

  public final void bk(String paramString, int paramInt)
  {
    AppMethodBeat.i(108110);
    ab.i("MicroMsg.AppBrandWcWssSocket", "close reason:%s,code:%s", new Object[] { paramString, Integer.valueOf(paramInt) });
    if (this.ibV < 0)
    {
      this.ibX.zJ("error socket id");
      AppMethodBeat.o(108110);
    }
    while (true)
    {
      return;
      if ((this.ibZ != b.a.ice) && (this.ibZ != b.a.icf))
        this.ibZ = b.a.ice;
      WcWss.closeSocket(this.ibQ, this.ibV, paramInt, paramString);
      AppMethodBeat.o(108110);
    }
  }

  public final void close()
  {
    AppMethodBeat.i(108109);
    ab.i("MicroMsg.AppBrandWcWssSocket", "close");
    bk("default_close", 1000);
    AppMethodBeat.o(108109);
  }

  public final void connect()
  {
    AppMethodBeat.i(108113);
    ab.i("MicroMsg.AppBrandWcWssSocket", "connect");
    if (this.mHeaders == null)
    {
      this.ibX.zJ("header is null");
      AppMethodBeat.o(108113);
    }
    while (true)
    {
      return;
      this.ibV = WcWss.a(this.ibY, this.ibQ, this.mUrl, this.ibS.toArray(), this.ibT.toArray(), this.ibU, this.ibW.toArray());
      if (this.ibV < 0)
        this.ibX.zJ("call connect fail code:" + this.ibV);
      ab.i("MicroMsg.AppBrandWcWssSocket", "connect mWcWssId:%s", new Object[] { Integer.valueOf(this.ibV) });
      AppMethodBeat.o(108113);
    }
  }

  public final Socket getSocket()
  {
    return null;
  }

  public final boolean isOpen()
  {
    if (this.ibZ == b.a.icd);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void p(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(108112);
    ab.i("MicroMsg.AppBrandWcWssSocket", "send bytes");
    if (this.ibV < 0)
    {
      this.ibX.zJ("error socket id");
      AppMethodBeat.o(108112);
    }
    while (true)
    {
      return;
      byte[] arrayOfByte = new byte[paramByteBuffer.remaining()];
      paramByteBuffer.get(arrayOfByte);
      WcWss.sendBuffer(this.ibQ, this.ibV, arrayOfByte, false);
      AppMethodBeat.o(108112);
    }
  }

  public final void setTcpNoDelay(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.websocket.b
 * JD-Core Version:    0.6.2
 */