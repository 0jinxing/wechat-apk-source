package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.b.a.b;
import android.support.v4.f.a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

abstract class c<T> extends d<T>
{
  Map<b, MenuItem> aap;
  Map<android.support.v4.b.a.c, SubMenu> aaq;
  final Context mContext;

  c(Context paramContext, T paramT)
  {
    super(paramT);
    this.mContext = paramContext;
  }

  final SubMenu a(SubMenu paramSubMenu)
  {
    if ((paramSubMenu instanceof android.support.v4.b.a.c))
    {
      android.support.v4.b.a.c localc = (android.support.v4.b.a.c)paramSubMenu;
      if (this.aaq == null)
        this.aaq = new a();
      SubMenu localSubMenu = (SubMenu)this.aaq.get(localc);
      paramSubMenu = localSubMenu;
      if (localSubMenu == null)
      {
        paramSubMenu = new v(this.mContext, localc);
        this.aaq.put(localc, paramSubMenu);
      }
    }
    while (true)
      return paramSubMenu;
  }

  final MenuItem e(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
    {
      b localb = (b)paramMenuItem;
      if (this.aap == null)
        this.aap = new a();
      MenuItem localMenuItem = (MenuItem)this.aap.get(paramMenuItem);
      paramMenuItem = localMenuItem;
      if (localMenuItem == null)
      {
        paramMenuItem = q.a(this.mContext, localb);
        this.aap.put(localb, paramMenuItem);
      }
    }
    while (true)
      return paramMenuItem;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.c
 * JD-Core Version:    0.6.2
 */