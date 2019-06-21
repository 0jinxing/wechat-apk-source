package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ClearCacheUI$2
  implements DialogInterface.OnClickListener
{
  ClearCacheUI$2(ClearCacheUI paramClearCacheUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29166);
    this.yfR.finish();
    AppMethodBeat.o(29166);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ClearCacheUI.2
 * JD-Core Version:    0.6.2
 */