package com.tencent.mm.ui;

import android.graphics.Rect;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;

final class NewChattingTabUI$3
  implements Runnable
{
  NewChattingTabUI$3(NewChattingTabUI paramNewChattingTabUI, int[] paramArrayOfInt, HomeUI.FitSystemWindowLayoutView paramFitSystemWindowLayoutView, ViewGroup paramViewGroup)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29795);
    NewChattingTabUI.g(this.ypr).getSupportActionBar().getCustomView().getLocationInWindow(this.ypt);
    int i = ak.getStatusBarHeight(NewChattingTabUI.g(this.ypr));
    if (i > 0)
    {
      NewChattingTabUI.e(this.ypr).a(this.ypu, new Rect(0, i, 0, 0), this.ypv);
      AppMethodBeat.o(29795);
    }
    while (true)
    {
      return;
      if (d.iW(20))
        this.ypu.setOnApplyWindowInsetsListener(new NewChattingTabUI.3.1(this));
      AppMethodBeat.o(29795);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI.3
 * JD-Core Version:    0.6.2
 */