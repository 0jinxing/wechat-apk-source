package com.tencent.mm.plugin.ipcall.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.protocal.protobuf.aqq;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class IPCallShareCouponUI$6
  implements MenuItem.OnMenuItemClickListener
{
  IPCallShareCouponUI$6(IPCallShareCouponUI paramIPCallShareCouponUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22324);
    paramMenuItem = c.bIU();
    int i;
    if ((paramMenuItem != null) && (!bo.isNullOrNil(paramMenuItem.wuD)))
      if (g.Nu().getInt("WCOWebPayListSwitch", 0) > 0)
      {
        i = 1;
        if (i == 0)
          break label137;
        i = 1;
        label44: if (i == 0)
          break label142;
        paramMenuItem = new String[3];
        paramMenuItem[0] = this.nFI.getString(2131300789);
        paramMenuItem[1] = this.nFI.getString(2131300732);
        paramMenuItem[2] = this.nFI.getString(2131300711);
        IPCallShareCouponUI.a(this.nFI, true);
      }
    while (true)
    {
      h.a(this.nFI.mController.ylL, null, paramMenuItem, null, false, new IPCallShareCouponUI.6.1(this));
      AppMethodBeat.o(22324);
      return true;
      i = 0;
      break;
      label137: i = 0;
      break label44;
      label142: paramMenuItem = new String[2];
      paramMenuItem[0] = this.nFI.getString(2131300732);
      paramMenuItem[1] = this.nFI.getString(2131300711);
      IPCallShareCouponUI.a(this.nFI, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.6
 * JD-Core Version:    0.6.2
 */