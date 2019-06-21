package com.tencent.mm.plugin.qqmail.ui;

import android.content.res.Resources;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class ReadMailUI$13
  implements MenuItem.OnMenuItemClickListener
{
  ReadMailUI$13(ReadMailUI paramReadMailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(68437);
    paramMenuItem = this.pzZ.getResources().getStringArray(2131755025);
    h.a(this.pzZ, null, paramMenuItem, this.pzZ.getResources().getString(2131302161), false, new ReadMailUI.13.1(this));
    AppMethodBeat.o(68437);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.13
 * JD-Core Version:    0.6.2
 */