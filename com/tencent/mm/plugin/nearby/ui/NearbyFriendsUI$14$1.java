package com.tencent.mm.plugin.nearby.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.nearby.a.c;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class NearbyFriendsUI$14$1
  implements n.d
{
  NearbyFriendsUI$14$1(NearbyFriendsUI.14 param14)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(55456);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(55456);
      while (true)
      {
        return;
        NearbyFriendsUI.a(this.oQv.oQs, 4);
        NearbyFriendsUI.u(this.oQv.oQs);
        g.RP().Ry().set(16386, Integer.valueOf(NearbyFriendsUI.h(this.oQv.oQs)));
        NearbyFriendsUI.v(this.oQv.oQs);
        AppMethodBeat.o(55456);
        continue;
        NearbyFriendsUI.a(this.oQv.oQs, 3);
        NearbyFriendsUI.u(this.oQv.oQs);
        g.RP().Ry().set(16386, Integer.valueOf(NearbyFriendsUI.h(this.oQv.oQs)));
        NearbyFriendsUI.v(this.oQv.oQs);
        AppMethodBeat.o(55456);
        continue;
        NearbyFriendsUI.a(this.oQv.oQs, 1);
        NearbyFriendsUI.u(this.oQv.oQs);
        g.RP().Ry().set(16386, Integer.valueOf(NearbyFriendsUI.h(this.oQv.oQs)));
        NearbyFriendsUI.v(this.oQv.oQs);
        AppMethodBeat.o(55456);
        continue;
        paramMenuItem = new Intent(this.oQv.oQs, NearbySayHiListUI.class);
        paramMenuItem.putExtra("k_say_hi_type", 2);
        this.oQv.oQs.startActivityForResult(paramMenuItem, 2009);
        AppMethodBeat.o(55456);
      }
      NearbyFriendsUI.b(this.oQv.oQs, new c(2, 0.0F, 0.0F, 0, 0, "", ""));
      g.Rg().a(NearbyFriendsUI.w(this.oQv.oQs), 0);
      NearbyFriendsUI localNearbyFriendsUI = this.oQv.oQs;
      paramMenuItem = this.oQv.oQs.mController.ylL;
      this.oQv.oQs.getString(2131297061);
      NearbyFriendsUI.a(localNearbyFriendsUI, h.b(paramMenuItem, this.oQv.oQs.getString(2131301618), true, new NearbyFriendsUI.14.1.1(this)));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.14.1
 * JD-Core Version:    0.6.2
 */