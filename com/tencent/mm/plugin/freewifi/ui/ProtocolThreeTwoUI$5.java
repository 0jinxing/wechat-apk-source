package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;

final class ProtocolThreeTwoUI$5
  implements View.OnClickListener
{
  ProtocolThreeTwoUI$5(ProtocolThreeTwoUI paramProtocolThreeTwoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21177);
    l.w(d.byN(), this.mAD.getIntent().getStringExtra("free_wifi_ap_key"), this.mAD.getIntent().getIntExtra("free_wifi_protocol_type", 0));
    int i = this.mAD.bzz();
    ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.connectWifiBtn.setOnClickListener, desc=User click the connect button and starts the connect wifi process. state=%s", new Object[] { m.V(this.mAD.getIntent()), Integer.valueOf(m.W(this.mAD.getIntent())), d.vR(i) });
    if (i == 2)
    {
      this.mAD.finish();
      AppMethodBeat.o(21177);
    }
    while (true)
    {
      return;
      d.a(this.mAD.ssid, 1, this.mAD.getIntent());
      this.mAD.connect();
      AppMethodBeat.o(21177);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeTwoUI.5
 * JD-Core Version:    0.6.2
 */