package com.tencent.mm.pluginsdk.ui.e;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.base.h.c;

final class l$1
  implements h.c
{
  l$1(DialogInterface.OnDismissListener paramOnDismissListener, String paramString, Context paramContext)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(28131);
    if (this.vsb != null)
      this.vsb.onDismiss(null);
    String str1 = this.vsc.replace(" ", "").replace("#", "@");
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(28131);
      while (true)
      {
        return;
        Context localContext = this.val$context;
        Intent localIntent = new Intent();
        localIntent.putExtra("composeType", 4);
        String str2 = str1.substring(0, str1.indexOf('@'));
        localIntent.putExtra("toList", new String[] { str2 + " " + str1 });
        d.b(localContext, "qqmail", ".ui.ComposeUI", localIntent);
        AppMethodBeat.o(28131);
      }
      l.bC(this.val$context, str1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.l.1
 * JD-Core Version:    0.6.2
 */