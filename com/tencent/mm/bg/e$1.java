package com.tencent.mm.bg;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1
  implements DialogInterface.OnClickListener
{
  e$1(Runnable paramRunnable)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(78812);
    if (this.fUr != null)
      this.fUr.run();
    AppMethodBeat.o(78812);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bg.e.1
 * JD-Core Version:    0.6.2
 */