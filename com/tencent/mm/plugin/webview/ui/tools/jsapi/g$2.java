package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$2
  implements DialogInterface.OnDismissListener
{
  g$2(g paramg, i parami)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(9038);
    g.a(this.uHd, this.uqf, "share_weibo:not_bind_qq", null);
    AppMethodBeat.o(9038);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.2
 * JD-Core Version:    0.6.2
 */