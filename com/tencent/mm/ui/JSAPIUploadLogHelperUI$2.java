package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class JSAPIUploadLogHelperUI$2
  implements DialogInterface.OnDismissListener
{
  JSAPIUploadLogHelperUI$2(JSAPIUploadLogHelperUI paramJSAPIUploadLogHelperUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(29439);
    if (!this.yjA.isFinishing())
      this.yjA.finish();
    AppMethodBeat.o(29439);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.JSAPIUploadLogHelperUI.2
 * JD-Core Version:    0.6.2
 */