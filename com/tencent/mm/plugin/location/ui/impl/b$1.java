package com.tencent.mm.plugin.location.ui.impl;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements View.OnTouchListener
{
  b$1(b paramb)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(113593);
    int i = paramMotionEvent.getAction();
    ab.i("MicroMsg.MMBaseMapUI", "map action ".concat(String.valueOf(i)));
    switch (i)
    {
    case 2:
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(113593);
      return false;
      this.nPf.neG = paramMotionEvent.getX();
      this.nPf.neH = paramMotionEvent.getY();
      continue;
      if ((Math.abs(paramMotionEvent.getX() - this.nPf.neG) > 10.0F) || (Math.abs(paramMotionEvent.getY() - this.nPf.neH) > 10.0F))
        this.nPf.bKp();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.b.1
 * JD-Core Version:    0.6.2
 */