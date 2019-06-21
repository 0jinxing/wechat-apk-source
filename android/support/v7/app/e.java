package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.g;
import android.support.v7.view.i;
import android.support.v7.view.menu.h;
import android.support.v7.widget.bc;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;

abstract class e extends d
{
  private static boolean UD;
  private static final boolean UE;
  private static final int[] UF;
  private CharSequence IT;
  final Window Ti;
  final Window.Callback UG;
  final Window.Callback UH;
  final c UI;
  boolean UJ;
  boolean UK;
  boolean UL;
  boolean UM;
  boolean UN;
  private boolean UO;
  boolean UP;
  ActionBar mActionBar;
  final Context mContext;
  MenuInflater mY;

  static
  {
    if (Build.VERSION.SDK_INT < 21);
    for (boolean bool = true; ; bool = false)
    {
      UE = bool;
      if ((bool) && (!UD))
      {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
        {
          public final void uncaughtException(Thread paramAnonymousThread, Throwable paramAnonymousThrowable)
          {
            int i = 0;
            int j = i;
            Object localObject;
            if ((paramAnonymousThrowable instanceof Resources.NotFoundException))
            {
              localObject = paramAnonymousThrowable.getMessage();
              j = i;
              if (localObject != null)
                if (!((String)localObject).contains("drawable"))
                {
                  j = i;
                  if (!((String)localObject).contains("Drawable"));
                }
                else
                {
                  j = 1;
                }
            }
            if (j != 0)
            {
              localObject = new Resources.NotFoundException(paramAnonymousThrowable.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
              ((Throwable)localObject).initCause(paramAnonymousThrowable.getCause());
              ((Throwable)localObject).setStackTrace(paramAnonymousThrowable.getStackTrace());
              this.UQ.uncaughtException(paramAnonymousThread, (Throwable)localObject);
            }
            while (true)
            {
              return;
              this.UQ.uncaughtException(paramAnonymousThread, paramAnonymousThrowable);
            }
          }
        });
        UD = true;
      }
      UF = new int[] { 16842836 };
      return;
    }
  }

  e(Context paramContext, Window paramWindow, c paramc)
  {
    this.mContext = paramContext;
    this.Ti = paramWindow;
    this.UI = paramc;
    this.UG = this.Ti.getCallback();
    if ((this.UG instanceof b))
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    this.UH = a(this.UG);
    this.Ti.setCallback(this.UH);
    paramWindow = bc.a(paramContext, null, UF);
    paramContext = paramWindow.cW(0);
    if (paramContext != null)
      this.Ti.setBackgroundDrawable(paramContext);
    paramWindow.atG.recycle();
  }

  Window.Callback a(Window.Callback paramCallback)
  {
    return new b(paramCallback);
  }

  abstract b b(b.a parama);

  abstract void bd(int paramInt);

  abstract boolean be(int paramInt);

  abstract boolean dispatchKeyEvent(KeyEvent paramKeyEvent);

  public boolean fl()
  {
    return false;
  }

  abstract void fn();

  final Context fo()
  {
    Context localContext = null;
    Object localObject = getSupportActionBar();
    if (localObject != null)
      localContext = ((ActionBar)localObject).getThemedContext();
    localObject = localContext;
    if (localContext == null)
      localObject = this.mContext;
    return localObject;
  }

  public final a.a getDrawerToggleDelegate()
  {
    return new a();
  }

  public final MenuInflater getMenuInflater()
  {
    if (this.mY == null)
    {
      fn();
      if (this.mActionBar == null)
        break label43;
    }
    label43: for (Context localContext = this.mActionBar.getThemedContext(); ; localContext = this.mContext)
    {
      this.mY = new g(localContext);
      return this.mY;
    }
  }

  public final ActionBar getSupportActionBar()
  {
    fn();
    return this.mActionBar;
  }

  final CharSequence getTitle()
  {
    if ((this.UG instanceof Activity));
    for (CharSequence localCharSequence = ((Activity)this.UG).getTitle(); ; localCharSequence = this.IT)
      return localCharSequence;
  }

  abstract void k(CharSequence paramCharSequence);

  public void onDestroy()
  {
    this.UP = true;
  }

  abstract boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent);

  public void onSaveInstanceState(Bundle paramBundle)
  {
  }

  public void onStart()
  {
    this.UO = true;
  }

  public void onStop()
  {
    this.UO = false;
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    this.IT = paramCharSequence;
    k(paramCharSequence);
  }

  final class a
    implements a.a
  {
    a()
    {
    }

    public final void bc(int paramInt)
    {
      ActionBar localActionBar = e.this.getSupportActionBar();
      if (localActionBar != null)
        localActionBar.setHomeActionContentDescription(paramInt);
    }
  }

  class b extends i
  {
    b(Window.Callback arg2)
    {
      super();
    }

    public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      if ((e.this.dispatchKeyEvent(paramKeyEvent)) || (super.dispatchKeyEvent(paramKeyEvent)));
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
    {
      if ((super.dispatchKeyShortcutEvent(paramKeyEvent)) || (e.this.onKeyShortcut(paramKeyEvent.getKeyCode(), paramKeyEvent)));
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public void onContentChanged()
    {
    }

    public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
    {
      if ((paramInt == 0) && (!(paramMenu instanceof h)));
      for (boolean bool = false; ; bool = super.onCreatePanelMenu(paramInt, paramMenu))
        return bool;
    }

    public boolean onMenuOpened(int paramInt, Menu paramMenu)
    {
      super.onMenuOpened(paramInt, paramMenu);
      e.this.be(paramInt);
      return true;
    }

    public void onPanelClosed(int paramInt, Menu paramMenu)
    {
      super.onPanelClosed(paramInt, paramMenu);
      e.this.bd(paramInt);
    }

    public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
    {
      h localh;
      boolean bool1;
      if ((paramMenu instanceof h))
      {
        localh = (h)paramMenu;
        if ((paramInt != 0) || (localh != null))
          break label34;
        bool1 = false;
      }
      while (true)
      {
        return bool1;
        localh = null;
        break;
        label34: if (localh != null)
          localh.abK = true;
        boolean bool2 = super.onPreparePanel(paramInt, paramView, paramMenu);
        bool1 = bool2;
        if (localh != null)
        {
          localh.abK = false;
          bool1 = bool2;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.e
 * JD-Core Version:    0.6.2
 */