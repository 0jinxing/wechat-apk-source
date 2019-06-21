package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.h;

final class i$3
  implements DialogInterface.OnClickListener
{
  i$3(i parami, h paramh)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(9905);
    this.uxH.cancel();
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    this.uJk.onClose();
    AppMethodBeat.o(9905);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.i.3
 * JD-Core Version:    0.6.2
 */