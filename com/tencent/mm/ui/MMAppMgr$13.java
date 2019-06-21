package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aj;

final class MMAppMgr$13
  implements DialogInterface.OnDismissListener
{
  MMAppMgr$13(DialogInterface.OnClickListener paramOnClickListener)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(29561);
    aj.amB("show_wap_adviser");
    if (this.uqM != null)
      this.uqM.onClick(paramDialogInterface, 0);
    AppMethodBeat.o(29561);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.13
 * JD-Core Version:    0.6.2
 */