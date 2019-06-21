package com.tencent.mm.plugin.qqmail.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmbedWebView$2$1
  implements View.OnTouchListener
{
  EmbedWebView$2$1(EmbedWebView.2 param2)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(68278);
    if (paramMotionEvent.getPointerCount() == 2)
      this.pxO.pxN.onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(68278);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.EmbedWebView.2.1
 * JD-Core Version:    0.6.2
 */