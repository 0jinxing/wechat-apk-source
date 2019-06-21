package com.tencent.mm.plugin.webview.luggage;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$3$1
  implements View.OnCreateContextMenuListener
{
  g$3$1(g.3 param3)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(6122);
    if (this.uiL.uiJ.icF != null)
    {
      ab.d("MicroMsg.GameWebViewMenuListHelper", "show webkit menu");
      this.uiL.uiJ.b(paramContextMenu, this.uiL.uiJ.icF);
      this.uiL.uiJ.icF = null;
      AppMethodBeat.o(6122);
    }
    while (true)
    {
      return;
      if (this.uiL.uiJ.icG != null)
      {
        ab.d("MicroMsg.GameWebViewMenuListHelper", "show IX5 menu");
        this.uiL.uiJ.a(paramContextMenu, this.uiL.uiJ.icG);
        this.uiL.uiJ.icG = null;
      }
      AppMethodBeat.o(6122);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g.3.1
 * JD-Core Version:    0.6.2
 */