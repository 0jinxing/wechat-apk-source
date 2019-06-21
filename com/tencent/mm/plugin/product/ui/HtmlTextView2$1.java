package com.tencent.mm.plugin.product.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HtmlTextView2$1
  implements View.OnTouchListener
{
  HtmlTextView2$1(HtmlTextView2 paramHtmlTextView2)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(44020);
    boolean bool;
    if (paramMotionEvent.getAction() == 2)
    {
      bool = true;
      AppMethodBeat.o(44020);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(44020);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.HtmlTextView2.1
 * JD-Core Version:    0.6.2
 */