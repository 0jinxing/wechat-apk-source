package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;

final class ProtocolThreeOneUI$6
  implements Runnable
{
  ProtocolThreeOneUI$6(ProtocolThreeOneUI paramProtocolThreeOneUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21128);
    ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.httpAuthentication, desc=it sends http request for authentication. http url=%s", new Object[] { m.V(this.mAx.getIntent()), Integer.valueOf(m.W(this.mAx.getIntent())), this.val$url });
    a.byw();
    a.a(this.val$url, new ProtocolThreeOneUI.6.1(this));
    AppMethodBeat.o(21128);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeOneUI.6
 * JD-Core Version:    0.6.2
 */