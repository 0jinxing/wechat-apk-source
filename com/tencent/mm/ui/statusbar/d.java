package com.tencent.mm.ui.statusbar;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.h.b;

public final class d
{
  public static void a(Window paramWindow)
  {
    AppMethodBeat.i(67852);
    if (paramWindow == null)
      AppMethodBeat.o(67852);
    while (true)
    {
      return;
      if ((Build.VERSION.SDK_INT >= 21) && (((paramWindow.getAttributes().flags & 0x80000000) == 0) || (paramWindow.getStatusBarColor() != 0)))
      {
        paramWindow.addFlags(-2147483648);
        paramWindow.setStatusBarColor(0);
      }
      AppMethodBeat.o(67852);
    }
  }

  public static boolean a(Window paramWindow, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(67853);
    if ((paramWindow == null) || (paramWindow.getDecorView() == null))
    {
      AppMethodBeat.o(67853);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (dJo())
      {
        paramWindow = paramWindow.getDecorView();
        int i = paramWindow.getSystemUiVisibility();
        if (paramBoolean)
          i |= 8192;
        while (true)
        {
          paramWindow.setSystemUiVisibility(i);
          paramBoolean = true;
          AppMethodBeat.o(67853);
          break;
          i &= -8193;
        }
      }
      AppMethodBeat.o(67853);
      paramBoolean = bool;
    }
  }

  public static boolean b(Window paramWindow)
  {
    boolean bool = false;
    AppMethodBeat.i(67851);
    if ((paramWindow == null) || (paramWindow.getDecorView() == null))
      AppMethodBeat.o(67851);
    while (true)
    {
      return bool;
      if ((Build.VERSION.SDK_INT >= 23) && ((paramWindow.getDecorView().getSystemUiVisibility() & 0x2000) != 0))
      {
        bool = true;
        AppMethodBeat.o(67851);
      }
      else
      {
        AppMethodBeat.o(67851);
      }
    }
  }

  public static Activity cY(Context paramContext)
  {
    AppMethodBeat.i(67850);
    if (paramContext == null)
    {
      AppMethodBeat.o(67850);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      if ((paramContext instanceof Activity))
      {
        paramContext = (Activity)paramContext;
        AppMethodBeat.o(67850);
      }
      else
      {
        if ((paramContext instanceof ContextWrapper))
        {
          Context localContext = ((ContextWrapper)paramContext).getBaseContext();
          if (localContext != paramContext)
          {
            paramContext = localContext;
            break;
          }
        }
        AppMethodBeat.o(67850);
        paramContext = null;
      }
    }
  }

  public static boolean dJo()
  {
    AppMethodBeat.i(67854);
    boolean bool;
    if ((Build.VERSION.SDK_INT >= 23) && (!b.Mt()))
    {
      bool = true;
      AppMethodBeat.o(67854);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(67854);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.statusbar.d
 * JD-Core Version:    0.6.2
 */