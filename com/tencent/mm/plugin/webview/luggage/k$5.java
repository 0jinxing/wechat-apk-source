package com.tencent.mm.plugin.webview.luggage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$5
  implements DialogInterface.OnClickListener
{
  k$5(k paramk)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(6176);
    k.b(this.ujg);
    this.ujg.bDx();
    AppMethodBeat.o(6176);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.k.5
 * JD-Core Version:    0.6.2
 */