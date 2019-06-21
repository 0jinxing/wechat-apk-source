package com.tencent.mm.plugin.qmessage.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;

final class b$2
  implements DialogInterface.OnClickListener
{
  b$2(b paramb, CheckBoxPreference paramCheckBoxPreference)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(24104);
    this.ptb.uOT = true;
    this.pta.biW();
    AppMethodBeat.o(24104);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.b.2
 * JD-Core Version:    0.6.2
 */