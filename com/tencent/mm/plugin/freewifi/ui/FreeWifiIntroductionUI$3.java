package com.tencent.mm.plugin.freewifi.ui;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiIntroductionUI$3
  implements CompoundButton.OnCheckedChangeListener
{
  FreeWifiIntroductionUI$3(FreeWifiIntroductionUI paramFreeWifiIntroductionUI)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AppMethodBeat.i(21000);
    if (paramBoolean)
    {
      FreeWifiIntroductionUI.a(this.mzw).setEnabled(true);
      AppMethodBeat.o(21000);
    }
    while (true)
    {
      return;
      FreeWifiIntroductionUI.a(this.mzw).setEnabled(false);
      AppMethodBeat.o(21000);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiIntroductionUI.3
 * JD-Core Version:    0.6.2
 */