package com.tencent.xweb;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebView$2
  implements View.OnLongClickListener
{
  WebView$2(WebView paramWebView)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(3840);
    boolean bool;
    if (this.AMV.zMt != null)
    {
      bool = this.AMV.zMt.onLongClick(this.AMV);
      AppMethodBeat.o(3840);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3840);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.WebView.2
 * JD-Core Version:    0.6.2
 */