package com.tencent.mm.plugin.aa.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.Map;

final class LaunchAAByPersonAmountSelectUI$3
  implements MenuItem.OnMenuItemClickListener
{
  LaunchAAByPersonAmountSelectUI$3(LaunchAAByPersonAmountSelectUI paramLaunchAAByPersonAmountSelectUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(40790);
    if ((LaunchAAByPersonAmountSelectUI.e(this.gou) > 0) && (LaunchAAByPersonAmountSelectUI.c(this.gou) != null) && (LaunchAAByPersonAmountSelectUI.c(this.gou).size() > LaunchAAByPersonAmountSelectUI.e(this.gou)))
    {
      com.tencent.mm.ui.base.h.b(this.gou.mController.ylL, this.gou.getString(2131300919, new Object[] { Integer.valueOf(LaunchAAByPersonAmountSelectUI.e(this.gou)) }), "", true);
      com.tencent.mm.plugin.report.service.h.pYm.e(13722, new Object[] { Integer.valueOf(8) });
      AppMethodBeat.o(40790);
    }
    while (true)
    {
      return true;
      LaunchAAByPersonAmountSelectUI.d(this.gou);
      com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(3), Integer.valueOf(4) });
      AppMethodBeat.o(40790);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI.3
 * JD-Core Version:    0.6.2
 */