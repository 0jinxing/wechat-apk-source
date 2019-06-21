package com.tencent.mm.plugin.webview.luggage.c;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.statusbar.d;

public final class a
{
  public static boolean a(Context paramContext, int paramInt, String paramString)
  {
    AppMethodBeat.i(6497);
    boolean bool = c(paramContext, paramInt, bo.nullAsNil(paramString).equals("black"));
    AppMethodBeat.o(6497);
    return bool;
  }

  public static int b(Window paramWindow, boolean paramBoolean)
  {
    AppMethodBeat.i(6496);
    int i = paramWindow.getDecorView().getSystemUiVisibility();
    int j;
    if (paramBoolean)
    {
      j = i | 0x400 | 0x100;
      i = j;
      if (Build.VERSION.SDK_INT >= 20)
        i = j | 0x200 | 0x2;
      j = i | 0x4;
      i = j;
      if (Build.VERSION.SDK_INT >= 19)
        i = j | 0x1000;
    }
    while (true)
    {
      AppMethodBeat.o(6496);
      return i;
      j = i & 0xFFFFFBFF & 0xFFFFFEFF;
      i = j;
      if (Build.VERSION.SDK_INT >= 20)
        i = j & 0xFFFFFDFF & 0xFFFFFFFD;
      j = i & 0xFFFFFFFB;
      i = j;
      if (Build.VERSION.SDK_INT >= 19)
        i = j & 0xFFFFEFFF;
    }
  }

  public static void c(Window paramWindow, boolean paramBoolean)
  {
    AppMethodBeat.i(6495);
    int i;
    if (paramBoolean)
    {
      i = b(paramWindow, paramBoolean);
      paramWindow.getDecorView().setSystemUiVisibility(i);
      paramWindow.setFlags(1024, 1024);
      paramWindow.getDecorView().setOnSystemUiVisibilityChangeListener(new a.1(paramWindow, paramBoolean));
      AppMethodBeat.o(6495);
    }
    while (true)
    {
      return;
      i = b(paramWindow, paramBoolean);
      paramWindow.getDecorView().setSystemUiVisibility(i);
      paramWindow.clearFlags(1024);
      paramWindow.getDecorView().setOnSystemUiVisibilityChangeListener(null);
      AppMethodBeat.o(6495);
    }
  }

  public static boolean c(Context paramContext, int paramInt, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(6498);
    if (!(paramContext instanceof Activity))
    {
      AppMethodBeat.o(6498);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (Build.VERSION.SDK_INT < 21)
      {
        AppMethodBeat.o(6498);
        paramBoolean = bool;
      }
      else
      {
        paramContext = ((Activity)paramContext).getWindow();
        int i;
        if (Build.VERSION.SDK_INT >= 23)
        {
          i = paramInt;
          if (d.a(paramContext, paramBoolean));
        }
        else
        {
          if (Build.VERSION.SDK_INT < 21)
            break label98;
          i = paramInt;
          if (paramBoolean)
            i = ae.Jj(paramInt);
        }
        paramContext.setStatusBarColor(i);
        label98: paramBoolean = true;
        AppMethodBeat.o(6498);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.c.a
 * JD-Core Version:    0.6.2
 */