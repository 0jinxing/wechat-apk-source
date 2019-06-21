package com.tencent.mm.plugin.mall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallIndexUI$2
  implements DialogInterface.OnDismissListener
{
  MallIndexUI$2(MallIndexUI paramMallIndexUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(43206);
    MallIndexUI.d(this.onu);
    AppMethodBeat.o(43206);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexUI.2
 * JD-Core Version:    0.6.2
 */