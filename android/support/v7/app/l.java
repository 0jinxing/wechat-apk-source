package android.support.v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.s;
import android.support.v7.view.i;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.o.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.b;
import android.support.v7.widget.bd;
import android.support.v7.widget.x;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import java.util.ArrayList;

final class l extends ActionBar
{
  x Wk;
  boolean Wl;
  Window.Callback Wm;
  private boolean Wn;
  private boolean Wo;
  private ArrayList<Object> Wp = new ArrayList();
  private final Runnable Wq = new Runnable()
  {
    public final void run()
    {
      l locall = l.this;
      Menu localMenu = locall.getMenu();
      h localh;
      if ((localMenu instanceof h))
        localh = (h)localMenu;
      while (true)
      {
        if (localh != null)
          localh.gx();
        try
        {
          localMenu.clear();
          if ((!locall.Wm.onCreatePanelMenu(0, localMenu)) || (!locall.Wm.onPreparePanel(0, null, localMenu)))
            localMenu.clear();
          return;
          localh = null;
        }
        finally
        {
          if (localh != null)
            localh.gy();
        }
      }
    }
  };
  private final Toolbar.b Wr = new Toolbar.b()
  {
    public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
    {
      return l.this.Wm.onMenuItemSelected(0, paramAnonymousMenuItem);
    }
  };

  l(Toolbar paramToolbar, CharSequence paramCharSequence, Window.Callback paramCallback)
  {
    this.Wk = new bd(paramToolbar, false);
    this.Wm = new c(paramCallback);
    this.Wk.setWindowCallback(this.Wm);
    paramToolbar.setOnMenuItemClickListener(this.Wr);
    this.Wk.setWindowTitle(paramCharSequence);
  }

  private void setDisplayOptions(int paramInt1, int paramInt2)
  {
    int i = this.Wk.getDisplayOptions();
    this.Wk.setDisplayOptions(i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }

  public final void K(boolean paramBoolean)
  {
  }

  public final void L(boolean paramBoolean)
  {
  }

  public final void M(boolean paramBoolean)
  {
    if (paramBoolean == this.Wo);
    while (true)
    {
      return;
      this.Wo = paramBoolean;
      int i = this.Wp.size();
      for (int j = 0; j < i; j++)
        this.Wp.get(j);
    }
  }

  public final boolean b(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 1)
      ff();
    return true;
  }

  public final boolean collapseActionView()
  {
    if (this.Wk.hasExpandedActionView())
      this.Wk.collapseActionView();
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void fa()
  {
    this.Wk.setIcon(2130840857);
  }

  public final void fb()
  {
    setDisplayOptions(0, 2);
  }

  public final void fc()
  {
    setDisplayOptions(0, 8);
  }

  public final void fd()
  {
    setDisplayOptions(16, 16);
  }

  public final boolean ff()
  {
    return this.Wk.showOverflowMenu();
  }

  public final boolean fg()
  {
    return this.Wk.hideOverflowMenu();
  }

  public final boolean fh()
  {
    this.Wk.hW().removeCallbacks(this.Wq);
    s.b(this.Wk.hW(), this.Wq);
    return true;
  }

  public final View getCustomView()
  {
    return this.Wk.getCustomView();
  }

  public final int getDisplayOptions()
  {
    return this.Wk.getDisplayOptions();
  }

  public final int getHeight()
  {
    return this.Wk.getHeight();
  }

  final Menu getMenu()
  {
    if (!this.Wn)
    {
      this.Wk.a(new a(), new b());
      this.Wn = true;
    }
    return this.Wk.getMenu();
  }

  public final Context getThemedContext()
  {
    return this.Wk.getContext();
  }

  public final CharSequence getTitle()
  {
    return this.Wk.getTitle();
  }

  public final void hide()
  {
    this.Wk.setVisibility(8);
  }

  public final boolean isShowing()
  {
    if (this.Wk.getVisibility() == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }

  final void onDestroy()
  {
    this.Wk.hW().removeCallbacks(this.Wq);
  }

  public final boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    Menu localMenu = getMenu();
    int i;
    if (localMenu != null)
    {
      if (paramKeyEvent == null)
        break label58;
      i = paramKeyEvent.getDeviceId();
      if (KeyCharacterMap.load(i).getKeyboardType() == 1)
        break label64;
    }
    label58: label64: for (bool = true; ; bool = false)
    {
      localMenu.setQwertyMode(bool);
      bool = localMenu.performShortcut(paramInt, paramKeyEvent, 0);
      return bool;
      i = -1;
      break;
    }
  }

  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.Wk.setBackgroundDrawable(paramDrawable);
  }

