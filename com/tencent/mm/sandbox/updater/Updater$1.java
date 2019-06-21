package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;

final class Updater$1
  implements DialogInterface.OnCancelListener
{
  Updater$1(Updater paramUpdater, DialogInterface.OnCancelListener paramOnCancelListener)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(28931);
    aw.getNotification().cancel(99);
    h.pYm.a(405L, 47L, 1L, true);
    Updater.LS(2);
    this.xwI.onStop();
    if ((!Updater.a(this.xwI)) && (this.xwJ != null))
      this.xwJ.onCancel(paramDialogInterface);
    AppMethodBeat.o(28931);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.Updater.1
 * JD-Core Version:    0.6.2
 */