package com.tencent.mm.ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class s$g
  implements View.OnTouchListener
{
  private int[] yJQ;

  public s$g()
  {
    AppMethodBeat.i(30724);
    this.yJQ = new int[2];
    AppMethodBeat.o(30724);
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(30725);
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(30725);
      return false;
      this.yJQ[0] = ((int)paramMotionEvent.getRawX());
      this.yJQ[1] = ((int)paramMotionEvent.getRawY());
      paramView.setTag(2131820679, this.yJQ);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.g
 * JD-Core Version:    0.6.2
 */