package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$1$1
  implements View.OnCreateContextMenuListener
{
  d$1$1(d.1 param1)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(24367);
    paramContextMenu.add(this.pLi.pLh.context.getString(2131296875));
    AppMethodBeat.o(24367);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.d.1.1
 * JD-Core Version:    0.6.2
 */