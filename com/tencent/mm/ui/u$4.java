package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class u$4
  implements DialogInterface.OnCancelListener
{
  u$4(Activity paramActivity)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(29598);
    h.pYm.a(405L, 37L, 1L, true);
    this.ghG.finish();
    MMAppMgr.bd(this.ghG);
    AppMethodBeat.o(29598);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.u.4
 * JD-Core Version:    0.6.2
 */