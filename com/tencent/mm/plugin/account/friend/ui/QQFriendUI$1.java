package com.tencent.mm.plugin.account.friend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ac;

final class QQFriendUI$1
  implements DialogInterface.OnCancelListener
{
  QQFriendUI$1(QQFriendUI paramQQFriendUI, ac paramac)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(108613);
    g.Rg().c(this.gxW);
    AppMethodBeat.o(108613);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.QQFriendUI.1
 * JD-Core Version:    0.6.2
 */