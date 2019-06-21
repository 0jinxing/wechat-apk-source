package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareImageSelectorUI$7
  implements DialogInterface.OnCancelListener
{
  ShareImageSelectorUI$7(ShareImageSelectorUI paramShareImageSelectorUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(35253);
    ShareImageSelectorUI.b(this.zKJ);
    AppMethodBeat.o(35253);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.ShareImageSelectorUI.7
 * JD-Core Version:    0.6.2
 */