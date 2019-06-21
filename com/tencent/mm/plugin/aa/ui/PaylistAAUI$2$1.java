package com.tencent.mm.plugin.aa.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.o;

final class PaylistAAUI$2$1
  implements DialogInterface.OnClickListener
{
  PaylistAAUI$2$1(PaylistAAUI.2 param2, o paramo)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(40865);
    PaylistAAUI.a(this.gpE.gpC, this.gpD);
    AppMethodBeat.o(40865);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.PaylistAAUI.2.1
 * JD-Core Version:    0.6.2
 */