package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelfQRCodeUI$10
  implements DialogInterface.OnClickListener
{
  SelfQRCodeUI$10(SelfQRCodeUI paramSelfQRCodeUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127022);
    SelfQRCodeUI.a(this.qly, 2);
    AppMethodBeat.o(127022);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.10
 * JD-Core Version:    0.6.2
 */