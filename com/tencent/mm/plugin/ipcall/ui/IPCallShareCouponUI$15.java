package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.ipcall.a.e.i;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class IPCallShareCouponUI$15
  implements View.OnClickListener
{
  IPCallShareCouponUI$15(IPCallShareCouponUI paramIPCallShareCouponUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22333);
    aw.ZK();
    if (((Boolean)c.Ry().get(ac.a.xLy, Boolean.FALSE)).booleanValue() == true)
      i.Z(3, -1, -1);
    aw.ZK();
    c.Ry().set(ac.a.xLy, Boolean.FALSE);
    IPCallShareCouponUI.a(this.nFI).setVisibility(8);
    paramView = new Intent();
    paramView.setClass(this.nFI.mController.ylL, IPCallRechargeUI.class);
    this.nFI.startActivity(paramView);
    AppMethodBeat.o(22333);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.15
 * JD-Core Version:    0.6.2
 */