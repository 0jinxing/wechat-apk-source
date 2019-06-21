package android.support.design.widget;

import android.content.Context;
import android.support.v4.c.a;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V>
{
  private int mActivePointerId = -1;
  private boolean mIsBeingDragged;
  private int mTouchSlop = -1;
  private VelocityTracker mVelocityTracker;
  private Runnable qM;
  OverScroller qN;
  private int qO;

  public HeaderBehavior()
  {
  }

  public HeaderBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void cn()
  {
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
  }

  int a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = bB();
    int j = 0;
    int k = j;
    if (paramInt2 != 0)
    {
      k = j;
      if (i >= paramInt2)
      {
        k = j;
        if (i <= paramInt3)
        {
          paramInt1 = a.clamp(paramInt1, paramInt2, paramInt3);
          k = j;
          if (i != paramInt1)
          {
            G(paramInt1);
            k = i - paramInt1;
          }
        }
      }
    }
    return k;
  }

  void a(CoordinatorLayout paramCoordinatorLayout, V paramV)
  {
  }

  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    if (this.mTouchSlop < 0)
      this.mTouchSlop = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop();
    if ((paramMotionEvent.getAction() == 2) && (this.mIsBeingDragged))
      return bool;
    switch (paramMotionEvent.getActionMasked())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      if (this.mVelocityTracker != null)
        this.mVelocityTracker.addMovement(paramMotionEvent);
      bool = this.mIsBeingDragged;
      break;
      this.mIsBeingDragged = false;
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      if ((bA()) && (paramCoordinatorLayout.d(paramV, i, j)))
      {
        this.qO = j;
        this.mActivePointerId = paramMotionEvent.getPointerId(0);
        cn();
        continue;
        i = this.mActivePointerId;
        if (i != -1)
        {
          i = paramMotionEvent.findPointerIndex(i);
          if (i != -1)
          {
            i = (int)paramMotionEvent.getY(i);
            if (Math.abs(i - this.qO) > this.mTouchSlop)
            {
              this.mIsBeingDragged = true;
              this.qO = i;
              continue;
              this.mIsBeingDragged = false;
              this.mActivePointerId = -1;
              if (this.mVelocityTracker != null)
              {
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
              }
            }
          }
        }
      }
    }
  }

  final int b(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramCoordinatorLayout, paramV, bz() - paramInt1, paramInt2, paramInt3);
  }

  public final boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (this.mTouchSlop < 0)
      this.mTouchSlop = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop();
    boolean bool;
    int j;
    switch (paramMotionEvent.getActionMasked())
    {
    default:
      if (this.mVelocityTracker != null)
        this.mVelocityTracker.addMovement(paramMotionEvent);
      bool = true;
    case 0:
    case 2:
      while (true)
      {
        return bool;
        i = (int)paramMotionEvent.getX();
        j = (int)paramMotionEvent.getY();
        if ((paramCoordinatorLayout.d(paramV, i, j)) && (bA()))
        {
          this.qO = j;
          this.mActivePointerId = paramMotionEvent.getPointerId(0);
          cn();
          break;
        }
        bool = false;
        continue;
        j = paramMotionEvent.findPointerIndex(this.mActivePointerId);
        if (j != -1)
          break label160;
        bool = false;
      }
      int k = (int)paramMotionEvent.getY(j);
      int i = this.qO - k;
      j = i;
      if (!this.mIsBeingDragged)
      {
        j = i;
        if (Math.abs(i) > this.mTouchSlop)
        {
          this.mIsBeingDragged = true;
          if (i <= 0)
            break label255;
        }
      }
      for (j = i - this.mTouchSlop; this.mIsBeingDragged; j = i + this.mTouchSlop)
      {
        this.qO = k;
        b(paramCoordinatorLayout, paramV, j, d(paramV), 0);
        break;
      }
    case 1:
      label160: label255: if (this.mVelocityTracker != null)
      {
        this.mVelocityTracker.addMovement(paramMotionEvent);
        this.mVelocityTracker.computeCurrentVelocity(1000);
        float f = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
        j = -c(paramV);
        if (this.qM != null)
        {
          paramV.removeCallbacks(this.qM);
          this.qM = null;
        }
        if (this.qN == null)
          this.qN = new OverScroller(paramV.getContext());
        this.qN.fling(0, bB(), 0, Math.round(f), 0, 0, j, 0);
        if (!this.qN.computeScrollOffset())
          break label443;
        this.qM = new HeaderBehavior.a(this, paramCoordinatorLayout, paramV);
        s.b(paramV, this.qM);
      }
      break;
    case 3:
    }
    while (true)
    {
      this.mIsBeingDragged = false;
      this.mActivePointerId = -1;
      if (this.mVelocityTracker == null)
        break;
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
      break;
      label443: a(paramCoordinatorLayout, paramV);
    }
  }

  boolean bA()
  {
    return false;
  }

  int bz()
  {
    return bB();
  }

  final int c(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    return a(paramCoordinatorLayout, paramV, paramInt, -2147483648, 2147483647);
  }

  int c(V paramV)
  {
    return paramV.getHeight();
  }

  int d(V paramV)
  {
    return -paramV.getHeight();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.design.widget.HeaderBehavior
 * JD-Core Version:    0.6.2
 */