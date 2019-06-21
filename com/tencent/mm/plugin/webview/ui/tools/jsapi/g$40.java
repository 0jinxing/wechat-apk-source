package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class g$40
  implements DialogInterface.OnClickListener
{
  g$40(g paramg, i parami, Map paramMap)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(9093);
    g.a(this.uHd, this.uqf, this.uqf.uIJ + ":ok", this.uHA);
    AppMethodBeat.o(9093);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.40
 * JD-Core Version:    0.6.2
 */