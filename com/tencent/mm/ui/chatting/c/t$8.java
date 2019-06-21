package com.tencent.mm.ui.chatting.c;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;

final class t$8
  implements MenuItem.OnMenuItemClickListener
{
  t$8(t paramt)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(31486);
    ui localui = new ui();
    localui.cQx.cAd = 5;
    localui.cQx.talker = this.yQA.cgL.sRl.field_username;
    localui.cQx.context = this.yQA.cgL.yTx.getContext();
    if (paramMenuItem.getItemId() == 1)
      localui.cQx.cQs = 4;
    while (true)
    {
      com.tencent.mm.sdk.b.a.xxA.m(localui);
      AppMethodBeat.o(31486);
      return true;
      if (paramMenuItem.getItemId() == 2)
        localui.cQx.cQs = 2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.t.8
 * JD-Core Version:    0.6.2
 */