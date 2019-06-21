package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class g$88
  implements DialogInterface.OnKeyListener
{
  g$88(g paramg)
  {
  }

  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(9153);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 1))
    {
      h.a(g.i(this.uHd), true, g.i(this.uHd).getString(2131305571), "", g.i(this.uHd).getString(2131305567), g.i(this.uHd).getString(2131305568), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(9152);
          g.m(g.88.this.uHd).cancel();
          AppMethodBeat.o(9152);
        }
      }
      , new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
        }
      });
      AppMethodBeat.o(9153);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(9153);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.88
 * JD-Core Version:    0.6.2
 */