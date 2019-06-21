package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$78
  implements View.OnCreateContextMenuListener
{
  g$78(g paramg)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(9142);
    paramContextMenu.add(0, 1, 0, g.i(this.uHd).getString(2131296918));
    paramContextMenu.add(0, 2, 1, g.i(this.uHd).getString(2131296925));
    AppMethodBeat.o(9142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.78
 * JD-Core Version:    0.6.2
 */