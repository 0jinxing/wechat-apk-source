package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NormalUserFooterPreference$i$3
  implements DialogInterface.OnClickListener
{
  NormalUserFooterPreference$i$3(NormalUserFooterPreference.i parami)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23718);
    this.ppc.cbs();
    AppMethodBeat.o(23718);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.i.3
 * JD-Core Version:    0.6.2
 */