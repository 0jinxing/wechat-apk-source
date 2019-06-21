package com.tencent.mm.plugin.location.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$1
  implements View.OnTouchListener
{
  m$1(m paramm)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(113560);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 2:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(113560);
      return false;
      if ((Math.abs(paramMotionEvent.getX() - this.nOf.neG) > 10.0F) || (Math.abs(paramMotionEvent.getY() - this.nOf.neH) > 10.0F))
      {
        m.a(this.nOf, true);
        continue;
        this.nOf.neG = paramMotionEvent.getX();
        this.nOf.neH = paramMotionEvent.getY();
        m.a(this.nOf, System.currentTimeMillis());
        m.a(this.nOf, false);
        continue;
        if ((!m.a(this.nOf)) && (System.currentTimeMillis() - m.b(this.nOf) < 200L))
          m.c(this.nOf);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.m.1
 * JD-Core Version:    0.6.2
 */