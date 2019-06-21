package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.bind.a.c;

final class BindLinkedInUI$8$1$1
  implements DialogInterface.OnCancelListener
{
  BindLinkedInUI$8$1$1(BindLinkedInUI.8.1 param1, c paramc)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13393);
    g.Rg().c(this.grf);
    AppMethodBeat.o(13393);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI.8.1.1
 * JD-Core Version:    0.6.2
 */