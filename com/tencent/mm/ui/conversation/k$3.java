package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$3
  implements DialogInterface.OnClickListener
{
  k$3(k paramk)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34464);
    paramDialogInterface = new Intent();
    paramDialogInterface.setClassName(k.a(this.zuQ), "com.tencent.mm.plugin.account.ui.RegByFacebookSetPwdUI");
    k.a(this.zuQ).startActivity(paramDialogInterface);
    AppMethodBeat.o(34464);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.3
 * JD-Core Version:    0.6.2
 */