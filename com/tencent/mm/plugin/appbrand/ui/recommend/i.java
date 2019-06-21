package com.tencent.mm.plugin.appbrand.ui.recommend;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i
{
  public static void b(Context paramContext, View paramView)
  {
    AppMethodBeat.i(133577);
    if ((paramView instanceof LinearLayout))
    {
      LinearLayout localLinearLayout = (LinearLayout)paramView;
      paramView = (LinearLayout.LayoutParams)localLinearLayout.getLayoutParams();
      int i = paramContext.getResources().getDimensionPixelOffset(2131428072);
      if (paramView != null)
      {
        paramView.rightMargin = i;
        paramView.leftMargin = i;
        paramView.topMargin = i;
        localLinearLayout.setLayoutParams(paramView);
        localLinearLayout.invalidate();
        localLinearLayout.requestLayout();
      }
    }
    AppMethodBeat.o(133577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.i
 * JD-Core Version:    0.6.2
 */