package com.tencent.mm.pluginsdk.ui.e;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.base.h.c;

final class l$7$1
  implements h.c
{
  l$7$1(l.7 param7, String paramString)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(28137);
    if (this.vsg.vsb != null)
      this.vsg.vsb.onDismiss(null);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(28137);
      while (true)
      {
        return;
        if (l.dlg())
        {
          Context localContext = this.vsg.val$context;
          String str = this.kod;
          Intent localIntent = new Intent("android.intent.action.INSERT");
          localIntent.setType("vnd.android.cursor.dir/contact");
          localIntent.putExtra("phone", str);
          localContext.startActivity(localIntent);
          h.pYm.X(10113, "1");
          AppMethodBeat.o(28137);
        }
        else
        {
          l.bD(this.vsg.val$context, this.kod);
          h.pYm.X(10114, "1");
          AppMethodBeat.o(28137);
        }
      }
      l.bD(this.vsg.val$context, this.kod);
      h.pYm.X(10114, "1");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.l.7.1
 * JD-Core Version:    0.6.2
 */