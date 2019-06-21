package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$1
  implements View.OnTouchListener
{
  g$1(g paramg)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(133658);
    if (paramMotionEvent.getAction() == 1)
    {
      this.iVj.dismiss();
      AppMethodBeat.o(133658);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133658);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.g.1
 * JD-Core Version:    0.6.2
 */