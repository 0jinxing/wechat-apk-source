package com.tencent.mm.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SingleChatInfoUI$6
  implements MenuItem.OnMenuItemClickListener
{
  SingleChatInfoUI$6(SingleChatInfoUI paramSingleChatInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(29873);
    this.yqm.finish();
    AppMethodBeat.o(29873);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.SingleChatInfoUI.6
 * JD-Core Version:    0.6.2
 */