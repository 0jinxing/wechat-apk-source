package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class OpenFileChooserUI$6$2$1
  implements DialogInterface.OnClickListener
{
  OpenFileChooserUI$6$2$1(OpenFileChooserUI.6.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(7449);
    this.usi.usg.usf.setResult(1);
    this.usi.usg.usf.finish();
    AppMethodBeat.o(7449);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI.6.2.1
 * JD-Core Version:    0.6.2
 */