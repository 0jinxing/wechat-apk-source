package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;

final class ProtocolThreeTwoUI$10
  implements Runnable
{
  ProtocolThreeTwoUI$10(ProtocolThreeTwoUI paramProtocolThreeTwoUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21192);
    ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.httpAuthentication, desc=it sends http request for authentication. http url=%s", new Object[] { m.V(this.mAD.getIntent()), Integer.valueOf(m.W(this.mAD.getIntent())), this.val$url });
    a.byw();
    a.a(this.val$url, new ProtocolThreeTwoUI.10.1(this));
    AppMethodBeat.o(21192);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeTwoUI.10
 * JD-Core Version:    0.6.2
 */