package android.support.v7.widget;

import android.os.Build.VERSION;
import android.support.v4.os.f;
import android.support.v4.view.k;
import android.support.v4.view.s;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.ArrayList;

final class RecyclerView$u
  implements Runnable
{
  int apF;
  int apG;
  private boolean apH = false;
  private boolean apI = false;
  Interpolator mInterpolator = RecyclerView.aom;
  OverScroller qN;

  RecyclerView$u(RecyclerView paramRecyclerView)
  {
    this.qN = new OverScroller(paramRecyclerView.getContext(), RecyclerView.aom);
  }

  private int aH(int paramInt1, int paramInt2)
  {
    int i = Math.abs(paramInt1);
    int j = Math.abs(paramInt2);
    int k;
    int m;
    if (i > j)
    {
      k = 1;
      m = (int)Math.sqrt(0.0D);
      paramInt2 = (int)Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
      if (k == 0)
        break label131;
    }
    label131: for (paramInt1 = this.aoo.getWidth(); ; paramInt1 = this.aoo.getHeight())
    {
      int n = paramInt1 / 2;
      float f1 = Math.min(1.0F, paramInt2 * 1.0F / paramInt1);
      float f2 = n;
      float f3 = n;
      f1 = distanceInfluenceForSnapDuration(f1);
      if (m <= 0)
        break label142;
      paramInt1 = Math.round(1000.0F * Math.abs((f1 * f3 + f2) / m)) * 4;
      return Math.min(paramInt1, 2000);
      k = 0;
      break;
    }
    label142: if (k != 0);
    for (paramInt2 = i; ; paramInt2 = j)
    {
      paramInt1 = (int)((paramInt2 / paramInt1 + 1.0F) * 300.0F);
      break;
    }
  }

  private static float distanceInfluenceForSnapDuration(float paramFloat)
  {
    return (float)Math.sin((paramFloat - 0.5F) * 0.4712389F);
  }

  public final void a(int paramInt1, int paramInt2, Interpolator paramInterpolator)
  {
    int i = aH(paramInt1, paramInt2);
    Interpolator localInterpolator = paramInterpolator;
    if (paramInterpolator == null)
      localInterpolator = RecyclerView.aom;
    b(paramInt1, paramInt2, i, localInterpolator);
  }

  final void aG(int paramInt1, int paramInt2)
  {
    n(paramInt1, paramInt2, aH(paramInt1, paramInt2));
  }

  public final void b(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    if (this.mInterpolator != paramInterpolator)
    {
      this.mInterpolator = paramInterpolator;
      this.qN = new OverScroller(this.aoo.getContext(), paramInterpolator);
    }
    this.aoo.setScrollState(2);
    this.apG = 0;
    this.apF = 0;
    this.qN.startScroll(0, 0, paramInt1, paramInt2, paramInt3);
    if (Build.VERSION.SDK_INT < 23)
      this.qN.computeScrollOffset();
    ke();
  }

  final void ke()
  {
    if (this.apH)
      this.apI = true;
    while (true)
    {
      return;
      this.aoo.removeCallbacks(this);
      s.b(this.aoo, this);
    }
  }

  public final void n(int paramInt1, int paramInt2, int paramInt3)
  {
    b(paramInt1, paramInt2, paramInt3, RecyclerView.aom);
  }

  public final void run()
  {
    if (this.aoo.ank == null)
    {
      stop();
      return;
    }
    this.apI = false;
    this.apH = true;
    this.aoo.jk();
    OverScroller localOverScroller = this.qN;
    RecyclerView.r localr = this.aoo.ank.aoC;
    int i;
    int j;
    int k;
    int m;
    int n;
    if (localOverScroller.computeScrollOffset())
    {
      int[] arrayOfInt = RecyclerView.b(this.aoo);
      i = localOverScroller.getCurrX();
      j = localOverScroller.getCurrY();
      k = i - this.apF;
      m = j - this.apG;
      this.apF = i;
      this.apG = j;
      if (!this.aoo.a(k, m, arrayOfInt, null, 1))
        break label914;
      n = arrayOfInt[0];
      m -= arrayOfInt[1];
      k -= n;
    }
    label265: label783: label914: 
    while (true)
    {
      int i1;
      label225: int i2;
      int i3;
      int i4;
      if (this.aoo.Yq != null)
      {
        this.aoo.jl();
        this.aoo.jw();
        f.beginSection("RV Scroll");
        this.aoo.m(this.aoo.anY);
        if (k != 0)
        {
          n = this.aoo.ank.a(k, this.aoo.anc, this.aoo.anY);
          i1 = k - n;
          if (m != 0)
          {
            i2 = this.aoo.ank.b(m, this.aoo.anc, this.aoo.anY);
            i3 = m - i2;
            f.endSection();
            this.aoo.jP();
            this.aoo.al(true);
            this.aoo.ak(false);
            if ((localr != null) && (!localr.apf) && (localr.apg))
            {
              i4 = this.aoo.anY.getItemCount();
              if (i4 == 0)
              {
                localr.stop();
                i4 = i3;
                i3 = n;
              }
            }
          }
        }
      }
      while (true)
      {
        label338: if (!this.aoo.anm.isEmpty())
          this.aoo.invalidate();
        if (this.aoo.getOverScrollMode() != 2)
          this.aoo.al(k, m);
        int i5;
        if ((!this.aoo.a(i3, i2, i1, i4, null, 1)) && ((i1 != 0) || (i4 != 0)))
        {
          i5 = (int)localOverScroller.getCurrVelocity();
          if (i1 == i)
            break label875;
          if (i1 >= 0)
            break label783;
          n = -i5;
        }
        label434: label455: label585: label613: label875: for (int i6 = n; ; i6 = 0)
        {
          if (i4 != j)
            if (i4 < 0)
              n = -i5;
          while (true)
          {
            if (this.aoo.getOverScrollMode() != 2)
              this.aoo.am(i6, n);
            if (((i6 != 0) || (i1 == i) || (localOverScroller.getFinalX() == 0)) && ((n != 0) || (i4 == j) || (localOverScroller.getFinalY() == 0)))
              localOverScroller.abortAnimation();
            if ((i3 != 0) || (i2 != 0))
              this.aoo.aq(i3, i2);
            if (!RecyclerView.c(this.aoo))
              this.aoo.invalidate();
            if ((m != 0) && (this.aoo.ank.iH()) && (i2 == m))
            {
              n = 1;
              if ((k == 0) || (!this.aoo.ank.iG()) || (i3 != k))
                break label822;
              i3 = 1;
              if (((k != 0) || (m != 0)) && (i3 == 0) && (n == 0))
                break label828;
              n = 1;
              label636: if ((!localOverScroller.isFinished()) && ((n != 0) || (this.aoo.getScrollingChildHelper().aI(1))))
                break label834;
              this.aoo.setScrollState(0);
              if (RecyclerView.access$800())
                this.aoo.anX.ig();
              this.aoo.aJ(1);
            }
            while (true)
            {
              if (localr != null)
              {
                if (localr.apf)
                  RecyclerView.r.a(localr, 0, 0);
                if (!this.apI)
                  localr.stop();
              }
              this.apH = false;
              if (!this.apI)
                break;
              ke();
              break;
              if (localr.ape >= i4)
                localr.ape = (i4 - 1);
              RecyclerView.r.a(localr, k - i1, m - i3);
              i4 = i3;
              i3 = n;
              break label338;
              if (i1 > 0)
              {
                n = i5;
                break label434;
              }
              n = 0;
              break label434;
              n = i5;
              if (i4 > 0)
                break label455;
              n = 0;
              break label455;
              n = 0;
              break label585;
              i3 = 0;
              break label613;
              n = 0;
              break label636;
              ke();
              if (this.aoo.anW != null)
                this.aoo.anW.b(this.aoo, k, m);
            }
            n = 0;
          }
        }
        label822: label828: label834: i3 = 0;
        i2 = 0;
        break label265;
        i1 = 0;
        n = 0;
        break label225;
        i4 = 0;
        i1 = 0;
        i2 = 0;
        i3 = 0;
      }
    }
  }

  public final void stop()
  {
    this.aoo.removeCallbacks(this);
    this.qN.abortAnimation();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.u
 * JD-Core Version:    0.6.2
 */