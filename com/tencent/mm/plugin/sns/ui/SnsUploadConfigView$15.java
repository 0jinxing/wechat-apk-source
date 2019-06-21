package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.i.a;

final class SnsUploadConfigView$15
  implements DialogInterface.OnClickListener
{
  SnsUploadConfigView$15(SnsUploadConfigView paramSnsUploadConfigView)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39700);
    paramDialogInterface = this.rCy;
    Context localContext = this.rCy.getContext();
    this.rCy.getContext().getString(2131297061);
    SnsUploadConfigView.a(paramDialogInterface, h.b(localContext, this.rCy.getContext().getString(2131304132), true, new SnsUploadConfigView.15.1(this)));
    SnsUploadConfigView.l(this.rCy).a(this.rCy, this.rCy.getContext());
    AppMethodBeat.o(39700);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadConfigView.15
 * JD-Core Version:    0.6.2
 */