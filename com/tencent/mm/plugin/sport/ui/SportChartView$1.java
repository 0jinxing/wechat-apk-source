package com.tencent.mm.plugin.sport.ui;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SportChartView$1 extends GestureDetector.SimpleOnGestureListener
{
  private long rQi;

  SportChartView$1(SportChartView paramSportChartView)
  {
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    boolean bool = true;
    AppMethodBeat.i(65422);
    ab.i("MicroMsg.Sport.SportChartView", "onScroll %.2f", new Object[] { Float.valueOf(paramFloat1) });
    if ((System.currentTimeMillis() - this.rQi < 500L) || (!SportChartView.d(this.rQj)))
    {
      AppMethodBeat.o(65422);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.rQi = System.currentTimeMillis();
      if (paramFloat1 > 0.0F)
      {
        SportChartView.e(this.rQj);
        if (SportChartView.f(this.rQj) > SportChartView.g(this.rQj))
          SportChartView.b(this.rQj, SportChartView.g(this.rQj));
        SportChartView.h(this.rQj);
        this.rQj.invalidate();
        AppMethodBeat.o(65422);
      }
      else if (paramFloat1 < 0.0F)
      {
        SportChartView.i(this.rQj);
        if (SportChartView.f(this.rQj) <= 0)
          SportChartView.b(this.rQj, 1);
        SportChartView.h(this.rQj);
        this.rQj.invalidate();
        AppMethodBeat.o(65422);
      }
      else
      {
        AppMethodBeat.o(65422);
        bool = false;
      }
    }
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(65421);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    SportChartView.a(this.rQj, SportChartView.a(this.rQj, f1));
    SportChartView.a(this.rQj);
    SportChartView.b(this.rQj);
    ab.i("MicroMsg.Sport.SportChartView", "onSingleTapUp %s %s %d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(SportChartView.c(this.rQj)) });
    this.rQj.invalidate();
    AppMethodBeat.o(65421);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.ui.SportChartView.1
 * JD-Core Version:    0.6.2
 */