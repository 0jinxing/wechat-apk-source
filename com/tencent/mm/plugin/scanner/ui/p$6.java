package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import java.util.concurrent.atomic.AtomicBoolean;

final class p$6
  implements Runnable
{
  p$6(p paramp, Activity paramActivity)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81206);
    p localp = this.qfp;
    Activity localActivity = this.val$activity;
    this.val$activity.getString(2131297061);
    localp.ehJ = h.b(localActivity, this.val$activity.getString(2131302100), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(81205);
        p.6.this.qfp.qff = false;
        p.6.this.qfp.qfe.set(false);
        p.6.this.qfp.qfg = false;
        AppMethodBeat.o(81205);
      }
    });
    AppMethodBeat.o(81206);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.p.6
 * JD-Core Version:    0.6.2
 */