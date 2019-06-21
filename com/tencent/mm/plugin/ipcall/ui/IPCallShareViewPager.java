package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.CustomViewPager;

public class IPCallShareViewPager extends CustomViewPager
{
  public IPCallShareViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(22359);
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
    AppMethodBeat.o(22359);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareViewPager
 * JD-Core Version:    0.6.2
 */