package com.tencent.mm.plugin.scanner.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$2
  implements DialogInterface.OnKeyListener
{
  c$2(c paramc, String paramString)
  {
  }

  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(80908);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 1))
    {
      c.a(this.qaS, this.hXt);
      AppMethodBeat.o(80908);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80908);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.c.2
 * JD-Core Version:    0.6.2
 */