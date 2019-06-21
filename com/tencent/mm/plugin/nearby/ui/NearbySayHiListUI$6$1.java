package com.tencent.mm.plugin.nearby.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class NearbySayHiListUI$6$1
  implements DialogInterface.OnCancelListener
{
  NearbySayHiListUI$6$1(NearbySayHiListUI.6 param6)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(55499);
    g.Rg().c(NearbySayHiListUI.f(this.oQR.oQP));
    AppMethodBeat.o(55499);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.6.1
 * JD-Core Version:    0.6.2
 */