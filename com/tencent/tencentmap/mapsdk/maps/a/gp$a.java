package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

class gp$a extends GestureDetector.SimpleOnGestureListener
{
  private PointF b;
  private boolean c;

  private gp$a(gp paramgp)
  {
    AppMethodBeat.i(99408);
    this.b = new PointF();
    this.c = true;
    AppMethodBeat.o(99408);
  }

  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(99413);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(99413);
      return true;
      this.c = true;
      gp.d(this.a).setIsLongpressEnabled(false);
      this.b.set(paramMotionEvent.getX(), paramMotionEvent.getY());
      gp.a(this.a).f(f1, f2);
      continue;
      if (this.c)
      {
        if (!gp.a(this.a, f1, f2))
          break label170;
        gp.a(this.a).a(f1, f2);
      }
      while (true)
      {
        this.b.set(0.0F, 0.0F);
        gp.d(this.a).setIsLongpressEnabled(true);
        gp.a(this.a).h(f1, f2);
        break;
        label170: gp.a(this.a).a(f1, f2);
      }
      float f3 = this.b.x;
      float f4 = this.b.y;
      if ((Math.abs(f1 - f3) > 10.0F) || (Math.abs(f2 - f4) > 10.0F))
      {
        this.c = false;
        gp.a(this.a).g(f1, f2);
      }
      gp.d(this.a).setIsLongpressEnabled(true);
    }
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99410);
    gp.a(this.a).c(paramFloat1, paramFloat2);
    AppMethodBeat.o(99410);
    return true;
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(99412);
    if (!gp.c(this.a))
      gp.a(this.a).e(paramMotionEvent.getX(), paramMotionEvent.getY());
    AppMethodBeat.o(99412);
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99411);
    if ((gp.b(this.a) != null) && (gp.b(this.a).get() != null) && (((gd)gp.b(this.a).get()).m()))
    {
      double d = Math.sqrt(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
      if (((paramMotionEvent1 != null) && ((paramMotionEvent1.getX() < 0.0F) || (paramMotionEvent1.getY() < 0.0F))) || ((paramMotionEvent2 != null) && ((paramMotionEvent2.getX() < 0.0F) || (paramMotionEvent2.getY() < 0.0F))) || (d > 50.0D))
        AppMethodBeat.o(99411);
    }
    while (true)
    {
      return true;
      gp.a(this.a).d(-paramFloat1, -paramFloat2);
      AppMethodBeat.o(99411);
    }
  }

  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(99409);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    gp.a(this.a).b(f1, f2);
    AppMethodBeat.o(99409);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gp.a
 * JD-Core Version:    0.6.2
 */