package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;

final class n$2
  implements DialogInterface.OnClickListener
{
  n$2(n paramn, int paramInt, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29508);
    if (this.jDT == 32)
      e.pXa.a(462L, 3L, 1L, true);
    while (true)
    {
      Intent localIntent = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
      localIntent.addFlags(268435456);
      this.val$activity.startActivity(localIntent);
      paramDialogInterface.dismiss();
      MMAppMgr.bd(this.val$activity);
      this.val$activity.finish();
      AppMethodBeat.o(29508);
      return;
      if (this.jDT == 96)
        e.pXa.a(462L, 4L, 1L, true);
      else
        e.pXa.a(462L, 5L, 1L, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.n.2
 * JD-Core Version:    0.6.2
 */