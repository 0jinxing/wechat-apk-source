package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.ipcall.a.e.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class e$1
  implements View.OnClickListener
{
  e$1(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22033);
    aw.ZK();
    boolean bool = ((Boolean)c.Ry().get(ac.a.xLr, Boolean.FALSE)).booleanValue();
    if (bool)
    {
      aw.ZK();
      i = ((Integer)c.Ry().get(ac.a.xLs, Integer.valueOf(-1))).intValue();
      i.Z(2, i, -1);
      aw.ZK();
      c.Ry().set(ac.a.xLs, Integer.valueOf(-1));
      ab.i("MicroMsg.IPCallAddressController", "set red dot type from %d to -1", new Object[] { Integer.valueOf(i) });
    }
    if (bool)
    {
      paramView = "true";
      aw.ZK();
      ab.i("MicroMsg.IPCallAddressController", "set show red dot from %s to false, set account string from %s to null", new Object[] { paramView, (String)c.Ry().get(ac.a.xLt, "") });
      aw.ZK();
      c.Ry().set(ac.a.xLr, Boolean.FALSE);
      aw.ZK();
      c.Ry().set(ac.a.xLt, "");
      aw.ZK();
      if (((Integer)c.Ry().get(ac.a.xLv, Integer.valueOf(0))).intValue() != 1)
        break label361;
    }
    label361: for (int i = 0; ; i = 1)
    {
      if (i != 0)
      {
        aw.ZK();
        ab.i("MicroMsg.IPCallAddressController", "set account activity string from %s to null", new Object[] { (String)c.Ry().get(ac.a.xLu, "") });
        aw.ZK();
        c.Ry().set(ac.a.xLu, "");
      }
      h.pYm.e(12061, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
      this.nBc.bIh();
      paramView = new Intent();
      paramView.setClass(this.nBc.nAV, IPCallShareCouponUI.class);
      this.nBc.nAV.startActivity(paramView);
      AppMethodBeat.o(22033);
      return;
      paramView = "false";
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.e.1
 * JD-Core Version:    0.6.2
 */