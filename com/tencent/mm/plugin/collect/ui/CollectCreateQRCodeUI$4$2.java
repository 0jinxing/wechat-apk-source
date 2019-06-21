package com.tencent.mm.plugin.collect.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class CollectCreateQRCodeUI$4$2
  implements DialogInterface.OnClickListener
{
  CollectCreateQRCodeUI$4$2(CollectCreateQRCodeUI.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41235);
    al.n(new CollectCreateQRCodeUI.4.2.1(this), 500L);
    AppMethodBeat.o(41235);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeUI.4.2
 * JD-Core Version:    0.6.2
 */