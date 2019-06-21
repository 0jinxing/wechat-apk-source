package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$60
  implements Runnable
{
  g$60(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9120);
    Toast.makeText(g.i(this.uHd), g.i(this.uHd).getString(2131300252), 0).show();
    AppMethodBeat.o(9120);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.60
 * JD-Core Version:    0.6.2
 */