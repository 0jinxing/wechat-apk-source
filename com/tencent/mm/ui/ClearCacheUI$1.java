package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ClearCacheUI$1
  implements DialogInterface.OnClickListener
{
  ClearCacheUI$1(ClearCacheUI paramClearCacheUI, long paramLong)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29165);
    ClearCacheUI.a(this.yfR, this.yfQ);
    this.yfR.finish();
    AppMethodBeat.o(29165);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ClearCacheUI.1
 * JD-Core Version:    0.6.2
 */