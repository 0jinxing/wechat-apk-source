package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiNetCheckUI$8
  implements DialogInterface.OnClickListener
{
  FreeWifiNetCheckUI$8(FreeWifiNetCheckUI paramFreeWifiNetCheckUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(21042);
    this.mzM.finish();
    AppMethodBeat.o(21042);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiNetCheckUI.8
 * JD-Core Version:    0.6.2
 */