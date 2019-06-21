package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.e;

final class WebViewSmileyGrid$1
  implements AdapterView.OnItemClickListener
{
  WebViewSmileyGrid$1(WebViewSmileyGrid paramWebViewSmileyGrid)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(10104);
    if (paramInt == WebViewSmileyGrid.a(this.uKB).getCount() - 1)
    {
      if (WebViewSmileyGrid.b(this.uKB).uKG != null)
        WebViewSmileyGrid.b(this.uKB).uKG.aRg();
      AppMethodBeat.o(10104);
    }
    while (true)
    {
      return;
      if (WebViewSmileyGrid.c(this.uKB) * (WebViewSmileyGrid.d(this.uKB) - 1) + paramInt >= WebViewSmileyGrid.e(this.uKB))
      {
        AppMethodBeat.o(10104);
      }
      else
      {
        int i = WebViewSmileyGrid.c(this.uKB);
        int j = WebViewSmileyGrid.d(this.uKB);
        if (WebViewSmileyGrid.b(this.uKB).uKG != null)
        {
          paramAdapterView = WebViewSmileyGrid.b(this.uKB).uKG;
          WebViewSmileyGrid.b(this.uKB);
          paramAdapterView.append(e.dqK().qL(i * (j - 1) + paramInt));
        }
        AppMethodBeat.o(10104);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid.1
 * JD-Core Version:    0.6.2
 */