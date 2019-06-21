package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.profile.ui.ContactInfoUI;

final class b$1
  implements MenuItem.OnMenuItemClickListener
{
  b$1(b paramb)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(23802);
    this.ppO.ppM.onBackPressed();
    AppMethodBeat.o(23802);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.b.1
 * JD-Core Version:    0.6.2
 */