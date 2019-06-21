package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class IPCallShareCouponUI$2
  implements View.OnClickListener
{
  IPCallShareCouponUI$2(IPCallShareCouponUI paramIPCallShareCouponUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22318);
    paramView = new Intent();
    paramView.setClass(this.nFI.mController.ylL, IPCallPackageUI.class);
    this.nFI.startActivity(paramView);
    AppMethodBeat.o(22318);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.2
 * JD-Core Version:    0.6.2
 */