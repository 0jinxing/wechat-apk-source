package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.w;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.o.a;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;

public abstract interface x
{
  public abstract void a(o.a parama, h.a parama1);

  public abstract void a(au paramau);

  public abstract void a(Menu paramMenu, o.a parama);

  public abstract w c(int paramInt, long paramLong);

  public abstract void collapseActionView();

  public abstract void dismissPopupMenus();

  public abstract boolean gV();

  public abstract boolean gW();

  public abstract void gX();

  public abstract Context getContext();

  public abstract View getCustomView();

  public abstract int getDisplayOptions();

  public abstract int getHeight();

  public abstract Menu getMenu();

  public abstract int getNavigationMode();

  public abstract CharSequence getTitle();

  public abstract int getVisibility();

  public abstract ViewGroup hW();

  public abstract boolean hasExpandedActionView();

  public abstract boolean hideOverflowMenu();

  public abstract boolean isOverflowMenuShowing();

  public abstract void setBackgroundDrawable(Drawable paramDrawable);

  public abstract void setCollapsible(boolean paramBoolean);

  public abstract void setCustomView(View paramView);

  public abstract void setDisplayOptions(int paramInt);

  public abstract void setIcon(int paramInt);

  public abstract void setIcon(Drawable paramDrawable);

  public abstract void setLogo(int paramInt);

  public abstract void setLogo(Drawable paramDrawable);

  public abstract void setNavigationContentDescription(int paramInt);

  public abstract void setVisibility(int paramInt);

  public abstract void setWindowCallback(Window.Callback paramCallback);

  public abstract void setWindowTitle(CharSequence paramCharSequence);

  public abstract boolean showOverflowMenu();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.x
 * JD-Core Version:    0.6.2
 */