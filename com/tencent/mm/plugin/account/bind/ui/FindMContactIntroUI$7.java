package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;

final class FindMContactIntroUI$7
  implements DialogInterface.OnClickListener
{
  FindMContactIntroUI$7(FindMContactIntroUI paramFindMContactIntroUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13603);
    g.RP().Ry().set(12322, Boolean.TRUE);
    FindMContactIntroUI.f(this.gsU);
    AppMethodBeat.o(13603);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI.7
 * JD-Core Version:    0.6.2
 */