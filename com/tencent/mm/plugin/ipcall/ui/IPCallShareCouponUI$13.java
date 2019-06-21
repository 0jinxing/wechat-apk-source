package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
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

final class IPCallShareCouponUI$13
  implements View.OnClickListener
{
  IPCallShareCouponUI$13(IPCallShareCouponUI paramIPCallShareCouponUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22331);
    aw.ZK();
    if (((Boolean)c.Ry().get(ac.a.xLG, Boolean.FALSE)).booleanValue())
    {
      aw.ZK();
      i.Z(4, -1, ((Integer)c.Ry().get(ac.a.xLH, Integer.valueOf(-1))).intValue());
    }
    aw.ZK();
    c.Ry().set(ac.a.xLH, Integer.valueOf(-1));
    aw.ZK();
    c.Ry().set(ac.a.xLG, Boolean.FALSE);
    IPCallShareCouponUI.g(this.nFI).setVisibility(8);
    paramView = new Intent();
    paramView.setClass(this.nFI.mController.ylL, IPCallMsgUI.class);
    this.nFI.mController.ylL.startActivity(paramView);
    AppMethodBeat.o(22331);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.13
 * JD-Core Version:    0.6.2
 */