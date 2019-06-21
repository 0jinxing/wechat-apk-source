package com.tencent.mm.plugin.appbrand.jsapi.websocket;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.t.e.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

final class a$1
  implements e.a
{
  a$1(a parama, String paramString1, e parame, d.a parama1, String paramString2)
  {
  }

  public final void BB(String paramString)
  {
    AppMethodBeat.i(108082);
    ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketMessage url is %s ,socket onmessage length :%d,taskId=%s", new Object[] { this.val$url, Integer.valueOf(paramString.length()), this.hvm });
    this.ibN.BB(paramString);
    AppMethodBeat.o(108082);
  }

  public final void K(int paramInt, String paramString)
  {
    AppMethodBeat.i(108084);
    ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketClose url is %s ,state: closed ,reason: %s, errCode = %d,taskId=%s", new Object[] { this.val$url, paramString, Integer.valueOf(paramInt), this.hvm });
    a.f(this.ibM);
    a.a(this.ibO, this.ibM);
    d.a locala;
    String str;
    if (paramInt == -1)
      if (!at.isConnected(ah.getContext()))
      {
        locala = this.ibN;
        str = "network is down";
        locala.zJ(str);
        this.ibN.K(1006, paramString);
        AppMethodBeat.o(108084);
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
      AppMethodBeat.o(108084);
    }
  }

  public final void a(com.tencent.mm.plugin.appbrand.t.e.a parama)
  {
    AppMethodBeat.i(108080);
    ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "onWebsocketHandshakeSentAsClient");
    this.ibN.a(parama);
    AppMethodBeat.o(108080);
  }

  public final void b(h paramh)
  {
    AppMethodBeat.i(108079);
    ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketOpen taskId=%s", new Object[] { this.hvm });
    a.f(this.ibM);
    this.ibN.b(paramh);
    AppMethodBeat.o(108079);
  }

  public final void l(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(108083);
    String str = this.val$url;
    if (paramByteBuffer != null);
    for (int i = paramByteBuffer.capacity(); ; i = -1)
    {
      ab.i("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketMessage url is %s , socket onMessage buffer length : %d,taskId=%s", new Object[] { str, Integer.valueOf(i), this.hvm });
      this.ibN.l(paramByteBuffer);
      AppMethodBeat.o(108083);
      return;
    }
  }

  public final void zJ(String paramString)
  {
    AppMethodBeat.i(108081);
    ab.e("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketError url is %s ,error is %s,taskId=%s", new Object[] { this.val$url, paramString, this.hvm });
    a.f(this.ibM);
    a.a(this.ibO, this.ibM);
    this.ibN.zJ("exception ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(108081);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.websocket.a.1
 * JD-Core Version:    0.6.2
 */