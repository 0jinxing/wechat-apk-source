package com.tencent.mm.plugin.fts.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSAddWw$7
  implements Runnable
{
  FTSAddWw$7(FTSAddWw paramFTSAddWw)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(61759);
    if (FTSAddWw.i(this.mIg) != null)
    {
      FTSAddWw.i(this.mIg).dismiss();
      FTSAddWw.h(this.mIg);
    }
    AppMethodBeat.o(61759);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSAddWw.7
 * JD-Core Version:    0.6.2
 */