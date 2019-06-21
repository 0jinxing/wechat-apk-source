package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.f;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;

final class ProtocolThreeThreeUI$8
  implements Runnable
{
  ProtocolThreeThreeUI$8(ProtocolThreeThreeUI paramProtocolThreeThreeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21158);
    String str1 = d.byK();
    String str2 = d.byO();
    int i = d.byL();
    ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.getBackPageInfoAfterConnectSuccess, desc=it starts net request [apauth.getBackPageFor33]  for backpage info. fullUrl=%s, nowApMac=%s, nowNetworkSSID=%s, rssi=%d", new Object[] { m.V(this.mAA.getIntent()), Integer.valueOf(m.W(this.mAA.getIntent())), "", str1, str2, Integer.valueOf(i) });
    new f(this.mAA.ssid, this.mAA.bssid, this.mAA.appId, this.mAA.mwU, this.mAA.mwV, this.mAA.mwW, this.mAA.cvO, this.mAA.sign).c(new ProtocolThreeThreeUI.8.1(this));
    AppMethodBeat.o(21158);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeThreeUI.8
 * JD-Core Version:    0.6.2
 */