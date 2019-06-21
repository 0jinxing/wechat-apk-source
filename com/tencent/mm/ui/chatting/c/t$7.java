package com.tencent.mm.ui.chatting.c;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

final class t$7
  implements MenuItem.OnMenuItemClickListener
{
  t$7(t paramt)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(31485);
    boolean bool = this.yQA.cgL.yTx.dBP();
    AppMethodBeat.o(31485);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.t.7
 * JD-Core Version:    0.6.2
 */