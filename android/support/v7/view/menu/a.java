package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class a
  implements android.support.v4.b.a.b
{
  private int Dj = 16;
  private CharSequence IT;
  private final int ZM;
  private final int ZN;
  private final int ZO;
  private CharSequence ZP;
  private char ZQ;
  private int ZR = 4096;
  private char ZS;
  private int ZT = 4096;
  private Drawable ZU;
  private int ZV = 0;
  private MenuItem.OnMenuItemClickListener ZW;
  private CharSequence ZX;
  private CharSequence ZY;
  private PorterDuff.Mode ZZ = null;
  private boolean aaa = false;
  private boolean aab = false;
  private ColorStateList lE = null;
  private Context mContext;
  private final int mId;
  private Intent mIntent;

  public a(Context paramContext, CharSequence paramCharSequence)
  {
    this.mContext = paramContext;
    this.mId = 16908332;
    this.ZM = 0;
    this.ZN = 0;
    this.ZO = 0;
    this.IT = paramCharSequence;
  }

  private void gh()
  {
    if ((this.ZU != null) && ((this.aaa) || (this.aab)))
    {
      this.ZU = android.support.v4.a.a.a.f(this.ZU);
      this.ZU = this.ZU.mutate();
      if (this.aaa)
        android.support.v4.a.a.a.a(this.ZU, this.lE);
      if (this.aab)
        android.support.v4.a.a.a.a(this.ZU, this.ZZ);
    }
  }

  public final android.support.v4.b.a.b a(android.support.v4.view.b paramb)
  {
    throw new UnsupportedOperationException();
  }

  public final boolean collapseActionView()
  {
    return false;
  }

  public final android.support.v4.view.b dG()
  {
    return null;
  }

  public final boolean expandActionView()
  {
    return false;
  }

  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException();
  }

  public final View getActionView()
  {
    return null;
  }

  public final int getAlphabeticModifiers()
  {
    return this.ZT;
  }

  public final char getAlphabeticShortcut()
  {
    return this.ZS;
  }

  public final CharSequence getContentDescription()
  {
    return this.ZX;
  }

  public final int getGroupId()
  {
    return this.ZM;
  }

  public final Drawable getIcon()
  {
    return this.ZU;
  }

  public final ColorStateList getIconTintList()
  {
    return this.lE;
  }

  public final PorterDuff.Mode getIconTintMode()
  {
    return this.ZZ;
  }

  public final Intent getIntent()
  {
    return this.mIntent;
  }

  public final int getItemId()
  {
    return this.mId;
  }

  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }

  public final int getNumericModifiers()
  {
    return this.ZR;
  }

  public final char getNumericShortcut()
  {
    return this.ZQ;
  }

  public final int getOrder()
  {
    return this.ZO;
  }

  public final SubMenu getSubMenu()
  {
    return null;
  }

  public final CharSequence getTitle()
  {
    return this.IT;
  }

  public final CharSequence getTitleCondensed()
  {
    if (this.ZP != null);
    for (CharSequence localCharSequence = this.ZP; ; localCharSequence = this.IT)
      return localCharSequence;
  }

  public final CharSequence getTooltipText()
  {
    return this.ZY;
  }

  public final boolean hasSubMenu()
  {
    return false;
  }

  public final android.support.v4.b.a.b i(CharSequence paramCharSequence)
  {
    this.ZX = paramCharSequence;
    return this;
  }

  public final boolean isActionViewExpanded()
  {
    return false;
  }

  public final boolean isCheckable()
  {
    if ((this.Dj & 0x1) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isChecked()
  {
    if ((this.Dj & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isEnabled()
  {
    if ((this.Dj & 0x10) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isVisible()
  {
    if ((this.Dj & 0x8) == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final android.support.v4.b.a.b j(CharSequence paramCharSequence)
  {
    this.ZY = paramCharSequence;
    return this;
  }

  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException();
  }

  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    this.ZS = Character.toLowerCase(paramChar);
    return this;
  }

  public final MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    this.ZS = Character.toLowerCase(paramChar);
    this.ZT = KeyEvent.normalizeMetaState(paramInt);
    return this;
  }

  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int i = this.Dj;
    if (paramBoolean);
    for (int j = 1; ; j = 0)
    {
      this.Dj = (j | i & 0xFFFFFFFE);
      return this;
    }
  }

  public final MenuItem setChecked(boolean paramBoolean)
  {
    int i = this.Dj;
    if (paramBoolean);
    for (int j = 2; ; j = 0)
    {
      this.Dj = (j | i & 0xFFFFFFFD);
      return this;
    }
  }

  public final MenuItem setEnabled(boolean paramBoolean)
  {
    int i = this.Dj;
    if (paramBoolean);
    for (int j = 16; ; j = 0)
    {
      this.Dj = (j | i & 0xFFFFFFEF);
      return this;
    }
  }

  public final MenuItem setIcon(int paramInt)
  {
    this.ZV = paramInt;
    this.ZU = android.support.v4.content.b.g(this.mContext, paramInt);
    gh();
    return this;
  }

  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.ZU = paramDrawable;
    this.ZV = 0;
    gh();
    return this;
  }

  public final MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    this.lE = paramColorStateList;
    this.aaa = true;
    gh();
    return this;
  }

  public final MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    this.ZZ = paramMode;
    this.aab = true;
    gh();
    return this;
  }

  public final MenuItem setIntent(Intent paramIntent)
  {
    this.mIntent = paramIntent;
    return this;
  }

  public final MenuItem setNumericShortcut(char paramChar)
  {
    this.ZQ = ((char)paramChar);
    return this;
  }

  public final MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    this.ZQ = ((char)paramChar);
    this.ZR = KeyEvent.normalizeMetaState(paramInt);
    return this;
  }

  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException();
  }

  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.ZW = paramOnMenuItemClickListener;
    return this;
  }

  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.ZQ = ((char)paramChar1);
    this.ZS = Character.toLowerCase(paramChar2);
    return this;
  }

  public final MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    this.ZQ = ((char)paramChar1);
    this.ZR = KeyEvent.normalizeMetaState(paramInt1);
    this.ZS = Character.toLowerCase(paramChar2);
    this.ZT = KeyEvent.normalizeMetaState(paramInt2);
    return this;
  }

  public final void setShowAsAction(int paramInt)
  {
  }

  public final MenuItem setTitle(int paramInt)
  {
    this.IT = this.mContext.getResources().getString(paramInt);
    return this;
  }

  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.IT = paramCharSequence;
    return this;
  }

  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.ZP = paramCharSequence;
    return this;
  }

  public final MenuItem setVisible(boolean paramBoolean)
  {
    int i = this.Dj;
    if (paramBoolean);
    for (int j = 0; ; j = 8)
    {
      this.Dj = (j | i & 0x8);
      return this;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.a
 * JD-Core Version:    0.6.2
 */