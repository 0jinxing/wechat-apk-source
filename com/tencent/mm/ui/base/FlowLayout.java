package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;
import java.util.LinkedList;

public class FlowLayout extends ViewGroup
{
  private int ysw;
  int ysx;
  LinkedList<Integer> ysy;

  static
  {
    AppMethodBeat.i(106276);
    if (!FlowLayout.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(106276);
      return;
    }
  }

  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106267);
    this.ysw = 0;
    this.ysx = 0;
    this.ysy = new LinkedList();
    d(paramContext, paramAttributeSet);
    AppMethodBeat.o(106267);
  }

  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106268);
    this.ysw = 0;
    this.ysx = 0;
    this.ysy = new LinkedList();
    d(paramContext, paramAttributeSet);
    AppMethodBeat.o(106268);
  }

  private void d(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(106269);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.FlowLayout);
    try
    {
      this.ysw = paramContext.getDimensionPixelSize(0, 0);
      this.ysx = paramContext.getDimensionPixelSize(1, 0);
      return;
    }
    finally
    {
      paramContext.recycle();
      AppMethodBeat.o(106269);
    }
    throw paramAttributeSet;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof ViewGroup.LayoutParams;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    AppMethodBeat.i(106273);
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-2, -2);
    AppMethodBeat.o(106273);
    return localLayoutParams;
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(106274);
    paramAttributeSet = new ViewGroup.LayoutParams(getContext(), paramAttributeSet);
    AppMethodBeat.o(106274);
    return paramAttributeSet;
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(106275);
    paramLayoutParams = new ViewGroup.LayoutParams(paramLayoutParams.width, paramLayoutParams.height);
    AppMethodBeat.o(106275);
    return paramLayoutParams;
  }

  public int getLineCount()
  {
    AppMethodBeat.i(106270);
    int i = this.ysy.size();
    AppMethodBeat.o(106270);
    return i;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106272);
    int i = getChildCount();
    int j = getPaddingLeft();
    paramInt2 = getPaddingTop();
    paramInt4 = 0;
    int k = 0;
    View localView;
    int m;
    int n;
    int i1;
    if (k < i)
    {
      localView = getChildAt(k);
      m = j;
      n = paramInt4;
      i1 = paramInt2;
      if (localView.getVisibility() != 8)
      {
        n = localView.getMeasuredWidth();
        i1 = localView.getMeasuredHeight();
        if (j + n + getPaddingRight() <= paramInt3 - paramInt1)
          break label214;
        j = getPaddingLeft();
        paramInt2 += ((Integer)this.ysy.get(paramInt4)).intValue() + this.ysx;
        paramInt4++;
      }
    }
    label214: 
    while (true)
    {
      m = (((Integer)this.ysy.get(paramInt4)).intValue() - i1) / 2;
      localView.layout(j, paramInt2 + m, j + n, m + paramInt2 + i1);
      m = this.ysw + n + j;
      i1 = paramInt2;
      n = paramInt4;
      k++;
      j = m;
      paramInt4 = n;
      paramInt2 = i1;
      break;
      AppMethodBeat.o(106272);
      return;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106271);
    Object localObject;
    if ((!$assertionsDisabled) && (View.MeasureSpec.getMode(paramInt1) == 0))
    {
      localObject = new AssertionError();
      AppMethodBeat.o(106271);
      throw ((Throwable)localObject);
    }
    int i = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
    int j = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    int k = getChildCount();
    this.ysy.clear();
    int m = 0;
    int n = 0;
    int i1 = 0;
    if (View.MeasureSpec.getMode(paramInt2) == -2147483648);
    for (int i2 = View.MeasureSpec.makeMeasureSpec(j, -2147483648); ; i2 = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      int i3 = 0;
      while (i3 < k)
      {
        localObject = getChildAt(i3);
        int i4 = i1;
        int i5 = n;
        int i6 = m;
        if (((View)localObject).getVisibility() != 8)
        {
          ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), i2);
          int i7 = ((View)localObject).getMeasuredWidth();
          i4 = i1;
          i5 = n;
          i6 = m;
          if (m + i7 > i)
          {
            i6 = 0;
            i5 = n + (this.ysx + i1);
            this.ysy.add(Integer.valueOf(i1));
            i4 = 0;
          }
          i4 = Math.max(i4, ((View)localObject).getMeasuredHeight());
          i6 += this.ysw + i7;
        }
        i3++;
        i1 = i4;
        n = i5;
        m = i6;
      }
    }
    this.ysy.add(Integer.valueOf(i1));
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      paramInt2 = n + i1 + getPaddingTop() + getPaddingBottom();
    while (true)
    {
      setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), paramInt2);
      AppMethodBeat.o(106271);
      return;
      if ((View.MeasureSpec.getMode(paramInt2) == -2147483648) && (n + i1 < j))
        paramInt2 = n + i1 + getPaddingTop() + getPaddingBottom();
      else
        paramInt2 = j;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.FlowLayout
 * JD-Core Version:    0.6.2
 */