package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class RemittanceBaseUI$23$4
  implements DialogInterface.OnClickListener
{
  RemittanceBaseUI$23$4(RemittanceBaseUI.23 param23)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44852);
    al.n(new RemittanceBaseUI.23.4.1(this), 500L);
    AppMethodBeat.o(44852);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.23.4
 * JD-Core Version:    0.6.2
 */