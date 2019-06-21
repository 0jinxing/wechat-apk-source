package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;

final class FindMContactIntroUI$8
  implements DialogInterface.OnClickListener
{
  FindMContactIntroUI$8(FindMContactIntroUI paramFindMContactIntroUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13604);
    g.RP().Ry().set(12322, Boolean.FALSE);
    AppMethodBeat.o(13604);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI.8
 * JD-Core Version:    0.6.2
 */