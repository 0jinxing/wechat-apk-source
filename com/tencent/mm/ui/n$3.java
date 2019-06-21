package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;

final class n$3
  implements DialogInterface.OnClickListener
{
  n$3(n paramn, int paramInt, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29509);
    if (this.jDT == 32)
      e.pXa.a(462L, 6L, 1L, true);
    while (true)
    {
      paramDialogInterface.dismiss();
      MMAppMgr.bd(this.val$activity);
      this.val$activity.finish();
      AppMethodBeat.o(29509);
      return;
      if (this.jDT == 96)
        e.pXa.a(462L, 7L, 1L, true);
      else
        e.pXa.a(462L, 8L, 1L, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.n.3
 * JD-Core Version:    0.6.2
 */