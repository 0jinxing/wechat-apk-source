package android.support.v7.app;

import android.content.Context;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import android.view.Window.Callback;
import java.util.List;

final class f extends h
{
  f(Context paramContext, Window paramWindow, c paramc)
  {
    super(paramContext, paramWindow, paramc);
  }

  final Window.Callback a(Window.Callback paramCallback)
  {
    return new a(paramCallback);
  }

  final class a extends h.a
  {
    a(Window.Callback arg2)
    {
      super(localCallback);
    }

    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
    {
      AppCompatDelegateImplV9.PanelFeatureState localPanelFeatureState = f.this.bh(0);
      if ((localPanelFeatureState != null) && (localPanelFeatureState.VK != null))
        super.onProvideKeyboardShortcuts(paramList, localPanelFeatureState.VK, paramInt);
      while (true)
      {
        return;
        super.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.f
 * JD-Core Version:    0.6.2
 */