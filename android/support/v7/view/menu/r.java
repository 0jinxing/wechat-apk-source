package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.b.a.a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class r extends c<a>
  implements Menu
{
  r(Context paramContext, a parama)
  {
    super(paramContext, parama);
  }

  public MenuItem add(int paramInt)
  {
    return e(((a)this.aar).add(paramInt));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return e(((a)this.aar).add(paramInt1, paramInt2, paramInt3, paramInt4));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return e(((a)this.aar).add(paramInt1, paramInt2, paramInt3, paramCharSequence));
  }

  public MenuItem add(CharSequence paramCharSequence)
  {
    return e(((a)this.aar).add(paramCharSequence));
  }

  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    MenuItem[] arrayOfMenuItem = null;
    if (paramArrayOfMenuItem != null)
      arrayOfMenuItem = new MenuItem[paramArrayOfMenuItem.length];
    paramInt3 = ((a)this.aar).addIntentOptions(paramInt1, paramInt2, paramInt3, paramComponentName, paramArrayOfIntent, paramIntent, paramInt4, arrayOfMenuItem);
    if (arrayOfMenuItem != null)
    {
      paramInt1 = 0;
      paramInt2 = arrayOfMenuItem.length;
      while (paramInt1 < paramInt2)
      {
        paramArrayOfMenuItem[paramInt1] = e(arrayOfMenuItem[paramInt1]);
        paramInt1++;
      }
    }
    return paramInt3;
  }

  public SubMenu addSubMenu(int paramInt)
  {
    return a(((a)this.aar).addSubMenu(paramInt));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(((a)this.aar).addSubMenu(paramInt1, paramInt2, paramInt3, paramInt4));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(((a)this.aar).addSubMenu(paramInt1, paramInt2, paramInt3, paramCharSequence));
  }

  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return a(((a)this.aar).addSubMenu(paramCharSequence));
  }

  public void clear()
  {
    if (this.aap != null)
      this.aap.clear();
    if (this.aaq != null)
      this.aaq.clear();
    ((a)this.aar).clear();
  }

  public void close()
  {
    ((a)this.aar).close();
  }

  public MenuItem findItem(int paramInt)
  {
    return e(((a)this.aar).findItem(paramInt));
  }

  public MenuItem getItem(int paramInt)
  {
    return e(((a)this.aar).getItem(paramInt));
  }

  public boolean hasVisibleItems()
  {
    return ((a)this.aar).hasVisibleItems();
  }

  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return ((a)this.aar).isShortcutKey(paramInt, paramKeyEvent);
  }

  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return ((a)this.aar).performIdentifierAction(paramInt1, paramInt2);
  }

  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    return ((a)this.aar).performShortcut(paramInt1, paramKeyEvent, paramInt2);
  }

  public void removeGroup(int paramInt)
  {
    if (this.aap != null)
    {
      Iterator localIterator = this.aap.keySet().iterator();
      while (localIterator.hasNext())
        if (paramInt == ((MenuItem)localIterator.next()).getGroupId())
          localIterator.remove();
    }
    ((a)this.aar).removeGroup(paramInt);
  }

  public void removeItem(int paramInt)
  {
    if (this.aap != null)
    {
      Iterator localIterator = this.aap.keySet().iterator();
      while (localIterator.hasNext())
        if (paramInt == ((MenuItem)localIterator.next()).getItemId())
          localIterator.remove();
    }
    ((a)this.aar).removeItem(paramInt);
  }

  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ((a)this.aar).setGroupCheckable(paramInt, paramBoolean1, paramBoolean2);
  }

  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    ((a)this.aar).setGroupEnabled(paramInt, paramBoolean);
  }

  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    ((a)this.aar).setGroupVisible(paramInt, paramBoolean);
  }

  public void setQwertyMode(boolean paramBoolean)
  {
    ((a)this.aar).setQwertyMode(paramBoolean);
  }

  public int size()
  {
    return ((a)this.aar).size();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.r
 * JD-Core Version:    0.6.2
 */