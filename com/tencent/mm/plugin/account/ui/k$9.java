package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;

final class k$9
  implements DialogInterface.OnClickListener
{
  k$9(k paramk)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125125);
    paramDialogInterface = new StringBuilder();
    g.RN();
    paramDialogInterface = paramDialogInterface.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_200,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R200_200") + ",2");
    AppMethodBeat.o(125125);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.k.9
 * JD-Core Version:    0.6.2
 */