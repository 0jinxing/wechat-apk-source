package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aj;

final class MMAppMgr$16
  implements DialogInterface.OnDismissListener
{
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(29564);
    aj.amB("show_wap_adviser");
    AppMethodBeat.o(29564);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.16
 * JD-Core Version:    0.6.2
 */