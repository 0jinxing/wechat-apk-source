package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmbedWebView$2
  implements Runnable
{
  EmbedWebView$2(EmbedWebView paramEmbedWebView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68279);
    View localView = (View)this.pxN.getParent();
    if (localView == null)
      AppMethodBeat.o(68279);
    while (true)
    {
      return;
      localView = (View)localView.getParent();
      if ((localView != null) && ((localView instanceof ScrollView)))
      {
        EmbedWebView.a(this.pxN);
        localView.setOnTouchListener(new EmbedWebView.2.1(this));
      }
      AppMethodBeat.o(68279);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.EmbedWebView.2
 * JD-Core Version:    0.6.2
 */