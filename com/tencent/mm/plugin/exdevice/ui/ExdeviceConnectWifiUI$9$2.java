package com.tencent.mm.plugin.exdevice.ui;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;

final class ExdeviceConnectWifiUI$9$2
  implements Runnable
{
  ExdeviceConnectWifiUI$9$2(ExdeviceConnectWifiUI.9 param9)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19884);
    ExdeviceConnectWifiUI.g(this.lAm.lAf).dismiss();
    h.a(this.lAm.lAf.mController.ylL, this.lAm.lAf.mController.ylL.getString(2131299245), "", this.lAm.lAf.mController.ylL.getString(2131299293), "", false, new ExdeviceConnectWifiUI.9.2.1(this), null).show();
    AppMethodBeat.o(19884);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.9.2
 * JD-Core Version:    0.6.2
 */