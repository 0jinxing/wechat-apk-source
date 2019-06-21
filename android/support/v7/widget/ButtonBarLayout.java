package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ButtonBarLayout extends LinearLayout
{
  private boolean agK;
  private int agL = -1;
  private int agM = 0;

  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.ButtonBarLayout);
    this.agK = paramContext.getBoolean(0, true);
    paramContext.recycle();
  }

  private int bG(int paramInt)
  {
    int i = getChildCount();
    if (paramInt < i)
      if (getChildAt(paramInt).getVisibility() != 0);
    while (true)
    {
      return paramInt;
      paramInt++;
      break;
      paramInt = -1;
    }
  }

  private boolean hQ()
  {
    boolean bool = true;
    if (getOrientation() == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private void setStacked(boolean paramBoolean)
  {
    label17: View localView;
    if (paramBoolean)
    {
      i = 1;
      setOrientation(i);
      if (!paramBoolean)
        break label76;
      i = 5;
      setGravity(i);
      localView = findViewById(2131820917);
      if (localView != null)
        if (!paramBoolean)
          break label82;
    }
    label76: label82: for (int i = 8; ; i = 4)
    {
      localView.setVisibility(i);
      for (i = getChildCount() - 2; i >= 0; i--)
        bringChildToFront(getChildAt(i));
      i = 0;
      break;
      i = 80;
      break label17;
    }
  }

  public int getMinimumHeight()
  {
    return Math.max(this.agM, super.getMinimumHeight());
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    if (this.agK)
    {
      if ((i > this.agL) && (hQ()))
        setStacked(false);
      this.agL = i;
    }
    int j;
    int k;
    if ((!hQ()) && (View.MeasureSpec.getMode(paramInt1) == 1073741824))
    {
      j = View.MeasureSpec.makeMeasureSpec(i, -2147483648);
      i = 1;
      super.onMeasure(j, paramInt2);
      j = i;
      if (this.agK)
      {
        j = i;
        if (!hQ())
        {
          if ((getMeasuredWidthAndState() & 0xFF000000) != 16777216)
            break label261;
          k = 1;
          label105: j = i;
          if (k != 0)
          {
            setStacked(true);
            j = 1;
          }
        }
      }
      if (j != 0)
        super.onMeasure(paramInt1, paramInt2);
      paramInt1 = bG(0);
      if (paramInt1 < 0)
        break label277;
      View localView = getChildAt(paramInt1);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
      i = getPaddingTop();
      j = localView.getMeasuredHeight();
      paramInt2 = localLayoutParams.topMargin;
      paramInt2 = localLayoutParams.bottomMargin + (j + i + paramInt2) + 0;
      if (!hQ())
        break label267;
      i = bG(paramInt1 + 1);
      paramInt1 = paramInt2;
      if (i >= 0)
        paramInt1 = paramInt2 + (getChildAt(i).getPaddingTop() + (int)(16.0F * getResources().getDisplayMetrics().density));
    }
    while (true)
    {
      if (s.aa(this) != paramInt1)
        setMinimumHeight(paramInt1);
      return;
      i = 0;
      j = paramInt1;
      break;
      label261: k = 0;
      break label105;
      label267: paramInt1 = paramInt2 + getPaddingBottom();
      continue;
      label277: paramInt1 = 0;
    }
  }

  public void setAllowStacking(boolean paramBoolean)
  {
    if (this.agK != paramBoolean)
    {
      this.agK = paramBoolean;
      if ((!this.agK) && (getOrientation() == 1))
        setStacked(false);
      requestLayout();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ButtonBarLayout
 * JD-Core Version:    0.6.2
 */