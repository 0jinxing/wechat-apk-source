package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.ui.widget.a.c;

final class j$8
  implements DialogInterface.OnClickListener
{
  j$8(j paramj, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(7649);
    if (paramDialogInterface == null);
    for (paramDialogInterface = ""; ; paramDialogInterface = ((c)paramDialogInterface).dKV())
    {
      this.utN.cZv().uhz.bG(this.utP, paramDialogInterface);
      AppMethodBeat.o(7649);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.j.8
 * JD-Core Version:    0.6.2
 */