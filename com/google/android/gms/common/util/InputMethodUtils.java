package com.google.android.gms.common.util;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class InputMethodUtils
{
  public static boolean hideSoftInput(Context paramContext, View paramView)
  {
    boolean bool = false;
    AppMethodBeat.i(90239);
    paramContext = zzf(paramContext);
    if (paramContext != null)
    {
      paramContext.hideSoftInputFromWindow(paramView.getWindowToken(), 0);
      bool = true;
      AppMethodBeat.o(90239);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(90239);
    }
  }

  public static boolean isAcceptingText(Context paramContext)
  {
    AppMethodBeat.i(90241);
    paramContext = zzf(paramContext);
    boolean bool;
    if (paramContext != null)
    {
      bool = paramContext.isAcceptingText();
      AppMethodBeat.o(90241);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90241);
    }
  }

  public static void restart(Context paramContext, View paramView)
  {
    AppMethodBeat.i(90240);
    paramContext = zzf(paramContext);
    if (paramContext != null)
      paramContext.restartInput(paramView);
    AppMethodBeat.o(90240);
  }

  public static boolean showSoftInput(Context paramContext, View paramView)
  {
    boolean bool = false;
    AppMethodBeat.i(90238);
    paramContext = zzf(paramContext);
    if (paramContext != null)
    {
      paramContext.showSoftInput(paramView, 0);
      bool = true;
      AppMethodBeat.o(90238);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(90238);
    }
  }

  private static InputMethodManager zzf(Context paramContext)
  {
    AppMethodBeat.i(90237);
    paramContext = (InputMethodManager)paramContext.getSystemService("input_method");
    AppMethodBeat.o(90237);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.InputMethodUtils
 * JD-Core Version:    0.6.2
 */