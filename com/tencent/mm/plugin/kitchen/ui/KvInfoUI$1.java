package com.tencent.mm.plugin.kitchen.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class KvInfoUI$1
  implements MenuItem.OnMenuItemClickListener
{
  KvInfoUI$1(KvInfoUI paramKvInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(114440);
    this.nHk.finish();
    AppMethodBeat.o(114440);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.kitchen.ui.KvInfoUI.1
 * JD-Core Version:    0.6.2
 */