  public final void setCustomView(int paramInt)
  {
    setCustomView(LayoutInflater.from(this.Wk.getContext()).inflate(paramInt, this.Wk.hW(), false));
  }

  public final void setCustomView(View paramView)
  {
    ActionBar.LayoutParams localLayoutParams = new ActionBar.LayoutParams();
    if (paramView != null)
      paramView.setLayoutParams(localLayoutParams);
    this.Wk.setCustomView(paramView);
  }

  public final void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 4; ; i = 0)
    {
      setDisplayOptions(i, 4);
      return;
    }
  }

  @SuppressLint({"WrongConstant"})
  public final void setDisplayOptions(int paramInt)
  {
    setDisplayOptions(paramInt, -1);
  }

  public final void setElevation(float paramFloat)
  {
    s.h(this.Wk.hW(), paramFloat);
  }

  public final void setHomeActionContentDescription(int paramInt)
  {
    this.Wk.setNavigationContentDescription(paramInt);
  }

  public final void setLogo(Drawable paramDrawable)
  {
    this.Wk.setLogo(paramDrawable);
  }

  public final void setWindowTitle(CharSequence paramCharSequence)
  {
    this.Wk.setWindowTitle(paramCharSequence);
  }

  public final void show()
  {
    this.Wk.setVisibility(0);
  }

  final class a
    implements o.a
  {
    private boolean Vt;

    a()
    {
    }

    public final void a(h paramh, boolean paramBoolean)
    {
      if (this.Vt);
      while (true)
      {
        return;
        this.Vt = true;
        l.this.Wk.dismissPopupMenus();
        if (l.this.Wm != null)
          l.this.Wm.onPanelClosed(108, paramh);
        this.Vt = false;
      }
    }

    public final boolean d(h paramh)
    {
      if (l.this.Wm != null)
        l.this.Wm.onMenuOpened(108, paramh);
      for (boolean bool = true; ; bool = false)
        return bool;
    }
  }

  final class b
    implements h.a
  {
    b()
    {
    }

    public final boolean a(h paramh, MenuItem paramMenuItem)
    {
      return false;
    }

    public final void b(h paramh)
    {
      if (l.this.Wm != null)
      {
        if (!l.this.Wk.isOverflowMenuShowing())
          break label41;
        l.this.Wm.onPanelClosed(108, paramh);
      }
      while (true)
      {
        return;
        label41: if (l.this.Wm.onPreparePanel(0, null, paramh))
          l.this.Wm.onMenuOpened(108, paramh);
      }
    }
  }

  final class c extends i
  {
    public c(Window.Callback arg2)
    {
      super();
    }

    public final View onCreatePanelView(int paramInt)
    {
      if (paramInt == 0);
      for (View localView = new View(l.this.Wk.getContext()); ; localView = super.onCreatePanelView(paramInt))
        return localView;
    }

    public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
    {
      boolean bool = super.onPreparePanel(paramInt, paramView, paramMenu);
      if ((bool) && (!l.this.Wl))
      {
        l.this.Wk.gX();
        l.this.Wl = true;
      }
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.l
 * JD-Core Version:    0.6.2
 */