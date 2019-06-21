package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsTimeLineUI$49
  implements DialogInterface.OnCancelListener
{
  SnsTimeLineUI$49(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(39523);
    SnsTimeLineUI.L(this.rzs).Ei(10);
    SnsTimeLineUI.b(SnsTimeLineUI.L(this.rzs));
    AppMethodBeat.o(39523);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.49
 * JD-Core Version:    0.6.2
 */