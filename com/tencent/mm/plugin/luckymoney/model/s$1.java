package com.tencent.mm.plugin.luckymoney.model;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class s$1
  implements DialogInterface.OnCancelListener
{
  s$1(s params)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(42339);
    this.nXT.bLz();
    AppMethodBeat.o(42339);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.s.1
 * JD-Core Version:    0.6.2
 */