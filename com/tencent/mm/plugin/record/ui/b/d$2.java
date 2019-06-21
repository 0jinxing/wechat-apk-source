package com.tencent.mm.plugin.record.ui.b;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$2
  implements View.OnTouchListener
{
  d$2(d paramd)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(24371);
    if (paramMotionEvent.getAction() == 0)
    {
      this.pLh.jLX = ((int)paramMotionEvent.getRawX());
      this.pLh.jLY = ((int)paramMotionEvent.getRawY());
    }
    AppMethodBeat.o(24371);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.d.2
 * JD-Core Version:    0.6.2
 */