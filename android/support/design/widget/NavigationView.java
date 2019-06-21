package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.a.a;
import android.support.design.internal.NavigationMenuView;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.design.internal.c;
import android.support.design.internal.c.b;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.aa;
import android.support.v4.view.s;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.j;
import android.support.v7.widget.bc;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class NavigationView extends ScrimInsetsFrameLayout
{
  private static final int[] kO = { 16842912 };
  private static final int[] mX = { -16842910 };
  private int di;
  private MenuInflater mY;
  private final android.support.design.internal.b qW;
  private final c qX = new c();
  NavigationView.a qY;

  public NavigationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public NavigationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    o.G(paramContext);
    this.qW = new android.support.design.internal.b(paramContext);
    bc localbc = bc.a(paramContext, paramAttributeSet, a.a.NavigationView, paramInt, 2131493827);
    s.a(this, localbc.getDrawable(0));
    if (localbc.hasValue(3))
      s.h(this, localbc.getDimensionPixelSize(3, 0));
    s.e(this, localbc.getBoolean(1, false));
    this.di = localbc.getDimensionPixelSize(2, 0);
    ColorStateList localColorStateList;
    int i;
    if (localbc.hasValue(5))
    {
      localColorStateList = localbc.getColorStateList(5);
      if (!localbc.hasValue(8))
        break label502;
      i = localbc.getResourceId(8, 0);
    }
    for (paramInt = 1; ; paramInt = 0)
    {
      paramAttributeSet = null;
      if (localbc.hasValue(6))
        paramAttributeSet = localbc.getColorStateList(6);
      Object localObject = paramAttributeSet;
      if (paramInt == 0)
      {
        localObject = paramAttributeSet;
        if (paramAttributeSet == null)
          localObject = ab(16842806);
      }
      paramAttributeSet = localbc.getDrawable(7);
      this.qW.a(new h.a()
      {
        public final boolean a(h paramAnonymoush, MenuItem paramAnonymousMenuItem)
        {
          if ((NavigationView.this.qY != null) && (NavigationView.this.qY.bK()));
          for (boolean bool = true; ; bool = false)
            return bool;
        }

        public final void b(h paramAnonymoush)
        {
        }
      });
      this.qX.mId = 1;
      this.qX.a(paramContext, this.qW);
      this.qX.setItemIconTintList(localColorStateList);
      if (paramInt != 0)
        this.qX.setItemTextAppearance(i);
      this.qX.setItemTextColor((ColorStateList)localObject);
      this.qX.setItemBackground(paramAttributeSet);
      this.qW.a(this.qX);
      paramContext = this.qX;
      if (paramContext.lJ == null)
      {
        paramContext.lJ = ((NavigationMenuView)paramContext.mLayoutInflater.inflate(2130969282, this, false));
        if (paramContext.lM == null)
          paramContext.lM = new c.b(paramContext);
        paramContext.lK = ((LinearLayout)paramContext.mLayoutInflater.inflate(2130969279, paramContext.lJ, false));
        paramContext.lJ.setAdapter(paramContext.lM);
      }
      addView((View)paramContext.lJ);
      if (localbc.hasValue(4))
      {
        paramInt = localbc.getResourceId(4, 0);
        this.qX.o(true);
        getMenuInflater().inflate(paramInt, this.qW);
        this.qX.o(false);
        this.qX.n(false);
      }
      if (localbc.hasValue(9))
      {
        paramInt = localbc.getResourceId(9, 0);
        paramContext = this.qX;
        paramAttributeSet = paramContext.mLayoutInflater.inflate(paramInt, paramContext.lK, false);
        paramContext.lK.addView(paramAttributeSet);
        paramContext.lJ.setPadding(0, 0, 0, paramContext.lJ.getPaddingBottom());
      }
      localbc.atG.recycle();
      return;
      localColorStateList = ab(16842808);
      break;
      label502: i = 0;
    }
  }

  private ColorStateList ab(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = new TypedValue();
    if (!getContext().getTheme().resolveAttribute(paramInt, (TypedValue)localObject2, true));
    while (true)
    {
      return localObject1;
      ColorStateList localColorStateList = android.support.v7.c.a.b.h(getContext(), ((TypedValue)localObject2).resourceId);
      if (getContext().getTheme().resolveAttribute(2130772201, (TypedValue)localObject2, true))
      {
        int i = ((TypedValue)localObject2).data;
        int j = localColorStateList.getDefaultColor();
        localObject1 = mX;
        localObject2 = kO;
        int[] arrayOfInt = EMPTY_STATE_SET;
        paramInt = localColorStateList.getColorForState(mX, j);
        localObject1 = new ColorStateList(new int[][] { localObject1, localObject2, arrayOfInt }, new int[] { paramInt, i, j });
      }
    }
  }

  private MenuInflater getMenuInflater()
  {
    if (this.mY == null)
      this.mY = new g(getContext());
    return this.mY;
  }

  public final void a(aa paramaa)
  {
    c localc = this.qX;
    int i = paramaa.getSystemWindowInsetTop();
    if (localc.lR != i)
    {
      localc.lR = i;
      if (localc.lK.getChildCount() == 0)
        localc.lJ.setPadding(0, localc.lR, 0, localc.lJ.getPaddingBottom());
    }
    s.b(localc.lK, paramaa);
  }

  public int getHeaderCount()
  {
    return this.qX.lK.getChildCount();
  }

  public Drawable getItemBackground()
  {
    return this.qX.lQ;
  }

  public ColorStateList getItemIconTintList()
  {
    return this.qX.lE;
  }

  public ColorStateList getItemTextColor()
  {
    return this.qX.lP;
  }

  public Menu getMenu()
  {
    return this.qW;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    switch (View.MeasureSpec.getMode(paramInt1))
    {
    default:
      i = paramInt1;
    case 1073741824:
    case -2147483648:
    case 0:
    }
    while (true)
    {
      super.onMeasure(i, paramInt2);
      return;
      i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(paramInt1), this.di), 1073741824);
      continue;
      i = View.MeasureSpec.makeMeasureSpec(this.di, 1073741824);
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof NavigationView.SavedState))
      super.onRestoreInstanceState(paramParcelable);
    while (true)
    {
      return;
      paramParcelable = (NavigationView.SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.LC);
      this.qW.dispatchRestoreInstanceState(paramParcelable.ra);
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    NavigationView.SavedState localSavedState = new NavigationView.SavedState(super.onSaveInstanceState());
    localSavedState.ra = new Bundle();
    this.qW.c(localSavedState.ra);
    return localSavedState;
  }

  public void setCheckedItem(int paramInt)
  {
    Object localObject = this.qW.findItem(paramInt);
    if (localObject != null)
    {
      c localc = this.qX;
      localObject = (j)localObject;
      localc.lM.d((j)localObject);
    }
  }

  public void setItemBackground(Drawable paramDrawable)
  {
    this.qX.setItemBackground(paramDrawable);
  }

  public void setItemBackgroundResource(int paramInt)
  {
    setItemBackground(android.support.v4.content.b.g(getContext(), paramInt));
  }

  public void setItemIconTintList(ColorStateList paramColorStateList)
  {
    this.qX.setItemIconTintList(paramColorStateList);
  }

  public void setItemTextAppearance(int paramInt)
  {
    this.qX.setItemTextAppearance(paramInt);
  }

  public void setItemTextColor(ColorStateList paramColorStateList)
  {
    this.qX.setItemTextColor(paramColorStateList);
  }

  public void setNavigationItemSelectedListener(NavigationView.a parama)
  {
    this.qY = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.NavigationView
 * JD-Core Version:    0.6.2
 */