package com.tencent.mm.ui.widget.b;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

final class a$5
  implements View.OnTouchListener
{
  a$5(a parama)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(112759);
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(112759);
      return false;
      a.Qn((int)paramMotionEvent.getRawX());
      a.Qo((int)paramMotionEvent.getRawY());
      a.b(this.zSe, a.e(this.zSe));
      a.dLj();
      ai.i("MicroMsg.MMPopupMenu", "popmenu view set , x_down=" + a.biE() + "y_down=" + a.cML(), new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.b.a.5
 * JD-Core Version:    0.6.2
 */