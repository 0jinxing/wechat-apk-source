package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsMsgUI$7
  implements DialogInterface.OnClickListener
{
  SnsMsgUI$7(SnsMsgUI paramSnsMsgUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39071);
    SnsMsgUI.a(this.rub, true);
    AppMethodBeat.o(39071);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.7
 * JD-Core Version:    0.6.2
 */