package com.tencent.mm.plugin.scanner.ui;

import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h.c;

final class VcardContactUI$1
  implements h.c
{
  VcardContactUI$1(VcardContactUI paramVcardContactUI, String paramString)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(81345);
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(81345);
      return;
      Intent localIntent = new Intent("android.intent.action.DIAL");
      localIntent.setFlags(268435456);
      localIntent.setData(Uri.parse("tel:" + this.kod));
      this.qgX.startActivity(localIntent);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.VcardContactUI.1
 * JD-Core Version:    0.6.2
 */