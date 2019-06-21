package com.tencent.mm.plugin.scanner.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.base.h.c;

final class VcardContactUI$2
  implements h.c
{
  VcardContactUI$2(VcardContactUI paramVcardContactUI, String paramString)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(81346);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(81346);
      while (true)
      {
        return;
        localIntent = new Intent();
        String str = this.qgY + " " + this.qgY;
        localIntent.putExtra("composeType", 4);
        localIntent.putExtra("toList", new String[] { str });
        d.b(this.qgX, "qqmail", ".ui.ComposeUI", localIntent);
        AppMethodBeat.o(81346);
      }
      Intent localIntent = new Intent("android.intent.action.SEND");
      localIntent.setType("text/plain");
      localIntent.putExtra("android.intent.extra.EMAIL", new String[] { this.qgY });
      this.qgX.startActivity(localIntent);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.VcardContactUI.2
 * JD-Core Version:    0.6.2
 */