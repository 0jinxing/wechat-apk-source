package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ot;
import com.tencent.mm.sdk.b.a;

final class ChattingUI$1$1
  implements DialogInterface.OnClickListener
{
  ChattingUI$1$1(ChattingUI.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(30817);
    paramDialogInterface = new ot();
    a.xxA.m(paramDialogInterface);
    AppMethodBeat.o(30817);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUI.1.1
 * JD-Core Version:    0.6.2
 */