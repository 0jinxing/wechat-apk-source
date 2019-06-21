package com.tencent.mm.ui.base;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.OverScroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMViewPager$d extends GestureDetector.SimpleOnGestureListener
{
  private MMViewPager$d(MMViewPager paramMMViewPager)
  {
  }

  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(106903);
    if (MMViewPager.a(this.yyC) == null)
    {
      AppMethodBeat.o(106903);
      return bool;
    }
    if (MMViewPager.a(this.yyC).getScale() <= MMViewPager.a(this.yyC).getScaleRate())
      MMViewPager.a(this.yyC).ai(f.c(paramMotionEvent, 0), f.d(paramMotionEvent, 0));
    while (true)
    {
      bool = true;
      AppMethodBeat.o(106903);
      break;
      MMViewPager.a(this.yyC).ah(f.c(paramMotionEvent, 0), f.d(paramMotionEvent, 0));
    }
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106901);
    if (MMViewPager.r(this.yyC) != null)
      MMViewPager.r(this.yyC).forceFinished(true);
    boolean bool = super.onDown(paramMotionEvent);
    AppMethodBeat.o(106901);
    return bool;
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(106904);
    ab.d("MicroMsg.MMViewPager", "onFling");
    Object localObject1 = this.yyC.getSelectedImageView();
    Object localObject2;
    float f1;
    float f2;
    float f3;
    float f4;
    float f5;
    if (localObject1 != null)
    {
      ab.d("MicroMsg.MMViewPager", "onFling MultiTouchImageView");
      if ((localObject1 instanceof MultiTouchImageView))
      {
        localObject2 = (MultiTouchImageView)localObject1;
        f1 = ((g)localObject2).getScale() * ((g)localObject2).getImageWidth();
        f2 = ((g)localObject2).getScale() * ((g)localObject2).getImageHeight();
        if ((!((g)localObject2).dzy()) && (!((g)localObject2).dzz()) && ((int)f1 <= MMViewPager.b(this.yyC)) && ((int)f2 <= MMViewPager.d(this.yyC)))
          break label635;
        localObject1 = new float[9];
        ((g)localObject2).getImageMatrix().getValues((float[])localObject1);
        f3 = localObject1[2];
        f4 = f3 + f1;
        f5 = localObject1[5];
        ab.d("MicroMsg.MMViewPager", "left: %f,right: %f isGestureRight=> %B, vX: %s, vY: %s", new Object[] { Float.valueOf(f3), Float.valueOf(f4), Boolean.valueOf(MMViewPager.c(paramMotionEvent1, paramMotionEvent2)), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
        if ((Math.round(f3) < MMViewPager.t(this.yyC).left) && (Math.round(f4) > MMViewPager.t(this.yyC).right))
          break label676;
      }
    }
    label411: label676: for (float f6 = 0.0F; ; f6 = paramFloat1)
    {
      if ((Math.round(f5) >= MMViewPager.t(this.yyC).top) || (Math.round(f5 + f2) <= MMViewPager.t(this.yyC).bottom))
        paramFloat2 = 0.0F;
      int i = (int)(MMViewPager.t(this.yyC).right - f1);
      int j = (int)(f1 + MMViewPager.t(this.yyC).right);
      int k = (int)(MMViewPager.t(this.yyC).bottom - f2);
      int m = (int)(MMViewPager.t(this.yyC).bottom + f2);
      label449: boolean bool;
      if (f6 >= 0.0F)
      {
        f1 = f6;
        if (Math.abs(f6) >= MMViewPager.u(this.yyC))
          f1 = MMViewPager.u(this.yyC);
        if (paramFloat2 < 0.0F)
          break label600;
        f6 = paramFloat2;
        if (Math.abs(paramFloat2) >= MMViewPager.u(this.yyC))
          f6 = MMViewPager.u(this.yyC);
        MMViewPager.r(this.yyC).fling(MMViewPager.r(this.yyC).getCurrX(), MMViewPager.r(this.yyC).getCurrY(), (int)f1, (int)f6, i, j, k, m, 0, 0);
        if (((MMViewPager.c(paramMotionEvent1, paramMotionEvent2)) && (f3 >= 0.0F)) || ((!MMViewPager.c(paramMotionEvent1, paramMotionEvent2)) && (f4 <= MMViewPager.b(this.yyC))))
          break label635;
        bool = false;
        AppMethodBeat.o(106904);
      }
      while (true)
      {
        return bool;
        localObject2 = localObject1;
        if (!(localObject1 instanceof WxImageView))
          break;
        localObject2 = (WxImageView)localObject1;
        break;
        f1 = f6;
        if (Math.abs(f6) >= MMViewPager.u(this.yyC))
          f1 = -MMViewPager.u(this.yyC);
        break label411;
        label600: f6 = paramFloat2;
        if (Math.abs(paramFloat2) < MMViewPager.u(this.yyC))
          break label449;
        f6 = -MMViewPager.u(this.yyC);
        break label449;
        label635: if (MMViewPager.m(this.yyC))
        {
          bool = false;
          AppMethodBeat.o(106904);
        }
        else
        {
          bool = MMViewPager.a(this.yyC, paramMotionEvent1, paramMotionEvent2, paramFloat1);
          AppMethodBeat.o(106904);
        }
      }
    }
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106902);
    MMViewPager.s(this.yyC);
    if (MMViewPager.p(this.yyC) != null)
      MMViewPager.p(this.yyC).bvE();
    AppMethodBeat.o(106902);
  }

  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106900);
    if (MMViewPager.q(this.yyC) != null)
      MMViewPager.q(this.yyC).bcX();
    AppMethodBeat.o(106900);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.d
 * JD-Core Version:    0.6.2
 */