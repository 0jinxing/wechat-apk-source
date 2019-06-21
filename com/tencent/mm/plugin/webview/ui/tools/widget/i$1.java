package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$1
  implements DialogInterface.OnClickListener
{
  i$1(i parami, GeolocationPermissions.Callback paramCallback, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(9903);
    this.uxD.invoke(this.uxE, true, true);
    AppMethodBeat.o(9903);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.i.1
 * JD-Core Version:    0.6.2
 */