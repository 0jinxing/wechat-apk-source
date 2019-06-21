package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.c;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager
{
  boolean akT = false;
  int akU = -1;
  int[] akV;
  View[] akW;
  final SparseIntArray akX = new SparseIntArray();
  final SparseIntArray akY = new SparseIntArray();
  public GridLayoutManager.b akZ = new GridLayoutManager.a();
  final Rect ala = new Rect();

  public GridLayoutManager(int paramInt)
  {
    bT(paramInt);
  }

  public GridLayoutManager(int paramInt, byte paramByte)
  {
    super(1);
    bT(paramInt);
  }

  private int Z(int paramInt1, int paramInt2)
  {
    if ((this.mOrientation == 1) && (ib()));
    for (paramInt1 = this.akV[(this.akU - paramInt1)] - this.akV[(this.akU - paramInt1 - paramInt2)]; ; paramInt1 = this.akV[(paramInt1 + paramInt2)] - this.akV[paramInt1])
      return paramInt1;
  }

  private int a(RecyclerView.o paramo, RecyclerView.s params, int paramInt)
  {
    if (!params.apv)
      paramInt = this.akZ.ac(paramInt, this.akU);
    while (true)
    {
      return paramInt;
      paramInt = paramo.cp(paramInt);
      if (paramInt == -1)
        paramInt = 0;
      else
        paramInt = this.akZ.ac(paramInt, this.akU);
    }
  }

  private void a(RecyclerView.o paramo, RecyclerView.s params, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    int j;
    int m;
    if (paramBoolean)
    {
      j = 1;
      int k = 0;
      m = paramInt;
      paramInt = k;
    }
    while (paramInt != m)
    {
      View localView = this.akW[paramInt];
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      localLayoutParams.alc = c(paramo, params, bt(localView));
      localLayoutParams.alb = i;
      i += localLayoutParams.alc;
      paramInt += j;
      continue;
      paramInt--;
      j = -1;
      m = -1;
    }
  }

  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    if (paramBoolean);
    for (paramBoolean = a(paramView, paramInt1, paramInt2, localLayoutParams); ; paramBoolean = b(paramView, paramInt1, paramInt2, localLayoutParams))
    {
      if (paramBoolean)
        paramView.measure(paramInt1, paramInt2);
      return;
    }
  }

  private int b(RecyclerView.o paramo, RecyclerView.s params, int paramInt)
  {
    int i;
    if (!params.apv)
      i = this.akZ.ab(paramInt, this.akU);
    while (true)
    {
      return i;
      int j = this.akY.get(paramInt, -1);
      i = j;
      if (j == -1)
      {
        paramInt = paramo.cp(paramInt);
        if (paramInt == -1)
          i = 0;
        else
          i = this.akZ.ab(paramInt, this.akU);
      }
    }
  }

  private void b(View paramView, int paramInt, boolean paramBoolean)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    Rect localRect = localLayoutParams.ala;
    int i = localRect.top + localRect.bottom + localLayoutParams.topMargin + localLayoutParams.bottomMargin;
    int j = localRect.left;
    int k = localRect.right;
    int m = localLayoutParams.leftMargin;
    m = localLayoutParams.rightMargin + (k + j + m);
    j = Z(localLayoutParams.alb, localLayoutParams.alc);
    if (this.mOrientation == 1)
    {
      m = c(j, paramInt, m, localLayoutParams.width, false);
      paramInt = c(this.alA.jg(), this.aoK, i, localLayoutParams.height, true);
    }
    while (true)
    {
      a(paramView, m, paramInt, paramBoolean);
      return;
      paramInt = c(j, paramInt, i, localLayoutParams.height, false);
      m = c(this.alA.jg(), this.aoJ, m, localLayoutParams.width, true);
    }
  }

  private void bS(int paramInt)
  {
    this.akV = d(this.akV, this.akU, paramInt);
  }

  private int c(RecyclerView.o paramo, RecyclerView.s params, int paramInt)
  {
    int i;
    if (!params.apv)
      i = this.akZ.bU(paramInt);
    while (true)
    {
      return i;
      int j = this.akX.get(paramInt, -1);
      i = j;
      if (j == -1)
      {
        paramInt = paramo.cp(paramInt);
        if (paramInt == -1)
          i = 1;
        else
          i = this.akZ.bU(paramInt);
      }
    }
  }

  private static int[] d(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt;
    if ((paramArrayOfInt != null) && (paramArrayOfInt.length == paramInt1 + 1))
    {
      arrayOfInt = paramArrayOfInt;
      if (paramArrayOfInt[(paramArrayOfInt.length - 1)] == paramInt2);
    }
    else
    {
      arrayOfInt = new int[paramInt1 + 1];
    }
    arrayOfInt[0] = 0;
    int i = paramInt2 / paramInt1;
    int j = paramInt2 % paramInt1;
    int k = 1;
    paramInt2 = 0;
    int m = 0;
    int n;
    if (k <= paramInt1)
    {
      paramInt2 += j;
      if ((paramInt2 <= 0) || (paramInt1 - paramInt2 >= j))
        break label106;
      n = i + 1;
      paramInt2 -= paramInt1;
    }
    while (true)
    {
      m += n;
      arrayOfInt[k] = m;
      k++;
      break;
      return arrayOfInt;
      label106: n = i;
    }
  }

  private void iB()
  {
    if (getOrientation() == 1);
    for (int i = this.mWidth - getPaddingRight() - getPaddingLeft(); ; i = this.mHeight - getPaddingBottom() - getPaddingTop())
    {
      bS(i);
      return;
    }
  }

  private void iC()
  {
    if ((this.akW == null) || (this.akW.length != this.akU))
      this.akW = new View[this.akU];
  }

  public final int a(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    iB();
    iC();
    return super.a(paramInt, paramo, params);
  }

  public final int a(RecyclerView.o paramo, RecyclerView.s params)
  {
    int i;
    if (this.mOrientation == 0)
      i = this.akU;
    while (true)
    {
      return i;
      if (params.getItemCount() <= 0)
        i = 0;
      else
        i = a(paramo, params, params.getItemCount() - 1) + 1;
    }
  }

  public final RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new LayoutParams(paramContext, paramAttributeSet);
  }

  final View a(RecyclerView.o paramo, RecyclerView.s params, int paramInt1, int paramInt2, int paramInt3)
  {
    iJ();
    int i = this.alA.je();
    int j = this.alA.jf();
    int k;
    Object localObject1;
    Object localObject2;
    label37: View localView;
    if (paramInt2 > paramInt1)
    {
      k = 1;
      localObject1 = null;
      localObject2 = null;
      if (paramInt1 == paramInt2)
        break label164;
      localView = getChildAt(paramInt1);
      int m = bt(localView);
      if ((m < 0) || (m >= paramInt3) || (b(paramo, params, m) != 0))
        break label183;
      if (!((RecyclerView.LayoutParams)localView.getLayoutParams()).aoM.isRemoved())
        break label120;
      if (localObject2 != null)
        break label183;
      localObject2 = localView;
    }
    label164: label176: label183: 
    while (true)
    {
      paramInt1 += k;
      break label37;
      k = -1;
      break;
      label120: if (this.alA.bf(localView) < j)
      {
        localObject3 = localView;
        if (this.alA.bg(localView) >= i);
      }
      else
      {
        if (localObject1 != null)
          break label183;
        localObject1 = localView;
        continue;
        if (localObject1 == null)
          break label176;
      }
      for (Object localObject3 = localObject1; ; localObject3 = localObject2)
        return localObject3;
    }
  }

  public final View a(View paramView, int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    View localView1 = bl(paramView);
    if (localView1 == null)
      paramView = null;
    Object localObject1;
    int i;
    int j;
    label75: label86: int m;
    label103: int i1;
    int i2;
    int i3;
    Object localObject2;
    int i4;
    int i5;
    int i7;
    label152: View localView2;
    label220: label225: label239: label245: LayoutParams localLayoutParams;
    int i8;
    int i9;
    do
    {
      while (true)
      {
        return paramView;
        localObject1 = (LayoutParams)localView1.getLayoutParams();
        i = ((LayoutParams)localObject1).alb;
        j = ((LayoutParams)localObject1).alb + ((LayoutParams)localObject1).alc;
        if (super.a(paramView, paramInt, paramo, params) != null)
          break;
        paramView = null;
      }
      int k;
      int n;
      if (bZ(paramInt) == 1)
      {
        k = 1;
        if (k == this.alD)
          break label220;
        paramInt = 1;
        if (paramInt == 0)
          break label225;
        paramInt = getChildCount() - 1;
        m = -1;
        n = -1;
        if ((this.mOrientation != 1) || (!ib()))
          break label239;
      }
      for (i1 = 1; ; i1 = 0)
      {
        localObject1 = null;
        i2 = -1;
        i3 = 0;
        localObject2 = null;
        i4 = -1;
        i5 = 0;
        int i6 = a(paramo, params, paramInt);
        i7 = paramInt;
        if (i7 != n)
        {
          paramInt = a(paramo, params, i7);
          localView2 = getChildAt(i7);
          if (localView2 != localView1)
          {
            if ((!localView2.hasFocusable()) || (paramInt == i6))
              break label245;
            if (localObject1 == null)
              break label624;
          }
        }
        if (localObject1 == null)
          break label618;
        paramView = (View)localObject1;
        break;
        k = 0;
        break label75;
        paramInt = 0;
        break label86;
        paramInt = 0;
        m = 1;
        n = getChildCount();
        break label103;
      }
      localLayoutParams = (LayoutParams)localView2.getLayoutParams();
      i8 = localLayoutParams.alb;
      i9 = localLayoutParams.alb + localLayoutParams.alc;
      if ((!localView2.hasFocusable()) || (i8 != i))
        break;
      paramView = localView2;
    }
    while (i9 == j);
    int i10 = 0;
    if (((localView2.hasFocusable()) && (localObject1 == null)) || ((!localView2.hasFocusable()) && (localObject2 == null)))
    {
      paramInt = 1;
      label331: if (paramInt == 0)
        break label624;
      if (!localView2.hasFocusable())
        break label588;
      i2 = localLayoutParams.alb;
      i3 = Math.min(i9, j) - Math.max(i8, i);
      paramInt = i4;
      localObject1 = localView2;
      i4 = i5;
    }
    while (true)
    {
      i7 += m;
      i5 = i4;
      i4 = paramInt;
      break label152;
      paramInt = Math.max(i8, i);
      int i11 = Math.min(i9, j) - paramInt;
      if (localView2.hasFocusable())
      {
        if (i11 > i3)
        {
          paramInt = 1;
          break label331;
        }
        paramInt = i10;
        if (i11 != i3)
          break label331;
        if (i8 > i2);
        for (i12 = 1; ; i12 = 0)
        {
          paramInt = i10;
          if (i1 != i12)
            break;
          paramInt = 1;
          break;
        }
      }
      paramInt = i10;
      if (localObject1 != null)
        break label331;
      if ((this.aoA.bV(localView2)) && (this.aoB.bV(localView2)))
      {
        paramInt = 1;
        label509: if (paramInt != 0)
          break label541;
      }
      label541: for (int i12 = 1; ; i12 = 0)
      {
        paramInt = i10;
        if (i12 == 0)
          break;
        if (i11 <= i5)
          break label547;
        paramInt = 1;
        break;
        paramInt = 0;
        break label509;
      }
      label547: paramInt = i10;
      if (i11 != i5)
        break label331;
      if (i8 > i4);
      for (i12 = 1; ; i12 = 0)
      {
        paramInt = i10;
        if (i1 != i12)
          break;
        paramInt = 1;
        break;
      }
      label588: paramInt = localLayoutParams.alb;
      i4 = Math.min(i9, j) - Math.max(i8, i);
      localObject2 = localView2;
      continue;
      label618: paramView = localObject2;
      break;
      label624: paramInt = i4;
      i4 = i5;
    }
  }

  public final void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    if (this.akV == null)
      super.a(paramRect, paramInt1, paramInt2);
    int i = getPaddingLeft();
    int j = getPaddingRight() + i;
    i = getPaddingTop() + getPaddingBottom();
    if (this.mOrientation == 1)
    {
      paramInt2 = l(paramInt2, i + paramRect.height(), s.aa(this.aiB));
      paramInt1 = l(paramInt1, j + this.akV[(this.akV.length - 1)], s.Z(this.aiB));
    }
    while (true)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      return;
      paramInt1 = l(paramInt1, j + paramRect.width(), s.Z(this.aiB));
      paramInt2 = l(paramInt2, i + this.akV[(this.akV.length - 1)], s.aa(this.aiB));
    }
  }

  public final void a(GridLayoutManager.b paramb)
  {
    this.akZ = paramb;
  }

  final void a(RecyclerView.o paramo, RecyclerView.s params, LinearLayoutManager.a parama, int paramInt)
  {
    int i = 1;
    super.a(paramo, params, parama, paramInt);
    iB();
    if ((params.getItemCount() > 0) && (!params.apv))
    {
      if (paramInt == 1);
      while (true)
      {
        paramInt = b(paramo, params, parama.mPosition);
        if (i == 0)
          break;
        while ((paramInt > 0) && (parama.mPosition > 0))
        {
          parama.mPosition -= 1;
          paramInt = b(paramo, params, parama.mPosition);
        }
        i = 0;
      }
      int j = params.getItemCount();
      i = parama.mPosition;
      while (i < j - 1)
      {
        int k = b(paramo, params, i + 1);
        if (k <= paramInt)
          break;
        i++;
        paramInt = k;
      }
      parama.mPosition = i;
    }
    iC();
  }

  final void a(RecyclerView.o paramo, RecyclerView.s params, LinearLayoutManager.c paramc, LinearLayoutManager.b paramb)
  {
    int i = this.alA.jh();
    int j;
    int k;
    label38: boolean bool;
    if (i != 1073741824)
    {
      j = 1;
      if (getChildCount() <= 0)
        break label212;
      k = this.akV[this.akU];
      if (j != 0)
        iB();
      if (paramc.ali != 1)
        break label218;
      bool = true;
      label58: m = 0;
      n = this.akU;
      i1 = m;
      if (!bool)
        n = b(paramo, params, paramc.alh) + c(paramo, params, paramc.alh);
    }
    int i2;
    label212: label218: View localView;
    for (int i1 = m; ; i1++)
    {
      if ((i1 >= this.akU) || (!paramc.b(params)) || (n <= 0))
        break label263;
      i2 = paramc.alh;
      m = c(paramo, params, i2);
      if (m > this.akU)
      {
        throw new IllegalArgumentException("Item at position " + i2 + " requires " + m + " spans but GridLayoutManager has only " + this.akU + " spans.");
        j = 0;
        break;
        k = 0;
        break label38;
        bool = false;
        break label58;
      }
      n -= m;
      if (n < 0)
        break label263;
      localView = paramc.a(paramo);
      if (localView == null)
        break label263;
      this.akW[i1] = localView;
    }
    label263: if (i1 == 0)
    {
      paramb.mFinished = true;
      return;
    }
    int n = 0;
    float f1 = 0.0F;
    a(paramo, params, i1, bool);
    int m = 0;
    label294: label327: int i3;
    if (m < i1)
    {
      paramo = this.akW[m];
      if (paramc.alW == null)
        if (bool)
        {
          addView(paramo, -1);
          g(paramo, this.ala);
          b(paramo, i, false);
          i3 = this.alA.bj(paramo);
          i2 = n;
          if (i3 > n)
            i2 = i3;
          params = (LayoutParams)paramo.getLayoutParams();
          float f2 = this.alA.bk(paramo) * 1.0F / params.alc;
          if (f2 <= f1)
            break label1157;
          f1 = f2;
        }
    }
    label1154: label1157: 
    while (true)
    {
      m++;
      n = i2;
      break label294;
      addView(paramo, 0);
      break label327;
      if (bool)
      {
        z(paramo, -1);
        break label327;
      }
      z(paramo, 0);
      break label327;
      if (j != 0)
      {
        bS(Math.max(Math.round(this.akU * f1), k));
        n = 0;
        k = 0;
        label481: j = n;
        if (k >= i1)
          break label540;
        paramo = this.akW[k];
        b(paramo, 1073741824, true);
        j = this.alA.bj(paramo);
        if (j <= n)
          break label1154;
        n = j;
      }
      while (true)
      {
        k++;
        break label481;
        j = n;
        label540: n = 0;
        if (n < i1)
        {
          localView = this.akW[n];
          if (this.alA.bj(localView) != j)
          {
            params = (LayoutParams)localView.getLayoutParams();
            paramo = params.ala;
            k = paramo.top + paramo.bottom + params.topMargin + params.bottomMargin;
            m = paramo.left;
            m = paramo.right + m + params.leftMargin + params.rightMargin;
            i2 = Z(params.alb, params.alc);
            if (this.mOrientation != 1)
              break label702;
            m = c(i2, 1073741824, m, params.width, false);
          }
          for (k = View.MeasureSpec.makeMeasureSpec(j - k, 1073741824); ; k = c(i2, 1073741824, k, params.height, false))
          {
            a(localView, m, k, true);
            n++;
            break;
            label702: m = View.MeasureSpec.makeMeasureSpec(j - m, 1073741824);
          }
        }
        paramb.alQ = j;
        i2 = 0;
        m = 0;
        k = 0;
        if (this.mOrientation == 1)
          if (paramc.sE == -1)
          {
            n = paramc.Lp;
            k = n - j;
            j = i2;
            i2 = 0;
            i3 = j;
            j = n;
            n = k;
            k = i3;
            label803: if (i2 >= i1)
              break label1143;
            paramo = this.akW[i2];
            params = (LayoutParams)paramo.getLayoutParams();
            if (this.mOrientation != 1)
              break label1103;
            if (!ib())
              break label1047;
            k = getPaddingLeft();
            m = this.akV[(this.akU - params.alb)] + k;
            i3 = m - this.alA.bk(paramo);
            k = n;
            n = j;
            j = i3;
          }
        while (true)
        {
          k(paramo, j, k, m, n);
          if ((params.aoM.isRemoved()) || (params.aoM.kx()))
            paramb.alR = true;
          paramb.YP |= paramo.hasFocusable();
          i3 = i2 + 1;
          i2 = n;
          n = k;
          k = j;
          j = i2;
          i2 = i3;
          break label803;
          k = paramc.Lp;
          n = j + k;
          j = i2;
          break;
          if (paramc.sE == -1)
          {
            m = paramc.Lp;
            j = m - j;
            n = 0;
            break;
          }
          n = paramc.Lp;
          m = n + j;
          i2 = 0;
          j = n;
          n = i2;
          break;
          label1047: i = getPaddingLeft() + this.akV[params.alb];
          i3 = this.alA.bk(paramo);
          m = j;
          k = n;
          i3 += i;
          j = i;
          n = m;
          m = i3;
          continue;
          label1103: i3 = getPaddingTop() + this.akV[params.alb];
          n = i3 + this.alA.bk(paramo);
          j = k;
          k = i3;
        }
        label1143: Arrays.fill(this.akW, null);
        break;
      }
    }
  }

  public final void a(RecyclerView.o paramo, RecyclerView.s params, View paramView, b paramb)
  {
    boolean bool1 = false;
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof LayoutParams))
      super.a(paramView, paramb);
    while (true)
    {
      return;
      paramView = (LayoutParams)localLayoutParams;
      int i = a(paramo, params, paramView.aoM.ki());
      if (this.mOrientation == 0)
      {
        j = paramView.alb;
        k = paramView.alc;
        if ((this.akU > 1) && (paramView.alc == this.akU));
        for (bool2 = true; ; bool2 = false)
        {
          paramb.H(b.c.b(j, k, i, 1, bool2));
          break;
        }
      }
      int j = paramView.alb;
      int k = paramView.alc;
      boolean bool2 = bool1;
      if (this.akU > 1)
      {
        bool2 = bool1;
        if (paramView.alc == this.akU)
          bool2 = true;
      }
      paramb.H(b.c.b(i, 1, j, k, bool2));
    }
  }

  public final void a(RecyclerView.s params)
  {
    super.a(params);
    this.akT = false;
  }

  final void a(RecyclerView.s params, LinearLayoutManager.c paramc, RecyclerView.i.a parama)
  {
    int i = this.akU;
    for (int j = 0; (j < this.akU) && (paramc.b(params)) && (i > 0); j++)
    {
      int k = paramc.alh;
      parama.T(k, Math.max(0, paramc.alS));
      i -= this.akZ.bU(k);
      paramc.alh += paramc.ali;
    }
  }

  public final void a(RecyclerView paramRecyclerView)
  {
    this.akZ.ald.clear();
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.akZ.ald.clear();
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    this.akZ.ald.clear();
  }

  public final boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }

  public final int b(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    iB();
    iC();
    return super.b(paramInt, paramo, params);
  }

  public final int b(RecyclerView.o paramo, RecyclerView.s params)
  {
    int i;
    if (this.mOrientation == 1)
      i = this.akU;
    while (true)
    {
      return i;
      if (params.getItemCount() <= 0)
        i = 0;
      else
        i = a(paramo, params, params.getItemCount() - 1) + 1;
    }
  }

  public final void bT(int paramInt)
  {
    if (paramInt == this.akU);
    while (true)
    {
      return;
      this.akT = true;
      if (paramInt <= 0)
        throw new IllegalArgumentException("Span count should be at least 1. Provided ".concat(String.valueOf(paramInt)));
      this.akU = paramInt;
      this.akZ.ald.clear();
      requestLayout();
    }
  }

  public void c(RecyclerView.o paramo, RecyclerView.s params)
  {
    if (params.apv)
    {
      int i = getChildCount();
      for (int j = 0; j < i; j++)
      {
        LayoutParams localLayoutParams = (LayoutParams)getChildAt(j).getLayoutParams();
        int k = localLayoutParams.aoM.ki();
        this.akX.put(k, localLayoutParams.alc);
        this.akY.put(k, localLayoutParams.alb);
      }
    }
    super.c(paramo, params);
    this.akX.clear();
    this.akY.clear();
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.akZ.ald.clear();
  }

  public final RecyclerView.LayoutParams d(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams));
    for (paramLayoutParams = new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams); ; paramLayoutParams = new LayoutParams(paramLayoutParams))
      return paramLayoutParams;
  }

  public final void d(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.akZ.ald.clear();
  }

  public final RecyclerView.LayoutParams iA()
  {
    if (this.mOrientation == 0);
    for (LayoutParams localLayoutParams = new LayoutParams(-2, -1); ; localLayoutParams = new LayoutParams(-1, -2))
      return localLayoutParams;
  }

  public final int iD()
  {
    return this.akU;
  }

  public boolean iE()
  {
    if ((this.alJ == null) && (!this.akT));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static class LayoutParams extends RecyclerView.LayoutParams
  {
    int alb = -1;
    int alc = 0;

    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }

    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }

    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }

    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.GridLayoutManager
 * JD-Core Version:    0.6.2
 */