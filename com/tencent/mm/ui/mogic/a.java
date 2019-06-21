package com.tencent.mm.ui.mogic;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.widget.p;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Arrays;

public final class a
{
  private static final Interpolator sInterpolator;
  public int SG;
  public float[] SH;
  public float[] SI;
  public float[] SJ;
  public float[] SK;
  public int[] SL;
  private int[] SM;
  private int[] SN;
  public int SO;
  public float SP;
  public float SQ;
  private int SR;
  public int SS;
  public View SU;
  public boolean SV;
  public final ViewGroup SW;
  public final Runnable SX;
  public p jlU;
  public int mActivePointerId;
  private int mTouchSlop;
  public VelocityTracker mVelocityTracker;
  public final a zzE;

  static
  {
    AppMethodBeat.i(107452);
    sInterpolator = new Interpolator()
    {
      public final float getInterpolation(float paramAnonymousFloat)
      {
        paramAnonymousFloat -= 1.0F;
        return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
      }
    };
    AppMethodBeat.o(107452);
  }

  private a(Context paramContext, ViewGroup paramViewGroup, a parama, Interpolator paramInterpolator)
  {
    AppMethodBeat.i(107434);
    this.mActivePointerId = -1;
    this.SX = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(107432);
        a.this.ba(0);
        AppMethodBeat.o(107432);
      }
    };
    if (paramViewGroup == null)
    {
      paramContext = new IllegalArgumentException("Parent view may not be null");
      AppMethodBeat.o(107434);
      throw paramContext;
    }
    if (parama == null)
    {
      paramContext = new IllegalArgumentException("Callback may not be null");
      AppMethodBeat.o(107434);
      throw paramContext;
    }
    this.SW = paramViewGroup;
    this.zzE = parama;
    paramViewGroup = ViewConfiguration.get(paramContext);
    this.SR = ((int)(paramContext.getResources().getDisplayMetrics().density * 20.0F + 0.5F));
    this.mTouchSlop = paramViewGroup.getScaledTouchSlop();
    this.SP = paramViewGroup.getScaledMaximumFlingVelocity();
    this.SQ = paramViewGroup.getScaledMinimumFlingVelocity();
    this.jlU = p.a(paramContext, paramInterpolator);
    AppMethodBeat.o(107434);
  }

  private int K(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107437);
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
      paramInt1 = h(paramInt1, paramInt3, this.zzE.dJm());
      paramInt2 = h(paramInt2, paramInt4, 0);
      float f3 = paramInt1;
      paramInt1 = (int)(f2 * paramInt2 + f1 * f3);
      AppMethodBeat.o(107437);
      return paramInt1;
      f1 = i / i1;
      break;
    }
  }

  public static a a(ViewGroup paramViewGroup, a parama, Interpolator paramInterpolator)
  {
    AppMethodBeat.i(107433);
    paramViewGroup = new a(paramViewGroup.getContext(), paramViewGroup, parama, paramInterpolator);
    AppMethodBeat.o(107433);
    return paramViewGroup;
  }

  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(107448);
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    if (((this.SL[paramInt1] & paramInt2) != paramInt2) || ((this.SS & paramInt2) == 0) || ((this.SN[paramInt1] & paramInt2) == paramInt2) || ((this.SM[paramInt1] & paramInt2) == paramInt2) || ((paramFloat1 <= this.mTouchSlop) && (paramFloat2 <= this.mTouchSlop)))
      AppMethodBeat.o(107448);
    while (true)
    {
      return bool;
      if (((this.SM[paramInt1] & paramInt2) == 0) && (paramFloat1 > this.mTouchSlop))
      {
        bool = true;
        AppMethodBeat.o(107448);
      }
      else
      {
        AppMethodBeat.o(107448);
      }
    }
  }

  private static float distanceInfluenceForSnapDuration(float paramFloat)
  {
    AppMethodBeat.i(107441);
    paramFloat = (float)Math.sin((float)((paramFloat - 0.5F) * 0.47123891676382D));
    AppMethodBeat.o(107441);
    return paramFloat;
  }

  private static float e(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(107440);
    float f = Math.abs(paramFloat1);
    if (f < paramFloat2)
    {
      AppMethodBeat.o(107440);
      paramFloat3 = 0.0F;
    }
    while (true)
    {
      return paramFloat3;
      if (f > paramFloat3)
      {
        if (paramFloat1 > 0.0F)
        {
          AppMethodBeat.o(107440);
        }
        else
        {
          paramFloat3 = -paramFloat3;
          AppMethodBeat.o(107440);
        }
      }
      else
      {
        AppMethodBeat.o(107440);
        paramFloat3 = paramFloat1;
      }
    }
  }

  private int h(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(107438);
    if (paramInt1 == 0)
    {
      paramInt1 = 0;
      AppMethodBeat.o(107438);
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
      AppMethodBeat.o(107438);
      break;
    }
  }

  private static int i(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(107439);
    int i = Math.abs(paramInt1);
    if (i < paramInt2)
    {
      paramInt3 = 0;
      AppMethodBeat.o(107439);
    }
    while (true)
    {
      return paramInt3;
      if (i > paramInt3)
      {
        if (paramInt1 > 0)
        {
          AppMethodBeat.o(107439);
        }
        else
        {
          paramInt3 = -paramInt3;
          AppMethodBeat.o(107439);
        }
      }
      else
      {
        AppMethodBeat.o(107439);
        paramInt3 = paramInt1;
      }
    }
  }

  public final View F(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107451);
    int i = this.SW.getChildCount() - 1;
    View localView;
    if (i >= 0)
    {
      localView = this.SW.getChildAt(i);
      if ((paramInt1 >= localView.getLeft()) && (paramInt1 < localView.getRight()) && (paramInt2 >= localView.getTop()) && (paramInt2 < localView.getBottom()))
        AppMethodBeat.o(107451);
    }
    while (true)
    {
      return localView;
      i--;
      break;
      localView = null;
      AppMethodBeat.o(107451);
    }
  }

  public final void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(107443);
    if ((this.SH == null) || (this.SH.length <= paramInt))
    {
      float[] arrayOfFloat1 = new float[paramInt + 1];
      float[] arrayOfFloat2 = new float[paramInt + 1];
      float[] arrayOfFloat3 = new float[paramInt + 1];
      float[] arrayOfFloat4 = new float[paramInt + 1];
      int[] arrayOfInt1 = new int[paramInt + 1];
      localObject = new int[paramInt + 1];
      int[] arrayOfInt2 = new int[paramInt + 1];
      if (this.SH != null)
      {
        System.arraycopy(this.SH, 0, arrayOfFloat1, 0, this.SH.length);
        System.arraycopy(this.SI, 0, arrayOfFloat2, 0, this.SI.length);
        System.arraycopy(this.SJ, 0, arrayOfFloat3, 0, this.SJ.length);
        System.arraycopy(this.SK, 0, arrayOfFloat4, 0, this.SK.length);
        System.arraycopy(this.SL, 0, arrayOfInt1, 0, this.SL.length);
        System.arraycopy(this.SM, 0, localObject, 0, this.SM.length);
        System.arraycopy(this.SN, 0, arrayOfInt2, 0, this.SN.length);
      }
      this.SH = arrayOfFloat1;
      this.SI = arrayOfFloat2;
      this.SJ = arrayOfFloat3;
      this.SK = arrayOfFloat4;
      this.SL = arrayOfInt1;
      this.SM = ((int[])localObject);
      this.SN = arrayOfInt2;
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
    AppMethodBeat.o(107443);
  }

  public final void aY(int paramInt)
  {
    if (this.SH == null);
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

  public final void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(107447);
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
        arrayOfInt[paramInt] = (j | arrayOfInt[paramInt]);
      }
      AppMethodBeat.o(107447);
      return;
      i = 0;
    }
  }

  public final boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    AppMethodBeat.i(107436);
    int i = this.SU.getLeft();
    int j = this.SU.getTop();
    paramInt1 -= i;
    paramInt2 -= j;
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.jlU.qN.abortAnimation();
      ba(0);
      bool = false;
      AppMethodBeat.o(107436);
    }
    while (true)
    {
      return bool;
      long l = paramLong;
      if (paramLong == 0L)
        l = K(paramInt1, paramInt2, paramInt3, paramInt4);
      ab.d("WxViewDragHelper", "ashutest:: xvel %d, yvel %d, dx %d, dy %d duration %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(l) });
      this.jlU.startScroll(i, j, paramInt1, paramInt2, (int)l);
      ba(2);
      bool = true;
      AppMethodBeat.o(107436);
    }
  }

  final void ba(int paramInt)
  {
    AppMethodBeat.i(107445);
    if (this.SG != paramInt)
    {
      this.SG = paramInt;
      this.zzE.N(paramInt);
      if (paramInt == 0)
        this.SU = null;
    }
    AppMethodBeat.o(107445);
  }

  public final void cancel()
  {
    AppMethodBeat.i(107435);
    this.mActivePointerId = -1;
    if (this.SH != null)
    {
      Arrays.fill(this.SH, 0.0F);
      Arrays.fill(this.SI, 0.0F);
      Arrays.fill(this.SJ, 0.0F);
      Arrays.fill(this.SK, 0.0F);
      Arrays.fill(this.SL, 0);
      Arrays.fill(this.SM, 0);
      Arrays.fill(this.SN, 0);
      this.SO = 0;
    }
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
    AppMethodBeat.o(107435);
  }

  public final void e(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(107444);
    int i = paramMotionEvent.getPointerCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramMotionEvent.getPointerId(j);
      float f1 = paramMotionEvent.getX(j);
      float f2 = paramMotionEvent.getY(j);
      this.SJ[k] = f1;
      this.SK[k] = f2;
    }
    AppMethodBeat.o(107444);
  }

  public final void eZ()
  {
    AppMethodBeat.i(107450);
    this.mVelocityTracker.computeCurrentVelocity(1000, this.SP);
    u(e(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.SQ, this.SP), e(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.SQ, this.SP));
    AppMethodBeat.o(107450);
  }

  public final boolean q(View paramView, float paramFloat)
  {
    boolean bool = false;
    AppMethodBeat.i(107449);
    if (paramView == null)
      AppMethodBeat.o(107449);
    while (true)
    {
      return bool;
      int i;
      if (this.zzE.dJm() > 0)
        i = 1;
      while (true)
        if (i != 0)
        {
          if (Math.abs(paramFloat) > this.mTouchSlop)
          {
            AppMethodBeat.o(107449);
            bool = true;
            break;
            i = 0;
            continue;
          }
          AppMethodBeat.o(107449);
          break;
        }
      AppMethodBeat.o(107449);
    }
  }

  public final void u(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(107442);
    this.SV = true;
    this.zzE.a(this.SU, paramFloat1, paramFloat2);
    this.SV = false;
    if (this.SG == 1)
      ba(0);
    AppMethodBeat.o(107442);
  }

  public final boolean v(View paramView, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(107446);
    if ((paramView == this.SU) && (this.mActivePointerId == paramInt))
      AppMethodBeat.o(107446);
    while (true)
    {
      return bool;
      if ((paramView != null) && (this.zzE.PG(paramInt)))
      {
        this.mActivePointerId = paramInt;
        if (paramView.getParent() != this.SW)
        {
          paramView = new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.SW + ")");
          AppMethodBeat.o(107446);
          throw paramView;
        }
        this.SU = paramView;
        this.mActivePointerId = paramInt;
        ba(1);
        AppMethodBeat.o(107446);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(107446);
      }
    }
  }

  public static abstract class a
  {
    public void N(int paramInt)
    {
    }

    public abstract boolean PG(int paramInt);

    public void a(View paramView, float paramFloat1, float paramFloat2)
    {
    }

    public int d(View paramView, int paramInt)
    {
      return 0;
    }

    public int dJm()
    {
      return 0;
    }

    public void ht(int paramInt1, int paramInt2)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.mogic.a
 * JD-Core Version:    0.6.2
 */