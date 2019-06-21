package com.tencent.mm.plugin.websearch.widget.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$6
  implements View.OnTouchListener
{
  b$6(b paramb)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(91531);
    this.uef.udV[0] = paramMotionEvent.getX();
    this.uef.udV[1] = paramMotionEvent.getY();
    AppMethodBeat.o(91531);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.b.6
 * JD-Core Version:    0.6.2
 */