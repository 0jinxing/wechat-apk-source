package com.tencent.mm.plugin.location.ui.impl;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$6
  implements Runnable
{
  i$6(i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113744);
    if (this.nRu.nOP)
    {
      if (this.nRu.ehJ != null)
        this.nRu.ehJ.dismiss();
      this.nRu.bKD();
    }
    this.nRu.nOP = false;
    AppMethodBeat.o(113744);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.i.6
 * JD-Core Version:    0.6.2
 */