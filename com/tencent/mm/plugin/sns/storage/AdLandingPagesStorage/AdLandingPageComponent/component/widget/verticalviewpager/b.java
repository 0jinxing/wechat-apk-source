package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.os.SystemClock;
import android.support.v4.view.s;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
  implements View.OnTouchListener
{
  private float hkf = 1.4E-45F;
  private DummyViewPager rcV;
  private float rcW = 1.4E-45F;

  public b(DummyViewPager paramDummyViewPager)
  {
    this.rcV = paramDummyViewPager;
  }

  private static boolean Z(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(37598);
    boolean bool;
    if (Math.abs(paramFloat1 + paramFloat2) < Math.abs(paramFloat1 - paramFloat2))
    {
      bool = true;
      AppMethodBeat.o(37598);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37598);
    }
  }

  private boolean a(View paramView, MotionEvent paramMotionEvent, float paramFloat)
  {
    AppMethodBeat.i(37596);
    if (this.rcV.mFakeDragging)
      if (!Z((int)(this.rcV.getScrollX() - paramFloat) - this.rcV.getBaseScrollX(), this.rcV.getScrollX() - this.rcV.getBaseScrollX()))
        break label150;
    label150: for (float f = this.rcV.getScrollX() - this.rcV.getBaseScrollX(); ; f = paramFloat)
    {
      this.rcV.fakeDragBy(f);
      new StringBuilder("fake drag, diff ").append(paramFloat).append(",step ").append(f).append(",scrollX ").append(this.rcV.getScrollX());
      c(paramView, paramMotionEvent);
      boolean bool = true;
      AppMethodBeat.o(37596);
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(37596);
      }
    }
  }

  private static void c(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(37597);
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(0);
    paramView.dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(37597);
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(37595);
    new StringBuilder("onTouchEvent , action ").append(paramMotionEvent.getAction()).append(", e.rawY ").append(paramMotionEvent.getRawY()).append(",lastMotionY ").append(this.rcW).append(",downY ").append(this.hkf);
    label107: int i;
    label270: label326: Object localObject1;
    Object localObject2;
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
      while (true)
      {
        bool = paramView.onTouchEvent(paramMotionEvent);
        AppMethodBeat.o(37595);
        return bool;
        this.hkf = paramMotionEvent.getRawY();
        continue;
        if ((this.hkf != 1.4E-45F) || (this.rcW != 1.4E-45F))
          break;
        this.hkf = paramMotionEvent.getRawY();
      }
      float f1 = paramMotionEvent.getRawY();
      if (this.rcW == 1.4E-45F);
      for (float f2 = this.hkf; ; f2 = this.rcW)
      {
        this.rcW = paramMotionEvent.getRawY();
        f2 = (f1 - f2) / 2.0F;
        new StringBuilder("scrollX ").append(this.rcV.getScrollX()).append(",basescrollX ").append(this.rcV.getBaseScrollX());
        if (this.rcV.getScrollX() == this.rcV.getBaseScrollX())
          break label270;
        if (!a(paramView, paramMotionEvent, f2))
          break;
        AppMethodBeat.o(37595);
        break label107;
      }
      if (-f2 > 0.0F);
      for (i = 1; ; i = -1)
      {
        if (!s.n(paramView, i))
          break label326;
        new StringBuilder("scroll vertically  ").append(f2).append(", move.lastMotionY ").append(paramMotionEvent.getY());
        break;
      }
      localObject1 = this.rcV;
      if (!((AdLandingViewPager)localObject1).mIsBeingDragged)
      {
        ((AdLandingViewPager)localObject1).mFakeDragging = true;
        ((AdLandingViewPager)localObject1).setScrollState(1);
        ((AdLandingViewPager)localObject1).mLastMotionX = 0.0F;
        ((AdLandingViewPager)localObject1).mInitialMotionX = 0.0F;
        if (((AdLandingViewPager)localObject1).mVelocityTracker != null)
          break label442;
        ((AdLandingViewPager)localObject1).mVelocityTracker = VelocityTracker.obtain();
      }
      while (true)
      {
        long l = SystemClock.uptimeMillis();
        localObject2 = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
        ((AdLandingViewPager)localObject1).mVelocityTracker.addMovement((MotionEvent)localObject2);
        ((MotionEvent)localObject2).recycle();
        ((AdLandingViewPager)localObject1).mFakeDragBeginTime = l;
        a(paramView, paramMotionEvent, f2);
        c(paramView, paramMotionEvent);
        AppMethodBeat.o(37595);
        break;
        label442: ((AdLandingViewPager)localObject1).mVelocityTracker.clear();
      }
    case 1:
    case 3:
    }
    if (this.rcV.mFakeDragging)
      try
      {
        localObject1 = this.rcV;
        if (!((AdLandingViewPager)localObject1).mFakeDragging)
        {
          localObject1 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject1).<init>("No fake drag in progress. Call beginFakeDrag first.");
          AppMethodBeat.o(37595);
          throw ((Throwable)localObject1);
        }
      }
      catch (Exception localException)
      {
      }
    while (true)
    {
      this.hkf = 1.4E-45F;
      this.rcW = 1.4E-45F;
      break;
      localObject2 = localException.mVelocityTracker;
      ((VelocityTracker)localObject2).computeCurrentVelocity(1000, localException.mMaximumVelocity);
      int j = (int)((VelocityTracker)localObject2).getXVelocity(localException.mActivePointerId);
      localException.mPopulatePending = true;
      int k = localException.getClientWidth();
      i = localException.getScrollX();
      localObject2 = localException.cpZ();
      localException.setCurrentItemInternal(localException.determineTargetPage(((AdLandingViewPager.b)localObject2).position, (i / k - ((AdLandingViewPager.b)localObject2).offset) / ((AdLandingViewPager.b)localObject2).widthFactor, j, (int)(localException.mLastMotionX - localException.mInitialMotionX)), true, true, j);
      localException.endDrag();
      localException.mFakeDragging = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.b
 * JD-Core Version:    0.6.2
 */