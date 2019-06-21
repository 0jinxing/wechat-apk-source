package com.tencent.mm.ui.base;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class l
  implements ContextMenu
{
  public CharSequence abz;
  private Context mContext;
  public List<MenuItem> yvT;

  public l(Context paramContext)
  {
    AppMethodBeat.i(112533);
    this.mContext = paramContext;
    this.yvT = new ArrayList();
    AppMethodBeat.o(112533);
  }

  public final MenuItem a(int paramInt1, int paramInt2, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(112547);
    m localm = new m(this.mContext, paramInt1, 0);
    paramCharSequence = new SpannableString(paramCharSequence);
    paramCharSequence.setSpan(new ForegroundColorSpan(paramInt2), 0, paramCharSequence.length(), 0);
    localm.setTitle(paramCharSequence);
    this.yvT.add(localm);
    AppMethodBeat.o(112547);
    return localm;
  }

  public final MenuItem a(int paramInt1, CharSequence paramCharSequence, int paramInt2)
  {
    AppMethodBeat.i(112546);
    m localm = new m(this.mContext, paramInt1, 0);
    localm.setTitle(paramCharSequence);
    localm.setIcon(paramInt2);
    this.yvT.add(localm);
    AppMethodBeat.o(112546);
    return localm;
  }

  public final MenuItem a(int paramInt1, CharSequence paramCharSequence, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(112542);
    m localm = new m(this.mContext, paramInt1, 0);
    localm.setTitle(paramCharSequence);
    localm.setIcon(paramInt2);
    localm.xeS = paramBoolean;
    this.yvT.add(localm);
    AppMethodBeat.o(112542);
    return localm;
  }

  public final MenuItem a(int paramInt, CharSequence paramCharSequence, Drawable paramDrawable)
  {
    AppMethodBeat.i(112540);
    m localm = new m(this.mContext, paramInt, 0);
    localm.setTitle(paramCharSequence);
    localm.setIcon(paramDrawable);
    this.yvT.add(localm);
    AppMethodBeat.o(112540);
    return localm;
  }

  public final MenuItem a(int paramInt, CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    AppMethodBeat.i(112543);
    m localm = new m(this.mContext, paramInt, 0);
    localm.setTitle(paramCharSequence1);
    localm.mKB = paramCharSequence2;
    localm.setIcon(0);
    this.yvT.add(localm);
    AppMethodBeat.o(112543);
    return localm;
  }

  public final MenuItem a(int paramInt, CharSequence paramCharSequence1, CharSequence paramCharSequence2, Drawable paramDrawable, boolean paramBoolean)
  {
    AppMethodBeat.i(112541);
    m localm = new m(this.mContext, paramInt, 0);
    localm.setTitle(paramCharSequence1);
    localm.mKB = paramCharSequence2;
    localm.setIcon(paramDrawable);
    localm.xeS = paramBoolean;
    this.yvT.add(localm);
    AppMethodBeat.o(112541);
    return localm;
  }

  public final MenuItem add(int paramInt)
  {
    AppMethodBeat.i(112537);
    m localm = new m(this.mContext, 0, 0);
    localm.setTitle(paramInt);
    this.yvT.add(localm);
    AppMethodBeat.o(112537);
    return localm;
  }

  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(112535);
    m localm = new m(this.mContext, paramInt2, paramInt1);
    localm.setTitle(paramInt4);
    this.yvT.add(localm);
    AppMethodBeat.o(112535);
    return localm;
  }

  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(112536);
    m localm = new m(this.mContext, paramInt2, paramInt1);
    localm.setTitle(paramCharSequence);
    this.yvT.add(localm);
    AppMethodBeat.o(112536);
    return localm;
  }

  public final MenuItem add(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(112538);
    m localm = new m(this.mContext, 0, 0);
    localm.setTitle(paramCharSequence);
    this.yvT.add(localm);
    AppMethodBeat.o(112538);
    return localm;
  }

  public final int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    return 0;
  }

  public final SubMenu addSubMenu(int paramInt)
  {
    return null;
  }

  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return null;
  }

  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return null;
  }

  public final SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return null;
  }

  public final MenuItem ax(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(112539);
    m localm = new m(this.mContext, paramInt1, 0);
    localm.setTitle(paramInt2);
    localm.setIcon(paramInt3);
    this.yvT.add(localm);
    AppMethodBeat.o(112539);
    return localm;
  }

  public final void clear()
  {
    AppMethodBeat.i(112550);
    Iterator localIterator = this.yvT.iterator();
    while (localIterator.hasNext())
    {
      MenuItem localMenuItem = (MenuItem)localIterator.next();
      ((m)localMenuItem).yvW = null;
      ((m)localMenuItem).setOnMenuItemClickListener(null);
    }
    this.yvT.clear();
    this.abz = null;
    AppMethodBeat.o(112550);
  }

  public final void clearHeader()
  {
  }

  public final void close()
  {
  }

  public final boolean dzR()
  {
    AppMethodBeat.i(112534);
    boolean bool;
    if (this.yvT.size() == 0)
    {
      bool = true;
      AppMethodBeat.o(112534);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112534);
    }
  }

  public final MenuItem e(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(112545);
    m localm = new m(this.mContext, paramInt, 0);
    localm.setTitle(paramCharSequence);
    this.yvT.add(localm);
    AppMethodBeat.o(112545);
    return localm;
  }

  public final MenuItem findItem(int paramInt)
  {
    AppMethodBeat.i(112551);
    Iterator localIterator = this.yvT.iterator();
    MenuItem localMenuItem;
    while (localIterator.hasNext())
    {
      localMenuItem = (MenuItem)localIterator.next();
      if (localMenuItem.getItemId() == paramInt)
        AppMethodBeat.o(112551);
    }
    while (true)
    {
      return localMenuItem;
      localMenuItem = null;
      AppMethodBeat.o(112551);
    }
  }

  public final MenuItem getItem(int paramInt)
  {
    AppMethodBeat.i(112553);
    MenuItem localMenuItem = (MenuItem)this.yvT.get(paramInt);
    AppMethodBeat.o(112553);
    return localMenuItem;
  }

  public final boolean hasVisibleItems()
  {
    return false;
  }

  public final MenuItem hi(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112544);
    m localm = new m(this.mContext, paramInt1, 0);
    localm.setTitle(paramInt2);
    this.yvT.add(localm);
    AppMethodBeat.o(112544);
    return localm;
  }

  public final MenuItem i(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(112548);
    if (paramMenuItem != null)
      this.yvT.add(paramMenuItem);
    AppMethodBeat.o(112548);
    return null;
  }

  public final boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }

  public final boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return false;
  }

  public final boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    return false;
  }

  public final void removeGroup(int paramInt)
  {
  }

  public final void removeItem(int paramInt)
  {
    AppMethodBeat.i(112549);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.yvT.iterator();
    while (localIterator.hasNext())
    {
      MenuItem localMenuItem = (MenuItem)localIterator.next();
      if (localMenuItem.getItemId() == paramInt)
        localArrayList.add(localMenuItem);
    }
    this.yvT.removeAll(localArrayList);
    AppMethodBeat.o(112549);
  }

  public final void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
  }

  public final void setGroupVisible(int paramInt, boolean paramBoolean)
  {
  }

  public final ContextMenu setHeaderIcon(int paramInt)
  {
    return this;
  }

  public final ContextMenu setHeaderIcon(Drawable paramDrawable)
  {
    return this;
  }

  public final ContextMenu setHeaderTitle(int paramInt)
  {
    AppMethodBeat.i(112554);
    Object localObject;
    if (paramInt > 0)
    {
      localObject = setHeaderTitle(this.mContext.getString(paramInt));
      AppMethodBeat.o(112554);
    }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(112554);
      localObject = this;
    }
  }

  public final ContextMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    while (true)
    {
      return this;
      this.abz = paramCharSequence;
    }
  }

  public final ContextMenu setHeaderView(View paramView)
  {
    return this;
  }

  public final void setQwertyMode(boolean paramBoolean)
  {
  }

  public final int size()
  {
    AppMethodBeat.i(112552);
    int i;
    if (this.yvT == null)
    {
      i = 0;
      AppMethodBeat.o(112552);
    }
    while (true)
    {
      return i;
      i = this.yvT.size();
      AppMethodBeat.o(112552);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.l
 * JD-Core Version:    0.6.2
 */