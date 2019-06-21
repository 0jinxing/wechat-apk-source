package com.tencent.luggage.g;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  public static boolean az(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(90905);
    if (paramContext == null)
      AppMethodBeat.o(90905);
    while (true)
    {
      return bool;
      InputMethodManager localInputMethodManager = (InputMethodManager)paramContext.getSystemService("input_method");
      if (localInputMethodManager == null)
      {
        AppMethodBeat.o(90905);
        continue;
      }
      if ((paramContext instanceof Activity));
      for (paramContext = (Activity)paramContext; ; paramContext = null)
      {
        if (paramContext != null)
          break label69;
        AppMethodBeat.o(90905);
        break;
      }
      label69: paramContext = paramContext.getCurrentFocus();
      if (paramContext == null)
      {
        AppMethodBeat.o(90905);
        continue;
      }
      paramContext = paramContext.getWindowToken();
      if (paramContext == null)
      {
        AppMethodBeat.o(90905);
        continue;
      }
      try
      {
        bool = localInputMethodManager.hideSoftInputFromWindow(paramContext, 0);
        AppMethodBeat.o(90905);
      }
      catch (IllegalArgumentException paramContext)
      {
        while (true)
          bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.g.f
 * JD-Core Version:    0.6.2
 */