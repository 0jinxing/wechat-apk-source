package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PBool;

final class c$8
  implements DialogInterface.OnClickListener
{
  c$8(ProgressDialog paramProgressDialog, PBool paramPBool, String paramString, boolean paramBoolean, Runnable paramRunnable)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34162);
    this.eiD.show();
    this.zqU.value = false;
    c.a(this.ewn, this.zqU, this.eiD);
    if (this.zqY)
      h.pYm.e(14553, new Object[] { Integer.valueOf(1), Integer.valueOf(3), this.ewn });
    if (this.zqW != null)
      this.zqW.run();
    AppMethodBeat.o(34162);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.c.8
 * JD-Core Version:    0.6.2
 */