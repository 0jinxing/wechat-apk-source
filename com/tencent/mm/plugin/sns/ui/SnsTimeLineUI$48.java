package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.ui.base.n.d;

final class SnsTimeLineUI$48
  implements n.d
{
  SnsTimeLineUI$48(SnsTimeLineUI paramSnsTimeLineUI, b paramb)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(39522);
    switch (paramMenuItem.getItemId())
    {
    case 2:
    default:
    case 1:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(39522);
      while (true)
      {
        return;
        h.pYm.e(13822, new Object[] { Integer.valueOf(2), Integer.valueOf(2) });
        g.qTp.b(this.rzI);
        this.rzI.ajK();
        SnsTimeLineUI.j(this.rzs).rCd = this.rzI;
        SnsTimeLineUI.j(this.rzs).Em(1);
        SnsTimeLineUI.L(this.rzs).Ei(2);
        SnsTimeLineUI.b(SnsTimeLineUI.L(this.rzs));
        AppMethodBeat.o(39522);
        continue;
        SnsTimeLineUI.L(this.rzs).Ei(1);
        SnsTimeLineUI.b(SnsTimeLineUI.L(this.rzs));
        SnsTimeLineUI.M(this.rzs);
        AppMethodBeat.o(39522);
      }
      SnsTimeLineUI.L(this.rzs).Ei(3);
      SnsTimeLineUI.b(SnsTimeLineUI.L(this.rzs));
      SnsTimeLineUI.N(this.rzs);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.48
 * JD-Core Version:    0.6.2
 */