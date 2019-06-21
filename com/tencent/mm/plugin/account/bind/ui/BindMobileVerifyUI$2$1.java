package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.x;

final class BindMobileVerifyUI$2$1
  implements DialogInterface.OnCancelListener
{
  BindMobileVerifyUI$2$1(BindMobileVerifyUI.2 param2, x paramx)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13529);
    g.Rg().c(this.gsu);
    AppMethodBeat.o(13529);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI.2.1
 * JD-Core Version:    0.6.2
 */