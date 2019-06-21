package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FindMContactIntroUI$3
  implements DialogInterface.OnClickListener
{
  FindMContactIntroUI$3(FindMContactIntroUI paramFindMContactIntroUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13598);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(13598);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI.3
 * JD-Core Version:    0.6.2
 */