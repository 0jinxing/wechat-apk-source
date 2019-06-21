package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareToTimeLineUI$1
  implements DialogInterface.OnCancelListener
{
  ShareToTimeLineUI$1(ShareToTimeLineUI paramShareToTimeLineUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(34980);
    this.zHD.finish();
    AppMethodBeat.o(34980);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareToTimeLineUI.1
 * JD-Core Version:    0.6.2
 */