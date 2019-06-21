package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.i.a;
import com.tencent.mm.ui.q;

final class IPCallShareCouponCardUI$16
  implements DialogInterface.OnClickListener
{
  IPCallShareCouponCardUI$16(IPCallShareCouponCardUI paramIPCallShareCouponCardUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22296);
    paramDialogInterface = this.nFb;
    AppCompatActivity localAppCompatActivity = this.nFb.mController.ylL;
    this.nFb.mController.ylL.getString(2131297061);
    IPCallShareCouponCardUI.a(paramDialogInterface, h.b(localAppCompatActivity, this.nFb.mController.ylL.getString(2131304132), true, new IPCallShareCouponCardUI.16.1(this)));
    IPCallShareCouponCardUI.c(this.nFb).a(this.nFb, this.nFb.mController.ylL);
    AppMethodBeat.o(22296);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI.16
 * JD-Core Version:    0.6.2
 */