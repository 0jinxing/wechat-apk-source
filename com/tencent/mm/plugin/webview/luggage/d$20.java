package com.tencent.mm.plugin.webview.luggage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter;

final class d$20
  implements View.OnTouchListener
{
  d$20(d paramd)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(6042);
    if (d.b(this.uiy).isShown())
      d.b(this.uiy).hide();
    AppMethodBeat.o(6042);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.20
 * JD-Core Version:    0.6.2
 */