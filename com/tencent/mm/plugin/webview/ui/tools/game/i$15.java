package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PBool;

final class i$15
  implements DialogInterface.OnCancelListener
{
  i$15(PBool paramPBool, i.a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(8795);
    if (this.uEn.value)
      AppMethodBeat.o(8795);
    while (true)
    {
      return;
      this.uEo.d("cancel", null);
      AppMethodBeat.o(8795);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.i.15
 * JD-Core Version:    0.6.2
 */