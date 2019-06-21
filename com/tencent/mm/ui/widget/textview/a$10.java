package com.tencent.mm.ui.widget.textview;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$10
  implements View.OnTouchListener
{
  a$10(a parama)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(113127);
    if (this.zWL.zWo != null)
      this.zWL.zWo.onTouch(paramView, paramMotionEvent);
    this.zWL.zWr = ((int)paramMotionEvent.getX());
    this.zWL.zWs = ((int)paramMotionEvent.getY());
    AppMethodBeat.o(113127);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.a.10
 * JD-Core Version:    0.6.2
 */