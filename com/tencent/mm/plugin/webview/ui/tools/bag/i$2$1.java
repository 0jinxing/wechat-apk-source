package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$2$1
  implements Runnable
{
  i$2$1(i.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8175);
    if (this.uyN.uyM.getParent() != null)
      ((ViewGroup)this.uyN.uyM.getParent()).removeView(this.uyN.uyM);
    AppMethodBeat.o(8175);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.i.2.1
 * JD-Core Version:    0.6.2
 */