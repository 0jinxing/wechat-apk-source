package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class FindMContactIntroUI$10
  implements DialogInterface.OnCancelListener
{
  FindMContactIntroUI$10(FindMContactIntroUI paramFindMContactIntroUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13606);
    if (FindMContactIntroUI.i(this.gsU) != null)
    {
      g.Rg().b(431, FindMContactIntroUI.i(this.gsU));
      FindMContactIntroUI.j(this.gsU);
    }
    AppMethodBeat.o(13606);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI.10
 * JD-Core Version:    0.6.2
 */