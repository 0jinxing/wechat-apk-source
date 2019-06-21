package com.tencent.mm.plugin.appbrand.ui;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$1$2
  implements Runnable
{
  g$1$2(g.1 param1, View paramView, ViewGroup paramViewGroup)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133088);
    this.iIu.setVisibility(8);
    this.xI.removeView(this.iIu);
    AppMethodBeat.o(133088);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.g.1.2
 * JD-Core Version:    0.6.2
 */