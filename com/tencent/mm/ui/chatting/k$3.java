package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$3
  implements DialogInterface.OnClickListener
{
  k$3(ah paramah)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(30575);
    if (this.yIJ != null)
    {
      ah localah = this.yIJ;
      paramDialogInterface = ah.a.yLP;
      localah.dCI();
    }
    AppMethodBeat.o(30575);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.k.3
 * JD-Core Version:    0.6.2
 */