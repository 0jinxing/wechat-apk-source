package android.support.design.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup
{
  private int kN = -1;

  public BaselineLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }

  public BaselineLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public int getBaseline()
  {
    return this.kN;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    int m = getPaddingTop();
    paramInt2 = 0;
    if (paramInt2 < i)
    {
      View localView = getChildAt(paramInt2);
      int n;
      int i1;
      int i2;
      if (localView.getVisibility() != 8)
      {
        n = localView.getMeasuredWidth();
        i1 = localView.getMeasuredHeight();
        i2 = j + (paramInt3 - paramInt1 - k - j - n) / 2;
        if ((this.kN == -1) || (localView.getBaseline() == -1))
          break label140;
      }
      label140: for (paramInt4 = this.kN + m - localView.getBaseline(); ; paramInt4 = m)
      {
        localView.layout(i2, paramInt4, n + i2, i1 + paramInt4);
        paramInt2++;
        break;
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    int j = 0;
    int k = 0;
    int m = -1;
    int n = -1;
    int i1 = 0;
    int i7;
    for (int i2 = 0; j < i; i2 = i7)
    {
      View localView = getChildAt(j);
      i3 = m;
      int i4 = n;
      int i5 = k;
      int i6 = i1;
      i7 = i2;
      if (localView.getVisibility() != 8)
      {
        measureChild(localView, paramInt1, paramInt2);
        i7 = localView.getBaseline();
        i3 = m;
        i4 = n;
        if (i7 != -1)
        {
          i4 = Math.max(n, i7);
          i3 = Math.max(m, localView.getMeasuredHeight() - i7);
        }
        i7 = Math.max(i2, localView.getMeasuredWidth());
        i6 = Math.max(i1, localView.getMeasuredHeight());
        i5 = View.combineMeasuredStates(k, localView.getMeasuredState());
      }
      j++;
      m = i3;
      n = i4;
      k = i5;
      i1 = i6;
    }
    int i3 = i1;
    if (n != -1)
    {
      i3 = Math.max(i1, Math.max(m, getPaddingBottom()) + n);
      this.kN = n;
    }
    i1 = Math.max(i3, getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSizeAndState(Math.max(i2, getSuggestedMinimumWidth()), paramInt1, k), View.resolveSizeAndState(i1, paramInt2, k << 16));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.design.internal.BaselineLayout
 * JD-Core Version:    0.6.2
 */