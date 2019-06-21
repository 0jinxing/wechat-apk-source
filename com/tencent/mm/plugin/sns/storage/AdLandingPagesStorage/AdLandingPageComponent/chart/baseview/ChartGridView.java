package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public abstract class ChartGridView extends View
{
  public ChartGridView(Context paramContext)
  {
    super(paramContext);
  }

  public ChartGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ChartGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected abstract int cpg();

  protected abstract int cph();

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = j;
    switch (i)
    {
    default:
      paramInt1 = j;
    case 1073741824:
      i = View.MeasureSpec.getMode(paramInt2);
      j = View.MeasureSpec.getSize(paramInt2);
      paramInt2 = j;
      switch (i)
      {
      default:
        paramInt2 = j;
      case 1073741824:
      case 0:
      case -2147483648:
      }
      break;
    case 0:
    case -2147483648:
    }
    while (true)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      return;
      paramInt1 = cph();
      break;
      paramInt1 = getSuggestedMinimumWidth();
      break;
      paramInt2 = cpg();
      continue;
      paramInt2 = getSuggestedMinimumHeight();
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView
 * JD-Core Version:    0.6.2
 */