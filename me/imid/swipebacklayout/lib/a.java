package me.imid.swipebacklayout.lib;

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
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class a
{
  private static final Interpolator sInterpolator;
  int[] BTp;
  final a BTq;
  int SG;
  float[] SH;
  float[] SI;
  private float[] SJ;
  private float[] SK;
  private int[] SM;
  private int[] SN;
  private int SO;
  float SP;
  float SQ;
  int SR;
  int SS;
  View SU;
  boolean SV;
  final ViewGroup SW;
  final Runnable SX;
  p jlU;
  int mActivePointerId;
  private int mTouchSlop;
  VelocityTracker mVelocityTracker;

  static
  {
    AppMethodBeat.i(91249);
    sInterpolator = new a.1();
    AppMethodBeat.o(91249);
  }

  private a(Context paramContext, ViewGroup paramViewGroup, a parama)
  {
    AppMethodBeat.i(91223);
    this.mActivePointerId = -1;
    this.SX = new a.2(this);
    if (paramViewGroup == null)
    {
      paramContext = new IllegalArgumentException("Parent view may not be null");
      AppMethodBeat.o(91223);
      throw paramContext;
    }
    if (parama == null)
    {
      paramContext = new IllegalArgumentException("Callback may not be null");
      AppMethodBeat.o(91223);
      throw paramContext;
    }
    this.SW = paramViewGroup;
    this.BTq = parama;
    paramViewGroup = ViewConfiguration.get(paramContext);
    this.SR = ((int)(paramContext.getResources().getDisplayMetrics().density * 20.0F + 0.5F));
    this.mTouchSlop = paramViewGroup.getScaledTouchSlop();
    this.SP = paramViewGroup.getScaledMaximumFlingVelocity();
    this.SQ = paramViewGroup.getScaledMinimumFlingVelocity();
    this.jlU = p.a(paramContext, sInterpolator);
    AppMethodBeat.o(91223);
  }

  private boolean E(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91245);
    boolean bool = i(this.SU, paramInt1, paramInt2);
    AppMethodBeat.o(91245);
    return bool;
  }

  private void Vf(int paramInt)
  {
    AppMethodBeat.i(91232);
    if ((this.SH == null) || (this.SH.length <= paramInt))
    {
      float[] arrayOfFloat1 = new float[paramInt + 1];
      float[] arrayOfFloat2 = new float[paramInt + 1];
      float[] arrayOfFloat3 = new float[paramInt + 1];
      float[] arrayOfFloat4 = new float[paramInt + 1];
      int[] arrayOfInt1 = new int[paramInt + 1];
      int[] arrayOfInt2 = new int[paramInt + 1];
      int[] arrayOfInt3 = new int[paramInt + 1];
      if (this.SH != null)
      {
        System.arraycopy(this.SH, 0, arrayOfFloat1, 0, this.SH.length);
        System.arraycopy(this.SI, 0, arrayOfFloat2, 0, this.SI.length);
        System.arraycopy(this.SJ, 0, arrayOfFloat3, 0, this.SJ.length);
        System.arraycopy(this.SK, 0, arrayOfFloat4, 0, this.SK.length);
        System.arraycopy(this.BTp, 0, arrayOfInt1, 0, this.BTp.length);
        System.arraycopy(this.SM, 0, arrayOfInt2, 0, this.SM.length);
        System.arraycopy(this.SN, 0, arrayOfInt3, 0, this.SN.length);
      }
      this.SH = arrayOfFloat1;
      this.SI = arrayOfFloat2;
      this.SJ = arrayOfFloat3;
      this.SK = arrayOfFloat4;
      this.BTp = arrayOfInt1;
      this.SM = arrayOfInt2;
      this.SN = arrayOfInt3;
    }
    AppMethodBeat.o(91232);
  }

  public static a a(ViewGroup paramViewGroup, a parama)
  {
    AppMethodBeat.i(91222);
    paramViewGroup = new a(paramViewGroup.getContext(), paramViewGroup, parama);
    AppMethodBeat.o(91222);
    return paramViewGroup;
  }

  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(91239);
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    if (((this.BTp[paramInt1] & paramInt2) != paramInt2) || ((this.SS & paramInt2) == 0) || ((this.SN[paramInt1] & paramInt2) == paramInt2) || ((this.SM[paramInt1] & paramInt2) == paramInt2) || ((paramFloat1 <= this.mTouchSlop) && (paramFloat2 <= this.mTouchSlop)))
      AppMethodBeat.o(91239);
    while (true)
    {
      return bool;
      if (((this.SM[paramInt1] & paramInt2) == 0) && (paramFloat1 > this.mTouchSlop))
      {
        bool = true;
        AppMethodBeat.o(91239);
      }
      else
      {
        AppMethodBeat.o(91239);
      }
    }
  }

  private boolean aZ(int paramInt)
  {
    boolean bool = true;
    if ((this.SO & 1 << paramInt) != 0);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private static float distanceInfluenceForSnapDuration(float paramFloat)
  {
    AppMethodBeat.i(91229);
    paramFloat = (float)Math.sin((float)((paramFloat - 0.5F) * 0.47123891676382D));
    AppMethodBeat.o(91229);
    return paramFloat;
  }

  private static float e(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(91228);
    float f = Math.abs(paramFloat1);
    if (f < paramFloat2)
    {
      AppMethodBeat.o(91228);
      paramFloat3 = 0.0F;
    }
    while (true)
    {
      return paramFloat3;
      if (f > paramFloat3)
      {
        if (paramFloat1 > 0.0F)
        {
          AppMethodBeat.o(91228);
        }
        else
        {
          paramFloat3 = -paramFloat3;
          AppMethodBeat.o(91228);
        }
      }
      else
      {
        AppMethodBeat.o(91228);
        paramFloat3 = paramFloat1;
      }
    }
  }

  private void eY()
  {
    AppMethodBeat.i(91231);
    if (this.SH == null)
      AppMethodBeat.o(91231);
    while (true)
    {
      return;
      Arrays.fill(this.SH, 0.0F);
      Arrays.fill(this.SI, 0.0F);
      Arrays.fill(this.SJ, 0.0F);
      Arrays.fill(this.SK, 0.0F);
      Arrays.fill(this.BTp, 0);
      Arrays.fill(this.SM, 0);
      Arrays.fill(this.SN, 0);
      this.SO = 0;
      AppMethodBeat.o(91231);
    }
  }

  private void eZ()
  {
    AppMethodBeat.i(91243);
    this.mVelocityTracker.computeCurrentVelocity(1000, this.SP);
    u(e(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.SQ, this.SP), e(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.SQ, this.SP));
    AppMethodBeat.o(91243);
  }

  static int i(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(91227);
    int i = Math.abs(paramInt1);
    if (i < paramInt2)
    {
      paramInt3 = 0;
      AppMethodBeat.o(91227);
    }
    while (true)
    {
      return paramInt3;
      if (i > paramInt3)
      {
        if (paramInt1 > 0)
        {
          AppMethodBeat.o(91227);
        }
        else
        {
          paramInt3 = -paramInt3;
          AppMethodBeat.o(91227);
        }
      }
      else
      {
        AppMethodBeat.o(91227);
        paramInt3 = paramInt1;
      }
    }
  }

  private void i(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(91244);
    int i = this.SU.getLeft();
    int j = this.SU.getTop();
    if (paramInt3 != 0)
    {
      paramInt1 = this.BTq.d(this.SU, paramInt1);
      this.SU.offsetLeftAndRight(paramInt1 - i);
    }
    while (true)
    {
      if (paramInt4 != 0)
      {
        paramInt2 = this.BTq.c(this.SU, paramInt2);
        this.SU.offsetTopAndBottom(paramInt2 - j);
      }
      while (true)
      {
        if ((paramInt3 != 0) || (paramInt4 != 0))
          this.BTq.o(this.SU, paramInt1, paramInt2, paramInt1 - i, paramInt2 - j);
        AppMethodBeat.o(91244);
        return;
      }
    }
  }

  private static boolean i(View paramView, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(91246);
    if (paramView == null)
      AppMethodBeat.o(91246);
    while (true)
    {
      return bool;
      if ((paramInt1 >= paramView.getLeft()) && (paramInt1 < paramView.getRight()) && (paramInt2 >= paramView.getTop()) && (paramInt2 < paramView.getBottom()))
      {
        bool = true;
        AppMethodBeat.o(91246);
      }
      else
      {
        AppMethodBeat.o(91246);
      }
    }
  }

  private int iv(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91248);
    int i = 0;
    if (paramInt1 < this.SW.getLeft() + this.SR)
      i = 1;
    if (paramInt2 < this.SW.getTop() + this.SR)
      i = 4;
    if (paramInt1 > this.SW.getRight() - this.SR)
      i = 2;
    if (paramInt2 > this.SW.getBottom() - this.SR)
      i = 8;
    AppMethodBeat.o(91248);
    return i;
  }

  private void u(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(91230);
    this.SV = true;
    this.BTq.a(this.SU, paramFloat1, paramFloat2);
    this.SV = false;
    if (this.SG == 1)
      ba(0);
    AppMethodBeat.o(91230);
  }

  private void u(View paramView, int paramInt)
  {
    AppMethodBeat.i(91224);
    if (paramView.getParent() != this.SW)
    {
      paramView = new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.SW + ")");
      AppMethodBeat.o(91224);
      throw paramView;
    }
    this.SU = paramView;
    this.mActivePointerId = paramInt;
    ba(1);
    AppMethodBeat.o(91224);
  }

  public final View F(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91247);
    int i = this.SW.getChildCount() - 1;
    View localView;
    if (i >= 0)
    {
      localView = this.SW.getChildAt(i);
      if ((paramInt1 >= localView.getLeft()) && (paramInt1 < localView.getRight()) && (paramInt2 >= localView.getTop()) && (paramInt2 < localView.getBottom()))
        AppMethodBeat.o(91247);
    }
    while (true)
    {
      return localView;
      i--;
      break;
      localView = null;
      AppMethodBeat.o(91247);
    }
  }

  final void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    AppMethodBeat.i(91233);
    Vf(paramInt);
    float[] arrayOfFloat = this.SH;
    this.SJ[paramInt] = paramFloat1;
    arrayOfFloat[paramInt] = paramFloat1;
    arrayOfFloat = this.SI;
    this.SK[paramInt] = paramFloat2;
    arrayOfFloat[paramInt] = paramFloat2;
    this.BTp[paramInt] = iv((int)paramFloat1, (int)paramFloat2);
    this.SO |= 1 << paramInt;
    AppMethodBeat.o(91233);
  }

  final void aY(int paramInt)
  {
    if (this.SH == null);
    while (true)
    {
      return;
      this.SH[paramInt] = 0.0F;
      this.SI[paramInt] = 0.0F;
      this.SJ[paramInt] = 0.0F;
      this.SK[paramInt] = 0.0F;
      this.BTp[paramInt] = 0;
      this.SM[paramInt] = 0;
      this.SN[paramInt] = 0;
      this.SO &= (1 << paramInt ^ 0xFFFFFFFF);
    }
  }

  final void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(91238);
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
      AppMethodBeat.o(91238);
      return;
      i = 0;
    }
  }

  final void ba(int paramInt)
  {
    AppMethodBeat.i(91235);
    if (this.SG != paramInt)
    {
      this.SG = paramInt;
      this.BTq.N(paramInt);
      if (paramInt == 0)
        this.SU = null;
    }
    AppMethodBeat.o(91235);
  }

  final boolean c(View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(91240);
    if (paramView == null)
      AppMethodBeat.o(91240);
    while (true)
    {
      return bool;
      int i;
      label35: int j;
      if (this.BTq.dJm() > 0)
      {
        i = 1;
        if (this.BTq.bL() <= 0)
          break label97;
        j = 1;
      }
      while (true)
        if ((i != 0) && (j != 0))
        {
          if (paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2 > this.mTouchSlop * this.mTouchSlop)
          {
            AppMethodBeat.o(91240);
            bool = true;
            break;
            i = 0;
            break label35;
            label97: j = 0;
            continue;
          }
          AppMethodBeat.o(91240);
          break;
        }
      if (i != 0)
      {
        if (Math.abs(paramFloat1) > this.mTouchSlop)
        {
          AppMethodBeat.o(91240);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(91240);
        }
      }
      else if (j != 0)
      {
        if (Math.abs(paramFloat2) > this.mTouchSlop)
        {
          AppMethodBeat.o(91240);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(91240);
        }
      }
      else
        AppMethodBeat.o(91240);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(91225);
    this.mActivePointerId = -1;
    eY();
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
    AppMethodBeat.o(91225);
  }

  final void e(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(91234);
    int i = paramMotionEvent.getPointerCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramMotionEvent.getPointerId(j);
      float f1 = paramMotionEvent.getX(j);
      float f2 = paramMotionEvent.getY(j);
      this.SJ[k] = f1;
      this.SK[k] = f2;
    }
    AppMethodBeat.o(91234);
  }

  public final void g(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(91237);
    int k = paramMotionEvent.getActionMasked();
    int m = paramMotionEvent.getActionIndex();
    if (k == 0)
      cancel();
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker.addMovement(paramMotionEvent);
    label102: float f1;
    float f2;
    switch (k)
    {
    case 4:
    default:
      AppMethodBeat.o(91237);
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
        if ((this.BTp[i] & this.SS) == 0)
          break;
        AppMethodBeat.o(91237);
        continue;
        i = paramMotionEvent.getPointerId(m);
        f1 = paramMotionEvent.getX(m);
        f2 = paramMotionEvent.getY(m);
        a(f1, f2, i);
        if (this.SG == 0)
        {
          v(F((int)f1, (int)f2), i);
          AppMethodBeat.o(91237);
        }
        else
        {
          if (!E((int)f1, (int)f2))
            break;
          v(this.SU, i);
          AppMethodBeat.o(91237);
          continue;
          if (this.SG == 1)
          {
            i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
            f1 = paramMotionEvent.getX(i);
            f2 = paramMotionEvent.getY(i);
            j = (int)(f1 - this.SJ[this.mActivePointerId]);
            i = (int)(f2 - this.SK[this.mActivePointerId]);
            i(this.SU.getLeft() + j, this.SU.getTop() + i, j, i);
            e(paramMotionEvent);
            AppMethodBeat.o(91237);
          }
          else
          {
            m = paramMotionEvent.getPointerCount();
            for (i = j; i < m; i++)
            {
              j = paramMotionEvent.getPointerId(i);
              float f3 = paramMotionEvent.getX(i);
              float f4 = paramMotionEvent.getY(i);
              f2 = f3 - this.SH[j];
              f1 = f4 - this.SI[j];
              b(f2, f1, j);
              if (this.SG == 1)
                break;
              View localView = F((int)f3, (int)f4);
              if ((c(localView, f2, f1)) && (v(localView, j)))
                break;
            }
            e(paramMotionEvent);
            AppMethodBeat.o(91237);
          }
        }
      }
    case 6:
      j = paramMotionEvent.getPointerId(m);
      if ((this.SG == 1) && (j == this.mActivePointerId))
      {
        m = paramMotionEvent.getPointerCount();
        label521: if (i >= m)
          break label667;
        k = paramMotionEvent.getPointerId(i);
        if (k == this.mActivePointerId)
          break label615;
        f1 = paramMotionEvent.getX(i);
        f2 = paramMotionEvent.getY(i);
        if ((F((int)f1, (int)f2) != this.SU) || (!v(this.SU, k)))
          break label615;
      }
      break;
    case 1:
    case 3:
    }
    label667: for (i = this.mActivePointerId; ; i = -1)
    {
      if (i == -1)
        eZ();
      aY(j);
      AppMethodBeat.o(91237);
      break label102;
      label615: i++;
      break label521;
      if (this.SG == 1)
        eZ();
      cancel();
      AppMethodBeat.o(91237);
      break label102;
      if (this.SG == 1)
        u(0.0F, 0.0F);
      cancel();
      break;
    }
  }

  final int h(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(91226);
    if (paramInt1 == 0)
    {
      paramInt1 = 0;
      AppMethodBeat.o(91226);
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
      AppMethodBeat.o(91226);
      break;
    }
  }

  public final boolean it(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(91241);
    if (!aZ(paramInt2))
      AppMethodBeat.o(91241);
    while (true)
    {
      return bool;
      int i;
      if ((paramInt1 & 0x1) == 1)
      {
        i = 1;
        label34: if ((paramInt1 & 0x2) != 2)
          break label124;
      }
      float f1;
      float f2;
      label124: for (paramInt1 = 1; ; paramInt1 = 0)
      {
        f1 = this.SJ[paramInt2] - this.SH[paramInt2];
        f2 = this.SK[paramInt2] - this.SI[paramInt2];
        if ((i == 0) || (paramInt1 == 0))
          break label138;
        if (f1 * f1 + f2 * f2 <= this.mTouchSlop * this.mTouchSlop)
          break label129;
        AppMethodBeat.o(91241);
        bool = true;
        break;
        i = 0;
        break label34;
      }
      label129: AppMethodBeat.o(91241);
      continue;
      label138: if (i != 0)
      {
        if (Math.abs(f1) > this.mTouchSlop)
        {
          AppMethodBeat.o(91241);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(91241);
        }
      }
      else if (paramInt1 != 0)
      {
        if (Math.abs(f2) > this.mTouchSlop)
        {
          AppMethodBeat.o(91241);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(91241);
        }
      }
      else
        AppMethodBeat.o(91241);
    }
  }

  public final boolean iu(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91242);
    boolean bool;
    if ((aZ(paramInt2)) && ((this.BTp[paramInt2] & paramInt1) != 0))
    {
      bool = true;
      AppMethodBeat.o(91242);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91242);
    }
  }

  final boolean v(View paramView, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(91236);
    if ((paramView == this.SU) && (this.mActivePointerId == paramInt))
      AppMethodBeat.o(91236);
    while (true)
    {
      return bool;
      if ((paramView != null) && (this.BTq.PG(paramInt)))
      {
        this.mActivePointerId = paramInt;
        u(paramView, paramInt);
        AppMethodBeat.o(91236);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(91236);
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

    public int dJm()
    {
      return 0;
    }

    public void o(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     me.imid.swipebacklayout.lib.a
 * JD-Core Version:    0.6.2
 */