package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcelable.Creator;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlexboxLayout extends ViewGroup
  implements a
{
  private int btA;
  private int btB;
  private int btC;
  private int btD;
  private int btE;
  private int btF;
  private Drawable btG;
  private Drawable btH;
  private int btI;
  private int btJ;
  private int btK;
  private int btL;
  private int[] btM;
  private SparseIntArray btN;
  private c btO;
  private c.a btP;
  private List<b> bty;

  public FlexboxLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FlexboxLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(54733);
    this.btF = -1;
    this.btO = new c(this);
    this.bty = new ArrayList();
    this.btP = new c.a();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, d.a.FlexboxLayout, paramInt, 0);
    this.btA = paramContext.getInt(0, 0);
    this.btB = paramContext.getInt(1, 0);
    this.btC = paramContext.getInt(2, 0);
    this.btD = paramContext.getInt(3, 4);
    this.btE = paramContext.getInt(4, 5);
    this.btF = paramContext.getInt(11, -1);
    paramAttributeSet = paramContext.getDrawable(5);
    if (paramAttributeSet != null)
    {
      setDividerDrawableHorizontal(paramAttributeSet);
      setDividerDrawableVertical(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getDrawable(6);
    if (paramAttributeSet != null)
      setDividerDrawableHorizontal(paramAttributeSet);
    paramAttributeSet = paramContext.getDrawable(7);
    if (paramAttributeSet != null)
      setDividerDrawableVertical(paramAttributeSet);
    paramInt = paramContext.getInt(8, 0);
    if (paramInt != 0)
    {
      this.btJ = paramInt;
      this.btI = paramInt;
    }
    paramInt = paramContext.getInt(10, 0);
    if (paramInt != 0)
      this.btJ = paramInt;
    paramInt = paramContext.getInt(9, 0);
    if (paramInt != 0)
      this.btI = paramInt;
    paramContext.recycle();
    AppMethodBeat.o(54733);
  }

  private void a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(54750);
    if (this.btH == null)
      AppMethodBeat.o(54750);
    while (true)
    {
      return;
      this.btH.setBounds(paramInt1, paramInt2, this.btL + paramInt1, paramInt2 + paramInt3);
      this.btH.draw(paramCanvas);
      AppMethodBeat.o(54750);
    }
  }

  private void a(Canvas paramCanvas, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(54748);
    int i = getPaddingLeft();
    int j = getPaddingRight();
    int k = Math.max(0, getWidth() - j - i);
    int m = this.bty.size();
    j = 0;
    if (j < m)
    {
      b localb = (b)this.bty.get(j);
      int n = 0;
      if (n < localb.apt)
      {
        int i1 = localb.btr + n;
        View localView = fc(i1);
        FlexboxLayout.LayoutParams localLayoutParams;
        if ((localView != null) && (localView.getVisibility() != 8))
        {
          localLayoutParams = (FlexboxLayout.LayoutParams)localView.getLayoutParams();
          if (bm(i1, n))
          {
            if (!paramBoolean1)
              break label237;
            i1 = localView.getRight() + localLayoutParams.rightMargin;
            label154: a(paramCanvas, i1, localb.xL, localb.btk);
          }
          if ((n == localb.apt - 1) && ((this.btJ & 0x4) > 0))
            if (!paramBoolean1)
              break label258;
        }
        for (i1 = localView.getLeft() - localLayoutParams.leftMargin - this.btL; ; i1 = localLayoutParams.rightMargin + i1)
        {
          a(paramCanvas, i1, localb.xL, localb.btk);
          n++;
          break;
          label237: i1 = localView.getLeft() - localLayoutParams.leftMargin - this.btL;
          break label154;
          label258: i1 = localView.getRight();
        }
      }
      if (fd(j))
      {
        if (paramBoolean2)
        {
          n = localb.xN;
          label298: b(paramCanvas, i, n, k);
        }
      }
      else if ((ff(j)) && ((this.btI & 0x4) > 0))
        if (!paramBoolean2)
          break label375;
      label375: for (n = localb.xL - this.btK; ; n = localb.xN)
      {
        b(paramCanvas, i, n, k);
        j++;
        break;
        n = localb.xL - this.btK;
        break label298;
      }
    }
    AppMethodBeat.o(54748);
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(54746);
    int i = getPaddingTop();
    int j = getPaddingBottom();
    int k = getPaddingRight();
    int m = getPaddingLeft();
    int n = paramInt4 - paramInt2;
    paramInt1 = paramInt3 - paramInt1 - k;
    int i1 = this.bty.size();
    paramInt3 = 0;
    paramInt2 = m;
    b localb;
    float f1;
    float f2;
    float f3;
    Object localObject;
    float f4;
    float f5;
    label235: View localView;
    int i2;
    if (paramInt3 < i1)
    {
      localb = (b)this.bty.get(paramInt3);
      paramInt4 = paramInt1;
      m = paramInt2;
      if (fd(paramInt3))
      {
        m = paramInt2 + this.btL;
        paramInt4 = paramInt1 - this.btL;
      }
      f1 = 0.0F;
      f2 = 0.0F;
      f3 = 0.0F;
      switch (this.btC)
      {
      default:
        localObject = new IllegalStateException("Invalid justifyContent is set: " + this.btC);
        AppMethodBeat.o(54746);
        throw ((Throwable)localObject);
      case 0:
        f2 = i;
        f1 = n - j;
        f4 = Math.max(f3, 0.0F);
        paramInt1 = 0;
        f3 = f1;
        f5 = f2;
        if (paramInt1 < localb.apt)
        {
          k = localb.btr + paramInt1;
          localView = fc(k);
          f1 = f5;
          f2 = f3;
          if (localView != null)
          {
            f1 = f5;
            f2 = f3;
            if (localView.getVisibility() != 8)
            {
              localObject = (FlexboxLayout.LayoutParams)localView.getLayoutParams();
              f1 = f5 + ((FlexboxLayout.LayoutParams)localObject).topMargin;
              f2 = f3 - ((FlexboxLayout.LayoutParams)localObject).bottomMargin;
              paramInt2 = 0;
              i2 = 0;
              if (!bm(k, paramInt1))
                break label928;
              paramInt2 = this.btK;
              f3 = paramInt2;
              f2 -= paramInt2;
              f1 += f3;
            }
          }
        }
        break;
      case 1:
      case 2:
      case 4:
      case 3:
      case 5:
      }
    }
    label928: 
    while (true)
    {
      k = i2;
      if (paramInt1 == localb.apt - 1)
      {
        k = i2;
        if ((this.btI & 0x4) > 0)
          k = this.btK;
      }
      if (paramBoolean1)
        if (paramBoolean2)
        {
          this.btO.a(localView, localb, true, paramInt4 - localView.getMeasuredWidth(), Math.round(f2) - localView.getMeasuredHeight(), paramInt4, Math.round(f2));
          label446: f1 += localView.getMeasuredHeight() + f4 + ((FlexboxLayout.LayoutParams)localObject).bottomMargin;
          f2 -= localView.getMeasuredHeight() + f4 + ((FlexboxLayout.LayoutParams)localObject).topMargin;
          if (!paramBoolean2)
            break label881;
          localb.m(localView, 0, k, 0, paramInt2);
        }
      while (true)
      {
        paramInt1++;
        f5 = f1;
        f3 = f2;
        break label235;
        f2 = n - localb.bti + j;
        f1 = localb.bti - i;
        break;
        f1 = i;
        f2 = (n - localb.bti) / 2.0F + f1;
        f1 = n - j - (n - localb.bti) / 2.0F;
        break;
        paramInt1 = localb.uk();
        f3 = f1;
        if (paramInt1 != 0)
          f3 = (n - localb.bti) / paramInt1;
        f1 = i;
        f2 = f3 / 2.0F + f1;
        f1 = n - j - f3 / 2.0F;
        break;
        f2 = i;
        paramInt1 = localb.uk();
        if (paramInt1 != 1);
        for (f1 = paramInt1 - 1; ; f1 = 1.0F)
        {
          f3 = (n - localb.bti) / f1;
          f1 = n - j;
          break;
        }
        paramInt1 = localb.uk();
        f3 = f2;
        if (paramInt1 != 0)
          f3 = (n - localb.bti) / (paramInt1 + 1);
        f2 = i + f3;
        f1 = n - j - f3;
        break;
        this.btO.a(localView, localb, true, paramInt4 - localView.getMeasuredWidth(), Math.round(f1), paramInt4, Math.round(f1) + localView.getMeasuredHeight());
        break label446;
        if (paramBoolean2)
        {
          this.btO.a(localView, localb, false, m, Math.round(f2) - localView.getMeasuredHeight(), m + localView.getMeasuredWidth(), Math.round(f2));
          break label446;
        }
        this.btO.a(localView, localb, false, m, Math.round(f1), m + localView.getMeasuredWidth(), Math.round(f1) + localView.getMeasuredHeight());
        break label446;
        label881: localb.m(localView, 0, paramInt2, 0, k);
      }
      paramInt2 = m + localb.btk;
      paramInt1 = paramInt4 - localb.btk;
      paramInt3++;
      break;
      AppMethodBeat.o(54746);
      return;
    }
  }

  private void ae(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54740);
    this.bty.clear();
    this.btP.reset();
    this.btO.a(this.btP, paramInt1, paramInt2, 2147483647, 0, -1, null);
    this.bty = this.btP.bty;
    this.btO.x(paramInt1, paramInt2, 0);
    if (this.btD == 3)
    {
      Iterator localIterator = this.bty.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        int i = 0;
        int j = -2147483648;
        if (i < localb.apt)
        {
          View localView = fc(localb.btr + i);
          int k = j;
          FlexboxLayout.LayoutParams localLayoutParams;
          int m;
          if (localView != null)
          {
            k = j;
            if (localView.getVisibility() != 8)
            {
              localLayoutParams = (FlexboxLayout.LayoutParams)localView.getLayoutParams();
              if (this.btB == 2)
                break label229;
              k = Math.max(localb.bto - localView.getBaseline(), localLayoutParams.topMargin);
              m = localView.getMeasuredHeight();
            }
          }
          for (k = Math.max(j, localLayoutParams.bottomMargin + (m + k)); ; k = Math.max(j, localLayoutParams.topMargin + k + m))
          {
            i++;
            j = k;
            break;
            label229: m = Math.max(localb.bto - localView.getMeasuredHeight() + localView.getBaseline(), localLayoutParams.bottomMargin);
            k = localView.getMeasuredHeight();
          }
        }
        localb.btk = j;
      }
    }
    this.btO.y(paramInt1, paramInt2, getPaddingTop() + getPaddingBottom());
    this.btO.eY(0);
    o(this.btA, paramInt1, paramInt2, this.btP.btz);
    AppMethodBeat.o(54740);
  }

  private void b(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(54751);
    if (this.btG == null)
      AppMethodBeat.o(54751);
    while (true)
    {
      return;
      this.btG.setBounds(paramInt1, paramInt2, paramInt1 + paramInt3, this.btK + paramInt2);
      this.btG.draw(paramCanvas);
      AppMethodBeat.o(54751);
    }
  }

  private void b(Canvas paramCanvas, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(54749);
    int i = getPaddingTop();
    int j = getPaddingBottom();
    int k = Math.max(0, getHeight() - j - i);
    int m = this.bty.size();
    j = 0;
    if (j < m)
    {
      b localb = (b)this.bty.get(j);
      int n = 0;
      if (n < localb.apt)
      {
        int i1 = localb.btr + n;
        View localView = fc(i1);
        FlexboxLayout.LayoutParams localLayoutParams;
        if ((localView != null) && (localView.getVisibility() != 8))
        {
          localLayoutParams = (FlexboxLayout.LayoutParams)localView.getLayoutParams();
          if (bm(i1, n))
          {
            if (!paramBoolean2)
              break label238;
            i1 = localView.getBottom() + localLayoutParams.bottomMargin;
            label155: b(paramCanvas, localb.xJ, i1, localb.btk);
          }
          if ((n == localb.apt - 1) && ((this.btI & 0x4) > 0))
            if (!paramBoolean2)
              break label259;
        }
        for (i1 = localView.getTop() - localLayoutParams.topMargin - this.btK; ; i1 = localLayoutParams.bottomMargin + i1)
        {
          b(paramCanvas, localb.xJ, i1, localb.btk);
          n++;
          break;
          label238: i1 = localView.getTop() - localLayoutParams.topMargin - this.btK;
          break label155;
          label259: i1 = localView.getBottom();
        }
      }
      if (fd(j))
      {
        if (paramBoolean1)
        {
          n = localb.xM;
          label299: a(paramCanvas, n, i, k);
        }
      }
      else if ((ff(j)) && ((this.btJ & 0x4) > 0))
        if (!paramBoolean1)
          break label376;
      label376: for (n = localb.xJ - this.btL; ; n = localb.xM)
      {
        a(paramCanvas, n, i, k);
        j++;
        break;
        n = localb.xJ - this.btL;
        break label299;
      }
    }
    AppMethodBeat.o(54749);
  }

  private void b(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(54745);
    int i = getPaddingLeft();
    int j = getPaddingRight();
    int k = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2 - getPaddingBottom();
    paramInt1 = getPaddingTop();
    int m = this.bty.size();
    paramInt3 = 0;
    b localb;
    int n;
    float f1;
    float f2;
    float f3;
    Object localObject;
    float f4;
    label224: int i1;
    float f5;
    FlexboxLayout.LayoutParams localLayoutParams;
    int i2;
    if (paramInt3 < m)
    {
      localb = (b)this.bty.get(paramInt3);
      n = paramInt2;
      paramInt4 = paramInt1;
      if (fd(paramInt3))
      {
        n = paramInt2 - this.btK;
        paramInt4 = paramInt1 + this.btK;
      }
      f1 = 0.0F;
      f2 = 0.0F;
      f3 = 0.0F;
      switch (this.btC)
      {
      default:
        localObject = new IllegalStateException("Invalid justifyContent is set: " + this.btC);
        AppMethodBeat.o(54745);
        throw ((Throwable)localObject);
      case 0:
        f2 = i;
        f1 = k - j;
        f4 = Math.max(f3, 0.0F);
        paramInt1 = 0;
        f3 = f2;
        if (paramInt1 < localb.apt)
        {
          i1 = localb.btr + paramInt1;
          localObject = fc(i1);
          f2 = f3;
          f5 = f1;
          if (localObject != null)
          {
            f2 = f3;
            f5 = f1;
            if (((View)localObject).getVisibility() != 8)
            {
              localLayoutParams = (FlexboxLayout.LayoutParams)((View)localObject).getLayoutParams();
              f2 = f3 + localLayoutParams.leftMargin;
              f1 -= localLayoutParams.rightMargin;
              paramInt2 = 0;
              i2 = 0;
              if (!bm(i1, paramInt1))
                break label915;
              paramInt2 = this.btL;
              f3 = paramInt2;
              f1 -= paramInt2;
              f2 += f3;
            }
          }
        }
        break;
      case 1:
      case 2:
      case 4:
      case 3:
      case 5:
      }
    }
    label915: 
    while (true)
    {
      i1 = i2;
      if (paramInt1 == localb.apt - 1)
      {
        i1 = i2;
        if ((this.btJ & 0x4) > 0)
          i1 = this.btL;
      }
      if (this.btB == 2)
        if (paramBoolean)
        {
          this.btO.a((View)localObject, localb, Math.round(f1) - ((View)localObject).getMeasuredWidth(), n - ((View)localObject).getMeasuredHeight(), Math.round(f1), n);
          label434: f2 += ((View)localObject).getMeasuredWidth() + f4 + localLayoutParams.rightMargin;
          f1 -= ((View)localObject).getMeasuredWidth() + f4 + localLayoutParams.leftMargin;
          if (!paramBoolean)
            break label861;
          localb.m((View)localObject, i1, 0, paramInt2, 0);
        }
      while (true)
      {
        paramInt1++;
        f3 = f2;
        break label224;
        f2 = k - localb.bti + j;
        f1 = localb.bti - i;
        break;
        f1 = i;
        f2 = (k - localb.bti) / 2.0F + f1;
        f1 = k - j - (k - localb.bti) / 2.0F;
        break;
        paramInt1 = localb.uk();
        f3 = f1;
        if (paramInt1 != 0)
          f3 = (k - localb.bti) / paramInt1;
        f1 = i;
        f2 = f3 / 2.0F + f1;
        f1 = k - j - f3 / 2.0F;
        break;
        f2 = i;
        paramInt1 = localb.uk();
        if (paramInt1 != 1);
        for (f1 = paramInt1 - 1; ; f1 = 1.0F)
        {
          f3 = (k - localb.bti) / f1;
          f1 = k - j;
          break;
        }
        paramInt1 = localb.uk();
        f3 = f2;
        if (paramInt1 != 0)
          f3 = (k - localb.bti) / (paramInt1 + 1);
        f2 = i + f3;
        f1 = k - j - f3;
        break;
        this.btO.a((View)localObject, localb, Math.round(f2), n - ((View)localObject).getMeasuredHeight(), Math.round(f2) + ((View)localObject).getMeasuredWidth(), n);
        break label434;
        if (paramBoolean)
        {
          this.btO.a((View)localObject, localb, Math.round(f1) - ((View)localObject).getMeasuredWidth(), paramInt4, Math.round(f1), paramInt4 + ((View)localObject).getMeasuredHeight());
          break label434;
        }
        this.btO.a((View)localObject, localb, Math.round(f2), paramInt4, Math.round(f2) + ((View)localObject).getMeasuredWidth(), paramInt4 + ((View)localObject).getMeasuredHeight());
        break label434;
        label861: localb.m((View)localObject, paramInt2, 0, i1, 0);
        f5 = f1;
        f1 = f5;
      }
      paramInt1 = paramInt4 + localb.btk;
      paramInt2 = n - localb.btk;
      paramInt3++;
      break;
      AppMethodBeat.o(54745);
      return;
    }
  }

  private boolean bm(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(54772);
    if (bn(paramInt1, paramInt2))
      if (ua())
        if ((this.btJ & 0x1) != 0)
          AppMethodBeat.o(54772);
    while (true)
    {
      return bool;
      AppMethodBeat.o(54772);
      bool = false;
      continue;
      if ((this.btI & 0x1) != 0)
      {
        AppMethodBeat.o(54772);
      }
      else
      {
        AppMethodBeat.o(54772);
        bool = false;
        continue;
        if (ua())
        {
          if ((this.btJ & 0x2) != 0)
          {
            AppMethodBeat.o(54772);
          }
          else
          {
            AppMethodBeat.o(54772);
            bool = false;
          }
        }
        else if ((this.btI & 0x2) != 0)
        {
          AppMethodBeat.o(54772);
        }
        else
        {
          AppMethodBeat.o(54772);
          bool = false;
        }
      }
    }
  }

  private boolean bn(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(54773);
    int i = 1;
    if (i <= paramInt2)
    {
      View localView = fc(paramInt1 - i);
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        bool = false;
        AppMethodBeat.o(54773);
      }
    }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(54773);
    }
  }

  private View fc(int paramInt)
  {
    AppMethodBeat.i(54737);
    View localView;
    if ((paramInt < 0) || (paramInt >= this.btM.length))
    {
      localView = null;
      AppMethodBeat.o(54737);
    }
    while (true)
    {
      return localView;
      localView = getChildAt(this.btM[paramInt]);
      AppMethodBeat.o(54737);
    }
  }

  private boolean fd(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(54774);
    if ((paramInt < 0) || (paramInt >= this.bty.size()))
    {
      AppMethodBeat.o(54774);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (fe(paramInt))
      {
        if (ua())
        {
          if ((this.btI & 0x1) != 0)
          {
            AppMethodBeat.o(54774);
          }
          else
          {
            AppMethodBeat.o(54774);
            bool = false;
          }
        }
        else if ((this.btJ & 0x1) != 0)
        {
          AppMethodBeat.o(54774);
        }
        else
        {
          AppMethodBeat.o(54774);
          bool = false;
        }
      }
      else if (ua())
      {
        if ((this.btI & 0x2) != 0)
        {
          AppMethodBeat.o(54774);
        }
        else
        {
          AppMethodBeat.o(54774);
          bool = false;
        }
      }
      else if ((this.btJ & 0x2) != 0)
      {
        AppMethodBeat.o(54774);
      }
      else
      {
        AppMethodBeat.o(54774);
        bool = false;
      }
    }
  }

  private boolean fe(int paramInt)
  {
    AppMethodBeat.i(54775);
    int i = 0;
    boolean bool;
    if (i < paramInt)
      if (((b)this.bty.get(i)).uk() > 0)
      {
        AppMethodBeat.o(54775);
        bool = false;
      }
    while (true)
    {
      return bool;
      i++;
      break;
      bool = true;
      AppMethodBeat.o(54775);
    }
  }

  private boolean ff(int paramInt)
  {
    AppMethodBeat.i(54776);
    boolean bool;
    if ((paramInt < 0) || (paramInt >= this.bty.size()))
    {
      AppMethodBeat.o(54776);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramInt++;
      while (true)
      {
        if (paramInt >= this.bty.size())
          break label85;
        if (((b)this.bty.get(paramInt)).uk() > 0)
        {
          AppMethodBeat.o(54776);
          bool = false;
          break;
        }
        paramInt++;
      }
      label85: if (ua())
      {
        if ((this.btI & 0x4) != 0)
        {
          AppMethodBeat.o(54776);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(54776);
          bool = false;
        }
      }
      else if ((this.btJ & 0x4) != 0)
      {
        AppMethodBeat.o(54776);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(54776);
        bool = false;
      }
    }
  }

  private void o(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(54741);
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    int k = View.MeasureSpec.getMode(paramInt3);
    int m = View.MeasureSpec.getSize(paramInt3);
    Object localObject;
    int n;
    switch (paramInt1)
    {
    default:
      localObject = new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(paramInt1)));
      AppMethodBeat.o(54741);
      throw ((Throwable)localObject);
    case 0:
    case 1:
      n = getSumOfCrossSize();
      paramInt1 = getPaddingTop();
      n = getPaddingBottom() + (n + paramInt1);
    case 2:
    case 3:
    }
    for (paramInt1 = getLargestMainSize(); ; paramInt1 = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight())
      switch (i)
      {
      default:
        localObject = new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(i)));
        AppMethodBeat.o(54741);
        throw ((Throwable)localObject);
        n = getLargestMainSize();
      case 1073741824:
      case -2147483648:
      case 0:
      }
    i = paramInt4;
    if (j < paramInt1)
      i = View.combineMeasuredStates(paramInt4, 16777216);
    paramInt2 = View.resolveSizeAndState(j, paramInt2, i);
    paramInt1 = i;
    while (true)
      switch (k)
      {
      default:
        localObject = new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(k)));
        AppMethodBeat.o(54741);
        throw ((Throwable)localObject);
        if (j < paramInt1)
        {
          paramInt4 = View.combineMeasuredStates(paramInt4, 16777216);
          paramInt1 = j;
        }
        while (true)
        {
          paramInt2 = View.resolveSizeAndState(paramInt1, paramInt2, paramInt4);
          paramInt1 = paramInt4;
          break;
        }
        paramInt2 = View.resolveSizeAndState(paramInt1, paramInt2, paramInt4);
        paramInt1 = paramInt4;
      case 1073741824:
      case -2147483648:
      case 0:
      }
    paramInt4 = paramInt1;
    if (m < n)
      paramInt4 = View.combineMeasuredStates(paramInt1, 256);
    paramInt1 = View.resolveSizeAndState(m, paramInt3, paramInt4);
    while (true)
    {
      setMeasuredDimension(paramInt2, paramInt1);
      AppMethodBeat.o(54741);
      return;
      if (m < n)
      {
        paramInt1 = View.combineMeasuredStates(paramInt1, 256);
        n = m;
      }
      while (true)
      {
        paramInt1 = View.resolveSizeAndState(n, paramInt3, paramInt1);
        break;
      }
      paramInt1 = View.resolveSizeAndState(n, paramInt3, paramInt1);
    }
  }

  private void um()
  {
    AppMethodBeat.i(54771);
    if ((this.btG == null) && (this.btH == null))
    {
      setWillNotDraw(true);
      AppMethodBeat.o(54771);
    }
    while (true)
    {
      return;
      setWillNotDraw(false);
      AppMethodBeat.o(54771);
    }
  }

  public final void a(int paramInt, View paramView)
  {
  }

  public final void a(View paramView, int paramInt1, int paramInt2, b paramb)
  {
    AppMethodBeat.i(54764);
    if (bm(paramInt1, paramInt2))
      if (ua())
      {
        paramb.bti += this.btL;
        paramb.btj += this.btL;
        AppMethodBeat.o(54764);
      }
    while (true)
    {
      return;
      paramb.bti += this.btK;
      paramb.btj += this.btK;
      AppMethodBeat.o(54764);
    }
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(54761);
    if (ua())
    {
      if ((this.btJ & 0x4) <= 0)
        break label90;
      paramb.bti += this.btL;
      paramb.btj += this.btL;
      AppMethodBeat.o(54761);
    }
    while (true)
    {
      return;
      if ((this.btI & 0x4) > 0)
      {
        paramb.bti += this.btK;
        paramb.btj += this.btK;
      }
      label90: AppMethodBeat.o(54761);
    }
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(54739);
    if (this.btN == null)
      this.btN = new SparseIntArray(getChildCount());
    this.btM = this.btO.a(paramView, paramInt, paramLayoutParams, this.btN);
    super.addView(paramView, paramInt, paramLayoutParams);
    AppMethodBeat.o(54739);
  }

  public final int ca(View paramView)
  {
    return 0;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof FlexboxLayout.LayoutParams;
  }

  public final View eU(int paramInt)
  {
    AppMethodBeat.i(54736);
    View localView = getChildAt(paramInt);
    AppMethodBeat.o(54736);
    return localView;
  }

  public final View eV(int paramInt)
  {
    AppMethodBeat.i(54738);
    View localView = fc(paramInt);
    AppMethodBeat.o(54738);
    return localView;
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(54752);
    if ((paramLayoutParams instanceof FlexboxLayout.LayoutParams))
    {
      paramLayoutParams = new FlexboxLayout.LayoutParams((FlexboxLayout.LayoutParams)paramLayoutParams);
      AppMethodBeat.o(54752);
    }
    while (true)
    {
      return paramLayoutParams;
      if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      {
        paramLayoutParams = new FlexboxLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
        AppMethodBeat.o(54752);
      }
      else
      {
        paramLayoutParams = new FlexboxLayout.LayoutParams(paramLayoutParams);
        AppMethodBeat.o(54752);
      }
    }
  }

  public int getAlignContent()
  {
    return this.btE;
  }

  public int getAlignItems()
  {
    return this.btD;
  }

  public Drawable getDividerDrawableHorizontal()
  {
    return this.btG;
  }

  public Drawable getDividerDrawableVertical()
  {
    return this.btH;
  }

  public int getFlexDirection()
  {
    return this.btA;
  }

  public int getFlexItemCount()
  {
    AppMethodBeat.i(54735);
    int i = getChildCount();
    AppMethodBeat.o(54735);
    return i;
  }

  public List<b> getFlexLines()
  {
    AppMethodBeat.i(54759);
    ArrayList localArrayList = new ArrayList(this.bty.size());
    Iterator localIterator = this.bty.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.uk() != 0)
        localArrayList.add(localb);
    }
    AppMethodBeat.o(54759);
    return localArrayList;
  }

  public List<b> getFlexLinesInternal()
  {
    return this.bty;
  }

  public int getFlexWrap()
  {
    return this.btB;
  }

  public int getJustifyContent()
  {
    return this.btC;
  }

  public int getLargestMainSize()
  {
    AppMethodBeat.i(54742);
    Iterator localIterator = this.bty.iterator();
    for (int i = -2147483648; localIterator.hasNext(); i = Math.max(i, ((b)localIterator.next()).bti));
    AppMethodBeat.o(54742);
    return i;
  }

  public int getMaxLine()
  {
    return this.btF;
  }

  public int getShowDividerHorizontal()
  {
    return this.btI;
  }

  public int getShowDividerVertical()
  {
    return this.btJ;
  }

  public int getSumOfCrossSize()
  {
    AppMethodBeat.i(54743);
    int i = this.bty.size();
    int j = 0;
    int k = 0;
    if (j < i)
    {
      b localb = (b)this.bty.get(j);
      int m = k;
      if (fd(j))
      {
        if (ua())
          m = k + this.btK;
      }
      else
      {
        label66: k = m;
        if (ff(j))
          if (!ua())
            break label117;
      }
      label117: for (k = m + this.btK; ; k = m + this.btL)
      {
        k += localb.btk;
        j++;
        break;
        m = k + this.btL;
        break label66;
      }
    }
    AppMethodBeat.o(54743);
    return k;
  }

  public final int m(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54760);
    int i = 0;
    int j = 0;
    if (ua())
    {
      if (bm(paramInt1, paramInt2))
        j = this.btL + 0;
      paramInt1 = j;
      if ((this.btJ & 0x4) > 0)
        paramInt1 = j + this.btL;
    }
    while (true)
    {
      AppMethodBeat.o(54760);
      return paramInt1;
      j = i;
      if (bm(paramInt1, paramInt2))
        j = this.btK + 0;
      paramInt1 = j;
      if ((this.btI & 0x4) > 0)
        paramInt1 = j + this.btK;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    AppMethodBeat.i(54747);
    if ((this.btH == null) && (this.btG == null))
      AppMethodBeat.o(54747);
    int i;
    while (true)
    {
      return;
      if ((this.btI == 0) && (this.btJ == 0))
      {
        AppMethodBeat.o(54747);
      }
      else
      {
        i = s.T(this);
        switch (this.btA)
        {
        default:
          AppMethodBeat.o(54747);
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
    }
    boolean bool5;
    if (i == 1)
    {
      bool5 = true;
      label118: if (this.btB != 2)
        break label303;
    }
    label161: label289: label295: label298: label303: for (bool1 = bool4; ; bool1 = false)
    {
      a(paramCanvas, bool5, bool1);
      AppMethodBeat.o(54747);
      break;
      bool5 = false;
      break label118;
      if (i != 1)
      {
        bool5 = true;
        if (this.btB != 2)
          break label298;
      }
      for (bool1 = bool2; ; bool1 = false)
      {
        a(paramCanvas, bool5, bool1);
        AppMethodBeat.o(54747);
        break;
        bool5 = false;
        break label161;
        if (i == 1)
        {
          bool5 = true;
          label203: if (this.btB != 2)
            break label295;
          if (bool5)
            break label243;
          bool5 = bool3;
        }
        while (true)
        {
          b(paramCanvas, bool5, false);
          AppMethodBeat.o(54747);
          break;
          bool5 = false;
          break label203;
          label243: bool5 = false;
          continue;
          if (i == 1)
          {
            bool5 = true;
            if (this.btB != 2)
              break label289;
            if (bool5);
          }
          for (bool1 = true; ; bool1 = bool5)
          {
            b(paramCanvas, bool1, true);
            break;
            bool5 = false;
            break label258;
          }
        }
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(54744);
    int i = s.T(this);
    switch (this.btA)
    {
    default:
      IllegalStateException localIllegalStateException = new IllegalStateException("Invalid flex direction is set: " + this.btA);
      AppMethodBeat.o(54744);
      throw localIllegalStateException;
    case 0:
      if (i == 1);
      for (paramBoolean = true; ; paramBoolean = false)
      {
        b(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        AppMethodBeat.o(54744);
        return;
      }
    case 1:
      if (i != 1);
      for (paramBoolean = true; ; paramBoolean = false)
      {
        b(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        AppMethodBeat.o(54744);
        break;
      }
    case 2:
      if (i == 1)
      {
        paramBoolean = true;
        label162: if (this.btB != 2)
          break label267;
        if (paramBoolean)
          break label203;
        paramBoolean = bool2;
      }
      break;
    case 3:
    }
    label264: label267: 
    while (true)
    {
      a(paramBoolean, false, paramInt1, paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(54744);
      break;
      paramBoolean = false;
      break label162;
      label203: paramBoolean = false;
      continue;
      if (i == 1)
      {
        paramBoolean = true;
        label216: if (this.btB != 2)
          break label264;
        bool2 = bool1;
        if (!paramBoolean)
          bool2 = true;
        paramBoolean = bool2;
      }
      while (true)
      {
        a(paramBoolean, true, paramInt1, paramInt2, paramInt3, paramInt4);
        AppMethodBeat.o(54744);
        break;
        paramBoolean = false;
        break label216;
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54734);
    if (this.btN == null)
      this.btN = new SparseIntArray(getChildCount());
    if (this.btO.b(this.btN))
      this.btM = this.btO.a(this.btN);
    switch (this.btA)
    {
    default:
      IllegalStateException localIllegalStateException = new IllegalStateException("Invalid value for the flex direction is set: " + this.btA);
      AppMethodBeat.o(54734);
      throw localIllegalStateException;
    case 0:
    case 1:
      ae(paramInt1, paramInt2);
      AppMethodBeat.o(54734);
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      this.bty.clear();
      this.btP.reset();
      this.btO.a(this.btP, paramInt1, paramInt2);
      this.bty = this.btP.bty;
      this.btO.bk(paramInt1, paramInt2);
      this.btO.y(paramInt1, paramInt2, getPaddingLeft() + getPaddingRight());
      this.btO.ul();
      o(this.btA, paramInt1, paramInt2, this.btP.btz);
      AppMethodBeat.o(54734);
    }
  }

  public void setAlignContent(int paramInt)
  {
    AppMethodBeat.i(54757);
    if (this.btE != paramInt)
    {
      this.btE = paramInt;
      requestLayout();
    }
    AppMethodBeat.o(54757);
  }

  public void setAlignItems(int paramInt)
  {
    AppMethodBeat.i(54756);
    if (this.btD != paramInt)
    {
      this.btD = paramInt;
      requestLayout();
    }
    AppMethodBeat.o(54756);
  }

  public void setDividerDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(54765);
    setDividerDrawableHorizontal(paramDrawable);
    setDividerDrawableVertical(paramDrawable);
    AppMethodBeat.o(54765);
  }

  public void setDividerDrawableHorizontal(Drawable paramDrawable)
  {
    AppMethodBeat.i(54766);
    if (paramDrawable == this.btG)
    {
      AppMethodBeat.o(54766);
      return;
    }
    this.btG = paramDrawable;
    if (paramDrawable != null);
    for (this.btK = paramDrawable.getIntrinsicHeight(); ; this.btK = 0)
    {
      um();
      requestLayout();
      AppMethodBeat.o(54766);
      break;
    }
  }

  public void setDividerDrawableVertical(Drawable paramDrawable)
  {
    AppMethodBeat.i(54767);
    if (paramDrawable == this.btH)
    {
      AppMethodBeat.o(54767);
      return;
    }
    this.btH = paramDrawable;
    if (paramDrawable != null);
    for (this.btL = paramDrawable.getIntrinsicWidth(); ; this.btL = 0)
    {
      um();
      requestLayout();
      AppMethodBeat.o(54767);
      break;
    }
  }

  public void setFlexDirection(int paramInt)
  {
    AppMethodBeat.i(54753);
    if (this.btA != paramInt)
    {
      this.btA = paramInt;
      requestLayout();
    }
    AppMethodBeat.o(54753);
  }

  public void setFlexLines(List<b> paramList)
  {
    this.bty = paramList;
  }

  public void setFlexWrap(int paramInt)
  {
    AppMethodBeat.i(54754);
    if (this.btB != paramInt)
    {
      this.btB = paramInt;
      requestLayout();
    }
    AppMethodBeat.o(54754);
  }

  public void setJustifyContent(int paramInt)
  {
    AppMethodBeat.i(54755);
    if (this.btC != paramInt)
    {
      this.btC = paramInt;
      requestLayout();
    }
    AppMethodBeat.o(54755);
  }

  public void setMaxLine(int paramInt)
  {
    AppMethodBeat.i(54758);
    if (this.btF != paramInt)
    {
      this.btF = paramInt;
      requestLayout();
    }
    AppMethodBeat.o(54758);
  }

  public void setShowDivider(int paramInt)
  {
    AppMethodBeat.i(54768);
    setShowDividerVertical(paramInt);
    setShowDividerHorizontal(paramInt);
    AppMethodBeat.o(54768);
  }

  public void setShowDividerHorizontal(int paramInt)
  {
    AppMethodBeat.i(54770);
    if (paramInt != this.btI)
    {
      this.btI = paramInt;
      requestLayout();
    }
    AppMethodBeat.o(54770);
  }

  public void setShowDividerVertical(int paramInt)
  {
    AppMethodBeat.i(54769);
    if (paramInt != this.btJ)
    {
      this.btJ = paramInt;
      requestLayout();
    }
    AppMethodBeat.o(54769);
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
    AppMethodBeat.i(54762);
    paramInt1 = getChildMeasureSpec(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(54762);
    return paramInt1;
  }

  public final int w(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(54763);
    paramInt1 = getChildMeasureSpec(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(54763);
    return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.flexbox.FlexboxLayout
 * JD-Core Version:    0.6.2
 */