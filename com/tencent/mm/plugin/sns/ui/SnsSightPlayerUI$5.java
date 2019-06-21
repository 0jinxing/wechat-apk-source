package com.tencent.mm.plugin.sns.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsSightPlayerUI$5
  implements View.OnCreateContextMenuListener
{
  SnsSightPlayerUI$5(SnsSightPlayerUI paramSnsSightPlayerUI)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(39253);
    if (bo.ank(g.Nu().getValue("SIGHTCannotTransmitForFav")) == 0)
    {
      boolean bool1 = com.tencent.mm.vfs.e.ct(SnsSightPlayerUI.e(this.rwT));
      boolean bool2 = com.tencent.mm.vfs.e.ct(SnsSightPlayerUI.u(this.rwT));
      ab.i("MicroMsg.SnsSightPlayerUI", "config can forward sight, thumb existed %B, video existed %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((bool1) && (bool2))
        paramContextMenu.add(0, 3, 0, this.rwT.getString(2131303588));
    }
    for (int i = 1; ; i = 0)
    {
      if (d.afj("favorite"))
        paramContextMenu.add(0, 2, 0, this.rwT.getString(2131301955));
      if (i != 0)
      {
        paramView = new dq();
        paramView.cxc.cwT = SnsSightPlayerUI.f(this.rwT);
        a.xxA.m(paramView);
        if (paramView.cxd.cwB)
          paramContextMenu.add(0, 4, 0, this.rwT.getString(2131296995));
      }
      if (!SnsSightPlayerUI.j(this.rwT))
        paramContextMenu.add(0, 1, 0, this.rwT.mController.ylL.getString(2131303816));
      AppMethodBeat.o(39253);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.5
 * JD-Core Version:    0.6.2
 */