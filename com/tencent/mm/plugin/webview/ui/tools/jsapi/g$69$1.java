package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.d;

final class g$69$1
  implements DialogInterface.OnClickListener
{
  g$69$1(g.69 param69)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(9130);
    if (g.i(this.uHP.uHd) != null)
      d.bX(g.i(this.uHP.uHd));
    AppMethodBeat.o(9130);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.69.1
 * JD-Core Version:    0.6.2
 */