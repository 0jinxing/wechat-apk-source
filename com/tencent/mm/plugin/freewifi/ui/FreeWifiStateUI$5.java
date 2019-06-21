package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.model.d;

final class FreeWifiStateUI$5
  implements View.OnClickListener
{
  FreeWifiStateUI$5(FreeWifiStateUI paramFreeWifiStateUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21075);
    l.w(d.byN(), this.mAc.getIntent().getStringExtra("free_wifi_ap_key"), this.mAc.getIntent().getIntExtra("free_wifi_protocol_type", 0));
    if (this.mAc.bzz() == 2)
    {
      this.mAc.finish();
      AppMethodBeat.o(21075);
    }
    while (true)
    {
      return;
      d.a(this.mAc.ssid, 1, this.mAc.getIntent());
      this.mAc.mxY = false;
      this.mAc.bzF();
      AppMethodBeat.o(21075);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiStateUI.5
 * JD-Core Version:    0.6.2
 */