package com.tencent.mm.plugin.topstory.ui.home;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.webview.TopStoryWebView;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

final class b$2
  implements Runnable
{
  b$2(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1567);
    this.sCf.iNB.dKT();
    this.sCf.sBM.setVisibility(8);
    this.sCf.sBK.setVisibility(0);
    AppMethodBeat.o(1567);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.2
 * JD-Core Version:    0.6.2
 */