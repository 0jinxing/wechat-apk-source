package com.tencent.mm.plugin.webview.ui.tools;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class n$33$1
  implements View.OnCreateContextMenuListener
{
  n$33$1(n.33 param33)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(7745);
    if (((WebViewUI)n.a(this.uuK.uuo).get()).uwH.icF != null)
    {
      ab.d("MicroMsg.WebViewStubCallbackAIDLStub", "show webkit menu");
      ((WebViewUI)n.a(this.uuK.uuo).get()).uwH.b(paramContextMenu, ((WebViewUI)n.a(this.uuK.uuo).get()).uwH.icF);
      ((WebViewUI)n.a(this.uuK.uuo).get()).uwH.icF = null;
      AppMethodBeat.o(7745);
    }
    while (true)
    {
      return;
      if (((WebViewUI)n.a(this.uuK.uuo).get()).uwH.icG != null)
      {
        ab.d("MicroMsg.WebViewStubCallbackAIDLStub", "show IX5 menu");
        ((WebViewUI)n.a(this.uuK.uuo).get()).uwH.a(paramContextMenu, ((WebViewUI)n.a(this.uuK.uuo).get()).uwH.icG);
        ((WebViewUI)n.a(this.uuK.uuo).get()).uwH.icG = null;
      }
      AppMethodBeat.o(7745);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.33.1
 * JD-Core Version:    0.6.2
 */