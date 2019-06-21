package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class RemittanceBusiUI$26$2
  implements DialogInterface.OnClickListener
{
  RemittanceBusiUI$26$2(RemittanceBusiUI.26 param26)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44922);
    al.n(new RemittanceBusiUI.26.2.1(this), 500L);
    AppMethodBeat.o(44922);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.26.2
 * JD-Core Version:    0.6.2
 */