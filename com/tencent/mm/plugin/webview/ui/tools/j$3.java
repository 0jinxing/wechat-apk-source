package com.tencent.mm.plugin.webview.ui.tools;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

final class j$3
  implements View.OnCreateContextMenuListener
{
  j$3(j paramj, ArrayList paramArrayList)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(7644);
    paramView = this.utO.iterator();
    while (paramView.hasNext())
      paramContextMenu.add((String)paramView.next());
    AppMethodBeat.o(7644);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.j.3
 * JD-Core Version:    0.6.2
 */