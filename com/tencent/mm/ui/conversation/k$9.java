package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.dbbackup.DBRecoveryUI;
import com.tencent.mm.ui.widget.a.c;

final class k$9
  implements DialogInterface.OnClickListener
{
  k$9(k paramk)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34477);
    k.e(this.zuQ).dismiss();
    paramDialogInterface = new Intent(k.a(this.zuQ), DBRecoveryUI.class);
    paramDialogInterface.putExtra("scene", 0);
    k.a(this.zuQ).startActivity(paramDialogInterface);
    AppMethodBeat.o(34477);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.9
 * JD-Core Version:    0.6.2
 */