package com.tencent.mm.plugin.exdevice.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceConnectWifiUI$11
  implements TextWatcher
{
  ExdeviceConnectWifiUI$11(ExdeviceConnectWifiUI paramExdeviceConnectWifiUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(19887);
    if (paramEditable.length() > 31)
    {
      ExdeviceConnectWifiUI.i(this.lAf).setVisibility(0);
      ExdeviceConnectWifiUI.j(this.lAf).setEnabled(false);
      AppMethodBeat.o(19887);
    }
    while (true)
    {
      return;
      ExdeviceConnectWifiUI.i(this.lAf).setVisibility(8);
      ExdeviceConnectWifiUI.j(this.lAf).setEnabled(true);
      AppMethodBeat.o(19887);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.11
 * JD-Core Version:    0.6.2
 */