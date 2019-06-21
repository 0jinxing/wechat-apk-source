package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class k extends c<android.support.v4.b.a.b>
  implements MenuItem
{
  public Method acb;

  k(Context paramContext, android.support.v4.b.a.b paramb)
  {
    super(paramContext, paramb);
  }

  a a(ActionProvider paramActionProvider)
  {
    return new a(this.mContext, paramActionProvider);
  }

  public boolean collapseActionView()
  {
    return ((android.support.v4.b.a.b)this.aar).collapseActionView();
  }

  public boolean expandActionView()
  {
    return ((android.support.v4.b.a.b)this.aar).expandActionView();
  }

  public ActionProvider getActionProvider()
  {
    Object localObject = ((android.support.v4.b.a.b)this.aar).dG();
    if ((localObject instanceof a));
    for (localObject = ((a)localObject).acc; ; localObject = null)
      return localObject;
  }

  public View getActionView()
  {
    View localView1 = ((android.support.v4.b.a.b)this.aar).getActionView();
    View localView2 = localView1;
    if ((localView1 instanceof b))
      localView2 = (View)((b)localView1).ace;
    return localView2;
  }

  public int getAlphabeticModifiers()
  {
    return ((android.support.v4.b.a.b)this.aar).getAlphabeticModifiers();
  }

  public char getAlphabeticShortcut()
  {
    return ((android.support.v4.b.a.b)this.aar).getAlphabeticShortcut();
  }

  public CharSequence getContentDescription()
  {
    return ((android.support.v4.b.a.b)this.aar).getContentDescription();
  }

  public int getGroupId()
  {
    return ((android.support.v4.b.a.b)this.aar).getGroupId();
  }

  public Drawable getIcon()
  {
    return ((android.support.v4.b.a.b)this.aar).getIcon();
  }

  public ColorStateList getIconTintList()
  {
    return ((android.support.v4.b.a.b)this.aar).getIconTintList();
  }

  public PorterDuff.Mode getIconTintMode()
  {
    return ((android.support.v4.b.a.b)this.aar).getIconTintMode();
  }

  public Intent getIntent()
  {
    return ((android.support.v4.b.a.b)this.aar).getIntent();
  }

  public int getItemId()
  {
    return ((android.support.v4.b.a.b)this.aar).getItemId();
  }

  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((android.support.v4.b.a.b)this.aar).getMenuInfo();
  }

  public int getNumericModifiers()
  {
    return ((android.support.v4.b.a.b)this.aar).getNumericModifiers();
  }

  public char getNumericShortcut()
  {
    return ((android.support.v4.b.a.b)this.aar).getNumericShortcut();
  }

  public int getOrder()
  {
    return ((android.support.v4.b.a.b)this.aar).getOrder();
  }

  public SubMenu getSubMenu()
  {
    return a(((android.support.v4.b.a.b)this.aar).getSubMenu());
  }

  public CharSequence getTitle()
  {
    return ((android.support.v4.b.a.b)this.aar).getTitle();
  }

  public CharSequence getTitleCondensed()
  {
    return ((android.support.v4.b.a.b)this.aar).getTitleCondensed();
  }

  public CharSequence getTooltipText()
  {
    return ((android.support.v4.b.a.b)this.aar).getTooltipText();
  }

  public boolean hasSubMenu()
  {
    return ((android.support.v4.b.a.b)this.aar).hasSubMenu();
  }

  public boolean isActionViewExpanded()
  {
    return ((android.support.v4.b.a.b)this.aar).isActionViewExpanded();
  }

  public boolean isCheckable()
  {
    return ((android.support.v4.b.a.b)this.aar).isCheckable();
  }

  public boolean isChecked()
  {
    return ((android.support.v4.b.a.b)this.aar).isChecked();
  }

  public boolean isEnabled()
  {
    return ((android.support.v4.b.a.b)this.aar).isEnabled();
  }

  public boolean isVisible()
  {
    return ((android.support.v4.b.a.b)this.aar).isVisible();
  }

  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    android.support.v4.b.a.b localb = (android.support.v4.b.a.b)this.aar;
    if (paramActionProvider != null);
    for (paramActionProvider = a(paramActionProvider); ; paramActionProvider = null)
    {
      localb.a(paramActionProvider);
      return this;
    }
  }

  public MenuItem setActionView(int paramInt)
  {
    ((android.support.v4.b.a.b)this.aar).setActionView(paramInt);
    View localView = ((android.support.v4.b.a.b)this.aar).getActionView();
    if ((localView instanceof CollapsibleActionView))
      ((android.support.v4.b.a.b)this.aar).setActionView(new b(localView));
    return this;
  }

  public MenuItem setActionView(View paramView)
  {
    Object localObject = paramView;
    if ((paramView instanceof CollapsibleActionView))
      localObject = new b(paramView);
    ((android.support.v4.b.a.b)this.aar).setActionView((View)localObject);
    return this;
  }

  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((android.support.v4.b.a.b)this.aar).setAlphabeticShortcut(paramChar);
    return this;
  }

  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    ((android.support.v4.b.a.b)this.aar).setAlphabeticShortcut(paramChar, paramInt);
    return this;
  }

  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((android.support.v4.b.a.b)this.aar).setCheckable(paramBoolean);
    return this;
  }

  public MenuItem setChecked(boolean paramBoolean)
  {
    ((android.support.v4.b.a.b)this.aar).setChecked(paramBoolean);
    return this;
  }

  public MenuItem setContentDescription(CharSequence paramCharSequence)
  {
    ((android.support.v4.b.a.b)this.aar).i(paramCharSequence);
    return this;
  }

  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((android.support.v4.b.a.b)this.aar).setEnabled(paramBoolean);
    return this;
  }

  public MenuItem setIcon(int paramInt)
  {
    ((android.support.v4.b.a.b)this.aar).setIcon(paramInt);
    return this;
  }

  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((android.support.v4.b.a.b)this.aar).setIcon(paramDrawable);
    return this;
  }

  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    ((android.support.v4.b.a.b)this.aar).setIconTintList(paramColorStateList);
    return this;
  }

  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    ((android.support.v4.b.a.b)this.aar).setIconTintMode(paramMode);
    return this;
  }

  public MenuItem setIntent(Intent paramIntent)
  {
    ((android.support.v4.b.a.b)this.aar).setIntent(paramIntent);
    return this;
  }

  public MenuItem setNumericShortcut(char paramChar)
  {
    ((android.support.v4.b.a.b)this.aar).setNumericShortcut(paramChar);
    return this;
  }

  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    ((android.support.v4.b.a.b)this.aar).setNumericShortcut(paramChar, paramInt);
    return this;
  }

  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    android.support.v4.b.a.b localb = (android.support.v4.b.a.b)this.aar;
    if (paramOnActionExpandListener != null);
    for (paramOnActionExpandListener = new c(paramOnActionExpandListener); ; paramOnActionExpandListener = null)
    {
      localb.setOnActionExpandListener(paramOnActionExpandListener);
      return this;
    }
  }

  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    android.support.v4.b.a.b localb = (android.support.v4.b.a.b)this.aar;
    if (paramOnMenuItemClickListener != null);
    for (paramOnMenuItemClickListener = new d(paramOnMenuItemClickListener); ; paramOnMenuItemClickListener = null)
    {
      localb.setOnMenuItemClickListener(paramOnMenuItemClickListener);
      return this;
    }
  }

  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((android.support.v4.b.a.b)this.aar).setShortcut(paramChar1, paramChar2);
    return this;
  }

  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    ((android.support.v4.b.a.b)this.aar).setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    return this;
  }

  public void setShowAsAction(int paramInt)
  {
    ((android.support.v4.b.a.b)this.aar).setShowAsAction(paramInt);
  }

  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((android.support.v4.b.a.b)this.aar).setShowAsActionFlags(paramInt);
    return this;
  }

  public MenuItem setTitle(int paramInt)
  {
    ((android.support.v4.b.a.b)this.aar).setTitle(paramInt);
    return this;
  }

  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((android.support.v4.b.a.b)this.aar).setTitle(paramCharSequence);
    return this;
  }

  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((android.support.v4.b.a.b)this.aar).setTitleCondensed(paramCharSequence);
    return this;
  }

  public MenuItem setTooltipText(CharSequence paramCharSequence)
  {
    ((android.support.v4.b.a.b)this.aar).j(paramCharSequence);
    return this;
  }

  public MenuItem setVisible(boolean paramBoolean)
  {
    return ((android.support.v4.b.a.b)this.aar).setVisible(paramBoolean);
  }

  class a extends android.support.v4.view.b
  {
    final ActionProvider acc;

    public a(Context paramActionProvider, ActionProvider arg3)
    {
      super();
      Object localObject;
      this.acc = localObject;
    }

    public final boolean hasSubMenu()
    {
      return this.acc.hasSubMenu();
    }

    public final View onCreateActionView()
    {
      return this.acc.onCreateActionView();
    }

    public final boolean onPerformDefaultAction()
    {
      return this.acc.onPerformDefaultAction();
    }

    public final void onPrepareSubMenu(SubMenu paramSubMenu)
    {
      this.acc.onPrepareSubMenu(k.this.a(paramSubMenu));
    }
  }

  static final class b extends FrameLayout
    implements android.support.v7.view.c
  {
    final CollapsibleActionView ace;

    b(View paramView)
    {
      super();
      this.ace = ((CollapsibleActionView)paramView);
      addView(paramView);
    }

    public final void onActionViewCollapsed()
    {
      this.ace.onActionViewCollapsed();
    }

    public final void onActionViewExpanded()
    {
      this.ace.onActionViewExpanded();
    }
  }

  final class c extends d<MenuItem.OnActionExpandListener>
    implements MenuItem.OnActionExpandListener
  {
    c(MenuItem.OnActionExpandListener arg2)
    {
      super();
    }

    public final boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnActionExpandListener)this.aar).onMenuItemActionCollapse(k.this.e(paramMenuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnActionExpandListener)this.aar).onMenuItemActionExpand(k.this.e(paramMenuItem));
    }
  }

  final class d extends d<MenuItem.OnMenuItemClickListener>
    implements MenuItem.OnMenuItemClickListener
  {
    d(MenuItem.OnMenuItemClickListener arg2)
    {
      super();
    }

    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnMenuItemClickListener)this.aar).onMenuItemClick(k.this.e(paramMenuItem));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.k
 * JD-Core Version:    0.6.2
 */