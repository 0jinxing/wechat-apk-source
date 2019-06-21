package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;

public final class d$1
  implements DialogInterface.OnCancelListener
{
  public d$1(Context paramContext, i parami)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(132988);
    if ((this.val$context instanceof MMActivity))
      ((MMActivity)this.val$context).finish();
    this.iGU.setOnCancelListener(null);
    AppMethodBeat.o(132988);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.d.1
 * JD-Core Version:    0.6.2
 */