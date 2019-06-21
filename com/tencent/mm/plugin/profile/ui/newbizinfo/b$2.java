package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.profile.ui.newbizinfo.c.c;
import com.tencent.mm.ui.widget.a.d;

final class b$2
  implements MenuItem.OnMenuItemClickListener
{
  b$2(b paramb)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(23805);
    paramMenuItem = new d(this.ppO.ppM, 1, false);
    paramMenuItem.rBl = new b.2.1(this);
    paramMenuItem.rBm = new b.2.2(this);
    paramMenuItem.cpD();
    c.cP(this.ppO.ehM.field_username, 600);
    AppMethodBeat.o(23805);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.b.2
 * JD-Core Version:    0.6.2
 */