package com.tencent.mm.plugin.freewifi.ui;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiSuccUI$3
  implements CompoundButton.OnCheckedChangeListener
{
  FreeWifiSuccUI$3(FreeWifiSuccUI paramFreeWifiSuccUI)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AppMethodBeat.i(21087);
    if (paramBoolean)
    {
      FreeWifiSuccUI.a(this.mAn, true);
      AppMethodBeat.o(21087);
    }
    while (true)
    {
      return;
      FreeWifiSuccUI.a(this.mAn, false);
      AppMethodBeat.o(21087);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiSuccUI.3
 * JD-Core Version:    0.6.2
 */