package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;

final class IPCallMyGiftCardUI$3
  implements DialogInterface.OnCancelListener
{
  IPCallMyGiftCardUI$3(IPCallMyGiftCardUI paramIPCallMyGiftCardUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(22211);
    try
    {
      if (IPCallMyGiftCardUI.a(this.nDz) != null)
        aw.Rg().c(IPCallMyGiftCardUI.a(this.nDz));
      this.nDz.finish();
      AppMethodBeat.o(22211);
      return;
    }
    catch (Exception paramDialogInterface)
    {
      while (true)
      {
        ab.e("MicroMsg.IPCallMyGiftCardUI", "cancel getProductListScene error: %s", new Object[] { paramDialogInterface.getMessage() });
        AppMethodBeat.o(22211);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI.3
 * JD-Core Version:    0.6.2
 */