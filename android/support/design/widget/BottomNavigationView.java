package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.a.a;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.design.internal.a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.widget.bc;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class BottomNavigationView extends FrameLayout
{
  private static final int[] kO = { 16842912 };
  private static final int[] mX = { -16842910 };
  private final BottomNavigationPresenter ln = new BottomNavigationPresenter();
  private final h lo;
  private final BottomNavigationMenuView lq;
  private MenuInflater mY;
  private b mZ;
  private a na;

  public BottomNavigationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public BottomNavigationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    o.G(paramContext);
    this.lo = new a(paramContext);
    this.lq = new BottomNavigationMenuView(paramContext);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    localLayoutParams.gravity = 17;
    this.lq.setLayoutParams(localLayoutParams);
    this.ln.lq = this.lq;
    this.ln.mId = 1;
    this.lq.setPresenter(this.ln);
    this.lo.a(this.ln);
    this.ln.a(getContext(), this.lo);
    paramAttributeSet = bc.a(paramContext, paramAttributeSet, a.a.BottomNavigationView, paramInt, 2131493822);
    if (paramAttributeSet.hasValue(2))
    {
      this.lq.setIconTintList(paramAttributeSet.getColorStateList(2));
      if (!paramAttributeSet.hasValue(3))
        break label368;
      this.lq.setItemTextColor(paramAttributeSet.getColorStateList(3));
    }
    while (true)
    {
      if (paramAttributeSet.hasValue(0))
        s.h(this, paramAttributeSet.getDimensionPixelSize(0, 0));
      paramInt = paramAttributeSet.getResourceId(4, 0);
      this.lq.setItemBackgroundRes(paramInt);
      if (paramAttributeSet.hasValue(1))
      {
        paramInt = paramAttributeSet.getResourceId(1, 0);
        this.ln.lr = true;
        getMenuInflater().inflate(paramInt, this.lo);
        this.ln.lr = false;
        this.ln.n(true);
      }
      paramAttributeSet.atG.recycle();
      addView(this.lq, localLayoutParams);
      if (Build.VERSION.SDK_INT < 21)
      {
        paramAttributeSet = new View(paramContext);
        paramAttributeSet.setBackgroundColor(android.support.v4.content.b.i(paramContext, 2131689928));
        paramAttributeSet.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131428278)));
        addView(paramAttributeSet);
      }
      this.lo.a(new BottomNavigationView.1(this));
      return;
      this.lq.setIconTintList(bJ());
      break;
      label368: this.lq.setItemTextColor(bJ());
    }
  }

  private ColorStateList bJ()
  {
    Object localObject1 = null;
    Object localObject2 = new TypedValue();
    if (!getContext().getTheme().resolveAttribute(16842808, (TypedValue)localObject2, true));
    while (true)
    {
      return localObject1;
      ColorStateList localColorStateList = android.support.v7.c.a.b.h(getContext(), ((TypedValue)localObject2).resourceId);
      if (getContext().getTheme().resolveAttribute(2130772201, (TypedValue)localObject2, true))
      {
        int i = ((TypedValue)localObject2).data;
        int j = localColorStateList.getDefaultColor();
        localObject1 = mX;
        int[] arrayOfInt = kO;
        localObject2 = EMPTY_STATE_SET;
        int k = localColorStateList.getColorForState(mX, j);
        localObject1 = new ColorStateList(new int[][] { localObject1, arrayOfInt, localObject2 }, new int[] { k, i, j });
      }
    }
  }

  private MenuInflater getMenuInflater()
  {
    if (this.mY == null)
      this.mY = new g(getContext());
    return this.mY;
  }

  public int getItemBackgroundResource()
  {
    return this.lq.getItemBackgroundRes();
  }

  public ColorStateList getItemIconTintList()
  {
    return this.lq.getIconTintList();
  }

  public ColorStateList getItemTextColor()
  {
    return this.lq.getItemTextColor();
  }

  public int getMaxItemCount()
  {
    return 5;
  }

  public Menu getMenu()
  {
    return this.lo;
  }

  public int getSelectedItemId()
  {
    return this.lq.getSelectedItemId();
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof BottomNavigationView.SavedState))
      super.onRestoreInstanceState(paramParcelable);
    while (true)
    {
      return;
      paramParcelable = (BottomNavigationView.SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.LC);
      this.lo.dispatchRestoreInstanceState(paramParcelable.nc);
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    BottomNavigationView.SavedState localSavedState = new BottomNavigationView.SavedState(super.onSaveInstanceState());
    localSavedState.nc = new Bundle();
    this.lo.c(localSavedState.nc);
    return localSavedState;
  }

  public void setItemBackgroundResource(int paramInt)
  {
    this.lq.setItemBackgroundRes(paramInt);
  }

  public void setItemIconTintList(ColorStateList paramColorStateList)
  {
    this.lq.setIconTintList(paramColorStateList);
  }

  public void setItemTextColor(ColorStateList paramColorStateList)
  {
    this.lq.setItemTextColor(paramColorStateList);
  }

  public void setOnNavigationItemReselectedListener(a parama)
  {
    this.na = parama;
  }

  public void setOnNavigationItemSelectedListener(b paramb)
  {
    this.mZ = paramb;
  }

  public void setSelectedItemId(int paramInt)
  {
    MenuItem localMenuItem = this.lo.findItem(paramInt);
    if ((localMenuItem != null) && (!this.lo.a(localMenuItem, this.ln, 0)))
      localMenuItem.setChecked(true);
  }

  public static abstract interface a
  {
  }

  public static abstract interface b
  {
    public abstract boolean bK();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.BottomNavigationView
 * JD-Core Version:    0.6.2
 */