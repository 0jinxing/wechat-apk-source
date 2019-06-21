package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GroupCardSelectUI$2
  implements MenuItem.OnMenuItemClickListener
{
  GroupCardSelectUI$2(GroupCardSelectUI paramGroupCardSelectUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33729);
    this.zmK.finish();
    AppMethodBeat.o(33729);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.GroupCardSelectUI.2
 * JD-Core Version:    0.6.2
 */