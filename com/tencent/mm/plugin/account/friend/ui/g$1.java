package com.tencent.mm.plugin.account.friend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.account.friend.a.ah;

final class g$1
  implements DialogInterface.OnCancelListener
{
  g$1(g paramg, ah paramah)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(108648);
    com.tencent.mm.kernel.g.Rg().c(this.gyk);
    this.gyl.gyh.e(false, this.gyl.gyj);
    AppMethodBeat.o(108648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.g.1
 * JD-Core Version:    0.6.2
 */