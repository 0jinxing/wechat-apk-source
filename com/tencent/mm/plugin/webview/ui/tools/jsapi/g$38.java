package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class g$38
  implements DialogInterface.OnCancelListener
{
  g$38(g paramg, i parami, Map paramMap)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(9091);
    g.a(this.uHd, this.uqf, this.uqf.uIJ + ":cancelled", this.uHA);
    AppMethodBeat.o(9091);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.38
 * JD-Core Version:    0.6.2
 */