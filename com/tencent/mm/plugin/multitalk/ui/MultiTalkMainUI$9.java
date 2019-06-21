package com.tencent.mm.plugin.multitalk.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MultiTalkMainUI$9
  implements DialogInterface.OnClickListener
{
  MultiTalkMainUI$9(MultiTalkMainUI paramMultiTalkMainUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(54126);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(54126);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.9
 * JD-Core Version:    0.6.2
 */