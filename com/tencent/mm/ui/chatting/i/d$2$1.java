package com.tencent.mm.ui.chatting.i;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.chatting.a.c.b;

final class d$2$1
  implements View.OnCreateContextMenuListener
{
  d$2$1(d.2 param2, c.b paramb)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(32539);
    paramContextMenu.add(0, 0, 0, paramView.getContext().getString(2131302498));
    if ((!ad.aox(this.yYV.username)) && (!t.mP(this.yYV.username)))
      paramContextMenu.add(0, 1, 0, paramView.getContext().getString(2131298092));
    paramContextMenu.add(0, 2, 0, paramView.getContext().getString(2131298154));
    AppMethodBeat.o(32539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.d.2.1
 * JD-Core Version:    0.6.2
 */