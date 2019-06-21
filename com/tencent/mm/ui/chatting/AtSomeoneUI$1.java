package com.tencent.mm.ui.chatting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AtSomeoneUI$1
  implements MenuItem.OnMenuItemClickListener
{
  AtSomeoneUI$1(AtSomeoneUI paramAtSomeoneUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(30387);
    this.yGM.setResult(0);
    this.yGM.finish();
    AppMethodBeat.o(30387);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AtSomeoneUI.1
 * JD-Core Version:    0.6.2
 */