package com.tencent.mm.plugin.exdevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class ExdeviceProfileUI$4
  implements DialogInterface.OnCancelListener
{
  ExdeviceProfileUI$4(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(20026);
    if (ExdeviceProfileUI.d(this.lCu) != null)
    {
      ExdeviceProfileUI.d(this.lCu).dismiss();
      ExdeviceProfileUI.y(this.lCu);
    }
    this.lCu.finish();
    AppMethodBeat.o(20026);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.4
 * JD-Core Version:    0.6.2
 */