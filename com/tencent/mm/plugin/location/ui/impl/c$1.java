package com.tencent.mm.plugin.location.ui.impl;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMLoadMoreListView;

final class c$1
  implements View.OnTouchListener
{
  private float nPY;
  private short nPZ = (short)0;

  c$1(c paramc)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(113594);
    if (!c.a(this.nQa))
    {
      AppMethodBeat.o(113594);
      return bool;
    }
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(113594);
      bool = false;
      break;
      ab.d("MicroMsg.MMPoiMapUI", "newpoi action down %s", new Object[] { Float.valueOf(paramMotionEvent.getRawY()) });
      this.nPY = paramMotionEvent.getRawY();
      c.a(this.nQa, false);
      continue;
      ab.d("MicroMsg.MMPoiMapUI", "newpoi action move %s", new Object[] { Float.valueOf(paramMotionEvent.getRawY()) });
      if (c.b(this.nQa))
      {
        ab.d("MicroMsg.MMPoiMapUI", "newpoi blocked");
        c.c(this.nQa).setSelection(0);
      }
      float f = this.nPY - paramMotionEvent.getRawY();
      if (Math.abs(f) < BackwardSupportUtil.b.b(this.nQa.activity, 20.0F))
        this.nPZ = ((short)0);
      while (true)
      {
        if (((this.nQa.bKr() > c.d(this.nQa)) || (this.nPZ != 1)) && ((c.c(this.nQa).getScroll2Top()) || (this.nPZ != -1) || (this.nQa.bKr() >= c.e(this.nQa))) && ((this.nPZ != -1) || (this.nQa.bKr() < c.e(this.nQa))))
          break label318;
        AppMethodBeat.o(113594);
        bool = false;
        break;
        if (f > 0.0F)
          this.nPZ = ((short)1);
        else
          this.nPZ = ((short)-1);
      }
      label318: if ((c.a(this.nQa)) && (this.nPZ != 0))
      {
        ab.d("MicroMsg.MMPoiMapUI", "newpoi start play isUP %s", new Object[] { Short.valueOf(this.nPZ) });
        if (this.nPZ == 1)
        {
          c.b(this.nQa, true);
          AppMethodBeat.o(113594);
          bool = false;
          break;
        }
        c.b(this.nQa, false);
        AppMethodBeat.o(113594);
        bool = false;
        break;
      }
      AppMethodBeat.o(113594);
      break;
      ab.d("MicroMsg.MMPoiMapUI", "newpoi action up ");
      c.a(this.nQa, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c.1
 * JD-Core Version:    0.6.2
 */