package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$1$1
  implements DialogInterface.OnClickListener
{
  m$1$1(m.1 param1, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(88682);
    paramDialogInterface = new Intent("android.intent.action.DIAL");
    paramDialogInterface.setFlags(268435456);
    paramDialogInterface.setData(Uri.parse("tel:" + this.kod));
    m.a(this.koe.koc).startActivity(paramDialogInterface);
    AppMethodBeat.o(88682);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.m.1.1
 * JD-Core Version:    0.6.2
 */