package com.tencent.mm.plugin.appbrand.jsapi.websocket;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Timer;
import java.util.TimerTask;

final class a$2 extends TimerTask
{
  a$2(a parama, e parame, d.a parama1, Timer paramTimer)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(108085);
    ab.e("MicroMsg.AppBrandNetworkWcWssSocket", "connect response time out taskid:%s", new Object[] { this.ibM.aBA() });
    this.ibM.close();
    a.a(this.ibO, this.ibM);
    this.ibN.zJ("connect response time out");
    cancel();
    this.ibP.cancel();
    AppMethodBeat.o(108085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.websocket.a.2
 * JD-Core Version:    0.6.2
 */