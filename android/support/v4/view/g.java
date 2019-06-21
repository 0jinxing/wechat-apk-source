package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.View;

public final class g
{
  static final c Ml;

  static
  {
    if (Build.VERSION.SDK_INT >= 26);
    for (Ml = new a(); ; Ml = new b())
      return;
  }

  public static MenuItem a(MenuItem paramMenuItem, b paramb)
  {
    Object localObject = paramMenuItem;
    if ((paramMenuItem instanceof android.support.v4.b.a.b))
      localObject = ((android.support.v4.b.a.b)paramMenuItem).a(paramb);
    return localObject;
  }

  @Deprecated
  public static MenuItem a(MenuItem paramMenuItem, d paramd)
  {
    return paramMenuItem.setOnActionExpandListener(new MenuItem.OnActionExpandListener()
    {
      public final boolean onMenuItemActionCollapse(MenuItem paramAnonymousMenuItem)
      {
        return this.Mm.ep();
      }

      public final boolean onMenuItemActionExpand(MenuItem paramAnonymousMenuItem)
      {
        return this.Mm.eo();
      }
    });
  }

  @Deprecated
  public static MenuItem a(MenuItem paramMenuItem, View paramView)
  {
    return paramMenuItem.setActionView(paramView);
  }

  @Deprecated
  public static View a(MenuItem paramMenuItem)
  {
    return paramMenuItem.getActionView();
  }

  public static void a(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    if ((paramMenuItem instanceof android.support.v4.b.a.b))
      ((android.support.v4.b.a.b)paramMenuItem).setNumericShortcut(paramChar, paramInt);
    while (true)
    {
      return;
      Ml.a(paramMenuItem, paramChar, paramInt);
    }
  }

  @Deprecated
  public static void a(MenuItem paramMenuItem, int paramInt)
  {
    paramMenuItem.setShowAsAction(paramInt);
  }

  public static void a(MenuItem paramMenuItem, ColorStateList paramColorStateList)
  {
    if ((paramMenuItem instanceof android.support.v4.b.a.b))
      ((android.support.v4.b.a.b)paramMenuItem).setIconTintList(paramColorStateList);
    while (true)
    {
      return;
      Ml.a(paramMenuItem, paramColorStateList);
    }
  }

  public static void a(MenuItem paramMenuItem, PorterDuff.Mode paramMode)
  {
    if ((paramMenuItem instanceof android.support.v4.b.a.b))
      ((android.support.v4.b.a.b)paramMenuItem).setIconTintMode(paramMode);
    while (true)
    {
      return;
      Ml.a(paramMenuItem, paramMode);
    }
  }

  public static void a(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    if ((paramMenuItem instanceof android.support.v4.b.a.b))
      ((android.support.v4.b.a.b)paramMenuItem).i(paramCharSequence);
    while (true)
    {
      return;
      Ml.a(paramMenuItem, paramCharSequence);
    }
  }

  public static void b(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    if ((paramMenuItem instanceof android.support.v4.b.a.b))
      ((android.support.v4.b.a.b)paramMenuItem).setAlphabeticShortcut(paramChar, paramInt);
    while (true)
    {
      return;
      Ml.b(paramMenuItem, paramChar, paramInt);
    }
  }

  public static void b(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    if ((paramMenuItem instanceof android.support.v4.b.a.b))
      ((android.support.v4.b.a.b)paramMenuItem).j(paramCharSequence);
    while (true)
    {
      return;
      Ml.b(paramMenuItem, paramCharSequence);
    }
  }

  @Deprecated
  public static boolean b(MenuItem paramMenuItem)
  {
    return paramMenuItem.expandActionView();
  }

  @Deprecated
  public static boolean c(MenuItem paramMenuItem)
  {
    return paramMenuItem.collapseActionView();
  }

  static final class a extends g.b
  {
    public final void a(MenuItem paramMenuItem, char paramChar, int paramInt)
    {
      paramMenuItem.setNumericShortcut(paramChar, paramInt);
    }

    public final void a(MenuItem paramMenuItem, ColorStateList paramColorStateList)
    {
      paramMenuItem.setIconTintList(paramColorStateList);
    }

    public final void a(MenuItem paramMenuItem, PorterDuff.Mode paramMode)
    {
      paramMenuItem.setIconTintMode(paramMode);
    }

    public final void a(MenuItem paramMenuItem, CharSequence paramCharSequence)
    {
      paramMenuItem.setContentDescription(paramCharSequence);
    }

    public final void b(MenuItem paramMenuItem, char paramChar, int paramInt)
    {
      paramMenuItem.setAlphabeticShortcut(paramChar, paramInt);
    }

    public final void b(MenuItem paramMenuItem, CharSequence paramCharSequence)
    {
      paramMenuItem.setTooltipText(paramCharSequence);
    }
  }

  static class b
    implements g.c
  {
    public void a(MenuItem paramMenuItem, char paramChar, int paramInt)
    {
    }

    public void a(MenuItem paramMenuItem, ColorStateList paramColorStateList)
    {
    }

    public void a(MenuItem paramMenuItem, PorterDuff.Mode paramMode)
    {
    }

    public void a(MenuItem paramMenuItem, CharSequence paramCharSequence)
    {
    }

    public void b(MenuItem paramMenuItem, char paramChar, int paramInt)
    {
    }

    public void b(MenuItem paramMenuItem, CharSequence paramCharSequence)
    {
    }
  }

  static abstract interface c
  {
    public abstract void a(MenuItem paramMenuItem, char paramChar, int paramInt);

    public abstract void a(MenuItem paramMenuItem, ColorStateList paramColorStateList);

    public abstract void a(MenuItem paramMenuItem, PorterDuff.Mode paramMode);

    public abstract void a(MenuItem paramMenuItem, CharSequence paramCharSequence);

    public abstract void b(MenuItem paramMenuItem, char paramChar, int paramInt);

    public abstract void b(MenuItem paramMenuItem, CharSequence paramCharSequence);
  }

  @Deprecated
  public static abstract interface d
  {
    public abstract boolean eo();

    public abstract boolean ep();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.g
 * JD-Core Version:    0.6.2
 */