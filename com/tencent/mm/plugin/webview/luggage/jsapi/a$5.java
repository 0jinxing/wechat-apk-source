package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$5
  implements DialogInterface.OnClickListener
{
  a$5(a parama, bc.a parama1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(6268);
    paramDialogInterface.dismiss();
    this.kOw.d("network_not_wifi", null);
    AppMethodBeat.o(6268);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.a.5
 * JD-Core Version:    0.6.2
 */