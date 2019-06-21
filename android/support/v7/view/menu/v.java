package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

final class v extends r
  implements SubMenu
{
  v(Context paramContext, c paramc)
  {
    super(paramContext, paramc);
  }

  public final void clearHeader()
  {
    ((c)this.aar).clearHeader();
  }

  public final MenuItem getItem()
  {
    return e(((c)this.aar).getItem());
  }

  public final SubMenu setHeaderIcon(int paramInt)
  {
    ((c)this.aar).setHeaderIcon(paramInt);
    return this;
  }

  public final SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    ((c)this.aar).setHeaderIcon(paramDrawable);
    return this;
  }

  public final SubMenu setHeaderTitle(int paramInt)
  {
    ((c)this.aar).setHeaderTitle(paramInt);
    return this;
  }

  public final SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    ((c)this.aar).setHeaderTitle(paramCharSequence);
    return this;
  }

  public final SubMenu setHeaderView(View paramView)
  {
    ((c)this.aar).setHeaderView(paramView);
    return this;
  }

  public final SubMenu setIcon(int paramInt)
  {
    ((c)this.aar).setIcon(paramInt);
    return this;
  }

  public final SubMenu setIcon(Drawable paramDrawable)
  {
    ((c)this.aar).setIcon(paramDrawable);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.v
 * JD-Core Version:    0.6.2
 */