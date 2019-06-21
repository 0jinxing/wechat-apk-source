package com.tencent.mm.ui.tools;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class e$2
  implements Runnable
{
  e$2(e parame, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107642);
    if (this.zFr.zFp == this.zFr.zFk)
    {
      ab.i("MicroMsg.ImagePreviewAnimation", "dancy enter Animation not Start!");
      this.zFs.requestLayout();
    }
    AppMethodBeat.o(107642);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.e.2
 * JD-Core Version:    0.6.2
 */