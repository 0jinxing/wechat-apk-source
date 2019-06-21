package com.tencent.mm.plugin.aa.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.aa.a.a;
import com.tencent.mm.protocal.protobuf.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class PaylistAAUI$13$2
  implements n.d
{
  PaylistAAUI$13$2(PaylistAAUI.13 param13)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    paramInt = 3;
    AppMethodBeat.i(40880);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(40880);
      return;
      if (!bo.isNullOrNil(PaylistAAUI.a(this.gpH.gpC)))
      {
        paramMenuItem = new Intent(this.gpH.gpC.mController.ylL, LaunchAAUI.class);
        paramMenuItem.putExtra("enter_scene", 3);
        paramMenuItem.putExtra("chatroom_name", PaylistAAUI.a(this.gpH.gpC));
        this.gpH.gpC.startActivity(paramMenuItem);
      }
      if (this.gpH.gpG.vzW == a.gld)
        paramInt = 1;
      while (true)
      {
        ab.d("MicroMsg.PaylistAAUI", "test");
        com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(7), Integer.valueOf(paramInt) });
        AppMethodBeat.o(40880);
        break;
        if (this.gpH.gpG.vzW == a.glc)
          paramInt = 2;
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(4), Integer.valueOf(5) });
      com.tencent.mm.ui.base.h.a(this.gpH.gpC, 2131296335, -1, 2131296339, 2131296868, new PaylistAAUI.13.2.1(this), null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.PaylistAAUI.13.2
 * JD-Core Version:    0.6.2
 */