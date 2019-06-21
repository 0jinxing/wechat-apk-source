package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.b.a;

final class i$16
  implements DialogInterface.OnClickListener
{
  i$16(a parama, i.a parama1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(8796);
    i.a(this.uEs, this.uEo, false);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(8796);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.i.16
 * JD-Core Version:    0.6.2
 */