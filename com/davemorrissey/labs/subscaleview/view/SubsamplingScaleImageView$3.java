package com.davemorrissey.labs.subscaleview.view;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class SubsamplingScaleImageView$3 extends GestureDetector.SimpleOnGestureListener
{
  SubsamplingScaleImageView$3(SubsamplingScaleImageView paramSubsamplingScaleImageView, Context paramContext)
  {
  }

  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(115643);
    if ((SubsamplingScaleImageView.k(this.aKO)) && (SubsamplingScaleImageView.f(this.aKO)) && (SubsamplingScaleImageView.g(this.aKO) != null))
    {
      SubsamplingScaleImageView.a(this.aKO, this.val$context);
      ab.i(SubsamplingScaleImageView.l(this.aKO), "alvinluo onDoubleTap, quickScaledEnabled: %b", new Object[] { Boolean.valueOf(SubsamplingScaleImageView.m(this.aKO)) });
      if (SubsamplingScaleImageView.m(this.aKO))
      {
        SubsamplingScaleImageView.a(this.aKO, new PointF(paramMotionEvent.getX(), paramMotionEvent.getY()));
        SubsamplingScaleImageView.b(this.aKO, new PointF(SubsamplingScaleImageView.g(this.aKO).x, SubsamplingScaleImageView.g(this.aKO).y));
        SubsamplingScaleImageView.a(this.aKO, SubsamplingScaleImageView.i(this.aKO));
        SubsamplingScaleImageView.n(this.aKO);
        SubsamplingScaleImageView.o(this.aKO);
        SubsamplingScaleImageView.p(this.aKO);
        SubsamplingScaleImageView.c(this.aKO, this.aKO.b(SubsamplingScaleImageView.q(this.aKO)));
        SubsamplingScaleImageView.d(this.aKO, new PointF(paramMotionEvent.getX(), paramMotionEvent.getY()));
        SubsamplingScaleImageView.e(this.aKO, new PointF(SubsamplingScaleImageView.r(this.aKO).x, SubsamplingScaleImageView.r(this.aKO).y));
        SubsamplingScaleImageView.s(this.aKO);
        AppMethodBeat.o(115643);
      }
    }
    while (true)
    {
      return bool;
      SubsamplingScaleImageView.a(this.aKO, this.aKO.b(new PointF(paramMotionEvent.getX(), paramMotionEvent.getY())), new PointF(paramMotionEvent.getX(), paramMotionEvent.getY()));
      AppMethodBeat.o(115643);
      bool = true;
      continue;
      bool = super.onDoubleTapEvent(paramMotionEvent);
      AppMethodBeat.o(115643);
    }
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    boolean bool = true;
    AppMethodBeat.i(115641);
    if ((SubsamplingScaleImageView.e(this.aKO)) && (SubsamplingScaleImageView.f(this.aKO)) && (SubsamplingScaleImageView.g(this.aKO) != null) && (paramMotionEvent1 != null) && (paramMotionEvent2 != null) && ((Math.abs(paramMotionEvent1.getX() - paramMotionEvent2.getX()) > 50.0F) || (Math.abs(paramMotionEvent1.getY() - paramMotionEvent2.getY()) > 50.0F)) && ((Math.abs(paramFloat1) > 500.0F) || (Math.abs(paramFloat2) > 500.0F)) && (!SubsamplingScaleImageView.h(this.aKO)))
    {
      paramMotionEvent1 = new PointF(SubsamplingScaleImageView.g(this.aKO).x + paramFloat1 * 0.25F, SubsamplingScaleImageView.g(this.aKO).y + 0.25F * paramFloat2);
      paramFloat1 = (this.aKO.getWidth() / 2 - paramMotionEvent1.x) / SubsamplingScaleImageView.i(this.aKO);
      paramFloat2 = (this.aKO.getHeight() / 2 - paramMotionEvent1.y) / SubsamplingScaleImageView.i(this.aKO);
      paramMotionEvent1 = new SubsamplingScaleImageView.b(this.aKO, new PointF(paramFloat1, paramFloat2), (byte)0);
      if (!SubsamplingScaleImageView.oK().contains(Integer.valueOf(1)))
      {
        paramMotionEvent1 = new IllegalArgumentException("Unknown easing type: 1");
        AppMethodBeat.o(115641);
        throw paramMotionEvent1;
      }
      paramMotionEvent1.aLb = 1;
      paramMotionEvent1.aLh = false;
      paramMotionEvent1.aLc = 3;
      paramMotionEvent1.start();
      AppMethodBeat.o(115641);
    }
    while (true)
    {
      return bool;
      bool = super.onFling(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
      AppMethodBeat.o(115641);
    }
  }

  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(115642);
    boolean bool;
    if (SubsamplingScaleImageView.j(this.aKO) != null)
    {
      bool = SubsamplingScaleImageView.j(this.aKO).onSingleTapConfirmed(paramMotionEvent);
      if (bool)
        AppMethodBeat.o(115642);
    }
    while (true)
    {
      return bool;
      this.aKO.performClick();
      bool = true;
      AppMethodBeat.o(115642);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.3
 * JD-Core Version:    0.6.2
 */