package com.tencent.mm.plugin.freewifi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;

final class h$1
  implements Runnable
{
  h$1(h paramh, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20826);
    ab.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.httpAuthentication, desc=it sends http request for authentication. http url=%s", new Object[] { m.V(this.mwS.intent), Integer.valueOf(m.W(this.mwS.intent)), this.val$url });
    a.byw();
    a.a(this.val$url, new h.1.1(this));
    AppMethodBeat.o(20826);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.h.1
 * JD-Core Version:    0.6.2
 */