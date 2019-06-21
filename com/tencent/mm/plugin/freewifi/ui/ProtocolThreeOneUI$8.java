package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;

final class ProtocolThreeOneUI$8
  implements Runnable
{
  ProtocolThreeOneUI$8(ProtocolThreeOneUI paramProtocolThreeOneUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21132);
    String str1 = d.byK();
    String str2 = d.byO();
    int i = d.byL();
    ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.getBackPageInfoAfterConnectSuccess, desc=it starts net request [apauth.getBackPage]  for backpage info. fullUrl=%s, nowApMac=%s, nowNetworkSSID=%s, rssi=%d", new Object[] { m.V(this.mAx.getIntent()), Integer.valueOf(m.W(this.mAx.getIntent())), this.mAx.jUg, str1, str2, Integer.valueOf(i) });
    new a(this.mAx.jUg, str1, str2, i, this.mAx.cdf, m.V(this.mAx.getIntent())).c(new ProtocolThreeOneUI.8.1(this));
    AppMethodBeat.o(21132);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeOneUI.8
 * JD-Core Version:    0.6.2
 */