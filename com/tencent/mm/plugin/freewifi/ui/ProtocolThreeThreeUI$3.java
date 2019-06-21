package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;

final class ProtocolThreeThreeUI$3
  implements View.OnClickListener
{
  ProtocolThreeThreeUI$3(ProtocolThreeThreeUI paramProtocolThreeThreeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21150);
    l.w(d.byN(), this.mAA.getIntent().getStringExtra("free_wifi_ap_key"), this.mAA.getIntent().getIntExtra("free_wifi_protocol_type", 0));
    int i = this.mAA.bzz();
    ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.connectWifiBtn.setOnClickListener, desc=User click the connect button and starts the connect wifi process. state=%s", new Object[] { m.V(this.mAA.getIntent()), Integer.valueOf(m.W(this.mAA.getIntent())), d.vR(i) });
    if (i == 2)
    {
      this.mAA.finish();
      AppMethodBeat.o(21150);
    }
    while (true)
    {
      return;
      d.a(this.mAA.ssid, 1, this.mAA.getIntent());
      this.mAA.connect();
      AppMethodBeat.o(21150);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeThreeUI.3
 * JD-Core Version:    0.6.2
 */