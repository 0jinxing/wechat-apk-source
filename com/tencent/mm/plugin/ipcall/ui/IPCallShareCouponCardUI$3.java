package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class IPCallShareCouponCardUI$3
  implements DialogInterface.OnClickListener
{
  IPCallShareCouponCardUI$3(IPCallShareCouponCardUI paramIPCallShareCouponCardUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22284);
    d.b(this.nFb.mController.ylL, "account", ".ui.FacebookAuthUI", new Intent());
    AppMethodBeat.o(22284);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI.3
 * JD-Core Version:    0.6.2
 */