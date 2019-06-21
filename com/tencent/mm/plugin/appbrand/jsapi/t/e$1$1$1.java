package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1$1$1
  implements View.OnCreateContextMenuListener
{
  e$1$1$1(e.1.1 param1)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(17024);
    if (this.icP.icO.icM.icF != null)
    {
      ab.d("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "show webkit menu");
      e.a(this.icP.icO.icM, paramContextMenu, this.icP.icO.icM.icF);
      this.icP.icO.icM.icF = null;
      AppMethodBeat.o(17024);
    }
    while (true)
    {
      return;
      if (this.icP.icO.icM.icG != null)
      {
        ab.d("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "show IX5 menu");
        e.b(this.icP.icO.icM, paramContextMenu, this.icP.icO.icM.icG);
        this.icP.icO.icM.icG = null;
      }
      AppMethodBeat.o(17024);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.e.1.1.1
 * JD-Core Version:    0.6.2
 */