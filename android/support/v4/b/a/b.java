package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import android.view.View;

public abstract interface b extends MenuItem
{
  public abstract b a(android.support.v4.view.b paramb);

  public abstract boolean collapseActionView();

  public abstract android.support.v4.view.b dG();

  public abstract boolean expandActionView();

  public abstract View getActionView();

  public abstract int getAlphabeticModifiers();

  public abstract CharSequence getContentDescription();

  public abstract ColorStateList getIconTintList();

  public abstract PorterDuff.Mode getIconTintMode();

  public abstract int getNumericModifiers();

  public abstract CharSequence getTooltipText();

  public abstract b i(CharSequence paramCharSequence);

  public abstract boolean isActionViewExpanded();

  public abstract b j(CharSequence paramCharSequence);

  public abstract MenuItem setActionView(int paramInt);

  public abstract MenuItem setActionView(View paramView);

  public abstract MenuItem setAlphabeticShortcut(char paramChar, int paramInt);

  public abstract MenuItem setIconTintList(ColorStateList paramColorStateList);

  public abstract MenuItem setIconTintMode(PorterDuff.Mode paramMode);

  public abstract MenuItem setNumericShortcut(char paramChar, int paramInt);

  public abstract MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2);

  public abstract void setShowAsAction(int paramInt);

  public abstract MenuItem setShowAsActionFlags(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.b.a.b
 * JD-Core Version:    0.6.2
 */