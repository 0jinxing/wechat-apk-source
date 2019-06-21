package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1$1
  implements DialogInterface.OnCancelListener
{
  e$1$1(e.1 param1)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(7413);
    try
    {
      paramDialogInterface.dismiss();
      AppMethodBeat.o(7413);
      return;
    }
    catch (Exception paramDialogInterface)
    {
      while (true)
      {
        ab.e("MicroMsg.OAuthSession", "onCancel, ex = " + paramDialogInterface.getMessage());
        AppMethodBeat.o(7413);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.e.1.1
 * JD-Core Version:    0.6.2
 */