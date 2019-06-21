package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.pointers.PBool;

final class i$3
  implements DialogInterface.OnClickListener
{
  i$3(PBool paramPBool, a parama, i.a parama1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(8783);
    this.uEn.value = true;
    i.a(this.kMF, true, this.uEo);
    AppMethodBeat.o(8783);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.i.3
 * JD-Core Version:    0.6.2
 */