package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShowNonWeixinFriendUI$2$1$1
  implements DialogInterface.OnClickListener
{
  ShowNonWeixinFriendUI$2$1$1(ShowNonWeixinFriendUI.2.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125585);
    this.gIo.gIn.gIm.finish();
    AppMethodBeat.o(125585);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ShowNonWeixinFriendUI.2.1.1
 * JD-Core Version:    0.6.2
 */