package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window;
import android.view.Window.Callback;

class h extends g
{
  private final UiModeManager Vd;

  h(Context paramContext, Window paramWindow, c paramc)
  {
    super(paramContext, paramWindow, paramc);
    this.Vd = ((UiModeManager)paramContext.getSystemService("uimode"));
  }

  Window.Callback a(Window.Callback paramCallback)
  {
    return new a(paramCallback);
  }

  final int bg(int paramInt)
  {
    if ((paramInt == 0) && (this.Vd.getNightMode() == 0));
    for (paramInt = -1; ; paramInt = super.bg(paramInt))
      return paramInt;
  }

  class a extends g.a
  {
    a(Window.Callback arg2)
    {
      super(localCallback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
    {
      return null;
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
    {
      if (h.this.UV)
        switch (paramInt)
        {
        default:
        case 0:
        }
      for (paramCallback = super.onWindowStartingActionMode(paramCallback, paramInt); ; paramCallback = a(paramCallback))
        return paramCallback;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.h
 * JD-Core Version:    0.6.2
 */