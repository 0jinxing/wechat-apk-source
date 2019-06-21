package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMAppMgr$4
  implements DialogInterface.OnClickListener
{
  MMAppMgr$4(Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29551);
    paramDialogInterface.dismiss();
    MMAppMgr.bd(this.ghG);
    AppMethodBeat.o(29551);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.4
 * JD-Core Version:    0.6.2
 */