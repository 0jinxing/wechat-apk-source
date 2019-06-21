package com.tencent.mm.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMAppMgr$15
  implements DialogInterface.OnClickListener
{
  MMAppMgr$15(Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29563);
    try
    {
      Context localContext = this.val$context;
      paramDialogInterface = new android/content/Intent;
      paramDialogInterface.<init>("android.settings.APN_SETTINGS");
      localContext.startActivity(paramDialogInterface);
      AppMethodBeat.o(29563);
      return;
    }
    catch (Exception paramDialogInterface)
    {
      while (true)
        AppMethodBeat.o(29563);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.15
 * JD-Core Version:    0.6.2
 */