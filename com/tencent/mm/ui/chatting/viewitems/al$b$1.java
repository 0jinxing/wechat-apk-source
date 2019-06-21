package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class al$b$1
  implements View.OnCreateContextMenuListener
{
  al$b$1(al.b paramb, Context paramContext)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(33304);
    paramContextMenu.clear();
    paramContextMenu.add(0, 0, 0, this.val$context.getResources().getString(2131296875));
    paramContextMenu.add(0, 1, 0, this.val$context.getResources().getString(2131301431));
    paramContextMenu.add(0, 2, 0, this.val$context.getResources().getString(2131301430));
    paramContextMenu.add(0, 3, 0, this.val$context.getResources().getString(2131299589));
    AppMethodBeat.o(33304);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.b.1
 * JD-Core Version:    0.6.2
 */