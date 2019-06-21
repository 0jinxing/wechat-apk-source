package com.tencent.mm.plugin.exdevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class ExdeviceRankInfoUI$7
  implements DialogInterface.OnCancelListener
{
  ExdeviceRankInfoUI$7(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(20141);
    if (ExdeviceRankInfoUI.e(this.lDC) != null)
    {
      ExdeviceRankInfoUI.e(this.lDC).dismiss();
      ExdeviceRankInfoUI.f(this.lDC);
    }
    this.lDC.finish();
    AppMethodBeat.o(20141);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.7
 * JD-Core Version:    0.6.2
 */