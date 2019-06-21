package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.c;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

public final class StaggeredGridLayoutManager extends RecyclerView.i
  implements RecyclerView.r.b
{
  private int akU;
  boolean alC;
  boolean alD;
  private boolean alF;
  int alG;
  int alH;
  StaggeredGridLayoutManager.b[] arR;
  am arS;
  am arT;
  private int arU;
  private final ag arV;
  private BitSet arW;
  StaggeredGridLayoutManager.LazySpanLookup arX;
  private int arY;
  private boolean arZ;
  private boolean asa;
  private StaggeredGridLayoutManager.SavedState asb;
  private int asc;
  private final StaggeredGridLayoutManager.a asd;
  private boolean ase;
  private int[] asf;
  private final Runnable asg;
  private int mOrientation;
  private final Rect oT;

  private int a(RecyclerView.o paramo, ag paramag, RecyclerView.s params)
  {
    this.arW.set(0, this.akU, true);
    int i;
    int j;
    label61: int k;
    label64: View localView;
    StaggeredGridLayoutManager.LayoutParams localLayoutParams;
    int m;
    int n;
    label139: StaggeredGridLayoutManager.b localb;
    label160: label171: label192: label224: int i1;
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem;
    int i2;
    if (this.arV.alm)
      if (paramag.sE == 1)
      {
        i = 2147483647;
        aK(paramag.sE, i);
        if (!this.alD)
          break label552;
        j = this.arS.jf();
        k = 0;
        if ((!paramag.b(params)) || ((!this.arV.alm) && (this.arW.isEmpty())))
          break label868;
        localView = paramag.a(paramo);
        localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
        m = localLayoutParams.aoM.ki();
        k = this.arX.cM(m);
        if (k != -1)
          break label564;
        n = 1;
        if (n == 0)
          break label580;
        if (!localLayoutParams.asl)
          break label570;
        localb = this.arR[0];
        this.arX.a(m, localb);
        localLayoutParams.ask = localb;
        if (paramag.sE != 1)
          break label592;
        addView(localView);
        a(localView, localLayoutParams);
        if (paramag.sE != 1)
          break label614;
        if (!localLayoutParams.asl)
          break label602;
        k = cG(j);
        i1 = this.arS.bj(localView) + k;
        if ((n == 0) || (!localLayoutParams.asl))
          break label967;
        localFullSpanItem = cC(k);
        localFullSpanItem.asn = -1;
        localFullSpanItem.mPosition = m;
        this.arX.a(localFullSpanItem);
        i2 = k;
      }
    while (true)
    {
      if ((localLayoutParams.asl) && (paramag.ali == -1))
      {
        if (n == 0)
        {
          if (paramag.sE != 1)
            break label712;
          if (kU())
            break label706;
          k = 1;
          label324: if (k == 0)
            break label356;
          localFullSpanItem = this.arX.cQ(m);
          if (localFullSpanItem != null)
            localFullSpanItem.asp = true;
        }
        this.ase = true;
      }
      label356: a(localView, localLayoutParams, paramag);
      if ((ib()) && (this.mOrientation == 1))
        if (localLayoutParams.asl)
        {
          k = this.arT.jf();
          label397: m = k - this.arT.bj(localView);
          n = k;
          k = m;
          if (this.mOrientation != 1)
            break label818;
          k(localView, k, i2, n, i1);
          label440: if (!localLayoutParams.asl)
            break label834;
          aK(this.arV.sE, i);
          label461: a(paramo, this.arV);
          if ((this.arV.all) && (localView.hasFocusable()))
          {
            if (!localLayoutParams.asl)
              break label852;
            this.arW.clear();
          }
        }
      while (true)
      {
        k = 1;
        break label64;
        i = -2147483648;
        break;
        if (paramag.sE == 1)
        {
          i = paramag.alk + paramag.alg;
          break;
        }
        i = paramag.alj - paramag.alg;
        break;
        label552: j = this.arS.je();
        break label61;
        label564: n = 0;
        break label139;
        label570: localb = a(paramag);
        break label160;
        label580: localb = this.arR[k];
        break label171;
        label592: addView(localView, 0);
        break label192;
        label602: k = localb.cT(j);
        break label224;
        label614: if (localLayoutParams.asl);
        for (k = cF(j); ; k = localb.cS(j))
        {
          i2 = k - this.arS.bj(localView);
          if ((n != 0) && (localLayoutParams.asl))
          {
            localFullSpanItem = cD(k);
            localFullSpanItem.asn = 1;
            localFullSpanItem.mPosition = m;
            this.arX.a(localFullSpanItem);
          }
          i1 = k;
          break;
        }
        label706: k = 0;
        break label324;
        label712: if (!kV())
        {
          k = 1;
          break label324;
        }
        k = 0;
        break label324;
        k = this.arT.jf() - (this.akU - 1 - localb.mIndex) * this.arU;
        break label397;
        if (localLayoutParams.asl);
        for (k = this.arT.je(); ; k = localb.mIndex * this.arU + this.arT.je())
        {
          n = k + this.arT.bj(localView);
          break;
        }
        label818: k(localView, i2, k, i1, n);
        break label440;
        label834: a(localb, this.arV.sE, i);
        break label461;
        label852: this.arW.set(localb.mIndex, false);
      }
      label868: if (k == 0)
        a(paramo, this.arV);
      if (this.arV.sE == -1)
      {
        i = cF(this.arS.je());
        i = this.arS.je() - i;
        if (i <= 0)
          break label961;
      }
      label961: for (i = Math.min(paramag.alg, i); ; i = 0)
      {
        return i;
        i = cG(this.arS.jf()) - this.arS.jf();
        break;
      }
      label967: i2 = k;
    }
  }

  private StaggeredGridLayoutManager.b a(ag paramag)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    if (cI(paramag.sE))
    {
      i = this.akU - 1;
      j = -1;
      k = -1;
      if (paramag.sE != 1)
        break label123;
      m = 2147483647;
      n = this.arS.je();
      i1 = i;
      paramag = (ag)localObject2;
      i = m;
      label60: localObject2 = paramag;
      if (i1 == k)
        break label194;
      localObject2 = this.arR[i1];
      m = ((StaggeredGridLayoutManager.b)localObject2).cT(n);
      if (m >= i)
        break label199;
      paramag = (ag)localObject2;
      i = m;
    }
    label194: label196: label199: 
    while (true)
    {
      i1 += j;
      break label60;
      i = 0;
      k = this.akU;
      j = 1;
      break;
      label123: m = -2147483648;
      n = this.arS.jf();
      i1 = i;
      paramag = localObject1;
      i = m;
      localObject2 = paramag;
      if (i1 != k)
      {
        localObject2 = this.arR[i1];
        m = ((StaggeredGridLayoutManager.b)localObject2).cS(n);
        if (m <= i)
          break label196;
        paramag = (ag)localObject2;
        i = m;
      }
      while (true)
      {
        i1 += j;
        break;
        return localObject2;
      }
    }
  }

  private void a(int paramInt, RecyclerView.s params)
  {
    boolean bool1 = false;
    this.arV.alg = 0;
    this.arV.alh = paramInt;
    int i;
    boolean bool3;
    if (jV())
    {
      i = params.ape;
      if (i != -1)
      {
        boolean bool2 = this.alD;
        if (i < paramInt)
        {
          bool3 = true;
          if (bool2 != bool3)
            break label173;
          paramInt = this.arS.jg();
          i = 0;
        }
      }
    }
    while (true)
    {
      label70: if (getClipToPadding())
      {
        this.arV.alj = (this.arS.je() - i);
        this.arV.alk = (paramInt + this.arS.jf());
      }
      while (true)
      {
        this.arV.all = false;
        this.arV.alf = true;
        params = this.arV;
        bool3 = bool1;
        if (this.arS.getMode() == 0)
        {
          bool3 = bool1;
          if (this.arS.getEnd() == 0)
            bool3 = true;
        }
        params.alm = bool3;
        return;
        bool3 = false;
        break;
        label173: i = this.arS.jg();
        paramInt = 0;
        break label70;
        this.arV.alk = (paramInt + this.arS.getEnd());
        this.arV.alj = (-i);
      }
      paramInt = 0;
      i = 0;
    }
  }

  private void a(RecyclerView.o paramo, int paramInt)
  {
    while (true)
    {
      View localView;
      StaggeredGridLayoutManager.LayoutParams localLayoutParams;
      if (getChildCount() > 0)
      {
        localView = getChildAt(0);
        if ((this.arS.bg(localView) <= paramInt) && (this.arS.bh(localView) <= paramInt))
        {
          localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.asl)
            break label118;
          i = 0;
          if (i >= this.akU)
            break label90;
          if (this.arR[i].asv.size() != 1)
            break label84;
        }
      }
      label84: label90: label118: 
      while (localLayoutParams.ask.asv.size() == 1)
      {
        while (true)
        {
          return;
          i++;
        }
        for (int i = 0; i < this.akU; i++)
          this.arR[i].lf();
      }
      localLayoutParams.ask.lf();
      a(localView, paramo);
    }
  }

  private void a(RecyclerView.o paramo, RecyclerView.s params, boolean paramBoolean)
  {
    int i = cG(-2147483648);
    if (i == -2147483648);
    while (true)
    {
      return;
      i = this.arS.jf() - i;
      if (i > 0)
      {
        i -= -c(-i, paramo, params);
        if ((paramBoolean) && (i > 0))
          this.arS.cc(i);
      }
    }
  }

  private void a(RecyclerView.o paramo, ag paramag)
  {
    if ((!paramag.alf) || (paramag.alm));
    while (true)
    {
      return;
      if (paramag.alg != 0)
        break;
      if (paramag.sE == -1)
        b(paramo, paramag.alk);
      else
        a(paramo, paramag.alj);
    }
    if (paramag.sE == -1)
    {
      i = paramag.alj - cE(paramag.alj);
      if (i < 0);
      for (i = paramag.alk; ; i = paramag.alk - Math.min(i, paramag.alg))
      {
        b(paramo, i);
        break;
      }
    }
    int j = cH(paramag.alk) - paramag.alk;
    if (j < 0);
    for (int i = paramag.alj; ; i = Math.min(j, paramag.alg) + i)
    {
      a(paramo, i);
      break;
      i = paramag.alj;
    }
  }

  private void a(StaggeredGridLayoutManager.b paramb, int paramInt1, int paramInt2)
  {
    int i = paramb.asy;
    if (paramInt1 == -1)
      if (i + paramb.la() <= paramInt2)
        this.arW.set(paramb.mIndex, false);
    while (true)
    {
      return;
      if (paramb.lc() - i >= paramInt2)
        this.arW.set(paramb.mIndex, false);
    }
  }

  private void a(View paramView, StaggeredGridLayoutManager.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams.asl)
      if (this.mOrientation == 1)
        l(paramView, this.asc, c(this.mHeight, this.aoK, getPaddingTop() + getPaddingBottom(), paramLayoutParams.height, true));
    while (true)
    {
      return;
      l(paramView, c(this.mWidth, this.aoJ, getPaddingLeft() + getPaddingRight(), paramLayoutParams.width, true), this.asc);
      continue;
      if (this.mOrientation == 1)
        l(paramView, c(this.arU, this.aoJ, 0, paramLayoutParams.width, false), c(this.mHeight, this.aoK, getPaddingTop() + getPaddingBottom(), paramLayoutParams.height, true));
      else
        l(paramView, c(this.mWidth, this.aoJ, getPaddingLeft() + getPaddingRight(), paramLayoutParams.width, true), c(this.arU, this.aoK, 0, paramLayoutParams.height, false));
    }
  }

  private void a(View paramView, StaggeredGridLayoutManager.LayoutParams paramLayoutParams, ag paramag)
  {
    if (paramag.sE == 1)
      if (paramLayoutParams.asl)
        bM(paramView);
    while (true)
    {
      return;
      paramLayoutParams.ask.bP(paramView);
      continue;
      if (paramLayoutParams.asl)
        bN(paramView);
      else
        paramLayoutParams.ask.bO(paramView);
    }
  }

  private boolean a(StaggeredGridLayoutManager.b paramb)
  {
    boolean bool;
    if (this.alD)
    {
      if (paramb.lc() >= this.arS.jf())
        break label108;
      if (!((StaggeredGridLayoutManager.LayoutParams)((View)paramb.asv.get(paramb.asv.size() - 1)).getLayoutParams()).asl)
        bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if (paramb.la() > this.arS.je())
      {
        if (!((StaggeredGridLayoutManager.LayoutParams)((View)paramb.asv.get(0)).getLayoutParams()).asl)
          bool = true;
        else
          bool = false;
      }
      else
        label108: bool = false;
    }
  }

  private void aK(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < this.akU; i++)
      if (!this.arR[i].asv.isEmpty())
        a(this.arR[i], paramInt1, paramInt2);
  }

  private View at(boolean paramBoolean)
  {
    int i = this.arS.je();
    int j = this.arS.jf();
    int k = getChildCount();
    Object localObject1 = null;
    int m = 0;
    Object localObject2;
    if (m < k)
    {
      View localView = getChildAt(m);
      int n = this.arS.bf(localView);
      if ((this.arS.bg(localView) <= i) || (n >= j))
        break label116;
      localObject2 = localView;
      if (n < i)
      {
        if (!paramBoolean)
          localObject2 = localView;
      }
      else
        label91: return localObject2;
      if (localObject1 != null)
        break label116;
      localObject1 = localView;
    }
    label116: 
    while (true)
    {
      m++;
      break;
      localObject2 = localObject1;
      break label91;
    }
  }

  private View au(boolean paramBoolean)
  {
    int i = this.arS.je();
    int j = this.arS.jf();
    Object localObject1 = null;
    int k = getChildCount() - 1;
    Object localObject2;
    if (k >= 0)
    {
      View localView = getChildAt(k);
      int m = this.arS.bf(localView);
      int n = this.arS.bg(localView);
      if ((n <= i) || (m >= j))
        break label117;
      localObject2 = localView;
      if (n > j)
      {
        if (!paramBoolean)
          localObject2 = localView;
      }
      else
        label92: return localObject2;
      if (localObject1 != null)
        break label117;
      localObject1 = localView;
    }
    label117: 
    while (true)
    {
      k--;
      break;
      localObject2 = localObject1;
      break label92;
    }
  }

  private void b(int paramInt, RecyclerView.s params)
  {
    int i;
    int j;
    if (paramInt > 0)
    {
      i = kW();
      j = 1;
    }
    while (true)
    {
      this.arV.alf = true;
      a(i, params);
      cB(j);
      params = this.arV;
      params.alh = (i + params.ali);
      this.arV.alg = Math.abs(paramInt);
      return;
      j = -1;
      i = kX();
    }
  }

  private void b(RecyclerView.o paramo, int paramInt)
  {
    for (int i = getChildCount() - 1; ; i--)
    {
      View localView;
      StaggeredGridLayoutManager.LayoutParams localLayoutParams;
      if (i >= 0)
      {
        localView = getChildAt(i);
        if ((this.arS.bf(localView) >= paramInt) && (this.arS.bi(localView) >= paramInt))
        {
          localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.asl)
            break label126;
          j = 0;
          if (j >= this.akU)
            break label98;
          if (this.arR[j].asv.size() != 1)
            break label92;
        }
      }
      label92: label98: label126: 
      while (localLayoutParams.ask.asv.size() == 1)
      {
        while (true)
        {
          return;
          j++;
        }
        for (int j = 0; j < this.akU; j++)
          this.arR[j].le();
      }
      localLayoutParams.ask.le();
      a(localView, paramo);
    }
  }

  private void b(RecyclerView.o paramo, RecyclerView.s params, boolean paramBoolean)
  {
    int i = cF(2147483647);
    if (i == 2147483647);
    while (true)
    {
      return;
      i -= this.arS.je();
      if (i > 0)
      {
        i -= c(i, paramo, params);
        if ((paramBoolean) && (i > 0))
          this.arS.cc(-i);
      }
    }
  }

  private void bM(View paramView)
  {
    for (int i = this.akU - 1; i >= 0; i--)
      this.arR[i].bP(paramView);
  }

  private void bN(View paramView)
  {
    for (int i = this.akU - 1; i >= 0; i--)
      this.arR[i].bO(paramView);
  }

  private int c(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    if ((getChildCount() == 0) || (paramInt == 0))
    {
      i = 0;
      return i;
    }
    b(paramInt, params);
    int j = a(paramo, this.arV, params);
    int i = paramInt;
    if (this.arV.alg >= j)
      if (paramInt >= 0)
        break label97;
    label97: for (i = -j; ; i = j)
    {
      this.arS.cc(-i);
      this.arZ = this.alD;
      this.arV.alg = 0;
      a(paramo, this.arV);
      break;
    }
  }

  private void cA(int paramInt)
  {
    this.arU = (paramInt / this.akU);
    this.asc = View.MeasureSpec.makeMeasureSpec(paramInt, this.arT.getMode());
  }

  private void cB(int paramInt)
  {
    int i = 1;
    this.arV.sE = paramInt;
    ag localag = this.arV;
    boolean bool1 = this.alD;
    boolean bool2;
    if (paramInt == -1)
    {
      bool2 = true;
      if (bool1 != bool2)
        break label50;
    }
    label50: for (paramInt = i; ; paramInt = -1)
    {
      localag.ali = paramInt;
      return;
      bool2 = false;
      break;
    }
  }

  private StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem cC(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
    localFullSpanItem.aso = new int[this.akU];
    for (int i = 0; i < this.akU; i++)
      localFullSpanItem.aso[i] = (paramInt - this.arR[i].cT(paramInt));
    return localFullSpanItem;
  }

  private StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem cD(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
    localFullSpanItem.aso = new int[this.akU];
    for (int i = 0; i < this.akU; i++)
      localFullSpanItem.aso[i] = (this.arR[i].cS(paramInt) - paramInt);
    return localFullSpanItem;
  }

  private int cE(int paramInt)
  {
    int i = this.arR[0].cS(paramInt);
    int j = 1;
    while (j < this.akU)
    {
      int k = this.arR[j].cS(paramInt);
      int m = i;
      if (k > i)
        m = k;
      j++;
      i = m;
    }
    return i;
  }

  private int cF(int paramInt)
  {
    int i = this.arR[0].cS(paramInt);
    int j = 1;
    while (j < this.akU)
    {
      int k = this.arR[j].cS(paramInt);
      int m = i;
      if (k < i)
        m = k;
      j++;
      i = m;
    }
    return i;
  }

  private int cG(int paramInt)
  {
    int i = this.arR[0].cT(paramInt);
    int j = 1;
    while (j < this.akU)
    {
      int k = this.arR[j].cT(paramInt);
      int m = i;
      if (k > i)
        m = k;
      j++;
      i = m;
    }
    return i;
  }

  private int cH(int paramInt)
  {
    int i = this.arR[0].cT(paramInt);
    int j = 1;
    while (j < this.akU)
    {
      int k = this.arR[j].cT(paramInt);
      int m = i;
      if (k < i)
        m = k;
      j++;
      i = m;
    }
    return i;
  }

  private boolean cI(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (this.mOrientation == 0)
    {
      if (paramInt == -1)
      {
        bool2 = true;
        if (bool2 == this.alD)
          break label33;
      }
      label33: for (bool2 = bool1; ; bool2 = false)
      {
        return bool2;
        bool2 = false;
        break;
      }
    }
    if (paramInt == -1)
    {
      bool2 = true;
      label45: if (bool2 != this.alD)
        break label77;
    }
    label77: for (int i = 1; ; i = 0)
    {
      bool2 = bool1;
      if (i == ib())
        break;
      bool2 = false;
      break;
      bool2 = false;
      break label45;
    }
  }

  private int cJ(int paramInt)
  {
    int i = 1;
    if (getChildCount() == 0)
    {
      if (this.alD);
      for (paramInt = i; ; paramInt = -1)
        return paramInt;
    }
    if (paramInt < kX());
    for (int j = 1; ; j = 0)
    {
      paramInt = i;
      if (j == this.alD)
        break;
      paramInt = -1;
      break;
    }
  }

  private void iI()
  {
    boolean bool = true;
    if ((this.mOrientation == 1) || (!ib()))
      bool = this.alC;
    while (true)
    {
      this.alD = bool;
      return;
      if (this.alC)
        bool = false;
    }
  }

  private boolean ib()
  {
    boolean bool = true;
    if (s.T(this.aiB) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private int j(RecyclerView.s params)
  {
    boolean bool1 = true;
    int i = 0;
    if (getChildCount() == 0)
      return i;
    am localam = this.arS;
    label29: View localView;
    if (!this.alF)
    {
      bool2 = true;
      localView = at(bool2);
      if (this.alF)
        break label80;
    }
    label80: for (boolean bool2 = bool1; ; bool2 = false)
    {
      i = at.a(params, localam, localView, au(bool2), this, this.alF, this.alD);
      break;
      bool2 = false;
      break label29;
    }
  }

  private int k(RecyclerView.s params)
  {
    boolean bool1 = true;
    int i = 0;
    if (getChildCount() == 0)
      return i;
    am localam = this.arS;
    label29: View localView;
    if (!this.alF)
    {
      bool2 = true;
      localView = at(bool2);
      if (this.alF)
        break label76;
    }
    label76: for (boolean bool2 = bool1; ; bool2 = false)
    {
      i = at.a(params, localam, localView, au(bool2), this, this.alF);
      break;
      bool2 = false;
      break label29;
    }
  }

  private boolean kS()
  {
    boolean bool = true;
    if ((getChildCount() == 0) || (this.arY == 0) || (!this.pv))
      bool = false;
    int i;
    int j;
    while (true)
    {
      return bool;
      if (this.alD)
        i = kW();
      for (j = kX(); ; j = kW())
      {
        if ((i != 0) || (kT() == null))
          break label87;
        this.arX.clear();
        this.aoD = true;
        requestLayout();
        break;
        i = kX();
      }
      label87: if (this.ase)
        break;
      bool = false;
    }
    if (this.alD);
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem1;
    for (int k = -1; ; k = 1)
    {
      localFullSpanItem1 = this.arX.q(i, j + 1, k);
      if (localFullSpanItem1 != null)
        break label156;
      this.ase = false;
      this.arX.cK(j + 1);
      bool = false;
      break;
    }
    label156: StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem2 = this.arX.q(i, localFullSpanItem1.mPosition, k * -1);
    if (localFullSpanItem2 == null)
      this.arX.cK(localFullSpanItem1.mPosition);
    while (true)
    {
      this.aoD = true;
      requestLayout();
      break;
      this.arX.cK(localFullSpanItem2.mPosition + 1);
    }
  }

  private View kT()
  {
    int i = getChildCount() - 1;
    BitSet localBitSet = new BitSet(this.akU);
    localBitSet.set(0, this.akU, true);
    int j;
    int k;
    label56: int m;
    label65: int n;
    View localView;
    StaggeredGridLayoutManager.LayoutParams localLayoutParams;
    if ((this.mOrientation == 1) && (ib()))
    {
      j = 1;
      if (!this.alD)
        break label128;
      k = -1;
      if (i >= k)
        break label146;
      m = 1;
      n = i;
      if (n == k)
        break label352;
      localView = getChildAt(n);
      localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
      if (!localBitSet.get(localLayoutParams.ask.mIndex))
        break label164;
      if (!a(localLayoutParams.ask))
        break label152;
    }
    label120: Object localObject;
    label128: label146: label152: label164: int i1;
    do
    {
      return localView;
      j = -1;
      break;
      k = 0;
      m = i + 1;
      i = k;
      k = m;
      break label56;
      m = -1;
      break label65;
      localBitSet.clear(localLayoutParams.ask.mIndex);
      if ((localLayoutParams.asl) || (n + m == k))
        break label342;
      localObject = getChildAt(n + m);
      if (!this.alD)
        break label290;
      i = this.arS.bg(localView);
      i1 = this.arS.bg((View)localObject);
    }
    while (i < i1);
    if (i == i1)
      i = 1;
    while (true)
    {
      label238: if (i != 0)
      {
        localObject = (StaggeredGridLayoutManager.LayoutParams)((View)localObject).getLayoutParams();
        if (localLayoutParams.ask.mIndex - ((StaggeredGridLayoutManager.LayoutParams)localObject).ask.mIndex < 0)
        {
          i = 1;
          if (j >= 0)
            break label336;
        }
        for (i1 = 1; ; i1 = 0)
        {
          if (i == i1)
            break label342;
          break;
          i = this.arS.bf(localView);
          i1 = this.arS.bf((View)localObject);
          if (i > i1)
            break;
          if (i != i1)
            break label358;
          i = 1;
          break label238;
          i = 0;
          break label274;
        }
      }
      label274: label290: label336: label342: n += m;
      break;
      label352: localView = null;
      break label120;
      label358: i = 0;
    }
  }

  private boolean kU()
  {
    boolean bool1 = true;
    int i = this.arR[0].cT(-2147483648);
    for (int j = 1; ; j++)
    {
      boolean bool2 = bool1;
      if (j < this.akU)
      {
        if (this.arR[j].cT(-2147483648) != i)
          bool2 = false;
      }
      else
        return bool2;
    }
  }

  private boolean kV()
  {
    boolean bool1 = true;
    int i = this.arR[0].cS(-2147483648);
    for (int j = 1; ; j++)
    {
      boolean bool2 = bool1;
      if (j < this.akU)
      {
        if (this.arR[j].cS(-2147483648) != i)
          bool2 = false;
      }
      else
        return bool2;
    }
  }

  private int kW()
  {
    int i = getChildCount();
    if (i == 0);
    for (i = 0; ; i = bt(getChildAt(i - 1)))
      return i;
  }

  private int kX()
  {
    int i = 0;
    if (getChildCount() == 0);
    while (true)
    {
      return i;
      i = bt(getChildAt(0));
    }
  }

  private int l(RecyclerView.s params)
  {
    boolean bool1 = true;
    int i = 0;
    if (getChildCount() == 0)
      return i;
    am localam = this.arS;
    label29: View localView;
    if (!this.alF)
    {
      bool2 = true;
      localView = at(bool2);
      if (this.alF)
        break label76;
    }
    label76: for (boolean bool2 = bool1; ; bool2 = false)
    {
      i = at.b(params, localam, localView, au(bool2), this, this.alF);
      break;
      bool2 = false;
      break label29;
    }
  }

  private void l(View paramView, int paramInt1, int paramInt2)
  {
    g(paramView, this.oT);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
    paramInt1 = o(paramInt1, localLayoutParams.leftMargin + this.oT.left, localLayoutParams.rightMargin + this.oT.right);
    paramInt2 = o(paramInt2, localLayoutParams.topMargin + this.oT.top, localLayoutParams.bottomMargin + this.oT.bottom);
    if (b(paramView, paramInt1, paramInt2, localLayoutParams))
      paramView.measure(paramInt1, paramInt2);
  }

  private static int o(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if ((paramInt2 == 0) && (paramInt3 == 0))
      i = paramInt1;
    while (true)
    {
      return i;
      int j = View.MeasureSpec.getMode(paramInt1);
      if (j != -2147483648)
      {
        i = paramInt1;
        if (j != 1073741824);
      }
      else
      {
        i = View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), j);
      }
    }
  }

  private void p(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    int j;
    int k;
    if (this.alD)
    {
      i = kW();
      if (paramInt3 != 8)
        break label104;
      if (paramInt1 >= paramInt2)
        break label93;
      j = paramInt2 + 1;
      k = paramInt1;
      label32: this.arX.cL(k);
      switch (paramInt3)
      {
      default:
        label76: if (j > i)
          break;
      case 1:
      case 2:
      case 8:
      }
    }
    label191: 
    while (true)
    {
      return;
      i = kX();
      break;
      label93: j = paramInt1 + 1;
      k = paramInt2;
      break label32;
      label104: j = paramInt1 + paramInt2;
      k = paramInt1;
      break label32;
      this.arX.aN(paramInt1, paramInt2);
      break label76;
      this.arX.aL(paramInt1, paramInt2);
      break label76;
      this.arX.aL(paramInt1, 1);
      this.arX.aN(paramInt2, 1);
      break label76;
      if (this.alD);
      for (paramInt1 = kX(); ; paramInt1 = kW())
      {
        if (k > paramInt1)
          break label191;
        requestLayout();
        break;
      }
    }
  }

  public final void T(String paramString)
  {
    if (this.asb == null)
      super.T(paramString);
  }

  public final int a(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    return c(paramInt, paramo, params);
  }

  public final int a(RecyclerView.o paramo, RecyclerView.s params)
  {
    if (this.mOrientation == 0);
    for (int i = this.akU; ; i = super.a(paramo, params))
      return i;
  }

  public final RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new StaggeredGridLayoutManager.LayoutParams(paramContext, paramAttributeSet);
  }

  public final View a(View paramView, int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    if (getChildCount() == 0)
      paramView = null;
    label393: label537: label667: 
    while (true)
    {
      return paramView;
      View localView = bl(paramView);
      label571: label727: label733: if (localView == null)
      {
        paramView = null;
      }
      else
      {
        iI();
        switch (paramInt)
        {
        default:
          paramInt = -2147483648;
        case 1:
        case 2:
        case 33:
        case 130:
        case 17:
        case 66:
        }
        while (true)
        {
          if (paramInt != -2147483648)
            break label240;
          paramView = null;
          break;
          if (this.mOrientation == 1)
          {
            paramInt = -1;
          }
          else if (ib())
          {
            paramInt = 1;
          }
          else
          {
            paramInt = -1;
            continue;
            if (this.mOrientation == 1)
            {
              paramInt = 1;
            }
            else if (ib())
            {
              paramInt = -1;
            }
            else
            {
              paramInt = 1;
              continue;
              if (this.mOrientation == 1)
              {
                paramInt = -1;
              }
              else
              {
                paramInt = -2147483648;
                continue;
                if (this.mOrientation == 1)
                {
                  paramInt = 1;
                }
                else
                {
                  paramInt = -2147483648;
                  continue;
                  if (this.mOrientation == 0)
                  {
                    paramInt = -1;
                  }
                  else
                  {
                    paramInt = -2147483648;
                    continue;
                    if (this.mOrientation == 0)
                      paramInt = 1;
                    else
                      paramInt = -2147483648;
                  }
                }
              }
            }
          }
        }
        label240: paramView = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
        boolean bool = paramView.asl;
        StaggeredGridLayoutManager.b localb = paramView.ask;
        if (paramInt == 1);
        for (int i = kW(); ; i = kX())
        {
          a(i, params);
          cB(paramInt);
          paramView = this.arV;
          paramView.alh = (paramView.ali + i);
          this.arV.alg = ((int)(0.3333333F * this.arS.jg()));
          this.arV.all = true;
          this.arV.alf = false;
          a(paramo, this.arV, params);
          this.arZ = this.alD;
          if (bool)
            break label393;
          paramView = localb.aQ(i, paramInt);
          if ((paramView == null) || (paramView == localView))
            break label393;
          break;
        }
        if (cI(paramInt))
          for (j = this.akU - 1; ; j--)
          {
            if (j < 0)
              break label492;
            paramView = this.arR[j].aQ(i, paramInt);
            if ((paramView != null) && (paramView != localView))
              break;
          }
        for (int j = 0; ; j++)
        {
          if (j >= this.akU)
            break label492;
          paramView = this.arR[j].aQ(i, paramInt);
          if ((paramView != null) && (paramView != localView))
            break;
        }
        label492: if (!this.alC)
        {
          i = 1;
          label502: if (paramInt == -1)
          {
            j = 1;
            label510: if (i != j)
              break label637;
            i = 1;
            if (!bool)
            {
              if (i == 0)
                break label643;
              j = localb.lg();
              paramo = bW(j);
              if (paramo != null)
              {
                paramView = paramo;
                if (paramo != localView)
                  continue;
              }
            }
            if (!cI(paramInt))
              break label667;
            paramInt = this.akU - 1;
            if (paramInt < 0)
              break label733;
            if (paramInt != localb.mIndex)
              if (i == 0)
                break label653;
          }
        }
        else
        {
          for (j = this.arR[paramInt].lg(); ; j = this.arR[paramInt].lh())
          {
            paramo = bW(j);
            if (paramo != null)
            {
              paramView = paramo;
              if (paramo != localView)
                break;
            }
            paramInt--;
            break label571;
            i = 0;
            break label502;
            j = 0;
            break label510;
            label637: i = 0;
            break label520;
            j = localb.lh();
            break label537;
          }
          for (paramInt = 0; ; paramInt++)
          {
            if (paramInt >= this.akU)
              break label733;
            if (i != 0);
            for (j = this.arR[paramInt].lg(); ; j = this.arR[paramInt].lh())
            {
              paramView = bW(j);
              if ((paramView == null) || (paramView == localView))
                break label727;
              break;
            }
          }
          paramView = null;
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, RecyclerView.s params, RecyclerView.i.a parama)
  {
    int i = 0;
    if (this.mOrientation == 0)
      if ((getChildCount() != 0) && (paramInt1 != 0))
        break label27;
    while (true)
    {
      return;
      paramInt1 = paramInt2;
      break;
      label27: b(paramInt1, params);
      if ((this.asf == null) || (this.asf.length < this.akU))
        this.asf = new int[this.akU];
      paramInt2 = 0;
      paramInt1 = 0;
      if (paramInt2 < this.akU)
      {
        if (this.arV.ali == -1);
        for (int j = this.arV.alj - this.arR[paramInt2].cS(this.arV.alj); ; j = this.arR[paramInt2].cT(this.arV.alk) - this.arV.alk)
        {
          int k = paramInt1;
          if (j >= 0)
          {
            this.asf[paramInt1] = j;
            k = paramInt1 + 1;
          }
          paramInt2++;
          paramInt1 = k;
          break;
        }
      }
      Arrays.sort(this.asf, 0, paramInt1);
      for (paramInt2 = i; (paramInt2 < paramInt1) && (this.arV.b(params)); paramInt2++)
      {
        parama.T(this.arV.alh, this.asf[paramInt2]);
        ag localag = this.arV;
        localag.alh += this.arV.ali;
      }
    }
  }

  public final void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = getPaddingLeft();
    i = getPaddingRight() + i;
    int j = getPaddingTop() + getPaddingBottom();
    if (this.mOrientation == 1)
    {
      paramInt2 = l(paramInt2, j + paramRect.height(), s.aa(this.aiB));
      paramInt1 = l(paramInt1, i + this.arU * this.akU, s.Z(this.aiB));
    }
    while (true)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      return;
      paramInt1 = l(paramInt1, i + paramRect.width(), s.Z(this.aiB));
      paramInt2 = l(paramInt2, j + this.arU * this.akU, s.aa(this.aiB));
    }
  }

  public final void a(RecyclerView.o paramo, RecyclerView.s params, View paramView, b paramb)
  {
    int i = 1;
    paramo = paramView.getLayoutParams();
    if (!(paramo instanceof StaggeredGridLayoutManager.LayoutParams))
    {
      super.a(paramView, paramb);
      return;
    }
    paramo = (StaggeredGridLayoutManager.LayoutParams)paramo;
    int j;
    int m;
    int n;
    if (this.mOrientation == 0)
    {
      j = paramo.kY();
      if (paramo.asl)
        i = this.akU;
      int k = -1;
      m = -1;
      n = i;
      i = k;
    }
    while (true)
    {
      paramb.H(b.c.b(j, n, m, i, paramo.asl));
      break;
      m = paramo.kY();
      if (paramo.asl)
      {
        i = this.akU;
        n = -1;
        j = -1;
      }
      else
      {
        i = 1;
        n = -1;
        j = -1;
      }
    }
  }

  public final void a(RecyclerView.s params)
  {
    super.a(params);
    this.alG = -1;
    this.alH = -2147483648;
    this.asb = null;
    this.asd.reset();
  }

  public final void a(RecyclerView paramRecyclerView)
  {
    this.arX.clear();
    requestLayout();
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    paramRecyclerView = new ah(paramRecyclerView.getContext());
    paramRecyclerView.ape = paramInt;
    a(paramRecyclerView);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    p(paramInt1, paramInt2, 8);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    p(paramInt1, paramInt2, 4);
  }

  public final void a(RecyclerView paramRecyclerView, RecyclerView.o paramo)
  {
    super.a(paramRecyclerView, paramo);
    removeCallbacks(this.asg);
    for (int i = 0; i < this.akU; i++)
      this.arR[i].clear();
    paramRecyclerView.requestLayout();
  }

  public final boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof StaggeredGridLayoutManager.LayoutParams;
  }

  public final int b(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    return c(paramInt, paramo, params);
  }

  public final int b(RecyclerView.o paramo, RecyclerView.s params)
  {
    if (this.mOrientation == 1);
    for (int i = this.akU; ; i = super.b(paramo, params))
      return i;
  }

  public final PointF bX(int paramInt)
  {
    paramInt = cJ(paramInt);
    PointF localPointF = new PointF();
    if (paramInt == 0)
      localPointF = null;
    while (true)
    {
      return localPointF;
      if (this.mOrientation == 0)
      {
        localPointF.x = paramInt;
        localPointF.y = 0.0F;
      }
      else
      {
        localPointF.x = 0.0F;
        localPointF.y = paramInt;
      }
    }
  }

  public final void bY(int paramInt)
  {
    if ((this.asb != null) && (this.asb.alX != paramInt))
    {
      StaggeredGridLayoutManager.SavedState localSavedState = this.asb;
      localSavedState.ass = null;
      localSavedState.asr = 0;
      localSavedState.alX = -1;
      localSavedState.asq = -1;
    }
    this.alG = paramInt;
    this.alH = -2147483648;
    requestLayout();
  }

  public final void c(RecyclerView.o paramo, RecyclerView.s params)
  {
    int i = 1;
    StaggeredGridLayoutManager.a locala = this.asd;
    if (((this.asb != null) || (this.alG != -1)) && (params.getItemCount() == 0))
    {
      d(paramo);
      locala.reset();
      label40: return;
    }
    int j;
    int k;
    label111: int m;
    if ((!locala.alP) || (this.alG != -1) || (this.asb != null))
    {
      j = 1;
      if (j == 0)
        break label500;
      locala.reset();
      if (this.asb == null)
        break label648;
      if (this.asb.asr <= 0)
        break label264;
      if (this.asb.asr != this.akU)
        break label214;
      k = 0;
      if (k >= this.akU)
        break label264;
      this.arR[k].clear();
      m = this.asb.ass[k];
      n = m;
      if (m != -2147483648)
        if (!this.asb.alZ)
          break label199;
    }
    label199: for (int n = m + this.arS.jf(); ; n = m + this.arS.je())
    {
      this.arR[k].cU(n);
      k++;
      break label111;
      j = 0;
      break;
    }
    label214: Object localObject1 = this.asb;
    ((StaggeredGridLayoutManager.SavedState)localObject1).ass = null;
    ((StaggeredGridLayoutManager.SavedState)localObject1).asr = 0;
    ((StaggeredGridLayoutManager.SavedState)localObject1).ast = 0;
    ((StaggeredGridLayoutManager.SavedState)localObject1).asu = null;
    ((StaggeredGridLayoutManager.SavedState)localObject1).asm = null;
    this.asb.alX = this.asb.asq;
    label264: this.asa = this.asb.asa;
    boolean bool = this.asb.alC;
    T(null);
    if ((this.asb != null) && (this.asb.alC != bool))
      this.asb.alC = bool;
    this.alC = bool;
    requestLayout();
    iI();
    if (this.asb.alX != -1)
    {
      this.alG = this.asb.alX;
      locala.alO = this.asb.alZ;
      if (this.asb.ast > 1)
      {
        this.arX.mData = this.asb.asu;
        this.arX.asm = this.asb.asm;
      }
      label404: if ((!params.apv) && (this.alG != -1))
        break label664;
      n = 0;
      label422: if (n == 0)
      {
        if (!this.arZ)
          break label1180;
        m = params.getItemCount();
        n = getChildCount() - 1;
        label448: if (n < 0)
          break label1174;
        k = bt(getChildAt(n));
        if ((k < 0) || (k >= m))
          break label1168;
        n = k;
      }
    }
    label500: label887: int i2;
    while (true)
    {
      locala.mPosition = n;
      locala.Lp = -2147483648;
      locala.alP = true;
      if ((this.asb == null) && (this.alG == -1) && ((locala.alO != this.arZ) || (ib() != this.asa)))
      {
        this.arX.clear();
        locala.ash = true;
      }
      if ((getChildCount() <= 0) || ((this.asb != null) && (this.asb.asr > 0)))
        break label1544;
      if (!locala.ash)
        break label1241;
      for (n = 0; n < this.akU; n++)
      {
        this.arR[n].clear();
        if (locala.Lp != -2147483648)
          this.arR[n].cU(locala.Lp);
      }
      locala.alO = this.alD;
      break;
      label648: iI();
      locala.alO = this.alD;
      break label404;
      label664: if ((this.alG < 0) || (this.alG >= params.getItemCount()))
      {
        this.alG = -1;
        this.alH = -2147483648;
        n = 0;
        break label422;
      }
      if ((this.asb == null) || (this.asb.alX == -1) || (this.asb.asr <= 0))
      {
        localObject1 = bW(this.alG);
        if (localObject1 != null)
        {
          if (this.alD)
          {
            n = kW();
            label755: locala.mPosition = n;
            if (this.alH == -2147483648)
              break label851;
            if (!locala.alO)
              break label821;
          }
          label821: for (locala.Lp = (this.arS.jf() - this.alH - this.arS.bg((View)localObject1)); ; locala.Lp = (this.arS.je() + this.alH - this.arS.bf((View)localObject1)))
          {
            n = 1;
            break;
            n = kX();
            break label755;
          }
          label851: if (this.arS.bj((View)localObject1) > this.arS.jg())
            if (locala.alO)
            {
              n = this.arS.jf();
              locala.Lp = n;
            }
        }
      }
      while (true)
      {
        n = 1;
        break;
        n = this.arS.je();
        break label887;
        n = this.arS.bf((View)localObject1) - this.arS.je();
        if (n < 0)
        {
          locala.Lp = (-n);
        }
        else
        {
          n = this.arS.jf() - this.arS.bg((View)localObject1);
          if (n < 0)
          {
            locala.Lp = n;
          }
          else
          {
            locala.Lp = -2147483648;
            continue;
            locala.mPosition = this.alG;
            if (this.alH == -2147483648)
              if (cJ(locala.mPosition) == 1)
              {
                bool = true;
                label1025: locala.alO = bool;
                if (!locala.alO)
                  break label1075;
                n = locala.asj.arS.jf();
                label1053: locala.Lp = n;
              }
            while (true)
            {
              locala.ash = true;
              break;
              bool = false;
              break label1025;
              label1075: n = locala.asj.arS.je();
              break label1053;
              n = this.alH;
              if (locala.alO)
                locala.Lp = (locala.asj.arS.jf() - n);
              else
                locala.Lp = (n + locala.asj.arS.je());
            }
            locala.Lp = -2147483648;
            locala.mPosition = this.alG;
          }
        }
      }
      label1168: n--;
      break label448;
      label1174: n = 0;
      continue;
      label1180: int i1 = params.getItemCount();
      i2 = getChildCount();
      for (k = 0; ; k++)
      {
        if (k >= i2)
          break label1235;
        m = bt(getChildAt(k));
        if (m >= 0)
        {
          n = m;
          if (m < i1)
            break;
        }
      }
      label1235: n = 0;
    }
    label1241: label1376: Object localObject2;
    if ((j != 0) || (this.asd.asi == null))
    {
      j = 0;
      if (j < this.akU)
      {
        localObject1 = this.arR[j];
        bool = this.alD;
        m = locala.Lp;
        if (bool)
        {
          n = ((StaggeredGridLayoutManager.b)localObject1).cT(-2147483648);
          label1304: ((StaggeredGridLayoutManager.b)localObject1).clear();
          if ((n != -2147483648) && ((!bool) || (n >= ((StaggeredGridLayoutManager.b)localObject1).asj.arS.jf())) && ((bool) || (n <= ((StaggeredGridLayoutManager.b)localObject1).asj.arS.je())))
            break label1376;
        }
        while (true)
        {
          j++;
          break;
          n = ((StaggeredGridLayoutManager.b)localObject1).cS(-2147483648);
          break label1304;
          k = n;
          if (m != -2147483648)
            k = n + m;
          ((StaggeredGridLayoutManager.b)localObject1).asx = k;
          ((StaggeredGridLayoutManager.b)localObject1).asw = k;
        }
      }
      localObject1 = this.asd;
      localObject2 = this.arR;
      j = localObject2.length;
      if ((((StaggeredGridLayoutManager.a)localObject1).asi == null) || (((StaggeredGridLayoutManager.a)localObject1).asi.length < j))
        ((StaggeredGridLayoutManager.a)localObject1).asi = new int[((StaggeredGridLayoutManager.a)localObject1).asj.arR.length];
      n = 0;
    }
    while (n < j)
    {
      ((StaggeredGridLayoutManager.a)localObject1).asi[n] = localObject2[n].cS(-2147483648);
      n++;
      continue;
      for (n = 0; n < this.akU; n++)
      {
        localObject1 = this.arR[n];
        ((StaggeredGridLayoutManager.b)localObject1).clear();
        ((StaggeredGridLayoutManager.b)localObject1).cU(this.asd.asi[n]);
      }
    }
    label1544: b(paramo);
    this.arV.alf = false;
    this.ase = false;
    cA(this.arT.jg());
    a(locala.mPosition, params);
    label1643: float f1;
    if (locala.alO)
    {
      cB(-1);
      a(paramo, this.arV, params);
      cB(1);
      this.arV.alh = (locala.mPosition + this.arV.ali);
      a(paramo, this.arV, params);
      if (this.arT.getMode() == 1073741824)
        break label2028;
      f1 = 0.0F;
      k = getChildCount();
      n = 0;
      label1668: if (n >= k)
        break label1799;
      localObject1 = getChildAt(n);
      float f2 = this.arT.bj((View)localObject1);
      if (f2 < f1)
        break label2212;
      if (!((StaggeredGridLayoutManager.LayoutParams)((View)localObject1).getLayoutParams()).asl)
        break label2209;
      f2 = 1.0F * f2 / this.akU;
      label1729: f1 = Math.max(f1, f2);
    }
    label1799: label2056: label2204: label2209: label2212: 
    while (true)
    {
      n++;
      break label1668;
      cB(1);
      a(paramo, this.arV, params);
      cB(-1);
      this.arV.alh = (locala.mPosition + this.arV.ali);
      a(paramo, this.arV, params);
      break label1643;
      m = this.arU;
      j = Math.round(this.akU * f1);
      n = j;
      if (this.arT.getMode() == -2147483648)
        n = Math.min(j, this.arT.jg());
      cA(n);
      if (this.arU != m)
      {
        n = 0;
        if (n < k)
        {
          localObject1 = getChildAt(n);
          localObject2 = (StaggeredGridLayoutManager.LayoutParams)((View)localObject1).getLayoutParams();
          if (!((StaggeredGridLayoutManager.LayoutParams)localObject2).asl)
          {
            if ((!ib()) || (this.mOrientation != 1))
              break label1966;
            ((View)localObject1).offsetLeftAndRight(-(this.akU - 1 - ((StaggeredGridLayoutManager.LayoutParams)localObject2).ask.mIndex) * this.arU - -(this.akU - 1 - ((StaggeredGridLayoutManager.LayoutParams)localObject2).ask.mIndex) * m);
          }
          while (true)
          {
            n++;
            break;
            label1966: j = ((StaggeredGridLayoutManager.LayoutParams)localObject2).ask.mIndex * this.arU;
            i2 = ((StaggeredGridLayoutManager.LayoutParams)localObject2).ask.mIndex * m;
            if (this.mOrientation == 1)
              ((View)localObject1).offsetLeftAndRight(j - i2);
            else
              ((View)localObject1).offsetTopAndBottom(j - i2);
          }
        }
      }
      label2028: if (getChildCount() > 0)
      {
        if (this.alD)
        {
          a(paramo, params, true);
          b(paramo, params, false);
        }
      }
      else
      {
        j = 0;
        n = j;
        if (i != 0)
        {
          n = j;
          if (!params.apv)
            if ((this.arY == 0) || (getChildCount() <= 0) || ((!this.ase) && (kT() == null)))
              break label2204;
        }
      }
      for (i = 1; ; i = 0)
      {
        n = j;
        if (i != 0)
        {
          removeCallbacks(this.asg);
          n = j;
          if (kS())
            n = 1;
        }
        if (params.apv)
          this.asd.reset();
        this.arZ = locala.alO;
        this.asa = ib();
        if (n == 0)
          break label40;
        this.asd.reset();
        i = 0;
        break;
        b(paramo, params, true);
        a(paramo, params, false);
        break label2056;
      }
      break label1729;
    }
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    p(paramInt1, paramInt2, 1);
  }

  public final void ck(int paramInt)
  {
    super.ck(paramInt);
    for (int i = 0; i < this.akU; i++)
      this.arR[i].cV(paramInt);
  }

  public final void cl(int paramInt)
  {
    super.cl(paramInt);
    for (int i = 0; i < this.akU; i++)
      this.arR[i].cV(paramInt);
  }

  public final void cm(int paramInt)
  {
    if (paramInt == 0)
      kS();
  }

  public final int d(RecyclerView.s params)
  {
    return j(params);
  }

  public final RecyclerView.LayoutParams d(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams));
    for (paramLayoutParams = new StaggeredGridLayoutManager.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams); ; paramLayoutParams = new StaggeredGridLayoutManager.LayoutParams(paramLayoutParams))
      return paramLayoutParams;
  }

  public final void d(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    p(paramInt1, paramInt2, 2);
  }

  public final int e(RecyclerView.s params)
  {
    return j(params);
  }

  public final int f(RecyclerView.s params)
  {
    return k(params);
  }

  public final int g(RecyclerView.s params)
  {
    return k(params);
  }

  public final int h(RecyclerView.s params)
  {
    return l(params);
  }

  public final int i(RecyclerView.s params)
  {
    return l(params);
  }

  public final RecyclerView.LayoutParams iA()
  {
    if (this.mOrientation == 0);
    for (StaggeredGridLayoutManager.LayoutParams localLayoutParams = new StaggeredGridLayoutManager.LayoutParams(-2, -1); ; localLayoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2))
      return localLayoutParams;
  }

  public final boolean iE()
  {
    if (this.asb == null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean iF()
  {
    if (this.arY != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean iG()
  {
    if (this.mOrientation == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean iH()
  {
    boolean bool = true;
    if (this.mOrientation == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    View localView1;
    View localView2;
    if (getChildCount() > 0)
    {
      localView1 = at(false);
      localView2 = au(false);
      if ((localView1 != null) && (localView2 != null))
        break label33;
    }
    while (true)
    {
      return;
      label33: int i = bt(localView1);
      int j = bt(localView2);
      if (i < j)
      {
        paramAccessibilityEvent.setFromIndex(i);
        paramAccessibilityEvent.setToIndex(j);
      }
      else
      {
        paramAccessibilityEvent.setFromIndex(j);
        paramAccessibilityEvent.setToIndex(i);
      }
    }
  }

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof StaggeredGridLayoutManager.SavedState))
    {
      this.asb = ((StaggeredGridLayoutManager.SavedState)paramParcelable);
      requestLayout();
    }
  }

  public final Parcelable onSaveInstanceState()
  {
    if (this.asb != null);
    StaggeredGridLayoutManager.SavedState localSavedState;
    for (Object localObject = new StaggeredGridLayoutManager.SavedState(this.asb); ; localObject = localSavedState)
    {
      return localObject;
      localSavedState = new StaggeredGridLayoutManager.SavedState();
      localSavedState.alC = this.alC;
      localSavedState.alZ = this.arZ;
      localSavedState.asa = this.asa;
      int i;
      label120: int j;
      label138: label144: label170: int k;
      if ((this.arX != null) && (this.arX.mData != null))
      {
        localSavedState.asu = this.arX.mData;
        localSavedState.ast = localSavedState.asu.length;
        localSavedState.asm = this.arX.asm;
        if (getChildCount() <= 0)
          break label306;
        if (!this.arZ)
          break label243;
        i = kW();
        localSavedState.alX = i;
        if (!this.alD)
          break label251;
        localObject = au(true);
        if (localObject != null)
          break label260;
        i = -1;
        localSavedState.asq = i;
        localSavedState.asr = this.akU;
        localSavedState.ass = new int[this.akU];
        j = 0;
        if (j >= this.akU)
          continue;
        if (!this.arZ)
          break label268;
        k = this.arR[j].cT(-2147483648);
        i = k;
        if (k != -2147483648)
          i = k - this.arS.jf();
      }
      while (true)
      {
        localSavedState.ass[j] = i;
        j++;
        break label170;
        localSavedState.ast = 0;
        break;
        label243: i = kX();
        break label120;
        label251: localObject = at(true);
        break label138;
        label260: i = bt((View)localObject);
        break label144;
        label268: k = this.arR[j].cS(-2147483648);
        i = k;
        if (k != -2147483648)
          i = k - this.arS.je();
      }
      label306: localSavedState.alX = -1;
      localSavedState.asq = -1;
      localSavedState.asr = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager
 * JD-Core Version:    0.6.2
 */