package com.tencent.mm.plugin.topstory.ui.home;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.webview.TopStoryWebView;

final class b$9
  implements View.OnClickListener
{
  b$9(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1587);
    long l = System.currentTimeMillis();
    if (l - this.sCf.sBR < 300L);
    try
    {
      if ((this.sCf.sBK != null) && (this.sCf.sBK.getView() != null))
        this.sCf.sBK.getView().scrollTo(this.sCf.sBK.getView().getScrollX(), 0);
      label76: this.sCf.sBR = l;
      AppMethodBeat.o(1587);
      return;
    }
    catch (Throwable paramView)
    {
      break label76;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.9
 * JD-Core Version:    0.6.2
 */