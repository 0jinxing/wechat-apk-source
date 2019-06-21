package com.tencent.mm.pluginsdk.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppChooserUI$5
  implements DialogInterface.OnDismissListener
{
  AppChooserUI$5(AppChooserUI paramAppChooserUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125858);
    this.vty.finish();
    AppMethodBeat.o(125858);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.5
 * JD-Core Version:    0.6.2
 */