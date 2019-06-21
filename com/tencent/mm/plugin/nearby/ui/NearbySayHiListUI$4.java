package com.tencent.mm.plugin.nearby.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NearbySayHiListUI$4
  implements DialogInterface.OnClickListener
{
  NearbySayHiListUI$4(NearbySayHiListUI paramNearbySayHiListUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(55496);
    this.oQP.setResult(-1);
    this.oQP.finish();
    AppMethodBeat.o(55496);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.4
 * JD-Core Version:    0.6.2
 */