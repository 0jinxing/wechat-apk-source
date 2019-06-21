package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingSnsBackgroundUI$5
  implements MenuItem.OnMenuItemClickListener
{
  SettingSnsBackgroundUI$5(SettingSnsBackgroundUI paramSettingSnsBackgroundUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(38557);
    this.rmS.finish();
    AppMethodBeat.o(38557);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI.5
 * JD-Core Version:    0.6.2
 */