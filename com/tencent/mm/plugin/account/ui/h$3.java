package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;

final class h$3
  implements DialogInterface.OnClickListener
{
  h$3(h paramh)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125087);
    paramDialogInterface = new StringBuilder();
    g.RN();
    paramDialogInterface = paramDialogInterface.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",F200_200,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("F200_200") + ",2");
    AppMethodBeat.o(125087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.h.3
 * JD-Core Version:    0.6.2
 */