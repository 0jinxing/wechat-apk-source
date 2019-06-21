package com.tencent.mm.bg;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$2
  implements DialogInterface.OnCancelListener
{
  e$2(Runnable paramRunnable)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(78813);
    if (this.fUr != null)
      this.fUr.run();
    AppMethodBeat.o(78813);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bg.e.2
 * JD-Core Version:    0.6.2
 */