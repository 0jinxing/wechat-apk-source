package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class FindMContactLearmMoreUI$4
  implements DialogInterface.OnCancelListener
{
  FindMContactLearmMoreUI$4(FindMContactLearmMoreUI paramFindMContactLearmMoreUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13625);
    if (FindMContactLearmMoreUI.e(this.gsY) != null)
    {
      g.Rg().b(431, FindMContactLearmMoreUI.e(this.gsY));
      FindMContactLearmMoreUI.f(this.gsY);
    }
    AppMethodBeat.o(13625);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactLearmMoreUI.4
 * JD-Core Version:    0.6.2
 */