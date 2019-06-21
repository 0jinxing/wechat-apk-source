package com.tencent.mm.plugin.ipcall.ui;

import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class IPCallShareCouponUI$1$1
  implements Runnable
{
  IPCallShareCouponUI$1$1(IPCallShareCouponUI.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22315);
    aw.ZK();
    if (((Boolean)c.Ry().get(ac.a.xLy, Boolean.FALSE)).booleanValue())
      IPCallShareCouponUI.a(this.nFJ.nFI).setVisibility(0);
    while (true)
    {
      aw.ZK();
      String str = (String)c.Ry().get(ac.a.xLx, "");
      IPCallShareCouponUI.b(this.nFJ.nFI).setText(str);
      aw.ZK();
      str = (String)c.Ry().get(ac.a.xLz, "");
      IPCallShareCouponUI.c(this.nFJ.nFI).setText(str);
      AppMethodBeat.o(22315);
      return;
      IPCallShareCouponUI.a(this.nFJ.nFI).setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.1.1
 * JD-Core Version:    0.6.2
 */