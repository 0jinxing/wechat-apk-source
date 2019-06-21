package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PBool;

final class c$9
  implements DialogInterface.OnClickListener
{
  c$9(String paramString, PBool paramPBool, ProgressDialog paramProgressDialog, Runnable paramRunnable)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34163);
    c.a(this.ewn, this.zqU, this.eiD);
    if (this.zqW != null)
      this.zqW.run();
    AppMethodBeat.o(34163);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.c.9
 * JD-Core Version:    0.6.2
 */