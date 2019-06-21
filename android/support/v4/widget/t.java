package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.s;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public final class t
{
  private static final Interpolator sInterpolator = new Interpolator()
  {
    public final float getInterpolation(float paramAnonymousFloat)
    {
      paramAnonymousFloat -= 1.0F;
      return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
    }
  };
  int SG;
  float[] SH;
  float[] SI;
  float[] SJ;
  float[] SK;
  private int[] SL;
  private int[] SM;
  private int[] SN;
  private int SO;
  private float SP;
  float SQ;
  int SR;
  int SS;
  private final a ST;
  View SU;
  private boolean SV;
  private final ViewGroup SW;
  private final Runnable SX = new Runnable()
  {
    public final void run()
    {
      t.this.ba(0);
    }
  };
  private int mActivePointerId = -1;
  public int mTouchSlop;
  private VelocityTracker mVelocityTracker;
  private OverScroller qN;

  private t(Context paramContext, ViewGroup paramViewGroup, a parama)
  {
    if (paramViewGroup == null)
      throw new IllegalArgumentException("Parent view may not be null");
    if (parama == null)
      throw new IllegalArgumentException("Callback may not be null");
    this.SW = paramViewGroup;
    this.ST = parama;
    paramViewGroup = ViewConfiguration.get(paramContext);
    this.SR = ((int)(paramContext.getResources().getDisplayMetrics().density * 20.0F + 0.5F));
    this.mTouchSlop = paramViewGroup.getScaledTouchSlop();
    this.SP = paramViewGroup.getScaledMaximumFlingVelocity();
    this.SQ = paramViewGroup.getScaledMinimumFlingVelocity();
    this.qN = new OverScroller(paramContext, sInterpolator);
  }

  private boolean E(int paramInt1, int paramInt2)
  {
    return i(this.SU, paramInt1, paramInt2);
  }

  public static t a(ViewGroup paramViewGroup, float paramFloat, a parama)
  {
    paramViewGroup = a(paramViewGroup, parama);
    paramViewGroup.mTouchSlop = ((int)(paramViewGroup.mTouchSlop * (1.0F / paramFloat)));
    return paramViewGroup;
  }

  public static t a(ViewGroup paramViewGroup, a parama)
  {
    return new t(paramViewGroup.getContext(), paramViewGroup, parama);
  }

  private void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i = 0;
    if ((this.SH == null) || (this.SH.length <= paramInt))
    {
      float[] arrayOfFloat1 = new float[paramInt + 1];
      float[] arrayOfFloat2 = new float[paramInt + 1];
      localObject = new float[paramInt + 1];
      float[] arrayOfFloat3 = new float[paramInt + 1];
      int[] arrayOfInt1 = new int[paramInt + 1];
      int[] arrayOfInt2 = new int[paramInt + 1];
      int[] arrayOfInt3 = new int[paramInt + 1];
      if (this.SH != null)
      {
        System.arraycopy(this.SH, 0, arrayOfFloat1, 0, this.SH.length);
        System.arraycopy(this.SI, 0, arrayOfFloat2, 0, this.SI.length);
        System.arraycopy(this.SJ, 0, localObject, 0, this.SJ.length);
        System.arraycopy(this.SK, 0, arrayOfFloat3, 0, this.SK.length);
        System.arraycopy(this.SL, 0, arrayOfInt1, 0, this.SL.length);
        System.arraycopy(this.SM, 0, arrayOfInt2, 0, this.SM.length);
        System.arraycopy(this.SN, 0, arrayOfInt3, 0, this.SN.length);
      }
      this.SH = arrayOfFloat1;
      this.SI = arrayOfFloat2;
      this.SJ = ((float[])localObject);
      this.SK = arrayOfFloat3;
      this.SL = arrayOfInt1;
      this.SM = arrayOfInt2;
      this.SN = arrayOfInt3;
    }
    Object localObject = this.SH;
    this.SJ[paramInt] = paramFloat1;
    localObject[paramInt] = paramFloat1;
    localObject = this.SI;
    this.SK[paramInt] = paramFloat2;
    localObject[paramInt] = paramFloat2;
    localObject = this.SL;
    int j = (int)paramFloat1;
    int k = (int)paramFloat2;
    if (j < this.SW.getLeft() + this.SR)
      i = 1;
    int m = i;
    if (k < this.SW.getTop() + this.SR)
      m = i | 0x4;
    i = m;
    if (j > this.SW.getRight() - this.SR)
      i = m | 0x2;
    m = i;
    if (k > this.SW.getBottom() - this.SR)
      m = i | 0x8;
    localObject[paramInt] = m;
    this.SO |= 1 << paramInt;
  }

  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    boolean bool2 = bool1;
    if ((this.SL[paramInt1] & paramInt2) == paramInt2)
    {
      bool2 = bool1;
      if ((this.SS & paramInt2) != 0)
      {
        bool2 = bool1;
        if ((this.SN[paramInt1] & paramInt2) != paramInt2)
        {
          bool2 = bool1;
          if ((this.SM[paramInt1] & paramInt2) != paramInt2)
          {
            if ((paramFloat1 > this.mTouchSlop) || (paramFloat2 > this.mTouchSlop))
              break label108;
            bool2 = bool1;
          }
        }
      }
    }
    while (true)
    {
      return bool2;
      label108: bool2 = bool1;
      if ((this.SM[paramInt1] & paramInt2) == 0)
      {
        bool2 = bool1;
        if (paramFloat1 > this.mTouchSlop)
          bool2 = true;
      }
    }
  }

  private void aY(int paramInt)
  {
    if ((this.SH == null) || (!aZ(paramInt)));
    while (true)
    {
      return;
      this.SH[paramInt] = 0.0F;
      this.SI[paramInt] = 0.0F;
      this.SJ[paramInt] = 0.0F;
      this.SK[paramInt] = 0.0F;
      this.SL[paramInt] = 0;
      this.SM[paramInt] = 0;
      this.SN[paramInt] = 0;
      this.SO &= (1 << paramInt ^ 0xFFFFFFFF);
    }
  }

  private void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i = 1;
    if (a(paramFloat1, paramFloat2, paramInt, 1));
    while (true)
    {
      int j = i;
      if (a(paramFloat2, paramFloat1, paramInt, 4))
        j = i | 0x4;
      i = j;
      if (a(paramFloat1, paramFloat2, paramInt, 2))
        i = j | 0x2;
      j = i;
      if (a(paramFloat2, paramFloat1, paramInt, 8))
        j = i | 0x8;
      if (j != 0)
      {
        int[] arrayOfInt = this.SM;
        arrayOfInt[paramInt] |= j;
        this.ST.z(j, paramInt);
      }
      return;
      i = 0;
    }
  }

  private boolean bb(int paramInt)
  {
    if (!aZ(paramInt))
      new StringBuilder("Ignoring pointerId=").append(paramInt).append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  private boolean c(View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramView == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      int i;
      if (this.ST.s(paramView) > 0)
      {
        i = 1;
        label28: if (this.ST.bL() <= 0)
          break label88;
      }
      label88: for (int j = 1; ; j = 0)
      {
        if ((i == 0) || (j == 0))
          break label94;
        bool2 = bool1;
        if (paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2 <= this.mTouchSlop * this.mTouchSlop)
          break;
        bool2 = true;
        break;
        i = 0;
        break label28;
      }
      label94: if (i != 0)
      {
        bool2 = bool1;
        if (Math.abs(paramFloat1) > this.mTouchSlop)
          bool2 = true;
      }
      else
      {
        bool2 = bool1;
        if (j != 0)
        {
          bool2 = bool1;
          if (Math.abs(paramFloat2) > this.mTouchSlop)
            bool2 = true;
        }
      }
    }
  }

  private static float distanceInfluenceForSnapDuration(float paramFloat)
  {
    return (float)Math.sin((paramFloat - 0.5F) * 0.4712389F);
  }

  private static float e(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = Math.abs(paramFloat1);
    if (f < paramFloat2)
      paramFloat2 = 0.0F;
    while (true)
    {
      return paramFloat2;
      if (f > paramFloat3)
      {
        paramFloat2 = paramFloat3;
        if (paramFloat1 <= 0.0F)
          paramFloat2 = -paramFloat3;
      }
      else
      {
        paramFloat2 = paramFloat1;
      }
    }
  }

  private int e(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = i(paramInt3, (int)this.SQ, (int)this.SP);
    paramInt4 = i(paramInt4, (int)this.SQ, (int)this.SP);
    int i = Math.abs(paramInt1);
    int j = Math.abs(paramInt2);
    int k = Math.abs(paramInt3);
    int m = Math.abs(paramInt4);
    int n = k + m;
    int i1 = i + j;
    float f1;
    if (paramInt3 != 0)
    {
      f1 = k / n;
      if (paramInt4 == 0)
        break label162;
    }
    label162: for (float f2 = m / n; ; f2 = j / i1)
    {
      paramInt1 = h(paramInt1, paramInt3, this.ST.s(paramView));
      paramInt2 = h(paramInt2, paramInt4, this.ST.bL());
      float f3 = paramInt1;
      return (int)(f2 * paramInt2 + f1 * f3);
      f1 = i / i1;
      break;
    }
  }

  private void e(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getPointerCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramMotionEvent.getPointerId(j);
      if (bb(k))
      {
        float f1 = paramMotionEvent.getX(j);
        float f2 = paramMotionEvent.getY(j);
        this.SJ[k] = f1;
        this.SK[k] = f2;
      }
    }
  }

  private void eY()
  {
    if (this.SH == null);
    while (true)
    {
      return;
      Arrays.fill(this.SH, 0.0F);
      Arrays.fill(this.SI, 0.0F);
      Arrays.fill(this.SJ, 0.0F);
      Arrays.fill(this.SK, 0.0F);
      Arrays.fill(this.SL, 0);
      Arrays.fill(this.SM, 0);
      Arrays.fill(this.SN, 0);
      this.SO = 0;
    }
  }

  private void eZ()
  {
    this.mVelocityTracker.computeCurrentVelocity(1000, this.SP);
    u(e(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.SQ, this.SP), e(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.SQ, this.SP));
  }

  private int h(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0)
    {
      paramInt1 = 0;
      return paramInt1;
    }
    int i = this.SW.getWidth();
    int j = i / 2;
    float f1 = Math.min(1.0F, Math.abs(paramInt1) / i);
    float f2 = j;
    float f3 = j;
    f1 = distanceInfluenceForSnapDuration(f1);
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0);
    for (paramInt1 = Math.round(Math.abs((f1 * f3 + f2) / paramInt2) * 1000.0F) * 4; ; paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F))
    {
      paramInt1 = Math.min(paramInt1, 600);
      break;
    }
  }

  private boolean h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = false;
    int i = this.SU.getLeft();
    int j = this.SU.getTop();
    paramInt1 -= i;
    paramInt2 -= j;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.qN.abortAnimation();
      ba(0);
    }
    while (true)
    {
      return bool;
      paramInt3 = e(this.SU, paramInt1, paramInt2, paramInt3, paramInt4);
      this.qN.startScroll(i, j, paramInt1, paramInt2, paramInt3);
      ba(2);
      bool = true;
    }
  }

  private static int i(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = Math.abs(paramInt1);
    if (i < paramInt2)
      paramInt2 = 0;
    while (true)
    {
      return paramInt2;
      if (i > paramInt3)
      {
        paramInt2 = paramInt3;
        if (paramInt1 <= 0)
          paramInt2 = -paramInt3;
      }
      else
      {
        paramInt2 = paramInt1;
      }
    }
  }

  private void i(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.SU.getLeft();
    int j = this.SU.getTop();
    int k = paramInt1;
    if (paramInt3 != 0)
    {
      k = this.ST.d(this.SU, paramInt1);
      s.r(this.SU, k - i);
    }
    paramInt1 = paramInt2;
    if (paramInt4 != 0)
    {
      paramInt1 = this.ST.c(this.SU, paramInt2);
      s.q(this.SU, paramInt1 - j);
    }
    if ((paramInt3 != 0) || (paramInt4 != 0))
      this.ST.b(this.SU, k, paramInt1);
  }

  public static boolean i(View paramView, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramView == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (paramInt1 >= paramView.getLeft())
      {
        bool2 = bool1;
        if (paramInt1 < paramView.getRight())
        {
          bool2 = bool1;
          if (paramInt2 >= paramView.getTop())
          {
            bool2 = bool1;
            if (paramInt2 < paramView.getBottom())
              bool2 = true;
          }
        }
      }
    }
  }

  private void u(float paramFloat1, float paramFloat2)
  {
    this.SV = true;
    this.ST.a(this.SU, paramFloat1, paramFloat2);
    this.SV = false;
    if (this.SG == 1)
      ba(0);
  }

  private boolean v(View paramView, int paramInt)
  {
    boolean bool = true;
    if ((paramView == this.SU) && (this.mActivePointerId == paramInt));
    while (true)
    {
      return bool;
      if ((paramView != null) && (this.ST.b(paramView, paramInt)))
      {
        this.mActivePointerId = paramInt;
        u(paramView, paramInt);
      }
      else
      {
        bool = false;
      }
    }
  }

  public final boolean D(int paramInt1, int paramInt2)
  {
    if (!this.SV)
      throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    return h(paramInt1, paramInt2, (int)this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int)this.mVelocityTracker.getYVelocity(this.mActivePointerId));
  }

  public final View F(int paramInt1, int paramInt2)
  {
    int i = this.SW.getChildCount() - 1;
    View localView;
    if (i >= 0)
    {
      localView = this.SW.getChildAt(i);
      if ((paramInt1 < localView.getLeft()) || (paramInt1 >= localView.getRight()) || (paramInt2 < localView.getTop()) || (paramInt2 >= localView.getBottom()));
    }
    while (true)
    {
      return localView;
      i--;
      break;
      localView = null;
    }
  }

  public final boolean aZ(int paramInt)
  {
    boolean bool = true;
    if ((this.SO & 1 << paramInt) != 0);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final void abort()
  {
    cancel();
    if (this.SG == 2)
    {
      this.qN.getCurrX();
      this.qN.getCurrY();
      this.qN.abortAnimation();
      int i = this.qN.getCurrX();
      int j = this.qN.getCurrY();
      this.ST.b(this.SU, i, j);
    }
    ba(0);
  }

  final void ba(int paramInt)
  {
    this.SW.removeCallbacks(this.SX);
    if (this.SG != paramInt)
    {
      this.SG = paramInt;
      this.ST.N(paramInt);
      if (this.SG == 0)
        this.SU = null;
    }
  }

  public final void cancel()
  {
    this.mActivePointerId = -1;
    eY();
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
  }

  public final boolean eX()
  {
    boolean bool1 = false;
    if (this.SG == 2)
    {
      boolean bool2 = this.qN.computeScrollOffset();
      int i = this.qN.getCurrX();
      int j = this.qN.getCurrY();
      int k = i - this.SU.getLeft();
      int m = j - this.SU.getTop();
      if (k != 0)
        s.r(this.SU, k);
      if (m != 0)
        s.q(this.SU, m);
      if ((k != 0) || (m != 0))
        this.ST.b(this.SU, i, j);
      bool3 = bool2;
      if (bool2)
      {
        bool3 = bool2;
        if (i == this.qN.getFinalX())
        {
          bool3 = bool2;
          if (j == this.qN.getFinalY())
          {
            this.qN.abortAnimation();
            bool3 = false;
          }
        }
      }
      if (!bool3)
        this.SW.post(this.SX);
    }
    boolean bool3 = bool1;
    if (this.SG == 2)
      bool3 = true;
    return bool3;
  }

  public final boolean f(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    int j = paramMotionEvent.getActionIndex();
    if (i == 0)
      cancel();
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker.addMovement(paramMotionEvent);
    switch (i)
    {
    case 4:
    default:
      if (this.SG != 1)
        break;
    case 0:
    case 5:
    case 2:
    case 6:
    case 1:
    case 3:
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      j = paramMotionEvent.getPointerId(0);
      a(f1, f2, j);
      paramMotionEvent = F((int)f1, (int)f2);
      if ((paramMotionEvent == this.SU) && (this.SG == 2))
        v(paramMotionEvent, j);
      if ((this.SL[j] & this.SS) == 0)
        break;
      this.ST.eK();
      break;
      i = paramMotionEvent.getPointerId(j);
      f2 = paramMotionEvent.getX(j);
      f1 = paramMotionEvent.getY(j);
      a(f2, f1, i);
      if (this.SG == 0)
      {
        if ((this.SL[i] & this.SS) == 0)
          break;
        this.ST.eK();
        break;
      }
      if (this.SG != 2)
        break;
      paramMotionEvent = F((int)f2, (int)f1);
      if (paramMotionEvent != this.SU)
        break;
      v(paramMotionEvent, i);
      break;
      if ((this.SH == null) || (this.SI == null))
        break;
      int k = paramMotionEvent.getPointerCount();
      j = 0;
      if (j < k)
      {
        int m = paramMotionEvent.getPointerId(j);
        float f3;
        float f4;
        View localView;
        if (bb(m))
        {
          f2 = paramMotionEvent.getX(j);
          f1 = paramMotionEvent.getY(j);
          f3 = f2 - this.SH[m];
          f4 = f1 - this.SI[m];
          localView = F((int)f2, (int)f1);
          if ((localView == null) || (!c(localView, f3, f4)))
            break label547;
        }
        label547: for (i = 1; ; i = 0)
        {
          if (i != 0)
          {
            int n = localView.getLeft();
            int i1 = (int)f3;
            int i2 = this.ST.d(localView, i1 + n);
            i1 = localView.getTop();
            int i3 = (int)f4;
            int i4 = this.ST.c(localView, i3 + i1);
            int i5 = this.ST.s(localView);
            i3 = this.ST.bL();
            if (((i5 == 0) || ((i5 > 0) && (i2 == n))) && ((i3 == 0) || ((i3 > 0) && (i4 == i1))))
              break label552;
          }
          b(f3, f4, m);
          if ((this.SG == 1) || ((i != 0) && (v(localView, m))))
            break label552;
          j++;
          break;
        }
      }
      label552: e(paramMotionEvent);
      break;
      aY(paramMotionEvent.getPointerId(j));
      break;
      cancel();
      break;
    }
  }

  public final void g(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = 0;
    int k = paramMotionEvent.getActionMasked();
    int m = paramMotionEvent.getActionIndex();
    if (k == 0)
      cancel();
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker.addMovement(paramMotionEvent);
    float f1;
    float f2;
    switch (k)
    {
    case 4:
    default:
    case 0:
    case 5:
    case 2:
      while (true)
      {
        return;
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        i = paramMotionEvent.getPointerId(0);
        paramMotionEvent = F((int)f1, (int)f2);
        a(f1, f2, i);
        v(paramMotionEvent, i);
        if ((this.SL[i] & this.SS) != 0)
        {
          this.ST.eK();
          continue;
          i = paramMotionEvent.getPointerId(m);
          f2 = paramMotionEvent.getX(m);
          f1 = paramMotionEvent.getY(m);
          a(f2, f1, i);
          if (this.SG == 0)
          {
            v(F((int)f2, (int)f1), i);
            if ((this.SL[i] & this.SS) != 0)
              this.ST.eK();
          }
          else if (E((int)f2, (int)f1))
          {
            v(this.SU, i);
            continue;
            if (this.SG == 1)
            {
              if (bb(this.mActivePointerId))
              {
                i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
                f2 = paramMotionEvent.getX(i);
                f1 = paramMotionEvent.getY(i);
                i = (int)(f2 - this.SJ[this.mActivePointerId]);
                j = (int)(f1 - this.SK[this.mActivePointerId]);
                i(this.SU.getLeft() + i, this.SU.getTop() + j, i, j);
                e(paramMotionEvent);
              }
            }
            else
            {
              m = paramMotionEvent.getPointerCount();
              for (i = j; i < m; i++)
              {
                j = paramMotionEvent.getPointerId(i);
                if (bb(j))
                {
                  f1 = paramMotionEvent.getX(i);
                  float f3 = paramMotionEvent.getY(i);
                  f2 = f1 - this.SH[j];
                  float f4 = f3 - this.SI[j];
                  b(f2, f4, j);
                  if (this.SG == 1)
                    break;
                  View localView = F((int)f1, (int)f3);
                  if ((c(localView, f2, f4)) && (v(localView, j)))
                    break;
                }
              }
              e(paramMotionEvent);
            }
          }
        }
      }
    case 6:
      j = paramMotionEvent.getPointerId(m);
      if ((this.SG == 1) && (j == this.mActivePointerId))
      {
        m = paramMotionEvent.getPointerCount();
        label528: if (i >= m)
          break label662;
        k = paramMotionEvent.getPointerId(i);
        if (k == this.mActivePointerId)
          break label616;
        f1 = paramMotionEvent.getX(i);
        f2 = paramMotionEvent.getY(i);
        if ((F((int)f1, (int)f2) != this.SU) || (!v(this.SU, k)))
          break label616;
      }
      break;
    case 1:
    case 3:
    }
    label662: for (i = this.mActivePointerId; ; i = -1)
    {
      if (i == -1)
        eZ();
      aY(j);
      break;
      label616: i++;
      break label528;
      if (this.SG == 1)
        eZ();
      cancel();
      break;
      if (this.SG == 1)
        u(0.0F, 0.0F);
      cancel();
      break;
    }
  }

  public final boolean h(View paramView, int paramInt1, int paramInt2)
  {
    this.SU = paramView;
    this.mActivePointerId = -1;
    boolean bool = h(paramInt1, paramInt2, 0, 0);
    if ((!bool) && (this.SG == 0) && (this.SU != null))
      this.SU = null;
    return bool;
  }

  public final void u(View paramView, int paramInt)
  {
    if (paramView.getParent() != this.SW)
      throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.SW + ")");
    this.SU = paramView;
    this.mActivePointerId = paramInt;
    this.ST.k(paramView, paramInt);
    ba(1);
  }

  public static abstract class a
  {
    public void N(int paramInt)
    {
    }

    public void a(View paramView, float paramFloat1, float paramFloat2)
    {
    }

    public void b(View paramView, int paramInt1, int paramInt2)
    {
    }

    public abstract boolean b(View paramView, int paramInt);

    public int bL()
    {
      return 0;
    }

    public int c(View paramView, int paramInt)
    {
      return 0;
    }

    public int d(View paramView, int paramInt)
    {
      return 0;
    }

    public void eK()
    {
    }

    public void k(View paramView, int paramInt)
    {
    }

    public int s(View paramView)
    {
      return 0;
    }

    public void z(int paramInt1, int paramInt2)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.t
 * JD-Core Version:    0.6.2
 */