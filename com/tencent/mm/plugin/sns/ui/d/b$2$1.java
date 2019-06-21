package com.tencent.mm.plugin.sns.ui.d;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2$1
  implements View.OnCreateContextMenuListener
{
  b$2$1(b.2 param2)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(40240);
    paramContextMenu.add(0, 0, 0, this.rKu.rKt.activity.getString(2131298604));
    paramContextMenu.add(1, 1, 0, this.rKu.rKt.activity.getString(2131303816));
    AppMethodBeat.o(40240);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.2.1
 * JD-Core Version:    0.6.2
 */