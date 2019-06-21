package com.tencent.mm.plugin.freewifi.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.model.d;

final class FreeWifiActivateStateUI$5
  implements View.OnClickListener
{
  FreeWifiActivateStateUI$5(FreeWifiActivateStateUI paramFreeWifiActivateStateUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20903);
    if (this.myd.bzz() == 2)
    {
      this.myd.finish();
      AppMethodBeat.o(20903);
    }
    while (true)
    {
      return;
      d.a(this.myd.ssid, 1, this.myd.getIntent());
      this.myd.mxY = false;
      this.myd.bzF();
      AppMethodBeat.o(20903);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiActivateStateUI.5
 * JD-Core Version:    0.6.2
 */