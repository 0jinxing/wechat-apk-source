package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsUploadBrowseUI$3$1
  implements DialogInterface.OnClickListener
{
  SnsUploadBrowseUI$3$1(SnsUploadBrowseUI.3 param3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39678);
    if (this.rCj.rCi.rpp.ctn() == 0)
      this.rCj.rCi.cuw();
    AppMethodBeat.o(39678);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI.3.1
 * JD-Core Version:    0.6.2
 */