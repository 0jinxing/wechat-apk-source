package com.tencent.mm.ui.base;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMAutoHeightViewPager extends ViewPager
{
  private static final String TAG = "MicoMsg.MMAutoHeightViewPager";

  public MMAutoHeightViewPager(Context paramContext)
  {
    super(paramContext);
  }

  public MMAutoHeightViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MMAutoHeightViewPager(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106483);
    int i = 0;
    for (int j = 0; i < getChildCount(); j = paramInt2)
    {
      View localView = getChildAt(i);
      localView.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, 0));
      int k = localView.getMeasuredHeight();
      paramInt2 = j;
      if (k > j)
        paramInt2 = k;
      i++;
    }
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(j, 1073741824));
    AppMethodBeat.o(106483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoHeightViewPager
 * JD-Core Version:    0.6.2
 */