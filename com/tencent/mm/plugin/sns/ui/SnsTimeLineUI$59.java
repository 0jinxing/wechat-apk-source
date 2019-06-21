package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsTimeLineUI$59
  implements DialogInterface.OnClickListener
{
  SnsTimeLineUI$59(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39535);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(39535);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.59
 * JD-Core Version:    0.6.2
 */