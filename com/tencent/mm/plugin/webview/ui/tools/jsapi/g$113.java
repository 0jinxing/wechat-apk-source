package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.webview.model.m;

final class g$113
  implements DialogInterface.OnCancelListener
{
  g$113(g paramg, m paramm, f paramf)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(9189);
    com.tencent.mm.kernel.g.Rg().c(this.uIq);
    com.tencent.mm.kernel.g.Rg().b(1393, this.uIr);
    AppMethodBeat.o(9189);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.113
 * JD-Core Version:    0.6.2
 */