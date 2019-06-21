package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.b.a;
import com.tencent.mm.pointers.PBool;

final class i$13
  implements DialogInterface.OnClickListener
{
  i$13(PBool paramPBool, a parama, i.a parama1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(8793);
    this.uEn.value = true;
    i.a(this.uEs, this.uEo, false);
    AppMethodBeat.o(8793);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.i.13
 * JD-Core Version:    0.6.2
 */