package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;

final class ProtocolThreeTwoUI$2
  implements Runnable
{
  ProtocolThreeTwoUI$2(ProtocolThreeTwoUI paramProtocolThreeTwoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21174);
    String str1 = d.byK();
    String str2 = d.byO();
    int i = d.byL();
    ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.getBackPageInfoAfterConnectSuccess, desc=it starts net request [apauth.getBackPage]  for backpage info. fullUrl=%s, nowApMac=%s, nowNetworkSSID=%s, rssi=%d", new Object[] { m.V(this.mAD.getIntent()), Integer.valueOf(m.W(this.mAD.getIntent())), this.mAD.jUg, str1, str2, Integer.valueOf(i) });
    new a(this.mAD.jUg, str1, str2, i, this.mAD.cdf, m.V(this.mAD.getIntent())).c(new ProtocolThreeTwoUI.2.1(this));
    AppMethodBeat.o(21174);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeTwoUI.2
 * JD-Core Version:    0.6.2
 */