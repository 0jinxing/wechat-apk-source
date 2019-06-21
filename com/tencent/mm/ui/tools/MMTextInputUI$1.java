package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMTextInputUI$1
  implements DialogInterface.OnClickListener
{
  MMTextInputUI$1(MMTextInputUI paramMMTextInputUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(107724);
    this.zGf.aqX();
    this.zGf.setResult(0);
    this.zGf.finish();
    AppMethodBeat.o(107724);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMTextInputUI.1
 * JD-Core Version:    0.6.2
 */