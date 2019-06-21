package com.tencent.mm.plugin.account.bind.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.y;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.j;

final class BindQQUI$7
  implements MenuItem.OnMenuItemClickListener
{
  BindQQUI$7(BindQQUI paramBindQQUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13551);
    paramMenuItem = new j(this.gsw.mController.ylL);
    paramMenuItem.rBl = new n.c()
    {
      public final void a(l paramAnonymousl)
      {
        AppMethodBeat.i(13549);
        paramAnonymousl.setHeaderTitle(2131297553);
        paramAnonymousl.hi(0, 2131304141);
        AppMethodBeat.o(13549);
      }
    };
    paramMenuItem.rBm = new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        AppMethodBeat.i(13550);
        switch (paramAnonymousMenuItem.getItemId())
        {
        default:
        case 0:
        }
        while (true)
        {
          AppMethodBeat.o(13550);
          return;
          paramAnonymousMenuItem = BindQQUI.7.this.gsw;
          y localy = new y(y.gvV);
          g.Rg().a(localy, 0);
          paramAnonymousMenuItem.getString(2131297061);
          paramAnonymousMenuItem.tipDialog = h.b(paramAnonymousMenuItem, paramAnonymousMenuItem.getString(2131296965), true, new BindQQUI.2(paramAnonymousMenuItem));
        }
      }
    };
    paramMenuItem.cuu();
    AppMethodBeat.o(13551);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindQQUI.7
 * JD-Core Version:    0.6.2
 */