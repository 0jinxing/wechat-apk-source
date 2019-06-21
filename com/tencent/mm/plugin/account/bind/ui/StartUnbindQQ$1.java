package com.tencent.mm.plugin.account.bind.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class StartUnbindQQ$1
  implements MenuItem.OnMenuItemClickListener
{
  StartUnbindQQ$1(StartUnbindQQ paramStartUnbindQQ)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13761);
    this.guq.finish();
    AppMethodBeat.o(13761);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ.1
 * JD-Core Version:    0.6.2
 */