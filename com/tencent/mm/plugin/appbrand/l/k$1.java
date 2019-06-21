package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.websocket.c;
import com.tencent.mm.plugin.appbrand.jsapi.websocket.e.a;
import com.tencent.mm.plugin.appbrand.t.d.d;
import com.tencent.mm.plugin.appbrand.t.e.h;
import com.tencent.mm.plugin.appbrand.t.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Map;

final class k$1 extends c
{
  private d hkx = null;

  k$1(k paramk, URI paramURI, com.tencent.mm.plugin.appbrand.t.b.a parama, Map paramMap, int paramInt, String paramString1, String paramString2, com.tencent.mm.plugin.appbrand.jsapi.websocket.d.a parama1)
  {
    super(paramURI, parama, paramMap, paramInt);
  }

  public final void N(int paramInt, String paramString)
  {
    AppMethodBeat.i(108217);
    ab.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,state: closed ,reason: %s, errCode = %d, taskId=%s", new Object[] { this.val$url, paramString, Integer.valueOf(paramInt), this.hvm });
    k.g(this);
    k.a(this.ipe, this);
    com.tencent.mm.plugin.appbrand.jsapi.websocket.d.a locala;
    String str;
    if ((paramInt == -1) || (paramInt == -2) || (paramInt == -3))
      if (!at.isConnected(ah.getContext()))
      {
        locala = this.ibN;
        str = "network is down";
        locala.zJ(str);
        this.ibN.K(1006, paramString);
        AppMethodBeat.o(108217);
      }
    while (true)
    {
      return;
      locala = this.ibN;
      if (bo.isNullOrNil(paramString))
      {
        str = "abnormal closure";
        break;
      }
      str = paramString;
      break;
      this.ibN.K(paramInt, paramString);
      AppMethodBeat.o(108217);
    }
  }

  public final void a(e.a parama)
  {
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(108220);
    if ((paramd.aOt() != com.tencent.mm.plugin.appbrand.t.d.d.a.iTr) && (!paramd.aOr()))
    {
      this.hkx = paramd;
      AppMethodBeat.o(108220);
    }
    while (true)
    {
      return;
      if (paramd.aOt() != com.tencent.mm.plugin.appbrand.t.d.d.a.iTr)
        break label177;
      if (this.hkx == null)
      {
        AppMethodBeat.o(108220);
      }
      else if (this.hkx.aOq().position() > 10485760)
      {
        ab.e("MicroMsg.AppBrandNetworkWebSocket", "Pending Frame exploded");
        this.hkx = null;
        AppMethodBeat.o(108220);
      }
      else
      {
        try
        {
          this.hkx.e(paramd);
          if (!paramd.aOr())
            AppMethodBeat.o(108220);
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", localException, "Exception: Framedata append fail", new Object[0]);
        }
      }
    }
    if (this.hkx.aOt() == com.tencent.mm.plugin.appbrand.t.d.d.a.iTt)
      m(this.hkx.aOq());
    while (true)
    {
      this.hkx = null;
      label177: AppMethodBeat.o(108220);
      break;
      if (this.hkx.aOt() == com.tencent.mm.plugin.appbrand.t.d.d.a.iTs)
        try
        {
          zO(bo.nullAsNil(b.B(this.hkx.aOq())));
        }
        catch (Exception paramd)
        {
          ab.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", paramd, "Exception: stringUtf8 error", new Object[0]);
        }
    }
  }

  public final void a(h paramh)
  {
    AppMethodBeat.i(108214);
    ab.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,state: opened, taskId=%s", new Object[] { this.val$url, this.hvm });
    k.g(this);
    this.ibN.b(paramh);
    AppMethodBeat.o(108214);
  }

  public final void b(com.tencent.mm.plugin.appbrand.t.e.a parama)
  {
    AppMethodBeat.i(108215);
    this.ibN.a(parama);
    AppMethodBeat.o(108215);
  }

  public final void m(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(108219);
    String str = this.val$url;
    if (paramByteBuffer != null);
    for (int i = paramByteBuffer.capacity(); ; i = -1)
    {
      ab.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s , socket onMessage buffer length : %d, taskId=%s", new Object[] { str, Integer.valueOf(i), this.hvm });
      this.ibN.l(paramByteBuffer);
      AppMethodBeat.o(108219);
      return;
    }
  }

  public final void onError(Exception paramException)
  {
    AppMethodBeat.i(108218);
    ab.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", paramException, "onError Exception: url %s, taskId=%s", new Object[] { this.val$url, this.hvm });
    k.g(this);
    k.a(this.ipe, this);
    this.ibN.zJ("exception " + paramException.getMessage());
    AppMethodBeat.o(108218);
  }

  public final void zO(String paramString)
  {
    AppMethodBeat.i(108216);
    String str = this.val$url;
    if (paramString != null);
    for (int i = paramString.length(); ; i = -1)
    {
      ab.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,socket onmessage length :%d, taskId=%s", new Object[] { str, Integer.valueOf(i), this.hvm });
      this.ibN.BB(paramString);
      AppMethodBeat.o(108216);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.k.1
 * JD-Core Version:    0.6.2
 */