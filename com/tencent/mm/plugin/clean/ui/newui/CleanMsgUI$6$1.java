package com.tencent.mm.plugin.clean.ui.newui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.clean.c.d;
import com.tencent.mm.plugin.clean.c.e;

final class CleanMsgUI$6$1
  implements DialogInterface.OnClickListener
{
  CleanMsgUI$6$1(CleanMsgUI.6 param6)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(18892);
    CleanMsgUI.a(this.kyU.kyS, new e(d.bfQ(), this.kyU.kyS, CleanMsgUI.bgn()));
    CleanMsgUI.b(this.kyU.kyS).start();
    CleanMsgUI.c(this.kyU.kyS).show();
    AppMethodBeat.o(18892);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanMsgUI.6.1
 * JD-Core Version:    0.6.2
 */