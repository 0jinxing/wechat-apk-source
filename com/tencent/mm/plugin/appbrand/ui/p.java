package com.tencent.mm.plugin.appbrand.ui;

import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class p
{
  static void b(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(93755);
    if (paramMMActivity.getSupportActionBar() == null)
      AppMethodBeat.o(93755);
    while (true)
    {
      return;
      paramMMActivity = paramMMActivity.getSupportActionBar().getCustomView().findViewById(2131820973);
      if ((paramMMActivity != null) && (paramMMActivity.getLayoutParams() != null) && ((paramMMActivity.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
      {
        ((ViewGroup.MarginLayoutParams)paramMMActivity.getLayoutParams()).rightMargin = 0;
        paramMMActivity.requestLayout();
      }
      AppMethodBeat.o(93755);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.p
 * JD-Core Version:    0.6.2
 */