package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;

final class ProtocolThreeOneUI$3
  implements View.OnClickListener
{
  ProtocolThreeOneUI$3(ProtocolThreeOneUI paramProtocolThreeOneUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21123);
    l.w(d.byN(), this.mAx.getIntent().getStringExtra("free_wifi_ap_key"), this.mAx.getIntent().getIntExtra("free_wifi_protocol_type", 0));
    int i = this.mAx.bzz();
    ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.connectWifiBtn.setOnClickListener, desc=User click the connect button and starts the connect wifi process. state=%s", new Object[] { m.V(this.mAx.getIntent()), Integer.valueOf(m.W(this.mAx.getIntent())), d.vR(i) });
    if (i == 2)
    {
      this.mAx.finish();
      AppMethodBeat.o(21123);
    }
    while (true)
    {
      return;
      d.a(this.mAx.ssid, 1, this.mAx.getIntent());
      this.mAx.connect();
      AppMethodBeat.o(21123);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeOneUI.3
 * JD-Core Version:    0.6.2
 */