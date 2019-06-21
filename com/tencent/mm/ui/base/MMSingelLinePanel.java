package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public class MMSingelLinePanel extends MMTagPanel
{
  private boolean mSingleLine;
  private int ysw;
  private int ysx;
  private LinkedList<Integer> ysy;
  private TextView ywY;
  private int ywZ;
  private int yxa;

  static
  {
    AppMethodBeat.i(106769);
    if (!MMSingelLinePanel.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(106769);
      return;
    }
  }

  public MMSingelLinePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMSingelLinePanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106764);
    this.ysy = new LinkedList();
    this.ysw = 0;
    this.ysx = 0;
    this.mSingleLine = true;
    this.ywZ = 0;
    this.yxa = 0;
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
      AppMethodBeat.o(106764);
    }
    throw paramAttributeSet;
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public final void dzU()
  {
    AppMethodBeat.i(106765);
    super.dzU();
    this.ywY = new TextView(getContext());
    this.ywY.setText("...");
    this.ywY.setTextColor(getResources().getColor(2131690683));
    this.ywY.setLayoutParams(generateDefaultLayoutParams());
    addView(this.ywY);
    AppMethodBeat.o(106765);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106768);
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    View localView;
    if (this.mSingleLine)
    {
      i = getChildCount();
      j = this.ywZ;
      k = getPaddingLeft();
      paramInt2 = getPaddingTop();
      m = 0;
      n = 0;
      paramInt4 = 0;
      i1 = 0;
      if (i1 < i)
      {
        localView = getChildAt(i1);
        if ((localView.getVisibility() == 8) || (localView == this.ywY))
          break label500;
        int i2 = localView.getMeasuredWidth();
        int i3 = localView.getMeasuredHeight();
        if (k + i2 + getPaddingRight() <= paramInt3 - paramInt1 - j)
          break label497;
        k = getPaddingLeft();
        paramInt2 += ((Integer)this.ysy.get(paramInt4)).intValue() + this.ysx;
        paramInt4++;
        label147: if (paramInt4 > 0)
          break label494;
        localView.layout(k, paramInt2 + 0, k + i2, paramInt2 + 0 + i3);
        k = this.ysw + i2 + k;
        n = paramInt2;
        m = k;
      }
    }
    label283: label491: label494: label497: label500: 
    while (true)
    {
      i1++;
      break;
      if (this.ywY != null)
        if (paramInt4 > 0)
        {
          this.ywY.layout(m, n, this.ywZ + m, this.yxa + n);
          AppMethodBeat.o(106768);
        }
      while (true)
      {
        return;
        this.ywY.layout(0, 0, 0, 0);
        AppMethodBeat.o(106768);
      }
      i = getChildCount();
      k = getPaddingLeft();
      paramInt2 = getPaddingTop();
      paramInt4 = 0;
      i1 = 0;
      if (i1 < i)
      {
        localView = getChildAt(i1);
        j = k;
        n = paramInt4;
        m = paramInt2;
        if (localView.getVisibility() != 8)
        {
          j = k;
          n = paramInt4;
          m = paramInt2;
          if (localView != this.ywY)
          {
            n = localView.getMeasuredWidth();
            m = localView.getMeasuredHeight();
            if (k + n + getPaddingRight() <= paramInt3 - paramInt1)
              break label491;
            k = getPaddingLeft();
            paramInt2 += ((Integer)this.ysy.get(paramInt4)).intValue() + this.ysx;
            paramInt4++;
          }
        }
      }
      while (true)
      {
        j = (((Integer)this.ysy.get(paramInt4)).intValue() - m) / 2;
        localView.layout(k, paramInt2 + j, k + n, j + paramInt2 + m);
        j = this.ysw + n + k;
        m = paramInt2;
        n = paramInt4;
        i1++;
        k = j;
        paramInt4 = n;
        paramInt2 = m;
        break label283;
        AppMethodBeat.o(106768);
        break;
      }
      continue;
      break label147;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106767);
    Object localObject;
    if ((!$assertionsDisabled) && (View.MeasureSpec.getMode(paramInt1) == 0))
    {
      localObject = new AssertionError();
      AppMethodBeat.o(106767);
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
      if ((this.mSingleLine) && (this.ywY != null))
      {
        this.ywY.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), i2);
        this.ywZ = this.ywY.getMeasuredWidth();
        this.yxa = this.ywY.getMeasuredHeight();
        ab.d("MicroMsg.MMTagContactPanel", "mEllipsisWidth %d", new Object[] { Integer.valueOf(this.ywZ) });
      }
      int i3 = i;
      if (this.mSingleLine)
        i3 = i - this.ywZ;
      i = 0;
      int i4 = 0;
      while (i4 < k)
      {
        localObject = getChildAt(i4);
        int i5 = i1;
        int i6 = n;
        int i7 = m;
        int i8 = i;
        if (((View)localObject).getVisibility() != 8)
        {
          ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(i3, -2147483648), i2);
          int i9 = ((View)localObject).getMeasuredWidth();
          i6 = ((View)localObject).getMeasuredHeight();
          i7 = i1;
          i = n;
          i8 = m;
          if (m + i9 > i3)
          {
            i8 = 0;
            i = n + (this.ysx + i1);
            this.ysy.add(Integer.valueOf(i1));
            i7 = 0;
          }
          i5 = Math.max(i7, ((View)localObject).getMeasuredHeight());
          i7 = i8 + (this.ysw + i9);
          i8 = i6;
          i6 = i;
        }
        i4++;
        i1 = i5;
        n = i6;
        m = i7;
        i = i8;
      }
    }
    this.ysy.add(Integer.valueOf(i1));
    if (this.mSingleLine)
    {
      getPaddingTop();
      getPaddingBottom();
    }
    while (true)
    {
      setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), i);
      AppMethodBeat.o(106767);
      return;
      if (View.MeasureSpec.getMode(paramInt2) == 0)
      {
        getPaddingTop();
        getPaddingBottom();
      }
      else if ((View.MeasureSpec.getMode(paramInt2) == -2147483648) && (n + i1 < j))
      {
        getPaddingTop();
        getPaddingBottom();
      }
    }
  }

  public void setSingleLine(boolean paramBoolean)
  {
    AppMethodBeat.i(106766);
    this.mSingleLine = paramBoolean;
    this.ywY = new TextView(getContext());
    this.ywY.setText("...");
    this.ywY.setLayoutParams(generateDefaultLayoutParams());
    addView(this.ywY);
    AppMethodBeat.o(106766);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMSingelLinePanel
 * JD-Core Version:    0.6.2
 */