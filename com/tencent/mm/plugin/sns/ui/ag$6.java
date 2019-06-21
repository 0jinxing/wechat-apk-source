package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import java.util.ArrayList;

final class ag$6
  implements n.d
{
  ag$6(ag paramag)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(38482);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(38482);
    case 0:
    case 1:
    }
    while (true)
    {
      return;
      paramMenuItem = this.rlW;
      paramInt = 9 - paramMenuItem.rlP.rma.size();
      if (paramInt <= 0)
      {
        ab.e("MicroMsg.PicWidget", "has select the max image count");
        AppMethodBeat.o(38482);
      }
      else
      {
        Intent localIntent;
        if (paramInt < 9)
        {
          h.pYm.e(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
          localIntent = new Intent();
          n.a(paramMenuItem.crP, 11, localIntent, 2, 2);
        }
        while (true)
        {
          paramMenuItem.DR(1);
          AppMethodBeat.o(38482);
          break;
          h.pYm.e(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
          localIntent = new Intent();
          n.a(paramMenuItem.crP, 11, localIntent, 2, 0);
        }
        paramInt = 9 - this.rlW.rlP.rma.size();
        if (paramInt > 0)
          break;
        ab.e("MicroMsg.PicWidget", "has select the max image count");
        AppMethodBeat.o(38482);
      }
    }
    paramMenuItem = this.rlW.crP.getSharedPreferences(ah.doA(), 0).getString("gallery", "1");
    h.pYm.e(13822, new Object[] { Integer.valueOf(2), Integer.valueOf(2) });
    if (paramMenuItem.equalsIgnoreCase("0"))
      n.aj(this.rlW.crP);
    while (true)
    {
      this.rlW.DR(2);
      break;
      if (paramInt < 9)
        n.a(this.rlW.crP, 9, paramInt, 4, 1, null);
      else
        n.a(this.rlW.crP, 9, paramInt, 4, 3, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ag.6
 * JD-Core Version:    0.6.2
 */