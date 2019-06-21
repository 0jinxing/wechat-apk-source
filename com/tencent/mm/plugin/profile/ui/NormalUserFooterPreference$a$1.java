package com.tencent.mm.plugin.profile.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.d;

final class NormalUserFooterPreference$a$1
  implements MenuItem.OnMenuItemClickListener
{
  NormalUserFooterPreference$a$1(NormalUserFooterPreference.a parama)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(23676);
    paramMenuItem = new d(NormalUserFooterPreference.b(this.poS.poR), 1, false);
    paramMenuItem.rBm = new NormalUserFooterPreference.a.1.1(this);
    paramMenuItem.rBl = new NormalUserFooterPreference.a.1.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(23676);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.a.1
 * JD-Core Version:    0.6.2
 */