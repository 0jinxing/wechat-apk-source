package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CreateAvatarUI$3
  implements DialogInterface.OnCancelListener
{
  CreateAvatarUI$3(CreateAvatarUI paramCreateAvatarUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(7355);
    try
    {
      paramDialogInterface.dismiss();
      AppMethodBeat.o(7355);
      return;
    }
    catch (Exception paramDialogInterface)
    {
      while (true)
      {
        ab.e("MicroMsg.CreateAvatarUI", "showProgressDlg onCancel exp: %s ", new Object[] { paramDialogInterface.getLocalizedMessage() });
        AppMethodBeat.o(7355);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.3
 * JD-Core Version:    0.6.2
 */