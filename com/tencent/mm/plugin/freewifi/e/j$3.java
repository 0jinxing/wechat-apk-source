package com.tencent.mm.plugin.freewifi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;

final class j$3
  implements Runnable
{
  j$3(j paramj, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20857);
    ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.httpAuthentication, desc=it sends http request for authentication. http url=%s", new Object[] { m.V(this.mxd.intent), Integer.valueOf(m.W(this.mxd.intent)), this.val$url });
    a.byw();
    a.a(this.val$url, new j.3.1(this));
    AppMethodBeat.o(20857);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.j.3
 * JD-Core Version:    0.6.2
 */