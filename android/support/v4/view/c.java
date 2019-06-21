package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class c
{
  private final c.a LI;

  public c(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener)
  {
    this(paramContext, paramOnGestureListener, (byte)0);
  }

  private c(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, byte paramByte)
  {
    if (Build.VERSION.SDK_INT > 17);
    for (this.LI = new c.c(paramContext, paramOnGestureListener); ; this.LI = new b(paramContext, paramOnGestureListener))
      return;
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.LI.onTouchEvent(paramMotionEvent);
  }

  static final class b
    implements c.a
  {
    private static final int LN = ViewConfiguration.getLongPressTimeout();
    private static final int LO = ViewConfiguration.getTapTimeout();
    private static final int LP = ViewConfiguration.getDoubleTapTimeout();
    private int LJ;
    private int LK;
    private int LL;
    private int LM;
    final GestureDetector.OnGestureListener LQ;
    GestureDetector.OnDoubleTapListener LR;
    boolean LS;
    boolean LU;
    boolean LV;
    private boolean LW;
    private boolean LX;
    MotionEvent LY;
    private MotionEvent LZ;
    private boolean Ma;
    private float Mb;
    private float Mc;
    private float Md;
    private float Me;
    private boolean Mf;
    final Handler mHandler = new c.b.a(this);
    private VelocityTracker mVelocityTracker;

    b(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener)
    {
      this.LQ = paramOnGestureListener;
      if ((paramOnGestureListener instanceof GestureDetector.OnDoubleTapListener))
        this.LR = ((GestureDetector.OnDoubleTapListener)paramOnGestureListener);
      if (paramContext == null)
        throw new IllegalArgumentException("Context must not be null");
      if (this.LQ == null)
        throw new IllegalArgumentException("OnGestureListener must not be null");
      this.Mf = true;
      paramContext = ViewConfiguration.get(paramContext);
      int i = paramContext.getScaledTouchSlop();
      int j = paramContext.getScaledDoubleTapSlop();
      this.LL = paramContext.getScaledMinimumFlingVelocity();
      this.LM = paramContext.getScaledMaximumFlingVelocity();
      this.LJ = (i * i);
      this.LK = (j * j);
    }

    public final boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      boolean bool1 = false;
      int i = paramMotionEvent.getAction();
      if (this.mVelocityTracker == null)
        this.mVelocityTracker = VelocityTracker.obtain();
      this.mVelocityTracker.addMovement(paramMotionEvent);
      int j;
      if ((i & 0xFF) == 6)
      {
        j = 1;
        if (j == 0)
          break label132;
      }
      int n;
      int i1;
      float f1;
      float f2;
      float f3;
      float f4;
      label132: for (int m = paramMotionEvent.getActionIndex(); ; m = -1)
      {
        n = paramMotionEvent.getPointerCount();
        i1 = 0;
        f1 = 0.0F;
        for (f2 = 0.0F; i1 < n; f2 = f4)
        {
          f3 = f1;
          f4 = f2;
          if (m != i1)
          {
            f4 = f2 + paramMotionEvent.getX(i1);
            f3 = f1 + paramMotionEvent.getY(i1);
          }
          i1++;
          f1 = f3;
        }
        j = 0;
        break;
      }
      boolean bool3;
      if (j != 0)
      {
        j = n - 1;
        f4 = f2 / j;
        f2 = f1 / j;
        bool3 = bool1;
      }
      switch (i & 0xFF)
      {
      default:
        bool3 = bool1;
      case 4:
      case 5:
      case 6:
      case 0:
      case 2:
        while (true)
        {
          return bool3;
          j = n;
          break;
          this.Mb = f4;
          this.Md = f4;
          this.Mc = f2;
          this.Me = f2;
          this.mHandler.removeMessages(1);
          this.mHandler.removeMessages(2);
          this.mHandler.removeMessages(3);
          this.Ma = false;
          this.LW = false;
          this.LX = false;
          this.LU = false;
          bool3 = bool1;
          if (this.LV)
          {
            this.LV = false;
            bool3 = bool1;
            continue;
            this.Mb = f4;
            this.Md = f4;
            this.Mc = f2;
            this.Me = f2;
            this.mVelocityTracker.computeCurrentVelocity(1000, this.LM);
            m = paramMotionEvent.getActionIndex();
            j = paramMotionEvent.getPointerId(m);
            f4 = this.mVelocityTracker.getXVelocity(j);
            f2 = this.mVelocityTracker.getYVelocity(j);
            for (j = 0; ; j++)
            {
              bool3 = bool1;
              if (j >= n)
                break;
              MotionEvent localMotionEvent;
              Object localObject;
              boolean bool2;
              int k;
              if (j != m)
              {
                i1 = paramMotionEvent.getPointerId(j);
                f1 = this.mVelocityTracker.getXVelocity(i1);
                if (this.mVelocityTracker.getYVelocity(i1) * f2 + f1 * f4 < 0.0F)
                {
                  this.mVelocityTracker.clear();
                  bool3 = bool1;
                  break;
                }
              }
            }
            if (this.LR != null)
            {
              bool3 = this.mHandler.hasMessages(3);
              if (bool3)
                this.mHandler.removeMessages(3);
              if ((this.LY != null) && (this.LZ != null) && (bool3))
              {
                localMotionEvent = this.LY;
                localObject = this.LZ;
                if ((this.LX) && (paramMotionEvent.getEventTime() - ((MotionEvent)localObject).getEventTime() <= LP))
                {
                  j = (int)localMotionEvent.getX() - (int)paramMotionEvent.getX();
                  m = (int)localMotionEvent.getY() - (int)paramMotionEvent.getY();
                  if (m * m + j * j < this.LK)
                  {
                    j = 1;
                    label609: if (j == 0)
                      break label804;
                    this.Ma = true;
                  }
                }
              }
            }
            for (bool2 = this.LR.onDoubleTap(this.LY) | false | this.LR.onDoubleTapEvent(paramMotionEvent); ; bool2 = false)
            {
              this.Mb = f4;
              this.Md = f4;
              this.Mc = f2;
              this.Me = f2;
              if (this.LY != null)
                this.LY.recycle();
              this.LY = MotionEvent.obtain(paramMotionEvent);
              this.LW = true;
              this.LX = true;
              this.LS = true;
              this.LV = false;
              this.LU = false;
              if (this.Mf)
              {
                this.mHandler.removeMessages(2);
                this.mHandler.sendEmptyMessageAtTime(2, this.LY.getDownTime() + LO + LN);
              }
              this.mHandler.sendEmptyMessageAtTime(1, this.LY.getDownTime() + LO);
              bool3 = bool2 | this.LQ.onDown(paramMotionEvent);
              break;
              bool2 = false;
              break label609;
              label804: this.mHandler.sendEmptyMessageDelayed(3, LP);
            }
            bool3 = bool1;
            if (!this.LV)
            {
              f1 = this.Mb - f4;
              f3 = this.Mc - f2;
              if (!this.Ma)
                break label875;
              bool3 = this.LR.onDoubleTapEvent(paramMotionEvent) | false;
            }
          }
        }
        label875: if (this.LW)
        {
          k = (int)(f4 - this.Md);
          m = (int)(f2 - this.Me);
          k = k * k + m * m;
          if (k <= this.LJ)
            break label1424;
          bool3 = this.LQ.onScroll(this.LY, paramMotionEvent, f1, f3);
          this.Mb = f4;
          this.Mc = f2;
          this.LW = false;
          this.mHandler.removeMessages(3);
          this.mHandler.removeMessages(1);
          this.mHandler.removeMessages(2);
        }
        break;
      case 1:
      case 3:
      }
      while (true)
      {
        if (k > this.LJ)
          this.LX = false;
        break;
        if (Math.abs(f1) < 1.0F)
        {
          bool3 = bool1;
          if (Math.abs(f3) < 1.0F)
            break;
        }
        bool3 = this.LQ.onScroll(this.LY, paramMotionEvent, f1, f3);
        this.Mb = f4;
        this.Mc = f2;
        break;
        this.LS = false;
        localMotionEvent = MotionEvent.obtain(paramMotionEvent);
        if (this.Ma)
          bool3 = this.LR.onDoubleTapEvent(paramMotionEvent) | false;
        while (true)
        {
          if (this.LZ != null)
            this.LZ.recycle();
          this.LZ = localMotionEvent;
          if (this.mVelocityTracker != null)
          {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
          }
          this.Ma = false;
          this.LU = false;
          this.mHandler.removeMessages(1);
          this.mHandler.removeMessages(2);
          break;
          if (this.LV)
          {
            this.mHandler.removeMessages(3);
            this.LV = false;
            bool3 = false;
          }
          else if (this.LW)
          {
            bool1 = this.LQ.onSingleTapUp(paramMotionEvent);
            bool3 = bool1;
            if (this.LU)
            {
              bool3 = bool1;
              if (this.LR != null)
              {
                this.LR.onSingleTapConfirmed(paramMotionEvent);
                bool3 = bool1;
              }
            }
          }
          else
          {
            localObject = this.mVelocityTracker;
            k = paramMotionEvent.getPointerId(0);
            ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.LM);
            f1 = ((VelocityTracker)localObject).getYVelocity(k);
            f4 = ((VelocityTracker)localObject).getXVelocity(k);
            if ((Math.abs(f1) > this.LL) || (Math.abs(f4) > this.LL))
            {
              bool3 = this.LQ.onFling(this.LY, paramMotionEvent, f4, f1);
              continue;
              this.mHandler.removeMessages(1);
              this.mHandler.removeMessages(2);
              this.mHandler.removeMessages(3);
              this.mVelocityTracker.recycle();
              this.mVelocityTracker = null;
              this.Ma = false;
              this.LS = false;
              this.LW = false;
              this.LX = false;
              this.LU = false;
              bool3 = bool1;
              if (!this.LV)
                break;
              this.LV = false;
              bool3 = bool1;
              break;
            }
            bool3 = false;
          }
        }
        label1424: bool3 = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.view.c
 * JD-Core Version:    0.6.2
 */