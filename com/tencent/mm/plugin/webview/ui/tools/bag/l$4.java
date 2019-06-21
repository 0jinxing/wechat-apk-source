package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class l$4
  implements View.OnClickListener
{
  l$4(l paraml)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(8213);
    l.a(this.uzz, l.c(this.uzz).url, l.c(this.uzz).scene);
    AppMethodBeat.o(8213);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.l.4
 * JD-Core Version:    0.6.2
 */