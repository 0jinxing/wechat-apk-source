package com.tencent.mm.ui.bizchat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizChatroomInfoUI$11
  implements DialogInterface.OnCancelListener
{
  BizChatroomInfoUI$11(BizChatroomInfoUI paramBizChatroomInfoUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(30210);
    BizChatroomInfoUI.e(this.yFp);
    AppMethodBeat.o(30210);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatroomInfoUI.11
 * JD-Core Version:    0.6.2
 */