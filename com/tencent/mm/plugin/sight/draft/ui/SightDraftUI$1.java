package com.tencent.mm.plugin.sight.draft.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SightDraftUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SightDraftUI$1(SightDraftUI paramSightDraftUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(25024);
    this.qAb.finish();
    AppMethodBeat.o(25024);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.SightDraftUI.1
 * JD-Core Version:    0.6.2
 */