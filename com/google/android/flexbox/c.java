package com.google.android.flexbox;

import android.support.v4.view.f;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class c
{
  private final a btt;
  private boolean[] btu;
  int[] btv;
  long[] btw;
  private long[] btx;

  static
  {
    AppMethodBeat.i(54727);
    if (!c.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(54727);
      return;
    }
  }

  c(a parama)
  {
    this.btt = parama;
  }

  private void C(View paramView, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(54706);
    int j = 0;
    FlexItem localFlexItem = (FlexItem)paramView.getLayoutParams();
    int k = paramView.getMeasuredWidth();
    int m = paramView.getMeasuredHeight();
    int n;
    if (k < localFlexItem.getMinWidth())
    {
      n = localFlexItem.getMinWidth();
      j = 1;
      if (m >= localFlexItem.getMinHeight())
        break label164;
      j = localFlexItem.getMinHeight();
    }
    while (true)
    {
      if (i != 0)
      {
        n = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
        j = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
        paramView.measure(n, j);
        a(paramInt, n, j, paramView);
        this.btt.a(paramInt, paramView);
      }
      AppMethodBeat.o(54706);
      return;
      n = k;
      if (k <= localFlexItem.getMaxWidth())
        break;
      n = localFlexItem.getMaxWidth();
      j = 1;
      break;
      label164: if (m > localFlexItem.getMaxHeight())
      {
        j = localFlexItem.getMaxHeight();
      }
      else
      {
        i = j;
        j = m;
      }
    }
  }

  private int a(int paramInt1, FlexItem paramFlexItem, int paramInt2)
  {
    AppMethodBeat.i(54712);
    a locala = this.btt;
    paramInt2 = locala.v(paramInt1, locala.getPaddingLeft() + this.btt.getPaddingRight() + paramFlexItem.ug() + paramFlexItem.ui() + paramInt2, paramFlexItem.getWidth());
    int i = View.MeasureSpec.getSize(paramInt2);
    if (i > paramFlexItem.getMaxWidth())
      paramInt1 = View.MeasureSpec.makeMeasureSpec(paramFlexItem.getMaxWidth(), View.MeasureSpec.getMode(paramInt2));
    while (true)
    {
      AppMethodBeat.o(54712);
      return paramInt1;
      paramInt1 = paramInt2;
      if (i < paramFlexItem.getMinWidth())
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramFlexItem.getMinWidth(), View.MeasureSpec.getMode(paramInt2));
    }
  }

  private static int a(FlexItem paramFlexItem, boolean paramBoolean)
  {
    AppMethodBeat.i(54697);
    int i;
    if (paramBoolean)
    {
      i = paramFlexItem.getWidth();
      AppMethodBeat.o(54697);
    }
    while (true)
    {
      return i;
      i = paramFlexItem.getHeight();
      AppMethodBeat.o(54697);
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, View paramView)
  {
    AppMethodBeat.i(54724);
    if (this.btw != null)
      this.btw[paramInt1] = bl(paramInt2, paramInt3);
    if (this.btx != null)
      this.btx[paramInt1] = bl(paramView.getMeasuredWidth(), paramView.getMeasuredHeight());
    AppMethodBeat.o(54724);
  }

  private void a(int paramInt1, int paramInt2, b paramb, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    AppMethodBeat.i(54710);
    if ((paramb.btm <= 0.0F) || (paramInt3 < paramb.bti))
    {
      AppMethodBeat.o(54710);
      label28: return;
    }
    int i = paramb.bti;
    int j = 0;
    float f1 = (paramInt3 - paramb.bti) / paramb.btm;
    paramb.bti = (paramb.btj + paramInt4);
    int k = 0;
    if (!paramBoolean)
      paramb.btk = -2147483648;
    float f2 = 0.0F;
    int m = 0;
    label84: int n;
    View localView;
    int i1;
    int i2;
    float f3;
    FlexItem localFlexItem;
    float f4;
    label300: label355: int i3;
    int i4;
    if (m < paramb.apt)
    {
      n = paramb.btr + m;
      localView = this.btt.eV(n);
      i1 = k;
      i2 = j;
      f3 = f2;
      if (localView != null)
      {
        i1 = k;
        i2 = j;
        f3 = f2;
        if (localView.getVisibility() != 8)
        {
          localFlexItem = (FlexItem)localView.getLayoutParams();
          i2 = this.btt.getFlexDirection();
          if ((i2 != 0) && (i2 != 1))
            break label601;
          i2 = localView.getMeasuredWidth();
          if (this.btx != null)
            i2 = (int)this.btx[n];
          i1 = localView.getMeasuredHeight();
          if (this.btx != null)
            i1 = (int)(this.btx[n] >> 32);
          if ((this.btu[n] != 0) || (localFlexItem.ub() <= 0.0F))
            break label1027;
          f3 = i2 + localFlexItem.ub() * f1;
          if (m != paramb.apt - 1)
            break label1024;
          f4 = 0.0F;
          f3 = f2 + f3;
          f2 = f4;
          i2 = Math.round(f3);
          if (i2 <= localFlexItem.getMaxWidth())
            break label544;
          j = 1;
          i2 = localFlexItem.getMaxWidth();
          this.btu[n] = true;
          paramb.btm -= localFlexItem.ub();
          i3 = b(paramInt2, localFlexItem, paramb.btp);
          i4 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
          localView.measure(i4, i3);
          i2 = localView.getMeasuredWidth();
          i1 = localView.getMeasuredHeight();
          a(n, i4, i3, localView);
          this.btt.a(n, localView);
        }
      }
    }
    label1024: label1027: 
    while (true)
    {
      i1 = Math.max(k, localFlexItem.uh() + i1 + localFlexItem.uj() + this.btt.ca(localView));
      n = paramb.bti;
      k = localFlexItem.ug();
      paramb.bti = (localFlexItem.ui() + (k + i2) + n);
      i2 = i1;
      label501: paramb.btk = Math.max(paramb.btk, i2);
      i1 = i2;
      f3 = f2;
      i2 = j;
      m++;
      k = i1;
      j = i2;
      f2 = f3;
      break label84;
      label544: f2 += f3 - i2;
      if (f2 > 1.0D)
      {
        i2++;
        f2 = (float)(f2 - 1.0D);
        break label355;
      }
      if (f2 < -1.0D)
      {
        i2--;
        f2 = (float)(f2 + 1.0D);
        break label355;
        label601: i2 = localView.getMeasuredHeight();
        if (this.btx != null)
          i2 = (int)(this.btx[n] >> 32);
        i1 = localView.getMeasuredWidth();
        if (this.btx != null)
          i1 = (int)this.btx[n];
        if ((this.btu[n] == 0) && (localFlexItem.ub() > 0.0F))
        {
          f4 = i2 + localFlexItem.ub() * f1;
          if (m == paramb.apt - 1)
          {
            f3 = 0.0F;
            f4 = f2 + f4;
            f2 = f3;
            f3 = f4;
            label719: i2 = Math.round(f3);
            if (i2 > localFlexItem.getMaxHeight())
            {
              j = 1;
              i2 = localFlexItem.getMaxHeight();
              this.btu[n] = true;
              paramb.btm -= localFlexItem.ub();
              label774: i3 = a(paramInt1, localFlexItem, paramb.btp);
              i4 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
              localView.measure(i3, i4);
              i1 = localView.getMeasuredWidth();
              i2 = localView.getMeasuredHeight();
              a(n, i3, i4, localView);
              this.btt.a(n, localView);
            }
          }
        }
        while (true)
        {
          i1 = Math.max(k, localFlexItem.ug() + i1 + localFlexItem.ui() + this.btt.ca(localView));
          n = paramb.bti;
          k = localFlexItem.uh();
          paramb.bti = (localFlexItem.uj() + (k + i2) + n);
          i2 = i1;
          break label501;
          f2 += f3 - i2;
          if (f2 > 1.0D)
          {
            i2++;
            f2 = (float)(f2 - 1.0D);
            break label774;
          }
          if (f2 < -1.0D)
          {
            i2--;
            f2 = (float)(f2 + 1.0D);
            break label774;
            if ((j != 0) && (i != paramb.bti))
            {
              paramBoolean = true;
              break;
            }
            AppMethodBeat.o(54710);
            break label28;
          }
          break label774;
          f3 = f4;
          break label719;
        }
      }
      break label355;
      break label300;
    }
  }

  private void a(List<b> paramList, b paramb, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54705);
    paramb.btp = paramInt2;
    this.btt.a(paramb);
    paramb.bts = paramInt1;
    paramList.add(paramb);
    AppMethodBeat.o(54705);
  }

  private static boolean a(int paramInt1, int paramInt2, b paramb)
  {
    AppMethodBeat.i(54704);
    boolean bool;
    if ((paramInt1 == paramInt2 - 1) && (paramb.uk() != 0))
    {
      bool = true;
      AppMethodBeat.o(54704);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54704);
    }
  }

  private boolean a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, FlexItem paramFlexItem, int paramInt5, int paramInt6, int paramInt7)
  {
    boolean bool = false;
    AppMethodBeat.i(54703);
    if (this.btt.getFlexWrap() == 0)
      AppMethodBeat.o(54703);
    while (true)
    {
      return bool;
      if (paramFlexItem.ue())
      {
        AppMethodBeat.o(54703);
        bool = true;
      }
      else if (paramInt1 == 0)
      {
        AppMethodBeat.o(54703);
      }
      else
      {
        paramInt1 = this.btt.getMaxLine();
        if ((paramInt1 != -1) && (paramInt1 <= paramInt7 + 1))
        {
          AppMethodBeat.o(54703);
        }
        else
        {
          paramInt5 = this.btt.m(paramView, paramInt5, paramInt6);
          paramInt1 = paramInt4;
          if (paramInt5 > 0)
            paramInt1 = paramInt4 + paramInt5;
          if (paramInt2 < paramInt3 + paramInt1)
          {
            AppMethodBeat.o(54703);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(54703);
          }
        }
      }
    }
  }

  private static int[] a(int paramInt, List<c.b> paramList, SparseIntArray paramSparseIntArray)
  {
    AppMethodBeat.i(54684);
    Collections.sort(paramList);
    paramSparseIntArray.clear();
    int[] arrayOfInt = new int[paramInt];
    Iterator localIterator = paramList.iterator();
    for (paramInt = 0; localIterator.hasNext(); paramInt++)
    {
      paramList = (c.b)localIterator.next();
      arrayOfInt[paramInt] = paramList.index;
      paramSparseIntArray.append(paramList.index, paramList.order);
    }
    AppMethodBeat.o(54684);
    return arrayOfInt;
  }

  private int aO(boolean paramBoolean)
  {
    AppMethodBeat.i(54691);
    int i;
    if (paramBoolean)
    {
      i = this.btt.getPaddingStart();
      AppMethodBeat.o(54691);
    }
    while (true)
    {
      return i;
      i = this.btt.getPaddingTop();
      AppMethodBeat.o(54691);
    }
  }

  private int aP(boolean paramBoolean)
  {
    AppMethodBeat.i(54692);
    int i;
    if (paramBoolean)
    {
      i = this.btt.getPaddingEnd();
      AppMethodBeat.o(54692);
    }
    while (true)
    {
      return i;
      i = this.btt.getPaddingBottom();
      AppMethodBeat.o(54692);
    }
  }

  private int aQ(boolean paramBoolean)
  {
    AppMethodBeat.i(54693);
    int i;
    if (paramBoolean)
    {
      i = this.btt.getPaddingTop();
      AppMethodBeat.o(54693);
    }
    while (true)
    {
      return i;
      i = this.btt.getPaddingStart();
      AppMethodBeat.o(54693);
    }
  }

  private int aR(boolean paramBoolean)
  {
    AppMethodBeat.i(54694);
    int i;
    if (paramBoolean)
    {
      i = this.btt.getPaddingBottom();
      AppMethodBeat.o(54694);
    }
    while (true)
    {
      return i;
      i = this.btt.getPaddingEnd();
      AppMethodBeat.o(54694);
    }
  }

  static int at(long paramLong)
  {
    return (int)paramLong;
  }

  static int au(long paramLong)
  {
    return (int)(paramLong >> 32);
  }

  private int b(int paramInt1, FlexItem paramFlexItem, int paramInt2)
  {
    AppMethodBeat.i(54713);
    a locala = this.btt;
    paramInt2 = locala.w(paramInt1, locala.getPaddingTop() + this.btt.getPaddingBottom() + paramFlexItem.uh() + paramFlexItem.uj() + paramInt2, paramFlexItem.getHeight());
    int i = View.MeasureSpec.getSize(paramInt2);
    if (i > paramFlexItem.getMaxHeight())
      paramInt1 = View.MeasureSpec.makeMeasureSpec(paramFlexItem.getMaxHeight(), View.MeasureSpec.getMode(paramInt2));
    while (true)
    {
      AppMethodBeat.o(54713);
      return paramInt1;
      paramInt1 = paramInt2;
      if (i < paramFlexItem.getMinHeight())
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramFlexItem.getMinHeight(), View.MeasureSpec.getMode(paramInt2));
    }
  }

  private static int b(FlexItem paramFlexItem, boolean paramBoolean)
  {
    AppMethodBeat.i(54698);
    int i;
    if (paramBoolean)
    {
      i = paramFlexItem.getHeight();
      AppMethodBeat.o(54698);
    }
    while (true)
    {
      return i;
      i = paramFlexItem.getWidth();
      AppMethodBeat.o(54698);
    }
  }

  private static List<b> b(List<b> paramList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54715);
    paramInt1 = (paramInt1 - paramInt2) / 2;
    ArrayList localArrayList = new ArrayList();
    b localb = new b();
    localb.btk = paramInt1;
    paramInt2 = paramList.size();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
    {
      if (paramInt1 == 0)
        localArrayList.add(localb);
      localArrayList.add((b)paramList.get(paramInt1));
      if (paramInt1 == paramList.size() - 1)
        localArrayList.add(localb);
    }
    AppMethodBeat.o(54715);
    return localArrayList;
  }

  private void b(int paramInt1, int paramInt2, b paramb, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    AppMethodBeat.i(54711);
    int i = paramb.bti;
    if ((paramb.btn <= 0.0F) || (paramInt3 > paramb.bti))
    {
      AppMethodBeat.o(54711);
      label36: return;
    }
    int j = 0;
    float f1 = (paramb.bti - paramInt3) / paramb.btn;
    float f2 = 0.0F;
    paramb.bti = (paramb.btj + paramInt4);
    if (!paramBoolean)
      paramb.btk = -2147483648;
    int k = 0;
    int m = 0;
    label86: int n;
    View localView;
    FlexItem localFlexItem;
    int i1;
    int i2;
    float f3;
    float f4;
    label278: int i3;
    label333: int i4;
    if (k < paramb.apt)
    {
      n = paramb.btr + k;
      localView = this.btt.eV(n);
      if ((localView == null) || (localView.getVisibility() == 8))
        break label1035;
      localFlexItem = (FlexItem)localView.getLayoutParams();
      i1 = this.btt.getFlexDirection();
      if ((i1 == 0) || (i1 == 1))
      {
        i1 = localView.getMeasuredWidth();
        if (this.btx != null)
          i1 = (int)this.btx[n];
        i2 = localView.getMeasuredHeight();
        if (this.btx != null)
          i2 = (int)(this.btx[n] >> 32);
        if ((this.btu[n] != 0) || (localFlexItem.uc() <= 0.0F))
          break label1028;
        f3 = i1 - localFlexItem.uc() * f1;
        if (k != paramb.apt - 1)
          break label1025;
        f4 = 0.0F;
        f3 = f2 + f3;
        f2 = f4;
        i3 = Math.round(f3);
        if (i3 < localFlexItem.getMinWidth())
        {
          i2 = 1;
          i1 = localFlexItem.getMinWidth();
          this.btu[n] = true;
          paramb.btn -= localFlexItem.uc();
          j = b(paramInt2, localFlexItem, paramb.btp);
          i4 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);
          localView.measure(i4, j);
          i1 = localView.getMeasuredWidth();
          i3 = localView.getMeasuredHeight();
          a(n, i4, j, localView);
          this.btt.a(n, localView);
          j = i2;
          label407: m = Math.max(m, localFlexItem.uh() + i3 + localFlexItem.uj() + this.btt.ca(localView));
          i3 = paramb.bti;
          i2 = localFlexItem.ug();
          paramb.bti = (localFlexItem.ui() + (i1 + i2) + i3);
          i1 = m;
          label483: paramb.btk = Math.max(paramb.btk, i1);
        }
      }
    }
    while (true)
    {
      k++;
      m = i1;
      break label86;
      f3 = f2 + (f3 - i3);
      if (f3 > 1.0D)
      {
        i1 = i3 + 1;
        f2 = f3 - 1.0F;
        i2 = j;
        break label333;
      }
      i1 = i3;
      i2 = j;
      f2 = f3;
      if (f3 >= -1.0D)
        break label333;
      i1 = i3 - 1;
      f2 = f3 + 1.0F;
      i2 = j;
      break label333;
      i1 = localView.getMeasuredHeight();
      if (this.btx != null)
        i1 = (int)(this.btx[n] >> 32);
      i2 = localView.getMeasuredWidth();
      if (this.btx != null)
        i2 = (int)this.btx[n];
      if ((this.btu[n] == 0) && (localFlexItem.uc() > 0.0F))
      {
        f3 = i1 - localFlexItem.uc() * f1;
        if (k == paramb.apt - 1)
        {
          f4 = 0.0F;
          f3 = f2 + f3;
          f2 = f4;
          label699: i3 = Math.round(f3);
          if (i3 < localFlexItem.getMinHeight())
          {
            i2 = 1;
            i1 = localFlexItem.getMinHeight();
            this.btu[n] = true;
            paramb.btn -= localFlexItem.uc();
            label754: j = a(paramInt1, localFlexItem, paramb.btp);
            i4 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);
            localView.measure(j, i4);
            i3 = localView.getMeasuredWidth();
            i1 = localView.getMeasuredHeight();
            a(n, j, i4, localView);
            this.btt.a(n, localView);
            j = i2;
          }
        }
      }
      while (true)
      {
        m = Math.max(m, localFlexItem.ug() + i3 + localFlexItem.ui() + this.btt.ca(localView));
        i2 = paramb.bti;
        i3 = localFlexItem.uh();
        paramb.bti = (localFlexItem.uj() + (i1 + i3) + i2);
        i1 = m;
        break label483;
        f3 = f2 + (f3 - i3);
        if (f3 > 1.0D)
        {
          i1 = i3 + 1;
          f2 = f3 - 1.0F;
          i2 = j;
          break label754;
        }
        i1 = i3;
        i2 = j;
        f2 = f3;
        if (f3 >= -1.0D)
          break label754;
        i1 = i3 - 1;
        f2 = f3 + 1.0F;
        i2 = j;
        break label754;
        if ((j != 0) && (i != paramb.bti))
        {
          paramBoolean = true;
          break;
        }
        AppMethodBeat.o(54711);
        break label36;
        break label699;
        i3 = i2;
      }
      label1025: break label278;
      label1028: i3 = i2;
      break label407;
      label1035: i1 = m;
    }
  }

  private static long bl(int paramInt1, int paramInt2)
  {
    return paramInt2 << 32 | paramInt1 & 0xFFFFFFFF;
  }

  private static int c(FlexItem paramFlexItem, boolean paramBoolean)
  {
    AppMethodBeat.i(54699);
    int i;
    if (paramBoolean)
    {
      i = paramFlexItem.ug();
      AppMethodBeat.o(54699);
    }
    while (true)
    {
      return i;
      i = paramFlexItem.uh();
      AppMethodBeat.o(54699);
    }
  }

  private static int d(FlexItem paramFlexItem, boolean paramBoolean)
  {
    AppMethodBeat.i(54700);
    int i;
    if (paramBoolean)
    {
      i = paramFlexItem.ui();
      AppMethodBeat.o(54700);
    }
    while (true)
    {
      return i;
      i = paramFlexItem.uj();
      AppMethodBeat.o(54700);
    }
  }

  private static int e(FlexItem paramFlexItem, boolean paramBoolean)
  {
    AppMethodBeat.i(54701);
    int i;
    if (paramBoolean)
    {
      i = paramFlexItem.uh();
      AppMethodBeat.o(54701);
    }
    while (true)
    {
      return i;
      i = paramFlexItem.ug();
      AppMethodBeat.o(54701);
    }
  }

  private List<c.b> eW(int paramInt)
  {
    AppMethodBeat.i(54682);
    ArrayList localArrayList = new ArrayList(paramInt);
    for (int i = 0; i < paramInt; i++)
    {
      FlexItem localFlexItem = (FlexItem)this.btt.eU(i).getLayoutParams();
      c.b localb = new c.b((byte)0);
      localb.order = localFlexItem.getOrder();
      localb.index = i;
      localArrayList.add(localb);
    }
    AppMethodBeat.o(54682);
    return localArrayList;
  }

  private void eX(int paramInt)
  {
    AppMethodBeat.i(54709);
    int i;
    if (this.btu == null)
    {
      i = paramInt;
      if (paramInt < 10)
        i = 10;
      this.btu = new boolean[i];
      AppMethodBeat.o(54709);
    }
    while (true)
    {
      return;
      if (this.btu.length < paramInt)
      {
        int j = this.btu.length * 2;
        i = paramInt;
        if (j >= paramInt)
          i = j;
        this.btu = new boolean[i];
        AppMethodBeat.o(54709);
      }
      else
      {
        Arrays.fill(this.btu, false);
        AppMethodBeat.o(54709);
      }
    }
  }

  private static int f(FlexItem paramFlexItem, boolean paramBoolean)
  {
    AppMethodBeat.i(54702);
    int i;
    if (paramBoolean)
    {
      i = paramFlexItem.uj();
      AppMethodBeat.o(54702);
    }
    while (true)
    {
      return i;
      i = paramFlexItem.ui();
      AppMethodBeat.o(54702);
    }
  }

  private static int j(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(54695);
    int i;
    if (paramBoolean)
    {
      i = paramView.getMeasuredWidth();
      AppMethodBeat.o(54695);
    }
    while (true)
    {
      return i;
      i = paramView.getMeasuredHeight();
      AppMethodBeat.o(54695);
    }
  }

  private static int k(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(54696);
    int i;
    if (paramBoolean)
    {
      i = paramView.getMeasuredHeight();
      AppMethodBeat.o(54696);
    }
    while (true)
    {
      return i;
      i = paramView.getMeasuredWidth();
      AppMethodBeat.o(54696);
    }
  }

  private void n(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54718);
    FlexItem localFlexItem = (FlexItem)paramView.getLayoutParams();
    int i = Math.min(Math.max(paramInt1 - localFlexItem.uh() - localFlexItem.uj() - this.btt.ca(paramView), localFlexItem.getMinHeight()), localFlexItem.getMaxHeight());
    if (this.btx != null);
    for (paramInt1 = (int)this.btx[paramInt2]; ; paramInt1 = paramView.getMeasuredWidth())
    {
      paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
      paramView.measure(paramInt1, i);
      a(paramInt2, paramInt1, i, paramView);
      this.btt.a(paramInt2, paramView);
      AppMethodBeat.o(54718);
      return;
    }
  }

  private void o(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54719);
    FlexItem localFlexItem = (FlexItem)paramView.getLayoutParams();
    int i = Math.min(Math.max(paramInt1 - localFlexItem.ug() - localFlexItem.ui() - this.btt.ca(paramView), localFlexItem.getMinWidth()), localFlexItem.getMaxWidth());
    if (this.btx != null);
    for (paramInt1 = (int)(this.btx[paramInt2] >> 32); ; paramInt1 = paramView.getMeasuredHeight())
    {
      paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
      paramView.measure(i, paramInt1);
      a(paramInt2, i, paramInt1, paramView);
      this.btt.a(paramInt2, paramView);
      AppMethodBeat.o(54719);
      return;
    }
  }

  final void a(View paramView, b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(54720);
    FlexItem localFlexItem = (FlexItem)paramView.getLayoutParams();
    int i = this.btt.getAlignItems();
    if (localFlexItem.ud() != -1)
      i = localFlexItem.ud();
    int j = paramb.btk;
    switch (i)
    {
    default:
    case 0:
    case 4:
    case 3:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(54720);
      while (true)
      {
        return;
        if (this.btt.getFlexWrap() != 2)
        {
          paramView.layout(paramInt1, localFlexItem.uh() + paramInt2, paramInt3, localFlexItem.uh() + paramInt4);
          AppMethodBeat.o(54720);
        }
        else
        {
          paramView.layout(paramInt1, paramInt2 - localFlexItem.uj(), paramInt3, paramInt4 - localFlexItem.uj());
          AppMethodBeat.o(54720);
          continue;
          if (this.btt.getFlexWrap() != 2)
          {
            i = Math.max(paramb.bto - paramView.getBaseline(), localFlexItem.uh());
            paramView.layout(paramInt1, paramInt2 + i, paramInt3, i + paramInt4);
            AppMethodBeat.o(54720);
          }
          else
          {
            i = Math.max(paramb.bto - paramView.getMeasuredHeight() + paramView.getBaseline(), localFlexItem.uj());
            paramView.layout(paramInt1, paramInt2 - i, paramInt3, paramInt4 - i);
            AppMethodBeat.o(54720);
            continue;
            if (this.btt.getFlexWrap() != 2)
            {
              paramView.layout(paramInt1, paramInt2 + j - paramView.getMeasuredHeight() - localFlexItem.uj(), paramInt3, j + paramInt2 - localFlexItem.uj());
              AppMethodBeat.o(54720);
            }
            else
            {
              int k = paramView.getMeasuredHeight();
              int m = localFlexItem.uh();
              i = paramView.getMeasuredHeight();
              paramView.layout(paramInt1, paramInt2 - j + k + m, paramInt3, localFlexItem.uh() + (paramInt4 - j + i));
              AppMethodBeat.o(54720);
              continue;
              paramInt4 = (j - paramView.getMeasuredHeight() + localFlexItem.uh() - localFlexItem.uj()) / 2;
              if (this.btt.getFlexWrap() == 2)
                break;
              paramView.layout(paramInt1, paramInt2 + paramInt4, paramInt3, paramInt4 + paramInt2 + paramView.getMeasuredHeight());
              AppMethodBeat.o(54720);
            }
          }
        }
      }
      paramView.layout(paramInt1, paramInt2 - paramInt4, paramInt3, paramInt2 - paramInt4 + paramView.getMeasuredHeight());
    }
  }

  final void a(View paramView, b paramb, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(54721);
    FlexItem localFlexItem = (FlexItem)paramView.getLayoutParams();
    int i = this.btt.getAlignItems();
    if (localFlexItem.ud() != -1)
      i = localFlexItem.ud();
    int j = paramb.btk;
    switch (i)
    {
    default:
    case 0:
    case 3:
    case 4:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(54721);
      while (true)
      {
        return;
        if (!paramBoolean)
        {
          paramView.layout(localFlexItem.ug() + paramInt1, paramInt2, localFlexItem.ug() + paramInt3, paramInt4);
          AppMethodBeat.o(54721);
        }
        else
        {
          paramView.layout(paramInt1 - localFlexItem.ui(), paramInt2, paramInt3 - localFlexItem.ui(), paramInt4);
          AppMethodBeat.o(54721);
          continue;
          if (!paramBoolean)
          {
            paramView.layout(paramInt1 + j - paramView.getMeasuredWidth() - localFlexItem.ui(), paramInt2, j + paramInt3 - paramView.getMeasuredWidth() - localFlexItem.ui(), paramInt4);
            AppMethodBeat.o(54721);
          }
          else
          {
            i = paramView.getMeasuredWidth();
            int k = localFlexItem.ug();
            int m = paramView.getMeasuredWidth();
            paramView.layout(paramInt1 - j + i + k, paramInt2, localFlexItem.ug() + (paramInt3 - j + m), paramInt4);
            AppMethodBeat.o(54721);
            continue;
            paramb = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
            i = (j - paramView.getMeasuredWidth() + f.a(paramb) - f.b(paramb)) / 2;
            if (paramBoolean)
              break;
            paramView.layout(paramInt1 + i, paramInt2, i + paramInt3, paramInt4);
            AppMethodBeat.o(54721);
          }
        }
      }
      paramView.layout(paramInt1 - i, paramInt2, paramInt3 - i, paramInt4);
    }
  }

  final void a(c.a parama, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54687);
    a(parama, paramInt2, paramInt1, 2147483647, 0, -1, null);
    AppMethodBeat.o(54687);
  }

  final void a(c.a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, List<b> paramList)
  {
    AppMethodBeat.i(54690);
    boolean bool = this.btt.ua();
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = 0;
    Object localObject = paramList;
    if (paramList == null)
      localObject = new ArrayList();
    parama.bty = ((List)localObject);
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    label156: View localView;
    if (paramInt5 == -1)
    {
      m = 1;
      n = aO(bool);
      i1 = aP(bool);
      i2 = aQ(bool);
      i3 = aR(bool);
      i4 = -2147483648;
      i5 = 0;
      i6 = 0;
      paramList = new b();
      paramList.btr = paramInt4;
      paramList.bti = (n + i1);
      i7 = this.btt.getFlexItemCount();
      i8 = paramInt4;
      paramInt4 = m;
      m = k;
      if (i8 >= i7)
        break label1320;
      localView = this.btt.eV(i8);
      if (localView != null)
        break label217;
      if (!a(i8, i7, paramList))
        break label1346;
      a((List)localObject, paramList, i8, i5);
    }
    label468: 
    while (true)
    {
      i8++;
      break label156;
      m = 0;
      break;
      label217: if (localView.getVisibility() == 8)
      {
        paramList.btl += 1;
        paramList.apt += 1;
        if (a(i8, i7, paramList))
          a((List)localObject, paramList, i8, i5);
      }
      else
      {
        FlexItem localFlexItem = (FlexItem)localView.getLayoutParams();
        if (localFlexItem.ud() == 4)
          paramList.btq.add(Integer.valueOf(i8));
        int i9 = a(localFlexItem, bool);
        k = i9;
        if (localFlexItem.uf() != -1.0F)
        {
          k = i9;
          if (i == 1073741824)
            k = Math.round(j * localFlexItem.uf());
        }
        int i11;
        if (bool)
        {
          i9 = this.btt.v(paramInt1, n + i1 + c(localFlexItem, true) + d(localFlexItem, true), k);
          k = this.btt.w(paramInt2, i2 + i3 + e(localFlexItem, true) + f(localFlexItem, true) + i5, b(localFlexItem, true));
          localView.measure(i9, k);
          a(i8, i9, k, localView);
          this.btt.a(i8, localView);
          C(localView, i8);
          k = View.combineMeasuredStates(m, localView.getMeasuredState());
          int i10 = paramList.bti;
          i11 = j(localView, bool);
          m = c(localFlexItem, bool);
          if (!a(localView, i, j, i10, d(localFlexItem, bool) + (i11 + m), localFlexItem, i8, i6, ((List)localObject).size()))
            break label1264;
          if (paramList.uk() <= 0)
            break label1343;
          if (i8 <= 0)
            break label1172;
          m = i8 - 1;
          a((List)localObject, paramList, m, i5);
          i5 += paramList.btk;
        }
        while (true)
        {
          if (bool)
          {
            if (localFlexItem.getHeight() == -1)
            {
              paramList = this.btt;
              localView.measure(i9, paramList.w(paramInt2, paramList.getPaddingTop() + this.btt.getPaddingBottom() + localFlexItem.uh() + localFlexItem.uj() + i5, localFlexItem.getHeight()));
              C(localView, i8);
            }
            paramList = new b();
            paramList.apt = 1;
            paramList.bti = (n + i1);
            paramList.btr = i8;
            m = 0;
            i4 = -2147483648;
            label735: if (this.btv != null)
              this.btv[i8] = ((List)localObject).size();
            paramList.bti += j(localView, bool) + c(localFlexItem, bool) + d(localFlexItem, bool);
            paramList.btm += localFlexItem.ub();
            paramList.btn += localFlexItem.uc();
            this.btt.a(localView, i8, m, paramList);
            i9 = Math.max(i4, k(localView, bool) + e(localFlexItem, bool) + f(localFlexItem, bool) + this.btt.ca(localView));
            paramList.btk = Math.max(paramList.btk, i9);
            if (bool)
            {
              if (this.btt.getFlexWrap() == 2)
                break label1285;
              paramList.bto = Math.max(paramList.bto, localView.getBaseline() + localFlexItem.uh());
            }
            if (!a(i8, i7, paramList))
              break label1340;
            a((List)localObject, paramList, i8, i5);
            i5 += paramList.btk;
          }
          while (true)
          {
            if ((paramInt5 != -1) && (((List)localObject).size() > 0) && (((b)((List)localObject).get(((List)localObject).size() - 1)).bts >= paramInt5) && (i8 >= paramInt5) && (paramInt4 == 0))
            {
              i5 = -paramList.btk;
              paramInt4 = 1;
            }
            while (true)
            {
              if (i5 > paramInt3)
              {
                i4 = k;
                if (paramInt4 != 0);
              }
              else
              {
                i6 = m;
                m = k;
                i4 = i9;
                break;
                i11 = this.btt.v(paramInt2, i2 + i3 + e(localFlexItem, false) + f(localFlexItem, false) + i5, b(localFlexItem, false));
                i9 = this.btt.w(paramInt1, n + i1 + c(localFlexItem, false) + d(localFlexItem, false), k);
                localView.measure(i11, i9);
                a(i8, i11, i9, localView);
                break label468;
                m = 0;
                break label586;
                if (localFlexItem.getWidth() != -1)
                  break label696;
                paramList = this.btt;
                localView.measure(paramList.v(paramInt2, paramList.getPaddingLeft() + this.btt.getPaddingRight() + localFlexItem.ug() + localFlexItem.ui() + i5, localFlexItem.getWidth()), i9);
                C(localView, i8);
                break label696;
                label1264: paramList.apt += 1;
                m = i6 + 1;
                break label735;
                paramList.bto = Math.max(paramList.bto, localView.getMeasuredHeight() - localView.getBaseline() + localFlexItem.uj());
                break label944;
                i4 = m;
              }
              parama.btz = i4;
              AppMethodBeat.o(54690);
              return;
            }
          }
        }
      }
    }
  }

  final void a(c.a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<b> paramList)
  {
    AppMethodBeat.i(54685);
    a(parama, paramInt1, paramInt2, paramInt3, paramInt4, -1, paramList);
    AppMethodBeat.o(54685);
  }

  final int[] a(SparseIntArray paramSparseIntArray)
  {
    AppMethodBeat.i(54681);
    int i = this.btt.getFlexItemCount();
    paramSparseIntArray = a(i, eW(i), paramSparseIntArray);
    AppMethodBeat.o(54681);
    return paramSparseIntArray;
  }

  final int[] a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, SparseIntArray paramSparseIntArray)
  {
    AppMethodBeat.i(54680);
    int i = this.btt.getFlexItemCount();
    List localList = eW(i);
    c.b localb = new c.b((byte)0);
    if ((paramView != null) && ((paramLayoutParams instanceof FlexItem)))
    {
      localb.order = ((FlexItem)paramLayoutParams).getOrder();
      if ((paramInt != -1) && (paramInt != i))
        break label117;
      localb.index = i;
    }
    while (true)
    {
      localList.add(localb);
      paramView = a(i + 1, localList, paramSparseIntArray);
      AppMethodBeat.o(54680);
      return paramView;
      localb.order = 1;
      break;
      label117: if (paramInt < this.btt.getFlexItemCount())
      {
        localb.index = paramInt;
        while (paramInt < i)
        {
          paramView = (c.b)localList.get(paramInt);
          paramView.index += 1;
          paramInt++;
        }
      }
      else
      {
        localb.index = i;
      }
    }
  }

  final void b(c.a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<b> paramList)
  {
    AppMethodBeat.i(54686);
    a(parama, paramInt1, paramInt2, paramInt3, 0, paramInt4, paramList);
    AppMethodBeat.o(54686);
  }

  final boolean b(SparseIntArray paramSparseIntArray)
  {
    AppMethodBeat.i(54683);
    int i = this.btt.getFlexItemCount();
    boolean bool;
    if (paramSparseIntArray.size() != i)
    {
      AppMethodBeat.o(54683);
      bool = true;
    }
    while (true)
    {
      return bool;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label100;
        View localView = this.btt.eU(j);
        if ((localView != null) && (((FlexItem)localView.getLayoutParams()).getOrder() != paramSparseIntArray.get(j)))
        {
          AppMethodBeat.o(54683);
          bool = true;
          break;
        }
      }
      label100: AppMethodBeat.o(54683);
      bool = false;
    }
  }

  final void bk(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54707);
    x(paramInt1, paramInt2, 0);
    AppMethodBeat.o(54707);
  }

  final void c(c.a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<b> paramList)
  {
    AppMethodBeat.i(54688);
    a(parama, paramInt2, paramInt1, paramInt3, paramInt4, -1, paramList);
    AppMethodBeat.o(54688);
  }

  final void d(c.a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<b> paramList)
  {
    AppMethodBeat.i(54689);
    a(parama, paramInt2, paramInt1, paramInt3, 0, paramInt4, paramList);
    AppMethodBeat.o(54689);
  }

  final void d(List<b> paramList, int paramInt)
  {
    AppMethodBeat.i(54726);
    if ((!$assertionsDisabled) && (this.btv == null))
    {
      paramList = new AssertionError();
      AppMethodBeat.o(54726);
      throw paramList;
    }
    if ((!$assertionsDisabled) && (this.btw == null))
    {
      paramList = new AssertionError();
      AppMethodBeat.o(54726);
      throw paramList;
    }
    int i = this.btv[paramInt];
    int j = i;
    if (i == -1)
      j = 0;
    for (i = paramList.size() - 1; i >= j; i--)
      paramList.remove(i);
    j = this.btv.length - 1;
    if (paramInt > j)
    {
      Arrays.fill(this.btv, -1);
      j = this.btw.length - 1;
      if (paramInt <= j)
        break label178;
      Arrays.fill(this.btw, 0L);
      AppMethodBeat.o(54726);
    }
    while (true)
    {
      return;
      Arrays.fill(this.btv, paramInt, j, -1);
      break;
      label178: Arrays.fill(this.btw, paramInt, j, 0L);
      AppMethodBeat.o(54726);
    }
  }

  final void eY(int paramInt)
  {
    AppMethodBeat.i(54717);
    if (paramInt >= this.btt.getFlexItemCount())
      AppMethodBeat.o(54717);
    while (true)
    {
      return;
      int i = this.btt.getFlexDirection();
      Object localObject1;
      Object localObject2;
      Object localObject3;
      Object localObject4;
      if (this.btt.getAlignItems() == 4)
      {
        int j = 0;
        if (this.btv != null)
          j = this.btv[paramInt];
        localObject1 = this.btt.getFlexLinesInternal();
        int k = ((List)localObject1).size();
        for (paramInt = j; paramInt < k; paramInt++)
        {
          localObject2 = (b)((List)localObject1).get(paramInt);
          int m = ((b)localObject2).apt;
          j = 0;
          if (j < m)
          {
            int n = ((b)localObject2).btr + j;
            if (j < this.btt.getFlexItemCount())
            {
              localObject3 = this.btt.eV(n);
              if ((localObject3 != null) && (((View)localObject3).getVisibility() != 8))
              {
                localObject4 = (FlexItem)((View)localObject3).getLayoutParams();
                if ((((FlexItem)localObject4).ud() == -1) || (((FlexItem)localObject4).ud() == 4))
                  switch (i)
                  {
                  default:
                    localObject4 = new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
                    AppMethodBeat.o(54717);
                    throw ((Throwable)localObject4);
                  case 0:
                  case 1:
                    n((View)localObject3, ((b)localObject2).btk, n);
                  case 2:
                  case 3:
                  }
              }
            }
            while (true)
            {
              j++;
              break;
              o((View)localObject3, ((b)localObject2).btk, n);
            }
          }
        }
        AppMethodBeat.o(54717);
      }
      else
      {
        localObject4 = this.btt.getFlexLinesInternal().iterator();
        while (((Iterator)localObject4).hasNext())
        {
          b localb = (b)((Iterator)localObject4).next();
          localObject1 = localb.btq.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject3 = (Integer)((Iterator)localObject1).next();
            localObject2 = this.btt.eV(((Integer)localObject3).intValue());
            switch (i)
            {
            default:
              localObject4 = new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
              AppMethodBeat.o(54717);
              throw ((Throwable)localObject4);
            case 0:
            case 1:
              n((View)localObject2, localb.btk, ((Integer)localObject3).intValue());
              break;
            case 2:
            case 3:
              o((View)localObject2, localb.btk, ((Integer)localObject3).intValue());
            }
          }
        }
        AppMethodBeat.o(54717);
      }
    }
  }

  final void eZ(int paramInt)
  {
    AppMethodBeat.i(54722);
    int i;
    if (this.btx == null)
    {
      i = paramInt;
      if (paramInt < 10)
        i = 10;
      this.btx = new long[i];
      AppMethodBeat.o(54722);
    }
    while (true)
    {
      return;
      if (this.btx.length < paramInt)
      {
        int j = this.btx.length * 2;
        i = paramInt;
        if (j >= paramInt)
          i = j;
        this.btx = Arrays.copyOf(this.btx, i);
      }
      AppMethodBeat.o(54722);
    }
  }

  final void fa(int paramInt)
  {
    AppMethodBeat.i(54723);
    int i;
    if (this.btw == null)
    {
      i = paramInt;
      if (paramInt < 10)
        i = 10;
      this.btw = new long[i];
      AppMethodBeat.o(54723);
    }
    while (true)
    {
      return;
      if (this.btw.length < paramInt)
      {
        int j = this.btw.length * 2;
        i = paramInt;
        if (j >= paramInt)
          i = j;
        this.btw = Arrays.copyOf(this.btw, i);
      }
      AppMethodBeat.o(54723);
    }
  }

  final void fb(int paramInt)
  {
    AppMethodBeat.i(54725);
    int i;
    if (this.btv == null)
    {
      i = paramInt;
      if (paramInt < 10)
        i = 10;
      this.btv = new int[i];
      AppMethodBeat.o(54725);
    }
    while (true)
    {
      return;
      if (this.btv.length < paramInt)
      {
        int j = this.btv.length * 2;
        i = paramInt;
        if (j >= paramInt)
          i = j;
        this.btv = Arrays.copyOf(this.btv, i);
      }
      AppMethodBeat.o(54725);
    }
  }

  final void ul()
  {
    AppMethodBeat.i(54716);
    eY(0);
    AppMethodBeat.o(54716);
  }

  final void x(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(54708);
    eX(this.btt.getFlexItemCount());
    if (paramInt3 >= this.btt.getFlexItemCount())
    {
      AppMethodBeat.o(54708);
      return;
    }
    int i = this.btt.getFlexDirection();
    Object localObject;
    int j;
    int k;
    switch (this.btt.getFlexDirection())
    {
    default:
      localObject = new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
      AppMethodBeat.o(54708);
      throw ((Throwable)localObject);
    case 0:
    case 1:
      j = View.MeasureSpec.getMode(paramInt1);
      i = View.MeasureSpec.getSize(paramInt1);
      if (j == 1073741824)
      {
        k = this.btt.getPaddingLeft() + this.btt.getPaddingRight();
        j = i;
        i = k;
        if (this.btv == null)
          break label351;
      }
      break;
    case 2:
    case 3:
    }
    label199: label351: for (paramInt3 = this.btv[paramInt3]; ; paramInt3 = 0)
    {
      List localList = this.btt.getFlexLinesInternal();
      k = localList.size();
      if (paramInt3 < k)
      {
        localObject = (b)localList.get(paramInt3);
        if (((b)localObject).bti < j)
          a(paramInt1, paramInt2, (b)localObject, j, i, false);
        while (true)
        {
          paramInt3++;
          break label199;
          i = this.btt.getLargestMainSize();
          break;
          j = View.MeasureSpec.getMode(paramInt2);
          i = View.MeasureSpec.getSize(paramInt2);
          if (j == 1073741824);
          while (true)
          {
            k = this.btt.getPaddingTop() + this.btt.getPaddingBottom();
            j = i;
            i = k;
            break;
            i = this.btt.getLargestMainSize();
          }
          b(paramInt1, paramInt2, (b)localObject, j, i, false);
        }
      }
      AppMethodBeat.o(54708);
      break;
    }
  }

  final void y(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(54714);
    int i = this.btt.getFlexDirection();
    Object localObject;
    switch (i)
    {
    default:
      localObject = new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
      AppMethodBeat.o(54714);
      throw ((Throwable)localObject);
    case 0:
    case 1:
      i = View.MeasureSpec.getMode(paramInt2);
      paramInt1 = View.MeasureSpec.getSize(paramInt2);
      paramInt2 = i;
    case 2:
    case 3:
    }
    while (true)
    {
      localObject = this.btt.getFlexLinesInternal();
      if (paramInt2 != 1073741824)
        break label224;
      paramInt2 = this.btt.getSumOfCrossSize() + paramInt3;
      if (((List)localObject).size() != 1)
        break;
      ((b)((List)localObject).get(0)).btk = (paramInt1 - paramInt3);
      AppMethodBeat.o(54714);
      return;
      paramInt2 = View.MeasureSpec.getMode(paramInt1);
      paramInt1 = View.MeasureSpec.getSize(paramInt1);
    }
    if (((List)localObject).size() >= 2);
    label224: float f2;
    label266: b localb;
    float f4;
    float f5;
    switch (this.btt.getAlignContent())
    {
    default:
    case 5:
      do
      {
        AppMethodBeat.o(54714);
        break;
      }
      while (paramInt2 >= paramInt1);
      float f1 = (paramInt1 - paramInt2) / ((List)localObject).size();
      f2 = 0.0F;
      paramInt3 = ((List)localObject).size();
      paramInt2 = 0;
      if (paramInt2 < paramInt3)
      {
        localb = (b)((List)localObject).get(paramInt2);
        float f3 = localb.btk + f1;
        f4 = f3;
        f5 = f2;
        if (paramInt2 == ((List)localObject).size() - 1)
        {
          f4 = f3 + f2;
          f5 = 0.0F;
        }
        paramInt1 = Math.round(f4);
        f2 = f5 + (f4 - paramInt1);
        if (f2 > 1.0F)
        {
          paramInt1++;
          f2 -= 1.0F;
        }
      }
      break;
    case 4:
    case 3:
    case 2:
    case 1:
    }
    while (true)
    {
      localb.btk = paramInt1;
      paramInt2++;
      break label266;
      if (f2 < -1.0F)
      {
        paramInt1--;
        f2 += 1.0F;
        continue;
        AppMethodBeat.o(54714);
        break;
        if (paramInt2 >= paramInt1)
        {
          this.btt.setFlexLines(b((List)localObject, paramInt1, paramInt2));
          AppMethodBeat.o(54714);
          break;
        }
        paramInt1 = (paramInt1 - paramInt2) / (((List)localObject).size() * 2);
        ArrayList localArrayList = new ArrayList();
        localb = new b();
        localb.btk = paramInt1;
        Iterator localIterator = ((List)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (b)localIterator.next();
          localArrayList.add(localb);
          localArrayList.add(localObject);
          localArrayList.add(localb);
        }
        this.btt.setFlexLines(localArrayList);
        AppMethodBeat.o(54714);
        break;
        if (paramInt2 >= paramInt1)
          break label224;
        f4 = (paramInt1 - paramInt2) / (((List)localObject).size() - 1);
        f2 = 0.0F;
        localArrayList = new ArrayList();
        paramInt2 = ((List)localObject).size();
        paramInt1 = 0;
        label596: if (paramInt1 < paramInt2)
        {
          localArrayList.add((b)((List)localObject).get(paramInt1));
          if (paramInt1 == ((List)localObject).size() - 1)
            break label848;
          localb = new b();
          if (paramInt1 == ((List)localObject).size() - 2)
          {
            localb.btk = Math.round(f4 + f2);
            f2 = 0.0F;
            f5 = f2 + (f4 - localb.btk);
            if (f5 <= 1.0F)
              break label739;
            localb.btk += 1;
            f2 = f5 - 1.0F;
            localArrayList.add(localb);
          }
        }
        label671: label710: label848: 
        while (true)
        {
          paramInt1++;
          break label596;
          localb.btk = Math.round(f4);
          break label671;
          label739: f2 = f5;
          if (f5 >= -1.0F)
            break label710;
          localb.btk -= 1;
          f2 = f5 + 1.0F;
          break label710;
          this.btt.setFlexLines(localArrayList);
          AppMethodBeat.o(54714);
          break;
          this.btt.setFlexLines(b((List)localObject, paramInt1, paramInt2));
          AppMethodBeat.o(54714);
          break;
          localb = new b();
          localb.btk = (paramInt1 - paramInt2);
          ((List)localObject).add(0, localb);
          break label224;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.flexbox.c
 * JD-Core Version:    0.6.2
 */