package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class IPCallShareCouponCardUI$9
  implements DialogInterface.OnCancelListener
{
  IPCallShareCouponCardUI$9(IPCallShareCouponCardUI paramIPCallShareCouponCardUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(22291);
    try
    {
      this.nFb.finish();
      AppMethodBeat.o(22291);
      return;
    }
    catch (Exception paramDialogInterface)
    {
      while (true)
      {
        ab.e("MicroMsg.IPCallShareCouponCardUI", "loadFromSystemAddressBook error: %s", new Object[] { paramDialogInterface.getMessage() });
        AppMethodBeat.o(22291);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI.9
 * JD-Core Version:    0.6.2
 */