package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class NewChattingTabUI$3$1
  implements View.OnApplyWindowInsetsListener
{
  NewChattingTabUI$3$1(NewChattingTabUI.3 param3)
  {
  }

  @TargetApi(20)
  public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    AppMethodBeat.i(29794);
    if (paramWindowInsets == null)
      AppMethodBeat.o(29794);
    while (true)
    {
      return paramWindowInsets;
      ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "OnApplyWindowInsetsListener %s", new Object[] { paramWindowInsets });
      paramWindowInsets.consumeSystemWindowInsets();
      LauncherUI.b localb = NewChattingTabUI.e(this.ypw.ypr);
      paramView = this.ypw.ypu;
      paramWindowInsets.getSystemWindowInsetTop();
      localb.a(paramView, new Rect(paramWindowInsets.getSystemWindowInsetLeft(), paramWindowInsets.getSystemWindowInsetTop(), paramWindowInsets.getSystemWindowInsetRight(), paramWindowInsets.getSystemWindowInsetBottom()), this.ypw.ypv);
      AppMethodBeat.o(29794);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI.3.1
 * JD-Core Version:    0.6.2
 */