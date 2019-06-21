package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class OpenFileChooserUI$2
  implements DialogInterface.OnCancelListener
{
  OpenFileChooserUI$2(OpenFileChooserUI paramOpenFileChooserUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(7443);
    this.usf.setResult(0);
    this.usf.finish();
    AppMethodBeat.o(7443);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI.2
 * JD-Core Version:    0.6.2
 */