package com.tencent.mm.plugin.game.f;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements DialogInterface.OnCancelListener
{
  c$1(Dialog paramDialog)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(112293);
    this.nny.setOnCancelListener(null);
    AppMethodBeat.o(112293);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.f.c.1
 * JD-Core Version:    0.6.2
 */