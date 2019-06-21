package com.tencent.mm.plugin.topstory.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ae;

public final class f
{
  public static int[] a(Context paramContext, View paramView1, View paramView2, boolean paramBoolean)
  {
    AppMethodBeat.i(2240);
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    paramView1.getLocationInWindow(arrayOfInt2);
    int i = paramView1.getHeight();
    int j = ae.hy(paramContext).x;
    paramView2.measure(0, 0);
    int k = paramView2.getMeasuredHeight();
    int m = paramView2.getMeasuredWidth();
    if (paramBoolean)
    {
      arrayOfInt1[0] = ((j - m) / 2);
      arrayOfInt2[1] -= k;
    }
    while (true)
    {
      AppMethodBeat.o(2240);
      return arrayOfInt1;
      arrayOfInt1[0] = ((j - m) / 2);
      arrayOfInt2[1] += i;
    }
  }

  public static int dip2px(Context paramContext, float paramFloat)
  {
    AppMethodBeat.i(2242);
    int i = (int)(paramContext.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
    AppMethodBeat.o(2242);
    return i;
  }

  public static int em(View paramView)
  {
    AppMethodBeat.i(2241);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int i = paramView.getWidth();
    int j = arrayOfInt[0];
    i /= 2;
    AppMethodBeat.o(2241);
    return j + i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.f
 * JD-Core Version:    0.6.2
 */