package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareImgUI$6
  implements DialogInterface.OnCancelListener
{
  ShareImgUI$6(ShareImgUI paramShareImgUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(34941);
    this.zHr.finish();
    AppMethodBeat.o(34941);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareImgUI.6
 * JD-Core Version:    0.6.2
 */