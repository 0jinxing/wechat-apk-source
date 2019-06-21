package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.n;

final class SnsUploadConfigView$11
  implements DialogInterface.OnClickListener
{
  SnsUploadConfigView$11(SnsUploadConfigView paramSnsUploadConfigView)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39698);
    a.gkE.g(new Intent(), SnsUploadConfigView.k(this.rCy));
    AppMethodBeat.o(39698);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadConfigView.11
 * JD-Core Version:    0.6.2
 */