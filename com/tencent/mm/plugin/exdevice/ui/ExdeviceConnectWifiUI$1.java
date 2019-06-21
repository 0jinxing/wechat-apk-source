package com.tencent.mm.plugin.exdevice.ui;

import android.text.Editable;
import android.text.Selection;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class ExdeviceConnectWifiUI$1
  implements Runnable
{
  ExdeviceConnectWifiUI$1(ExdeviceConnectWifiUI paramExdeviceConnectWifiUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19871);
    if (!bo.isNullOrNil(ExdeviceConnectWifiUI.a(this.lAf)))
    {
      ab.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "User has input password.");
      AppMethodBeat.o(19871);
    }
    while (true)
    {
      return;
      ExdeviceConnectWifiUI.c(this.lAf).setText(ExdeviceConnectWifiUI.b(this.lAf).luH);
      Editable localEditable = ExdeviceConnectWifiUI.c(this.lAf).getText();
      if (localEditable != null)
        Selection.setSelection(localEditable, localEditable.length());
      AppMethodBeat.o(19871);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.1
 * JD-Core Version:    0.6.2
 */