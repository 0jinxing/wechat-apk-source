package com.tencent.mm.plugin.nearby.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.widget.a.d;

final class NearbyFriendsUI$14
  implements MenuItem.OnMenuItemClickListener
{
  NearbyFriendsUI$14(NearbyFriendsUI paramNearbyFriendsUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(55458);
    paramMenuItem = new d(this.oQs, 1, false);
    paramMenuItem.rBm = new NearbyFriendsUI.14.1(this);
    paramMenuItem.rBl = new n.c()
    {
      public final void a(l paramAnonymousl)
      {
        AppMethodBeat.i(55457);
        paramAnonymousl.hi(-1, 2131301631);
        paramAnonymousl.hi(-1, 2131301630);
        paramAnonymousl.hi(-1, 2131301629);
        paramAnonymousl.hi(-1, 2131302717);
        paramAnonymousl.hi(-1, 2131301614);
        AppMethodBeat.o(55457);
      }
    };
    paramMenuItem.cpD();
    AppMethodBeat.o(55458);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.14
 * JD-Core Version:    0.6.2
 */