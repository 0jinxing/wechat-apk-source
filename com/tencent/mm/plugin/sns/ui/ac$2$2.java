package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;

final class ac$2$2
  implements n.d
{
  ac$2$2(ac.2 param2)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(38338);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(38338);
    case 0:
      while (true)
      {
        return;
        ac localac = this.rkT.rkS;
        localac.DR(1);
        h.pYm.e(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
        paramMenuItem = new Intent();
        n.a(localac.crP, 11, paramMenuItem, 2, 0);
        AppMethodBeat.o(38338);
      }
    case 1:
    }
    paramMenuItem = this.rkT.rkS.crP.getSharedPreferences(ah.doA(), 0).getString("gallery", "1");
    h.pYm.e(13822, new Object[] { Integer.valueOf(2), Integer.valueOf(2) });
    if (paramMenuItem.equalsIgnoreCase("0"))
      n.aj(this.rkT.rkS.crP);
    while (true)
    {
      this.rkT.rkS.DR(2);
      break;
      n.a(this.rkT.rkS.crP, 9, 9, 4, 3, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ac.2.2
 * JD-Core Version:    0.6.2
 */