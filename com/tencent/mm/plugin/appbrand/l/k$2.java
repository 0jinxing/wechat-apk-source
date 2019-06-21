package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.websocket.d.a;
import com.tencent.mm.plugin.appbrand.jsapi.websocket.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Timer;
import java.util.TimerTask;

final class k$2 extends TimerTask
{
  k$2(k paramk, e parame, d.a parama, Timer paramTimer)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(108221);
    ab.e("MicroMsg.AppBrandNetworkWebSocket", "connect response time out");
    this.ibM.close();
    k.a(this.ipe, this.ibM);
    this.ibN.zJ("connect response time out");
    cancel();
    this.ibP.cancel();
    AppMethodBeat.o(108221);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.k.2
 * JD-Core Version:    0.6.2
 */