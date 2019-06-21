package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m
  implements MenuItem
{
  private int Zb;
  private int Zi;
  public String hAh;
  private int iconId;
  private Intent intent;
  private Context mContext;
  public CharSequence mKB = null;
  private CharSequence title;
  public boolean xeS = false;
  private int yvU;
  private Drawable yvV;
  public ContextMenu.ContextMenuInfo yvW;
  private MenuItem.OnMenuItemClickListener yvX;

  public m(Context paramContext, int paramInt1, int paramInt2)
  {
    this.mContext = paramContext;
    this.Zi = paramInt1;
    this.Zb = paramInt2;
  }

  public final boolean collapseActionView()
  {
    return false;
  }

  public final boolean expandActionView()
  {
    return false;
  }

  public final ActionProvider getActionProvider()
  {
    return null;
  }

  public final View getActionView()
  {
    return null;
  }

  public final char getAlphabeticShortcut()
  {
    return '\000';
  }

  public final int getGroupId()
  {
    return this.Zb;
  }

  public final Drawable getIcon()
  {
    AppMethodBeat.i(112556);
    Drawable localDrawable;
    if (this.yvV == null)
      if ((this.iconId != 0) && (this.mContext != null))
      {
        localDrawable = this.mContext.getResources().getDrawable(this.iconId);
        AppMethodBeat.o(112556);
      }
    while (true)
    {
      return localDrawable;
      localDrawable = null;
      AppMethodBeat.o(112556);
      continue;
      localDrawable = this.yvV;
      AppMethodBeat.o(112556);
    }
  }

  public final Intent getIntent()
  {
    return this.intent;
  }

  public final int getItemId()
  {
    return this.Zi;
  }

  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.yvW;
  }

  public final char getNumericShortcut()
  {
    return '\000';
  }

  public final int getOrder()
  {
    return 0;
  }

  public final SubMenu getSubMenu()
  {
    return null;
  }

  public final CharSequence getTitle()
  {
    AppMethodBeat.i(112555);
    Object localObject;
    if (this.title == null)
      if ((this.yvU != 0) && (this.mContext != null))
      {
        localObject = this.mContext.getString(this.yvU);
        AppMethodBeat.o(112555);
      }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(112555);
      continue;
      localObject = this.title;
      AppMethodBeat.o(112555);
    }
  }

  public final CharSequence getTitleCondensed()
  {
    return null;
  }

  public final boolean hasSubMenu()
  {
    return false;
  }

  public final boolean isActionViewExpanded()
  {
    return false;
  }

  public final boolean isCheckable()
  {
    return false;
  }

  public final boolean isChecked()
  {
    return false;
  }

  public final boolean isEnabled()
  {
    return true;
  }

  public final boolean isVisible()
  {
    return true;
  }

  public final boolean performClick()
  {
    AppMethodBeat.i(112557);
    boolean bool;
    if (this.yvX != null)
    {
      bool = this.yvX.onMenuItemClick(this);
      AppMethodBeat.o(112557);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112557);
    }
  }

  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    return null;
  }

  public final MenuItem setActionView(int paramInt)
  {
    return null;
  }

  public final MenuItem setActionView(View paramView)
  {
    return null;
  }

  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    return this;
  }

  public final MenuItem setCheckable(boolean paramBoolean)
  {
    return this;
  }

  public final MenuItem setChecked(boolean paramBoolean)
  {
    return this;
  }

  public final MenuItem setEnabled(boolean paramBoolean)
  {
    return this;
  }

  public final MenuItem setIcon(int paramInt)
  {
    this.iconId = paramInt;
    return this;
  }

  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.yvV = paramDrawable;
    return this;
  }

  public final MenuItem setIntent(Intent paramIntent)
  {
    this.intent = paramIntent;
    return this;
  }

  public final MenuItem setNumericShortcut(char paramChar)
  {
    return this;
  }

  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    return null;
  }

  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.yvX = paramOnMenuItemClickListener;
    return this;
  }

  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    return this;
  }

  public final void setShowAsAction(int paramInt)
  {
  }

  public final MenuItem setShowAsActionFlags(int paramInt)
  {
    return null;
  }

  public final MenuItem setTitle(int paramInt)
  {
    this.yvU = paramInt;
    return this;
  }

  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.title = paramCharSequence;
    return this;
  }

  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    return this;
  }

  public final MenuItem setVisible(boolean paramBoolean)
  {
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.m
 * JD-Core Version:    0.6.2
 */