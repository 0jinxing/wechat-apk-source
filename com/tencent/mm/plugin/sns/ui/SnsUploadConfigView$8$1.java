package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsUploadConfigView$8$1
  implements DialogInterface.OnClickListener
{
  SnsUploadConfigView$8$1(SnsUploadConfigView.8 param8)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39694);
    paramDialogInterface = this.rCA.rCy;
    if (SnsUploadConfigView.d(this.rCA.rCy));
    for (boolean bool = false; ; bool = true)
    {
      SnsUploadConfigView.b(paramDialogInterface, bool);
      SnsUploadConfigView.e(this.rCA.rCy);
      AppMethodBeat.o(39694);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadConfigView.8.1
 * JD-Core Version:    0.6.2
 */