package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class f
{
  public static boolean cX(View paramView)
  {
    boolean bool = false;
    AppMethodBeat.i(11172);
    if (paramView == null)
      AppMethodBeat.o(11172);
    while (true)
    {
      return bool;
      InputMethodManager localInputMethodManager = (InputMethodManager)paramView.getContext().getSystemService("input_method");
      if (localInputMethodManager == null)
      {
        AppMethodBeat.o(11172);
        continue;
      }
      paramView = paramView.getWindowToken();
      if (paramView == null)
      {
        AppMethodBeat.o(11172);
        continue;
      }
      try
      {
        bool = localInputMethodManager.hideSoftInputFromWindow(paramView, 0);
        AppMethodBeat.o(11172);
      }
      catch (IllegalArgumentException paramView)
      {
        while (true)
        {
          ab.e("MicroMsg.InputMethodHelper", "hide VKB(View) exception %s", new Object[] { paramView });
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.f
 * JD-Core Version:    0.6.2
 */