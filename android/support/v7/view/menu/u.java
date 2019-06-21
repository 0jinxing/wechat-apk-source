package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class u extends h
  implements SubMenu
{
  public h acs;
  private j act;

  public u(Context paramContext, h paramh, j paramj)
  {
    super(paramContext);
    this.acs = paramh;
    this.act = paramj;
  }

  public final void a(h.a parama)
  {
    this.acs.a(parama);
  }

  final boolean d(h paramh, MenuItem paramMenuItem)
  {
    if ((super.d(paramh, paramMenuItem)) || (this.acs.d(paramh, paramMenuItem)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean g(j paramj)
  {
    return this.acs.g(paramj);
  }

  public final h gE()
  {
    return this.acs.gE();
  }

  public MenuItem getItem()
  {
    return this.act;
  }

  public final String gu()
  {
    int i;
    if (this.act != null)
    {
      i = this.act.getItemId();
      if (i != 0)
        break label28;
    }
    label28: for (String str = null; ; str = super.gu() + ":" + i)
    {
      return str;
      i = 0;
      break;
    }
  }

  public final boolean gv()
  {
    return this.acs.gv();
  }

  public final boolean gw()
  {
    return this.acs.gw();
  }

  public final boolean h(j paramj)
  {
    return this.acs.h(paramj);
  }

  public SubMenu setHeaderIcon(int paramInt)
  {
    super.a(0, null, paramInt, null, null);
    return (SubMenu)this;
  }

  public SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    super.a(0, null, 0, paramDrawable, null);
    return (SubMenu)this;
  }

  public SubMenu setHeaderTitle(int paramInt)
  {
    super.a(paramInt, null, 0, null, null);
    return (SubMenu)this;
  }

  public SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    super.a(0, paramCharSequence, 0, null, null);
    return (SubMenu)this;
  }

  public SubMenu setHeaderView(View paramView)
  {
    super.a(0, null, 0, null, paramView);
    return (SubMenu)this;
  }

  public SubMenu setIcon(int paramInt)
  {
    this.act.setIcon(paramInt);
    return this;
  }

  public SubMenu setIcon(Drawable paramDrawable)
  {
    this.act.setIcon(paramDrawable);
    return this;
  }

  public void setQwertyMode(boolean paramBoolean)
  {
    this.acs.setQwertyMode(paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.u
 * JD-Core Version:    0.6.2
 */