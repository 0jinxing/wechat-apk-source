package com.tencent.mm.plugin.collect.ui;

import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bbc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

final class CollectMainUI$13$2
  implements n.d
{
  CollectMainUI$13$2(CollectMainUI.13 param13)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(41266);
    switch (paramMenuItem.getItemId())
    {
    default:
      paramInt = paramMenuItem.getItemId() - 1 - 1;
      if (paramInt < 0)
      {
        ab.w("MicroMsg.CollectMainUI", "illegal pos: %s", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(41266);
      }
      break;
    case 1:
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.collect.a.a.bgv();
      if (com.tencent.mm.plugin.collect.a.a.bgx())
      {
        CollectMainUI.x(this.kHr.kHl);
        Toast.makeText(this.kHr.kHl.mController.ylL, 2131298366, 1).show();
        h.pYm.e(13944, new Object[] { Integer.valueOf(8) });
        AppMethodBeat.o(41266);
      }
      else
      {
        CollectMainUI.y(this.kHr.kHl);
        Toast.makeText(this.kHr.kHl.mController.ylL, 2131298376, 1).show();
        com.tencent.mm.plugin.collect.model.voice.a.bgJ().bgK();
        h.pYm.e(13944, new Object[] { Integer.valueOf(7) });
        AppMethodBeat.o(41266);
        continue;
        paramMenuItem = (bbc)this.kHr.gCz.get(paramInt);
        if (paramMenuItem.type == 1)
        {
          ab.w("MicroMsg.CollectMainUI", "wrong native type: %s", new Object[] { paramMenuItem.url });
          h.pYm.e(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(1), paramMenuItem.cEh, "", "", "", Integer.valueOf(2) });
          AppMethodBeat.o(41266);
        }
        else if (paramMenuItem.type == 2)
        {
          if (!bo.isNullOrNil(paramMenuItem.url))
          {
            e.n(this.kHr.kHl.mController.ylL, paramMenuItem.url, false);
            h.pYm.e(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(2), paramMenuItem.cEh, "", "", paramMenuItem.url, Integer.valueOf(2) });
            AppMethodBeat.o(41266);
          }
        }
        else
        {
          if (paramMenuItem.type == 3)
          {
            se localse = new se();
            localse.cOf.userName = paramMenuItem.wFS;
            localse.cOf.cOh = bo.bc(paramMenuItem.wFT, "");
            localse.cOf.scene = 1072;
            localse.cOf.cOi = 0;
            com.tencent.mm.sdk.b.a.xxA.m(localse);
            h.pYm.e(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(3), paramMenuItem.cEh, paramMenuItem.wFS, paramMenuItem.wFT, "", Integer.valueOf(2) });
          }
          AppMethodBeat.o(41266);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.13.2
 * JD-Core Version:    0.6.2
 */