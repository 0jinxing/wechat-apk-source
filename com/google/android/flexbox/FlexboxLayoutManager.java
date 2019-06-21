package com.google.android.flexbox;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.s;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.o;
import android.support.v7.widget.RecyclerView.r.b;
import android.support.v7.widget.RecyclerView.s;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.ah;
import android.support.v7.widget.am;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.i
  implements RecyclerView.r.b, a
{
  private static final Rect btW;
  private am alA;
  private int alG;
  private int alH;
  private boolean alI;
  private RecyclerView.s anY;
  private RecyclerView.o anc;
  private int btA;
  private int btB;
  private int btC;
  private int btD;
  private int btF;
  private final c btO;
  private c.a btP;
  private boolean btX;
  private FlexboxLayoutManager.b btY;
  private FlexboxLayoutManager.a btZ;
  private List<b> bty;
  private am bua;
  private FlexboxLayoutManager.SavedState bub;
  private int buc;
  private int bud;
  private SparseArray<View> bue;
  private View bug;
  private int buh;
  private boolean hq;
  private final Context mContext;

  static
  {
    AppMethodBeat.i(54865);
    if (!FlexboxLayoutManager.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      btW = new Rect();
      AppMethodBeat.o(54865);
      return;
    }
  }

  private boolean D(View paramView, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(54827);
    if ((!ua()) && (this.hq))
      if (this.alA.getEnd() - this.alA.bf(paramView) <= paramInt)
        AppMethodBeat.o(54827);
    while (true)
    {
      return bool;
      AppMethodBeat.o(54827);
      bool = false;
      continue;
      if (this.alA.bg(paramView) <= paramInt)
      {
        AppMethodBeat.o(54827);
      }
      else
      {
        AppMethodBeat.o(54827);
        bool = false;
      }
    }
  }

  private boolean E(View paramView, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(54829);
    if ((!ua()) && (this.hq))
      if (this.alA.bg(paramView) <= paramInt)
        AppMethodBeat.o(54829);
    while (true)
    {
      return bool;
      AppMethodBeat.o(54829);
      bool = false;
      continue;
      if (this.alA.bf(paramView) >= this.alA.getEnd() - paramInt)
      {
        AppMethodBeat.o(54829);
      }
      else
      {
        AppMethodBeat.o(54829);
        bool = false;
      }
    }
  }

  private int a(int paramInt, RecyclerView.o paramo, RecyclerView.s params, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(54818);
    int j;
    if ((!ua()) && (this.hq))
    {
      j = 1;
      if (j == 0)
        break label118;
      j = paramInt - this.alA.je();
      if (j <= 0)
        break label106;
      j = d(j, paramo, params);
      label56: if (!paramBoolean)
        break label161;
      paramInt = this.alA.jf() - (paramInt + j);
      if (paramInt <= 0)
        break label161;
      this.alA.cc(paramInt);
      j += paramInt;
      AppMethodBeat.o(54818);
    }
    while (true)
    {
      return j;
      j = 0;
      break;
      label106: AppMethodBeat.o(54818);
      j = i;
      continue;
      label118: j = this.alA.jf() - paramInt;
      if (j > 0)
      {
        j = -d(-j, paramo, params);
        break label56;
      }
      AppMethodBeat.o(54818);
      j = i;
      continue;
      label161: AppMethodBeat.o(54818);
    }
  }

  private int a(RecyclerView.o paramo, RecyclerView.s params, FlexboxLayoutManager.b paramb)
  {
    AppMethodBeat.i(54824);
    if (paramb.alS != -2147483648)
    {
      if (paramb.alg < 0)
        paramb.alS += paramb.alg;
      a(paramo, paramb);
    }
    int i = paramb.alg;
    int j = paramb.alg;
    boolean bool = ua();
    int k = 0;
    Object localObject;
    int m;
    int n;
    int i1;
    int i2;
    if ((j > 0) || (this.btY.alm))
    {
      localObject = this.bty;
      if ((paramb.mPosition >= 0) && (paramb.mPosition < params.getItemCount()) && (paramb.bui >= 0) && (paramb.bui < ((List)localObject).size()))
        m = 1;
      while (true)
        if (m != 0)
        {
          localObject = (b)this.bty.get(paramb.bui);
          paramb.mPosition = ((b)localObject).btr;
          if (ua())
          {
            if ((!$assertionsDisabled) && (this.btO.btw == null))
            {
              paramo = new AssertionError();
              AppMethodBeat.o(54824);
              throw paramo;
              m = 0;
              continue;
            }
            n = getPaddingLeft();
            m = getPaddingRight();
            i1 = this.mWidth;
            i2 = paramb.Lp;
            if (paramb.sE != -1)
              break label1160;
            i2 -= ((b)localObject).btk;
          }
        }
    }
    label1157: label1160: 
    while (true)
    {
      int i3 = paramb.mPosition;
      float f1 = 0.0F;
      float f2 = 0.0F;
      float f3 = 0.0F;
      label347: float f4;
      label399: View localView;
      label445: int i5;
      switch (this.btC)
      {
      default:
        paramo = new IllegalStateException("Invalid justifyContent is set: " + this.btC);
        AppMethodBeat.o(54824);
        throw paramo;
      case 0:
        f1 = n;
        f2 = i1 - m;
        f4 = FlexboxLayoutManager.a.i(this.btZ);
        f2 -= FlexboxLayoutManager.a.i(this.btZ);
        f3 = Math.max(f3, 0.0F);
        m = 0;
        i1 = ((b)localObject).apt;
        f1 -= f4;
        n = i3;
        if (n < i3 + i1)
        {
          localView = eU(n);
          if (localView == null)
            break label1157;
          if (paramb.sE == 1)
          {
            g(localView, btW);
            addView(localView);
            long l = this.btO.btw[n];
            int i4 = c.at(l);
            i5 = c.au(l);
            FlexboxLayoutManager.LayoutParams localLayoutParams = (FlexboxLayoutManager.LayoutParams)localView.getLayoutParams();
            if (b(localView, i4, i5, localLayoutParams))
              localView.measure(i4, i5);
            f1 += localLayoutParams.leftMargin + bD(localView);
            f2 -= localLayoutParams.rightMargin + bE(localView);
            i5 = i2 + bB(localView);
            if (!this.hq)
              break label931;
            this.btO.a(localView, (b)localObject, Math.round(f2) - localView.getMeasuredWidth(), i5, Math.round(f2), localView.getMeasuredHeight() + i5);
            label593: float f5 = localView.getMeasuredWidth() + localLayoutParams.rightMargin + bE(localView);
            i4 = localView.getMeasuredWidth();
            i5 = localLayoutParams.leftMargin;
            f4 = bD(localView) + (i4 + i5);
            f1 = f5 + f3 + f1;
            f2 -= f4 + f3;
          }
        }
        break;
      case 1:
      case 2:
      case 4:
      case 3:
      case 5:
      }
      while (true)
      {
        n++;
        break label399;
        f1 = i1 - ((b)localObject).bti + m;
        f2 = ((b)localObject).bti - n;
        break label347;
        f1 = n + (i1 - ((b)localObject).bti) / 2.0F;
        f2 = i1 - m - (i1 - ((b)localObject).bti) / 2.0F;
        break label347;
        f3 = f1;
        if (((b)localObject).apt != 0)
          f3 = (i1 - ((b)localObject).bti) / ((b)localObject).apt;
        f1 = n + f3 / 2.0F;
        f2 = i1 - m - f3 / 2.0F;
        break label347;
        f2 = n;
        if (((b)localObject).apt != 1);
        for (f1 = ((b)localObject).apt - 1; ; f1 = 1.0F)
        {
          f3 = (i1 - ((b)localObject).bti) / f1;
          f4 = i1 - m;
          f1 = f2;
          f2 = f4;
          break;
        }
        f3 = f2;
        if (((b)localObject).apt != 0)
          f3 = (i1 - ((b)localObject).bti) / (((b)localObject).apt + 1);
        f1 = n + f3;
        f2 = i1 - m - f3;
        break label347;
        g(localView, btW);
        addView(localView, m);
        m++;
        break label445;
        label931: this.btO.a(localView, (b)localObject, Math.round(f1), i5, Math.round(f1) + localView.getMeasuredWidth(), localView.getMeasuredHeight() + i5);
        break label593;
        paramb.bui += this.btY.sE;
        m = ((b)localObject).btk;
        label994: if ((!bool) && (this.hq));
        for (paramb.Lp -= ((b)localObject).btk * paramb.sE; ; paramb.Lp += ((b)localObject).btk * paramb.sE)
        {
          i2 = ((b)localObject).btk;
          k = m + k;
          j -= i2;
          break;
          m = a((b)localObject, paramb);
          break label994;
        }
        paramb.alg -= k;
        if (paramb.alS != -2147483648)
        {
          paramb.alS += k;
          if (paramb.alg < 0)
            paramb.alS += paramb.alg;
          a(paramo, paramb);
        }
        m = paramb.alg;
        AppMethodBeat.o(54824);
        return i - m;
      }
    }
  }

  private int a(b paramb, FlexboxLayoutManager.b paramb1)
  {
    AppMethodBeat.i(54831);
    if ((!$assertionsDisabled) && (this.btO.btw == null))
    {
      paramb = new AssertionError();
      AppMethodBeat.o(54831);
      throw paramb;
    }
    int i = getPaddingTop();
    int j = getPaddingBottom();
    int k = this.mHeight;
    int m = paramb1.Lp;
    int n = paramb1.Lp;
    int i1;
    if (paramb1.sE == -1)
    {
      i1 = paramb.btk;
      n += paramb.btk;
      m -= i1;
    }
    while (true)
    {
      i1 = paramb1.mPosition;
      float f1 = 0.0F;
      float f2 = 0.0F;
      float f3 = 0.0F;
      float f4;
      label253: View localView;
      int i2;
      int i3;
      switch (this.btC)
      {
      default:
        paramb = new IllegalStateException("Invalid justifyContent is set: " + this.btC);
        AppMethodBeat.o(54831);
        throw paramb;
      case 0:
        f1 = i;
        f2 = k - j;
        f4 = f1 - FlexboxLayoutManager.a.i(this.btZ);
        f1 = f2 - FlexboxLayoutManager.a.i(this.btZ);
        f3 = Math.max(f3, 0.0F);
        i = 0;
        k = paramb.apt;
        j = i1;
        f2 = f4;
        if (j < i1 + k)
        {
          localView = eU(j);
          if (localView == null)
            break label983;
          long l = this.btO.btw[j];
          i2 = c.at(l);
          i3 = c.au(l);
          FlexboxLayoutManager.LayoutParams localLayoutParams = (FlexboxLayoutManager.LayoutParams)localView.getLayoutParams();
          if (b(localView, i2, i3, localLayoutParams))
            localView.measure(i2, i3);
          f2 += localLayoutParams.topMargin + bB(localView);
          f1 -= localLayoutParams.rightMargin + bC(localView);
          if (paramb1.sE == 1)
          {
            g(localView, btW);
            addView(localView);
            label393: i2 = m + bD(localView);
            i3 = n - bE(localView);
            if (!this.hq)
              break label841;
            if (!this.btX)
              break label778;
            this.btO.a(localView, paramb, this.hq, i3 - localView.getMeasuredWidth(), Math.round(f1) - localView.getMeasuredHeight(), i3, Math.round(f1));
            label467: f2 = localView.getMeasuredHeight() + localLayoutParams.topMargin + bC(localView) + f3 + f2;
            i2 = localView.getMeasuredHeight();
            i3 = localLayoutParams.bottomMargin;
            f1 -= bB(localView) + (i2 + i3) + f3;
          }
        }
        break;
      case 1:
      case 2:
      case 4:
      case 3:
      case 5:
      }
      label778: label841: label983: 
      while (true)
      {
        j++;
        break label253;
        f1 = k - paramb.bti + j;
        f2 = paramb.bti - i;
        break;
        f1 = i + (k - paramb.bti) / 2.0F;
        f2 = k - j - (k - paramb.bti) / 2.0F;
        break;
        f3 = f1;
        if (paramb.apt != 0)
          f3 = (k - paramb.bti) / paramb.apt;
        f1 = i + f3 / 2.0F;
        f2 = k - j - f3 / 2.0F;
        break;
        f2 = i;
        if (paramb.apt != 1);
        for (f1 = paramb.apt - 1; ; f1 = 1.0F)
        {
          f3 = (k - paramb.bti) / f1;
          f4 = k - j;
          f1 = f2;
          f2 = f4;
          break;
        }
        f3 = f2;
        if (paramb.apt != 0)
          f3 = (k - paramb.bti) / (paramb.apt + 1);
        f1 = i + f3;
        f2 = k - j - f3;
        break;
        g(localView, btW);
        addView(localView, i);
        i++;
        break label393;
        c localc = this.btO;
        boolean bool = this.hq;
        i2 = localView.getMeasuredWidth();
        int i4 = Math.round(f2);
        int i5 = Math.round(f2);
        localc.a(localView, paramb, bool, i3 - i2, i4, i3, localView.getMeasuredHeight() + i5);
        break label467;
        if (this.btX)
        {
          this.btO.a(localView, paramb, this.hq, i2, Math.round(f1) - localView.getMeasuredHeight(), i2 + localView.getMeasuredWidth(), Math.round(f1));
          break label467;
        }
        localc = this.btO;
        bool = this.hq;
        i4 = Math.round(f2);
        i3 = localView.getMeasuredWidth();
        i5 = Math.round(f2);
        localc.a(localView, paramb, bool, i2, i4, i2 + i3, localView.getMeasuredHeight() + i5);
        break label467;
        paramb1.bui += this.btY.sE;
        i = paramb.btk;
        AppMethodBeat.o(54831);
        return i;
      }
    }
  }

  private View a(View paramView, b paramb)
  {
    AppMethodBeat.i(54848);
    boolean bool = ua();
    int i = paramb.apt;
    int j = 1;
    if (j < i)
    {
      View localView = getChildAt(j);
      if ((localView != null) && (localView.getVisibility() != 8))
        if ((this.hq) && (!bool))
        {
          if (this.alA.bg(paramView) >= this.alA.bg(localView))
            break label115;
          paramb = localView;
        }
      while (true)
      {
        j++;
        paramView = paramb;
        break;
        paramb = localView;
        if (this.alA.bf(paramView) <= this.alA.bf(localView))
          label115: paramb = paramView;
      }
    }
    AppMethodBeat.o(54848);
    return paramView;
  }

  private void a(RecyclerView.o paramo, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54830);
    while (paramInt2 >= paramInt1)
    {
      a(paramInt2, paramo);
      paramInt2--;
    }
    AppMethodBeat.o(54830);
  }

  private void a(RecyclerView.o paramo, FlexboxLayoutManager.b paramb)
  {
    AppMethodBeat.i(54825);
    if (!paramb.bum)
      AppMethodBeat.o(54825);
    while (true)
    {
      return;
      if (paramb.sE == -1)
      {
        c(paramo, paramb);
        AppMethodBeat.o(54825);
      }
      else
      {
        b(paramo, paramb);
        AppMethodBeat.o(54825);
      }
    }
  }

  private void a(FlexboxLayoutManager.a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(54832);
    if (paramBoolean2)
    {
      un();
      if ((ua()) || (!this.hq))
        break label211;
    }
    label211: for (this.btY.alg = (FlexboxLayoutManager.a.j(parama) - getPaddingRight()); ; this.btY.alg = (this.alA.jf() - FlexboxLayoutManager.a.j(parama)))
    {
      this.btY.mPosition = FlexboxLayoutManager.a.e(parama);
      this.btY.ali = 1;
      this.btY.sE = 1;
      this.btY.Lp = FlexboxLayoutManager.a.j(parama);
      this.btY.alS = -2147483648;
      this.btY.bui = FlexboxLayoutManager.a.f(parama);
      if ((paramBoolean1) && (this.bty.size() > 1) && (FlexboxLayoutManager.a.f(parama) >= 0) && (FlexboxLayoutManager.a.f(parama) < this.bty.size() - 1))
      {
        b localb = (b)this.bty.get(FlexboxLayoutManager.a.f(parama));
        FlexboxLayoutManager.b.a(this.btY);
        parama = this.btY;
        int i = parama.mPosition;
        parama.mPosition = (localb.apt + i);
      }
      AppMethodBeat.o(54832);
      return;
      this.btY.alm = false;
      break;
    }
  }

  private int b(int paramInt, RecyclerView.o paramo, RecyclerView.s params, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(54817);
    int j;
    if ((!ua()) && (this.hq))
    {
      j = this.alA.jf() - paramInt;
      if (j > 0)
      {
        i = d(-j, paramo, params);
        if (!paramBoolean)
          break label144;
        paramInt = paramInt + i - this.alA.je();
        if (paramInt <= 0)
          break label144;
        this.alA.cc(-paramInt);
        i -= paramInt;
        AppMethodBeat.o(54817);
      }
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(54817);
      continue;
      j = paramInt - this.alA.je();
      if (j > 0)
      {
        i = -d(j, paramo, params);
        break;
      }
      AppMethodBeat.o(54817);
      continue;
      label144: AppMethodBeat.o(54817);
    }
  }

  private View b(View paramView, b paramb)
  {
    AppMethodBeat.i(54849);
    boolean bool = ua();
    int i = getChildCount();
    int j = getChildCount();
    int k = paramb.apt;
    i -= 2;
    if (i > j - k - 1)
    {
      View localView = getChildAt(i);
      if ((localView != null) && (localView.getVisibility() != 8))
        if ((this.hq) && (!bool))
        {
          if (this.alA.bf(paramView) <= this.alA.bf(localView))
            break label132;
          paramb = localView;
        }
      while (true)
      {
        i--;
        paramView = paramb;
        break;
        paramb = localView;
        if (this.alA.bg(paramView) >= this.alA.bg(localView))
          label132: paramb = paramView;
      }
    }
    AppMethodBeat.o(54849);
    return paramView;
  }

  private void b(RecyclerView.o paramo, FlexboxLayoutManager.b paramb)
  {
    int i = -1;
    AppMethodBeat.i(54826);
    if (paramb.alS < 0)
      AppMethodBeat.o(54826);
    while (true)
    {
      return;
      if ((!$assertionsDisabled) && (this.btO.btv == null))
      {
        paramo = new AssertionError();
        AppMethodBeat.o(54826);
        throw paramo;
      }
      int j = getChildCount();
      if (j == 0)
      {
        AppMethodBeat.o(54826);
      }
      else
      {
        Object localObject1 = getChildAt(0);
        int k = this.btO.btv[bt(localObject1)];
        if (k == -1)
        {
          AppMethodBeat.o(54826);
        }
        else
        {
          localObject1 = (b)this.bty.get(k);
          int m = 0;
          while (true)
          {
            n = i;
            if (m >= j)
              break label247;
            View localView = getChildAt(m);
            n = i;
            if (!D(localView, paramb.alS))
              break label247;
            Object localObject2 = localObject1;
            n = k;
            if (((b)localObject1).bts == bt(localView))
            {
              if (k >= this.bty.size() - 1)
                break;
              n = k + paramb.sE;
              localObject2 = (b)this.bty.get(n);
              i = m;
            }
            m++;
            localObject1 = localObject2;
            k = n;
          }
          int n = m;
          label247: a(paramo, 0, n);
          AppMethodBeat.o(54826);
        }
      }
    }
  }

  private void b(FlexboxLayoutManager.a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(54833);
    if (paramBoolean2)
    {
      un();
      if ((ua()) || (!this.hq))
        break label204;
    }
    label204: for (this.btY.alg = (this.bug.getWidth() - FlexboxLayoutManager.a.j(parama) - this.alA.je()); ; this.btY.alg = (FlexboxLayoutManager.a.j(parama) - this.alA.je()))
    {
      this.btY.mPosition = FlexboxLayoutManager.a.e(parama);
      this.btY.ali = 1;
      this.btY.sE = -1;
      this.btY.Lp = FlexboxLayoutManager.a.j(parama);
      this.btY.alS = -2147483648;
      this.btY.bui = FlexboxLayoutManager.a.f(parama);
      if ((paramBoolean1) && (FlexboxLayoutManager.a.f(parama) > 0) && (this.bty.size() > FlexboxLayoutManager.a.f(parama)))
      {
        parama = (b)this.bty.get(FlexboxLayoutManager.a.f(parama));
        FlexboxLayoutManager.b.b(this.btY);
        FlexboxLayoutManager.b localb = this.btY;
        localb.mPosition -= parama.apt;
      }
      AppMethodBeat.o(54833);
      return;
      this.btY.alm = false;
      break;
    }
  }

  private boolean b(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(54859);
    boolean bool;
    if ((paramView.isLayoutRequested()) || (!this.aoF) || (!m(paramView.getWidth(), paramInt1, paramLayoutParams.width)) || (!m(paramView.getHeight(), paramInt2, paramLayoutParams.height)))
    {
      bool = true;
      AppMethodBeat.o(54859);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54859);
    }
  }

  private void bo(int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(54847);
    if ((!$assertionsDisabled) && (this.btO.btv == null))
    {
      localObject1 = new AssertionError();
      AppMethodBeat.o(54847);
      throw ((Throwable)localObject1);
    }
    this.btY.sE = paramInt1;
    boolean bool = ua();
    int j = View.MeasureSpec.makeMeasureSpec(this.mWidth, this.aoJ);
    int k = View.MeasureSpec.makeMeasureSpec(this.mHeight, this.aoK);
    int m;
    Object localObject2;
    if ((!bool) && (this.hq))
    {
      m = 1;
      if (paramInt1 != 1)
        break label560;
      localObject1 = getChildAt(getChildCount() - 1);
      this.btY.Lp = this.alA.bg((View)localObject1);
      paramInt1 = bt((View)localObject1);
      i = this.btO.btv[paramInt1];
      localObject2 = b((View)localObject1, (b)this.bty.get(i));
      this.btY.ali = 1;
      localObject1 = this.btY;
      ((FlexboxLayoutManager.b)localObject1).mPosition = (((FlexboxLayoutManager.b)localObject1).ali + paramInt1);
      if (this.btO.btv.length > this.btY.mPosition)
        break label457;
      this.btY.bui = -1;
      label219: if (m == 0)
        break label487;
      this.btY.Lp = this.alA.bf((View)localObject2);
      this.btY.alS = (-this.alA.bf((View)localObject2) + this.alA.je());
      localObject1 = this.btY;
      if (this.btY.alS < 0)
        break label482;
      paramInt1 = this.btY.alS;
      label289: ((FlexboxLayoutManager.b)localObject1).alS = paramInt1;
      label295: if (((this.btY.bui == -1) || (this.btY.bui > this.bty.size() - 1)) && (this.btY.mPosition <= getFlexItemCount()))
      {
        paramInt1 = paramInt2 - this.btY.alS;
        this.btP.reset();
        if (paramInt1 > 0)
        {
          if (!bool)
            break label530;
          this.btO.a(this.btP, j, k, paramInt1, this.btY.mPosition, this.bty);
        }
      }
    }
    while (true)
    {
      this.btO.x(j, k, this.btY.mPosition);
      this.btO.eY(this.btY.mPosition);
      localObject1 = this.btY;
      ((FlexboxLayoutManager.b)localObject1).alg = (paramInt2 - ((FlexboxLayoutManager.b)localObject1).alS);
      AppMethodBeat.o(54847);
      return;
      m = 0;
      break;
      label457: this.btY.bui = this.btO.btv[this.btY.mPosition];
      break label219;
      label482: paramInt1 = 0;
      break label289;
      label487: this.btY.Lp = this.alA.bg((View)localObject2);
      this.btY.alS = (this.alA.bg((View)localObject2) - this.alA.jf());
      break label295;
      label530: this.btO.c(this.btP, j, k, paramInt1, this.btY.mPosition, this.bty);
    }
    label560: Object localObject1 = getChildAt(0);
    this.btY.Lp = this.alA.bf((View)localObject1);
    j = bt((View)localObject1);
    paramInt1 = this.btO.btv[j];
    localObject1 = a((View)localObject1, (b)this.bty.get(paramInt1));
    this.btY.ali = 1;
    paramInt1 = this.btO.btv[j];
    if (paramInt1 == -1)
      paramInt1 = 0;
    while (true)
    {
      if (paramInt1 > 0)
      {
        localObject2 = (b)this.bty.get(paramInt1 - 1);
        this.btY.mPosition = (j - ((b)localObject2).apt);
        label684: localObject2 = this.btY;
        if (paramInt1 <= 0)
          break label794;
        paramInt1--;
      }
      while (true)
      {
        ((FlexboxLayoutManager.b)localObject2).bui = paramInt1;
        if (m == 0)
          break label799;
        this.btY.Lp = this.alA.bg((View)localObject1);
        this.btY.alS = (this.alA.bg((View)localObject1) - this.alA.jf());
        localObject1 = this.btY;
        paramInt1 = i;
        if (this.btY.alS >= 0)
          paramInt1 = this.btY.alS;
        ((FlexboxLayoutManager.b)localObject1).alS = paramInt1;
        break;
        this.btY.mPosition = -1;
        break label684;
        label794: paramInt1 = 0;
      }
      label799: this.btY.Lp = this.alA.bf((View)localObject1);
      this.btY.alS = (-this.alA.bf((View)localObject1) + this.alA.je());
      break;
    }
  }

  private View bp(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54864);
    int i;
    View localView;
    if (paramInt2 > paramInt1)
    {
      i = 1;
      if (paramInt1 == paramInt2)
        break label55;
      localView = getChildAt(paramInt1);
      if (!cb(localView))
        break label48;
      AppMethodBeat.o(54864);
    }
    while (true)
    {
      return localView;
      i = -1;
      break;
      label48: paramInt1 += i;
      break;
      label55: localView = null;
      AppMethodBeat.o(54864);
    }
  }

  private void c(RecyclerView.o paramo, FlexboxLayoutManager.b paramb)
  {
    AppMethodBeat.i(54828);
    if (paramb.alS < 0)
      AppMethodBeat.o(54828);
    while (true)
    {
      return;
      if ((!$assertionsDisabled) && (this.btO.btv == null))
      {
        paramo = new AssertionError();
        AppMethodBeat.o(54828);
        throw paramo;
      }
      int i = getChildCount();
      if (i == 0)
      {
        AppMethodBeat.o(54828);
      }
      else
      {
        Object localObject1 = getChildAt(i - 1);
        int j = this.btO.btv[bt(localObject1)];
        if (j == -1)
        {
          AppMethodBeat.o(54828);
        }
        else
        {
          Object localObject2 = (b)this.bty.get(j);
          int k = i - 1;
          int m = i;
          while (true)
          {
            n = m;
            if (k < 0)
              break label240;
            View localView = getChildAt(k);
            n = m;
            if (!E(localView, paramb.alS))
              break label240;
            localObject1 = localObject2;
            n = j;
            if (((b)localObject2).btr == bt(localView))
            {
              if (j <= 0)
                break;
              n = j + paramb.sE;
              localObject1 = (b)this.bty.get(n);
              m = k;
            }
            k--;
            localObject2 = localObject1;
            j = n;
          }
          int n = k;
          label240: a(paramo, n, i - 1);
          AppMethodBeat.o(54828);
        }
      }
    }
  }

  private boolean cb(View paramView)
  {
    AppMethodBeat.i(54861);
    int i = getPaddingLeft();
    int j = getPaddingTop();
    int k = this.mWidth;
    int m = getPaddingRight();
    int n = this.mHeight;
    int i1 = getPaddingBottom();
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i2 = bx(paramView);
    int i3 = localLayoutParams.leftMargin;
    localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i4 = by(paramView);
    int i5 = localLayoutParams.topMargin;
    localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i6 = bz(paramView);
    int i7 = localLayoutParams.rightMargin;
    localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i8 = bA(paramView);
    int i9 = localLayoutParams.bottomMargin;
    if ((i2 - i3 >= k - m) || (i6 + i7 >= i));
    for (m = 1; ; m = 0)
    {
      if ((i4 - i5 >= n - i1) || (i9 + i8 >= j));
      for (i5 = 1; ; i5 = 0)
      {
        if ((m != 0) && (i5 != 0))
          AppMethodBeat.o(54861);
        for (boolean bool = true; ; bool = false)
        {
          return bool;
          AppMethodBeat.o(54861);
        }
      }
    }
  }

  private int d(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    int i = 1;
    AppMethodBeat.i(54845);
    if ((getChildCount() == 0) || (paramInt == 0))
    {
      AppMethodBeat.o(54845);
      paramInt = 0;
      return paramInt;
    }
    uo();
    this.btY.bum = true;
    int j;
    if ((!ua()) && (this.hq))
    {
      j = 1;
      label59: if (j == 0)
        break label130;
      if (paramInt >= 0)
        break label124;
    }
    int k;
    int m;
    while (true)
    {
      k = Math.abs(paramInt);
      bo(i, k);
      m = this.btY.alS + a(paramo, params, this.btY);
      if (m >= 0)
        break label140;
      AppMethodBeat.o(54845);
      paramInt = 0;
      break;
      j = 0;
      break label59;
      label124: i = -1;
      continue;
      label130: if (paramInt <= 0)
        i = -1;
    }
    label140: if (j != 0)
      if (k > m)
        paramInt = -i * m;
    while (true)
    {
      this.alA.cc(-paramInt);
      this.btY.alV = paramInt;
      AppMethodBeat.o(54845);
      break;
      if (k > m)
        paramInt = i * m;
    }
  }

  private void fg(int paramInt)
  {
    AppMethodBeat.i(54815);
    int i = iQ();
    int j = iS();
    if (paramInt >= j)
      AppMethodBeat.o(54815);
    while (true)
    {
      return;
      int k = getChildCount();
      this.btO.fa(k);
      this.btO.eZ(k);
      this.btO.fb(k);
      Object localObject;
      if ((!$assertionsDisabled) && (this.btO.btv == null))
      {
        localObject = new AssertionError();
        AppMethodBeat.o(54815);
        throw ((Throwable)localObject);
      }
      if (paramInt >= this.btO.btv.length)
      {
        AppMethodBeat.o(54815);
      }
      else
      {
        this.buh = paramInt;
        localObject = iM();
        if (localObject == null)
        {
          AppMethodBeat.o(54815);
        }
        else if ((i <= paramInt) && (paramInt <= j))
        {
          AppMethodBeat.o(54815);
        }
        else
        {
          this.alG = bt((View)localObject);
          if ((!ua()) && (this.hq))
          {
            this.alH = (this.alA.bg((View)localObject) + this.alA.getEndPadding());
            AppMethodBeat.o(54815);
          }
          else
          {
            this.alH = (this.alA.bf((View)localObject) - this.alA.je());
            AppMethodBeat.o(54815);
          }
        }
      }
    }
  }

  private View fh(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(54820);
    if ((!$assertionsDisabled) && (this.btO.btv == null))
    {
      localObject = new AssertionError();
      AppMethodBeat.o(54820);
      throw ((Throwable)localObject);
    }
    View localView = z(0, getChildCount(), paramInt);
    if (localView == null)
      AppMethodBeat.o(54820);
    while (true)
    {
      return localObject;
      paramInt = bt(localView);
      paramInt = this.btO.btv[paramInt];
      if (paramInt == -1)
      {
        AppMethodBeat.o(54820);
      }
      else
      {
        localObject = a(localView, (b)this.bty.get(paramInt));
        AppMethodBeat.o(54820);
      }
    }
  }

  private View fi(int paramInt)
  {
    AppMethodBeat.i(54821);
    if ((!$assertionsDisabled) && (this.btO.btv == null))
    {
      localObject = new AssertionError();
      AppMethodBeat.o(54821);
      throw ((Throwable)localObject);
    }
    Object localObject = z(getChildCount() - 1, -1, paramInt);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(54821);
    }
    while (true)
    {
      return localObject;
      paramInt = bt((View)localObject);
      paramInt = this.btO.btv[paramInt];
      localObject = b((View)localObject, (b)this.bty.get(paramInt));
      AppMethodBeat.o(54821);
    }
  }

  private int fj(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(54846);
    int j;
    if ((getChildCount() == 0) || (paramInt == 0))
    {
      AppMethodBeat.o(54846);
      j = 0;
      return j;
    }
    uo();
    boolean bool = ua();
    label52: int k;
    if (bool)
    {
      j = this.bug.getWidth();
      if (!bool)
        break label127;
      k = this.mWidth;
      label63: if (s.T(this.aiB) == 1)
        i = 1;
      if (i == 0)
        break label162;
      i = Math.abs(paramInt);
      if (paramInt >= 0)
        break label136;
      j = -Math.min(k + FlexboxLayoutManager.a.i(this.btZ) - j, i);
    }
    while (true)
    {
      AppMethodBeat.o(54846);
      break;
      j = this.bug.getHeight();
      break label52;
      label127: k = this.mHeight;
      break label63;
      label136: j = paramInt;
      if (FlexboxLayoutManager.a.i(this.btZ) + paramInt > 0)
      {
        j = -FlexboxLayoutManager.a.i(this.btZ);
        continue;
        label162: if (paramInt > 0)
        {
          j = Math.min(k - FlexboxLayoutManager.a.i(this.btZ) - j, paramInt);
        }
        else
        {
          j = paramInt;
          if (FlexboxLayoutManager.a.i(this.btZ) + paramInt < 0)
            j = -FlexboxLayoutManager.a.i(this.btZ);
        }
      }
    }
  }

  private void iJ()
  {
    AppMethodBeat.i(54836);
    if (this.btY == null)
      this.btY = new FlexboxLayoutManager.b((byte)0);
    AppMethodBeat.o(54836);
  }

  private View iM()
  {
    AppMethodBeat.i(138507);
    View localView = getChildAt(0);
    AppMethodBeat.o(138507);
    return localView;
  }

  private int iQ()
  {
    AppMethodBeat.i(54862);
    View localView = bp(0, getChildCount());
    int i;
    if (localView == null)
    {
      i = -1;
      AppMethodBeat.o(54862);
    }
    while (true)
    {
      return i;
      i = bt(localView);
      AppMethodBeat.o(54862);
    }
  }

  private int iS()
  {
    int i = -1;
    AppMethodBeat.i(54863);
    View localView = bp(getChildCount() - 1, -1);
    if (localView == null)
      AppMethodBeat.o(54863);
    while (true)
    {
      return i;
      i = bt(localView);
      AppMethodBeat.o(54863);
    }
  }

  private int j(RecyclerView.s params)
  {
    int i = 0;
    AppMethodBeat.i(54855);
    if (getChildCount() == 0)
      AppMethodBeat.o(54855);
    while (true)
    {
      return i;
      int j = params.getItemCount();
      View localView1 = fh(j);
      View localView2 = fi(j);
      if ((params.getItemCount() == 0) || (localView1 == null) || (localView2 == null))
      {
        AppMethodBeat.o(54855);
      }
      else
      {
        if ((!$assertionsDisabled) && (this.btO.btv == null))
        {
          params = new AssertionError();
          AppMethodBeat.o(54855);
          throw params;
        }
        int k = bt(localView1);
        int m = bt(localView2);
        j = Math.abs(this.alA.bg(localView2) - this.alA.bf(localView1));
        k = this.btO.btv[k];
        if ((k == 0) || (k == -1))
        {
          AppMethodBeat.o(54855);
        }
        else
        {
          i = this.btO.btv[m];
          i = Math.round(j / (i - k + 1) * k + (this.alA.je() - this.alA.bf(localView1)));
          AppMethodBeat.o(54855);
        }
      }
    }
  }

  private int k(RecyclerView.s params)
  {
    int i = 0;
    AppMethodBeat.i(54852);
    if (getChildCount() == 0)
      AppMethodBeat.o(54852);
    while (true)
    {
      return i;
      int j = params.getItemCount();
      uo();
      View localView1 = fh(j);
      View localView2 = fi(j);
      if ((params.getItemCount() == 0) || (localView1 == null) || (localView2 == null))
      {
        AppMethodBeat.o(54852);
      }
      else
      {
        i = this.alA.bg(localView2);
        j = this.alA.bf(localView1);
        i = Math.min(this.alA.jg(), i - j);
        AppMethodBeat.o(54852);
      }
    }
  }

  private int l(RecyclerView.s params)
  {
    int i = 0;
    AppMethodBeat.i(54858);
    if (getChildCount() == 0)
      AppMethodBeat.o(54858);
    while (true)
    {
      return i;
      int j = params.getItemCount();
      View localView1 = fh(j);
      View localView2 = fi(j);
      if ((params.getItemCount() == 0) || (localView1 == null) || (localView2 == null))
      {
        AppMethodBeat.o(54858);
      }
      else
      {
        if ((!$assertionsDisabled) && (this.btO.btv == null))
        {
          params = new AssertionError();
          AppMethodBeat.o(54858);
          throw params;
        }
        i = iQ();
        j = iS();
        i = (int)(Math.abs(this.alA.bg(localView2) - this.alA.bf(localView1)) / (j - i + 1) * params.getItemCount());
        AppMethodBeat.o(54858);
      }
    }
  }

  private static boolean m(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    AppMethodBeat.i(54860);
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if ((paramInt3 > 0) && (paramInt1 != paramInt3))
      AppMethodBeat.o(54860);
    while (true)
    {
      return bool;
      switch (i)
      {
      default:
        AppMethodBeat.o(54860);
        break;
      case 0:
        AppMethodBeat.o(54860);
        bool = true;
        break;
      case -2147483648:
        if (paramInt2 >= paramInt1)
        {
          AppMethodBeat.o(54860);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(54860);
        }
        break;
      case 1073741824:
        if (paramInt2 == paramInt1)
        {
          AppMethodBeat.o(54860);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(54860);
        }
        break;
      }
    }
  }

  private void un()
  {
    AppMethodBeat.i(54834);
    int i;
    FlexboxLayoutManager.b localb;
    if (ua())
    {
      i = this.aoK;
      localb = this.btY;
      if ((i != 0) && (i != -2147483648))
        break label55;
    }
    label55: for (boolean bool = true; ; bool = false)
    {
      localb.alm = bool;
      AppMethodBeat.o(54834);
      return;
      i = this.aoJ;
      break;
    }
  }

  private void uo()
  {
    AppMethodBeat.i(54835);
    if (this.alA != null)
      AppMethodBeat.o(54835);
    while (true)
    {
      return;
      if (ua())
      {
        if (this.btB != 0)
        {
          this.alA = am.e(this);
          this.bua = am.d(this);
          AppMethodBeat.o(54835);
        }
      }
      else if (this.btB == 0)
      {
        this.alA = am.e(this);
        this.bua = am.d(this);
        AppMethodBeat.o(54835);
      }
      else
      {
        this.alA = am.d(this);
        this.bua = am.e(this);
        AppMethodBeat.o(54835);
      }
    }
  }

  private View z(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(54822);
    uo();
    iJ();
    int i = this.alA.je();
    int j = this.alA.jf();
    int k;
    Object localObject1;
    Object localObject2;
    label46: Object localObject3;
    if (paramInt2 > paramInt1)
    {
      k = 1;
      localObject1 = null;
      localObject2 = null;
      if (paramInt1 == paramInt2)
        break label165;
      localObject3 = getChildAt(paramInt1);
      int m = bt((View)localObject3);
      if ((m < 0) || (m >= paramInt3))
        break label196;
      if (!((RecyclerView.LayoutParams)((View)localObject3).getLayoutParams()).aoM.isRemoved())
        break label116;
      if (localObject2 != null)
        break label196;
      localObject2 = localObject3;
    }
    label165: label196: 
    while (true)
    {
      paramInt1 += k;
      break label46;
      k = -1;
      break;
      label116: if ((this.alA.bf((View)localObject3) < i) || (this.alA.bg((View)localObject3) > j))
      {
        if (localObject1 == null)
          localObject1 = localObject3;
      }
      else
      {
        AppMethodBeat.o(54822);
        while (true)
        {
          return localObject3;
          if (localObject1 != null)
          {
            AppMethodBeat.o(54822);
            localObject3 = localObject1;
          }
          else
          {
            AppMethodBeat.o(54822);
            localObject3 = localObject2;
          }
        }
      }
    }
  }

  public final int a(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    AppMethodBeat.i(54843);
    if (!ua())
    {
      paramInt = d(paramInt, paramo, params);
      this.bue.clear();
      AppMethodBeat.o(54843);
    }
    while (true)
    {
      return paramInt;
      paramInt = fj(paramInt);
      paramo = this.btZ;
      FlexboxLayoutManager.a.d(paramo, FlexboxLayoutManager.a.i(paramo) + paramInt);
      this.bua.cc(-paramInt);
      AppMethodBeat.o(54843);
    }
  }

  public final RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(54806);
    paramContext = new FlexboxLayoutManager.LayoutParams(paramContext, paramAttributeSet);
    AppMethodBeat.o(54806);
    return paramContext;
  }

  public final void a(int paramInt, View paramView)
  {
    AppMethodBeat.i(54803);
    this.bue.put(paramInt, paramView);
    AppMethodBeat.o(54803);
  }

  public final void a(RecyclerView.s params)
  {
    AppMethodBeat.i(54819);
    super.a(params);
    this.bub = null;
    this.alG = -1;
    this.alH = -2147483648;
    this.buh = -1;
    FlexboxLayoutManager.a.b(this.btZ);
    this.bue.clear();
    AppMethodBeat.o(54819);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(54838);
    paramRecyclerView = new ah(paramRecyclerView.getContext());
    paramRecyclerView.ape = paramInt;
    a(paramRecyclerView);
    AppMethodBeat.o(54838);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(54814);
    super.a(paramRecyclerView, paramInt1, paramInt2, paramInt3);
    fg(Math.min(paramInt1, paramInt2));
    AppMethodBeat.o(54814);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(54811);
    super.a(paramRecyclerView, paramInt1, paramInt2, paramObject);
    fg(paramInt1);
    AppMethodBeat.o(54811);
  }

  public final void a(RecyclerView paramRecyclerView, RecyclerView.o paramo)
  {
    AppMethodBeat.i(54840);
    super.a(paramRecyclerView, paramo);
    if (this.alI)
    {
      d(paramo);
      paramo.clear();
    }
    AppMethodBeat.o(54840);
  }

  public final void a(View paramView, int paramInt1, int paramInt2, b paramb)
  {
    AppMethodBeat.i(54795);
    g(paramView, btW);
    if (ua())
    {
      paramInt1 = bD(paramView) + bE(paramView);
      paramb.bti += paramInt1;
      paramb.btj = (paramInt1 + paramb.btj);
      AppMethodBeat.o(54795);
    }
    while (true)
    {
      return;
      paramInt1 = bB(paramView) + bC(paramView);
      paramb.bti += paramInt1;
      paramb.btj = (paramInt1 + paramb.btj);
      AppMethodBeat.o(54795);
    }
  }

  public final void a(b paramb)
  {
  }

  public final boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof FlexboxLayoutManager.LayoutParams;
  }

  public final int b(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    AppMethodBeat.i(54844);
    if (ua())
    {
      paramInt = d(paramInt, paramo, params);
      this.bue.clear();
      AppMethodBeat.o(54844);
    }
    while (true)
    {
      return paramInt;
      paramInt = fj(paramInt);
      paramo = this.btZ;
      FlexboxLayoutManager.a.d(paramo, FlexboxLayoutManager.a.i(paramo) + paramInt);
      this.bua.cc(-paramInt);
      AppMethodBeat.o(54844);
    }
  }

  public final PointF bX(int paramInt)
  {
    AppMethodBeat.i(54804);
    PointF localPointF;
    if (getChildCount() == 0)
    {
      localPointF = null;
      AppMethodBeat.o(54804);
    }
    while (true)
    {
      return localPointF;
      if (paramInt < bt(getChildAt(0)));
      for (paramInt = -1; ; paramInt = 1)
      {
        if (!ua())
          break label69;
        localPointF = new PointF(0.0F, paramInt);
        AppMethodBeat.o(54804);
        break;
      }
      label69: localPointF = new PointF(paramInt, 0.0F);
      AppMethodBeat.o(54804);
    }
  }

  public final void bY(int paramInt)
  {
    AppMethodBeat.i(54837);
    this.alG = paramInt;
    this.alH = -2147483648;
    if (this.bub != null)
      FlexboxLayoutManager.SavedState.a(this.bub);
    requestLayout();
    AppMethodBeat.o(54837);
  }

  public final void c(RecyclerView.o paramo, RecyclerView.s params)
  {
    AppMethodBeat.i(54816);
    this.anc = paramo;
    this.anY = params;
    int i = params.getItemCount();
    if ((i == 0) && (params.apv))
      AppMethodBeat.o(54816);
    while (true)
    {
      return;
      int j = s.T(this.aiB);
      FlexboxLayoutManager.a locala;
      Object localObject;
      boolean bool;
      switch (this.btA)
      {
      default:
        this.hq = false;
        this.btX = false;
        uo();
        iJ();
        this.btO.fa(i);
        this.btO.eZ(i);
        this.btO.fb(i);
        this.btY.bum = false;
        if ((this.bub != null) && (FlexboxLayoutManager.SavedState.c(this.bub, i)))
          this.alG = FlexboxLayoutManager.SavedState.b(this.bub);
        if ((FlexboxLayoutManager.a.a(this.btZ)) && (this.alG == -1) && (this.bub == null))
          break label631;
        FlexboxLayoutManager.a.b(this.btZ);
        locala = this.btZ;
        localObject = this.bub;
        if ((!$assertionsDisabled) && (this.btO.btv == null))
        {
          paramo = new AssertionError();
          AppMethodBeat.o(54816);
          throw paramo;
        }
        label401: label445: break;
      case 0:
        if (j == 1)
        {
          bool = true;
          this.hq = bool;
          if (this.btB != 2)
            break label280;
        }
        for (bool = true; ; bool = false)
        {
          this.btX = bool;
          break;
          bool = false;
          break label248;
        }
      case 1:
        if (j != 1)
        {
          bool = true;
          this.hq = bool;
          if (this.btB != 2)
            break label327;
        }
        for (bool = true; ; bool = false)
        {
          this.btX = bool;
          break;
          bool = false;
          break label295;
        }
      case 2:
        if (j == 1)
        {
          bool = true;
          this.hq = bool;
          if (this.btB == 2)
            if (this.hq)
              break label386;
        }
        label386: for (bool = true; ; bool = false)
        {
          this.hq = bool;
          this.btX = false;
          break;
          bool = false;
          break label342;
        }
      case 3:
        label248: if (j == 1)
        {
          bool = true;
          this.hq = bool;
          if (this.btB == 2)
            if (this.hq)
              break label445;
        }
        label280: label295: label327: label342: for (bool = true; ; bool = false)
        {
          this.hq = bool;
          this.btX = true;
          break;
          bool = false;
          break label401;
        }
      }
      label499: label631: int k;
      label566: label588: label599: int m;
      label656: int n;
      int i1;
      if ((params.apv) || (this.alG == -1))
      {
        j = 0;
        if (j == 0)
        {
          if (getChildCount() == 0)
            break label1288;
          if (!FlexboxLayoutManager.a.d(locala))
            break label1257;
          localObject = fi(params.getItemCount());
          if (localObject == null)
            break label1288;
          FlexboxLayoutManager.a.a(locala, (View)localObject);
          if ((!params.apv) && (iE()))
          {
            if ((this.alA.bf((View)localObject) < this.alA.jf()) && (this.alA.bg((View)localObject) >= this.alA.je()))
              break label1270;
            j = 1;
            if (j != 0)
            {
              if (!FlexboxLayoutManager.a.d(locala))
                break label1276;
              j = this.alA.jf();
              FlexboxLayoutManager.a.c(locala, j);
            }
          }
          j = 1;
          if (j == 0)
          {
            FlexboxLayoutManager.a.g(locala);
            FlexboxLayoutManager.a.b(locala, 0);
            FlexboxLayoutManager.a.a(locala, 0);
          }
        }
        FlexboxLayoutManager.a.c(this.btZ);
        b(paramo);
        if (!FlexboxLayoutManager.a.d(this.btZ))
          break label1294;
        b(this.btZ, false, true);
        k = View.MeasureSpec.makeMeasureSpec(this.mWidth, this.aoJ);
        m = View.MeasureSpec.makeMeasureSpec(this.mHeight, this.aoK);
        n = this.mWidth;
        i1 = this.mHeight;
        if (!ua())
          break label1325;
        if ((this.buc == -2147483648) || (this.buc == n))
          break label1307;
        j = 1;
        label722: if (!this.btY.alm)
          break label1313;
      }
      label1288: label1294: label1307: label1313: for (int i2 = this.mContext.getResources().getDisplayMetrics().heightPixels; ; i2 = this.btY.alg)
      {
        this.buc = n;
        this.bud = i1;
        if ((this.buh != -1) || ((this.alG == -1) && (j == 0)))
          break label1637;
        if (FlexboxLayoutManager.a.d(this.btZ))
          break label1500;
        this.bty.clear();
        if (($assertionsDisabled) || (this.btO.btv != null))
          break label1392;
        paramo = new AssertionError();
        AppMethodBeat.o(54816);
        throw paramo;
        if ((this.alG < 0) || (this.alG >= params.getItemCount()))
        {
          this.alG = -1;
          this.alH = -2147483648;
          j = 0;
          break;
        }
        FlexboxLayoutManager.a.b(locala, this.alG);
        FlexboxLayoutManager.a.a(locala, this.btO.btv[FlexboxLayoutManager.a.e(locala)]);
        if ((this.bub != null) && (FlexboxLayoutManager.SavedState.c(this.bub, params.getItemCount())))
        {
          j = this.alA.je();
          FlexboxLayoutManager.a.c(locala, FlexboxLayoutManager.SavedState.c((FlexboxLayoutManager.SavedState)localObject) + j);
          FlexboxLayoutManager.a.h(locala);
          FlexboxLayoutManager.a.a(locala, -1);
        }
        while (true)
        {
          j = 1;
          break;
          if (this.alH == -2147483648)
          {
            localObject = bW(this.alG);
            if (localObject != null)
            {
              if (this.alA.bj((View)localObject) > this.alA.jg())
              {
                FlexboxLayoutManager.a.g(locala);
              }
              else if (this.alA.bf((View)localObject) - this.alA.je() < 0)
              {
                FlexboxLayoutManager.a.c(locala, this.alA.je());
                FlexboxLayoutManager.a.a(locala, false);
              }
              else if (this.alA.jf() - this.alA.bg((View)localObject) < 0)
              {
                FlexboxLayoutManager.a.c(locala, this.alA.jf());
                FlexboxLayoutManager.a.a(locala, true);
              }
              else
              {
                if (FlexboxLayoutManager.a.d(locala));
                for (j = this.alA.bg((View)localObject) + this.alA.jd(); ; j = this.alA.bf((View)localObject))
                {
                  FlexboxLayoutManager.a.c(locala, j);
                  j = 1;
                  break;
                }
              }
            }
            else
            {
              if (getChildCount() > 0)
              {
                j = bt(getChildAt(0));
                if (this.alG >= j)
                  break label1195;
              }
              label1195: for (bool = true; ; bool = false)
              {
                FlexboxLayoutManager.a.a(locala, bool);
                FlexboxLayoutManager.a.g(locala);
                break;
              }
            }
          }
          else if ((!ua()) && (this.hq))
          {
            FlexboxLayoutManager.a.c(locala, this.alH - this.alA.getEndPadding());
          }
          else
          {
            FlexboxLayoutManager.a.c(locala, this.alA.je() + this.alH);
          }
        }
        label1257: localObject = fh(params.getItemCount());
        break label499;
        label1270: j = 0;
        break label566;
        label1276: j = this.alA.je();
        break label588;
        j = 0;
        break label599;
        a(this.btZ, false, true);
        break label656;
        j = 0;
        break label722;
      }
      label1325: if ((this.bud != -2147483648) && (this.bud != i1))
      {
        j = 1;
        label1346: if (!this.btY.alm)
          break label1380;
      }
      label1380: for (i2 = this.mContext.getResources().getDisplayMetrics().widthPixels; ; i2 = this.btY.alg)
      {
        break;
        j = 0;
        break label1346;
      }
      label1392: this.btP.reset();
      if (ua())
      {
        this.btO.b(this.btP, k, m, i2, FlexboxLayoutManager.a.e(this.btZ), this.bty);
        label1434: this.bty = this.btP.bty;
        this.btO.bk(k, m);
        this.btO.ul();
        FlexboxLayoutManager.a.a(this.btZ, this.btO.btv[FlexboxLayoutManager.a.e(this.btZ)]);
        this.btY.bui = FlexboxLayoutManager.a.f(this.btZ);
        label1500: if (!FlexboxLayoutManager.a.d(this.btZ))
          break label1902;
        a(paramo, params, this.btY);
        j = this.btY.Lp;
        a(this.btZ, true, false);
        a(paramo, params, this.btY);
        i2 = this.btY.Lp;
      }
      while (true)
        if (getChildCount() > 0)
        {
          if (FlexboxLayoutManager.a.d(this.btZ))
          {
            b(a(i2, paramo, params, true) + j, paramo, params, false);
            AppMethodBeat.o(54816);
            break;
            this.btO.d(this.btP, k, m, i2, FlexboxLayoutManager.a.e(this.btZ), this.bty);
            break label1434;
            label1637: if (this.buh != -1)
            {
              j = Math.min(this.buh, FlexboxLayoutManager.a.e(this.btZ));
              label1661: this.btP.reset();
              if (!ua())
                break label1811;
              if (this.bty.size() <= 0)
                break label1778;
              this.btO.d(this.bty, j);
              this.btO.a(this.btP, k, m, i2, j, FlexboxLayoutManager.a.e(this.btZ), this.bty);
            }
            while (true)
            {
              this.bty = this.btP.bty;
              this.btO.x(k, m, j);
              this.btO.eY(j);
              break;
              j = FlexboxLayoutManager.a.e(this.btZ);
              break label1661;
              label1778: this.btO.fb(i);
              this.btO.a(this.btP, k, m, i2, 0, this.bty);
              continue;
              label1811: if (this.bty.size() > 0)
              {
                this.btO.d(this.bty, j);
                this.btO.a(this.btP, m, k, i2, j, FlexboxLayoutManager.a.e(this.btZ), this.bty);
              }
              else
              {
                this.btO.fb(i);
                this.btO.c(this.btP, k, m, i2, 0, this.bty);
              }
            }
            label1902: a(paramo, params, this.btY);
            i2 = this.btY.Lp;
            b(this.btZ, true, false);
            a(paramo, params, this.btY);
            j = this.btY.Lp;
            continue;
          }
          a(i2 + b(j, paramo, params, true), paramo, params, false);
        }
      AppMethodBeat.o(54816);
    }
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54810);
    super.c(paramRecyclerView, paramInt1, paramInt2);
    fg(paramInt1);
    AppMethodBeat.o(54810);
  }

  public final int ca(View paramView)
  {
    AppMethodBeat.i(54794);
    int i;
    if (ua())
    {
      i = bB(paramView) + bC(paramView);
      AppMethodBeat.o(54794);
    }
    while (true)
    {
      return i;
      i = bD(paramView) + bE(paramView);
      AppMethodBeat.o(54794);
    }
  }

  public final int d(RecyclerView.s params)
  {
    AppMethodBeat.i(54853);
    j(params);
    int i = j(params);
    AppMethodBeat.o(54853);
    return i;
  }

  public final void d(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54813);
    super.d(paramRecyclerView, paramInt1, paramInt2);
    fg(paramInt1);
    AppMethodBeat.o(54813);
  }

  public final int e(RecyclerView.s params)
  {
    AppMethodBeat.i(54854);
    int i = j(params);
    AppMethodBeat.o(54854);
    return i;
  }

  public final View eU(int paramInt)
  {
    AppMethodBeat.i(54797);
    View localView = (View)this.bue.get(paramInt);
    if (localView != null)
      AppMethodBeat.o(54797);
    while (true)
    {
      return localView;
      localView = this.anc.cq(paramInt);
      AppMethodBeat.o(54797);
    }
  }

  public final View eV(int paramInt)
  {
    AppMethodBeat.i(54798);
    View localView = eU(paramInt);
    AppMethodBeat.o(54798);
    return localView;
  }

  public final int f(RecyclerView.s params)
  {
    AppMethodBeat.i(54850);
    int i = k(params);
    AppMethodBeat.o(54850);
    return i;
  }

  public final void f(RecyclerView paramRecyclerView)
  {
    AppMethodBeat.i(54839);
    super.f(paramRecyclerView);
    this.bug = ((View)paramRecyclerView.getParent());
    AppMethodBeat.o(54839);
  }

  public final int g(RecyclerView.s params)
  {
    AppMethodBeat.i(54851);
    int i = k(params);
    AppMethodBeat.o(54851);
    return i;
  }

  public final void g(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54812);
    super.g(paramRecyclerView, paramInt1, paramInt2);
    fg(paramInt1);
    AppMethodBeat.o(54812);
  }

  public int getAlignContent()
  {
    return 5;
  }

  public int getAlignItems()
  {
    return this.btD;
  }

  public int getFlexDirection()
  {
    return this.btA;
  }

  public int getFlexItemCount()
  {
    AppMethodBeat.i(54796);
    int i = this.anY.getItemCount();
    AppMethodBeat.o(54796);
    return i;
  }

  public List<b> getFlexLinesInternal()
  {
    return this.bty;
  }

  public int getFlexWrap()
  {
    return this.btB;
  }

  public int getLargestMainSize()
  {
    int i = 0;
    AppMethodBeat.i(54801);
    if (this.bty.size() == 0)
      AppMethodBeat.o(54801);
    while (true)
    {
      return i;
      i = -2147483648;
      int j = this.bty.size();
      for (int k = 0; k < j; k++)
        i = Math.max(i, ((b)this.bty.get(k)).bti);
      AppMethodBeat.o(54801);
    }
  }

  public int getMaxLine()
  {
    return this.btF;
  }

  public int getSumOfCrossSize()
  {
    AppMethodBeat.i(54802);
    int i = this.bty.size();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += ((b)this.bty.get(j)).btk;
      j++;
    }
    AppMethodBeat.o(54802);
    return k;
  }

  public final int h(RecyclerView.s params)
  {
    AppMethodBeat.i(54856);
    int i = l(params);
    AppMethodBeat.o(54856);
    return i;
  }

  public final int i(RecyclerView.s params)
  {
    AppMethodBeat.i(54857);
    int i = l(params);
    AppMethodBeat.o(54857);
    return i;
  }

  public final RecyclerView.LayoutParams iA()
  {
    AppMethodBeat.i(54805);
    FlexboxLayoutManager.LayoutParams localLayoutParams = new FlexboxLayoutManager.LayoutParams();
    AppMethodBeat.o(54805);
    return localLayoutParams;
  }

  public final boolean iG()
  {
    AppMethodBeat.i(54841);
    boolean bool;
    if ((!ua()) || (this.mWidth > this.bug.getWidth()))
    {
      bool = true;
      AppMethodBeat.o(54841);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54841);
    }
  }

  public final boolean iH()
  {
    AppMethodBeat.i(54842);
    boolean bool;
    if ((ua()) || (this.mHeight > this.bug.getHeight()))
    {
      bool = true;
      AppMethodBeat.o(54842);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54842);
    }
  }

  public final void jW()
  {
    AppMethodBeat.i(54807);
    removeAllViews();
    AppMethodBeat.o(54807);
  }

  public final int m(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54793);
    if (ua())
    {
      paramInt1 = bD(paramView) + bE(paramView);
      AppMethodBeat.o(54793);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = bB(paramView) + bC(paramView);
      AppMethodBeat.o(54793);
    }
  }

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(54809);
    if ((paramParcelable instanceof FlexboxLayoutManager.SavedState))
    {
      this.bub = ((FlexboxLayoutManager.SavedState)paramParcelable);
      requestLayout();
    }
    AppMethodBeat.o(54809);
  }

  public final Parcelable onSaveInstanceState()
  {
    AppMethodBeat.i(54808);
    if (this.bub != null)
    {
      localSavedState = new FlexboxLayoutManager.SavedState(this.bub, (byte)0);
      AppMethodBeat.o(54808);
      return localSavedState;
    }
    FlexboxLayoutManager.SavedState localSavedState = new FlexboxLayoutManager.SavedState();
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      FlexboxLayoutManager.SavedState.a(localSavedState, bt(localView));
      FlexboxLayoutManager.SavedState.b(localSavedState, this.alA.bf(localView) - this.alA.je());
    }
    while (true)
    {
      AppMethodBeat.o(54808);
      break;
      FlexboxLayoutManager.SavedState.a(localSavedState);
    }
  }

  public void setFlexLines(List<b> paramList)
  {
    this.bty = paramList;
  }

  public final boolean ua()
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (this.btA != 0)
      if (this.btA != 1)
        break label23;
    label23: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public final int v(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(54799);
    paramInt1 = c(this.mWidth, this.aoJ, paramInt2, paramInt3, iG());
    AppMethodBeat.o(54799);
    return paramInt1;
  }

  public final int w(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(54800);
    paramInt1 = c(this.mHeight, this.aoK, paramInt2, paramInt3, iH());
    AppMethodBeat.o(54800);
    return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.flexbox.FlexboxLayoutManager
 * JD-Core Version:    0.6.2
 */