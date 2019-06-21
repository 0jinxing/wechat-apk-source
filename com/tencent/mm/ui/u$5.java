package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.base.b;

final class u$5
  implements DialogInterface.OnCancelListener
{
  u$5(Activity paramActivity)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(29599);
    h.pYm.a(405L, 39L, 1L, true);
    if (this.ymY != null)
    {
      this.ghG.finish();
      this.ghG.startActivity(this.ymY);
      b.K(this.ghG, this.ymY);
    }
    AppMethodBeat.o(29599);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.u.5
 * JD-Core Version:    0.6.2
 */