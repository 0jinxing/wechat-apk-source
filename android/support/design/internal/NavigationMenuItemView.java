package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.content.a.b;
import android.support.v4.view.s;
import android.support.v4.widget.q;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.p.a;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.support.v7.widget.be;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView extends ForegroundLinearLayout
  implements p.a
{
  private static final int[] kO = { 16842912 };
  private j kY;
  private boolean lA;
  boolean lB;
  final CheckedTextView lC;
  FrameLayout lD;
  private ColorStateList lE;
  private boolean lF;
  private Drawable lG;
  private final android.support.v4.view.a lH = new NavigationMenuItemView.1(this);
  private final int lz;

  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(0);
    LayoutInflater.from(paramContext).inflate(2130969283, this, true);
    this.lz = paramContext.getResources().getDimensionPixelSize(2131428290);
    this.lC = ((CheckedTextView)findViewById(2131823269));
    this.lC.setDuplicateParentStateEnabled(true);
    s.a(this.lC, this.lH);
  }

  private void setActionView(View paramView)
  {
    if (paramView != null)
    {
      if (this.lD == null)
        this.lD = ((FrameLayout)((ViewStub)findViewById(2131823270)).inflate());
      this.lD.removeAllViews();
      this.lD.addView(paramView);
    }
  }

  public final void a(j paramj)
  {
    this.kY = paramj;
    int i;
    StateListDrawable localStateListDrawable;
    if (paramj.isVisible())
    {
      i = 0;
      setVisibility(i);
      if (getBackground() == null)
      {
        TypedValue localTypedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(2130772206, localTypedValue, true))
          break label248;
        localStateListDrawable = new StateListDrawable();
        localStateListDrawable.addState(kO, new ColorDrawable(localTypedValue.data));
        localStateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        label95: s.a(this, localStateListDrawable);
      }
      setCheckable(paramj.isCheckable());
      setChecked(paramj.isChecked());
      setEnabled(paramj.isEnabled());
      setTitle(paramj.getTitle());
      setIcon(paramj.getIcon());
      setActionView(paramj.getActionView());
      setContentDescription(paramj.getContentDescription());
      be.a(this, paramj.getTooltipText());
      if ((this.kY.getTitle() != null) || (this.kY.getIcon() != null) || (this.kY.getActionView() == null))
        break label254;
      i = 1;
      label197: if (i == 0)
        break label259;
      this.lC.setVisibility(8);
      if (this.lD != null)
      {
        paramj = (LinearLayoutCompat.LayoutParams)this.lD.getLayoutParams();
        paramj.width = -1;
        this.lD.setLayoutParams(paramj);
      }
    }
    while (true)
    {
      return;
      i = 8;
      break;
      label248: localStateListDrawable = null;
      break label95;
      label254: i = 0;
      break label197;
      label259: this.lC.setVisibility(0);
      if (this.lD != null)
      {
        paramj = (LinearLayoutCompat.LayoutParams)this.lD.getLayoutParams();
        paramj.width = -2;
        this.lD.setLayoutParams(paramj);
      }
    }
  }

  public final boolean br()
  {
    return false;
  }

  public j getItemData()
  {
    return this.kY;
  }

  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if ((this.kY != null) && (this.kY.isCheckable()) && (this.kY.isChecked()))
      mergeDrawableStates(arrayOfInt, kO);
    return arrayOfInt;
  }

  public void setCheckable(boolean paramBoolean)
  {
    refreshDrawableState();
    if (this.lB != paramBoolean)
    {
      this.lB = paramBoolean;
      this.lH.sendAccessibilityEvent(this.lC, 2048);
    }
  }

  public void setChecked(boolean paramBoolean)
  {
    refreshDrawableState();
    this.lC.setChecked(paramBoolean);
  }

  public void setIcon(Drawable paramDrawable)
  {
    Object localObject;
    if (paramDrawable != null)
    {
      localObject = paramDrawable;
      if (this.lF)
      {
        localObject = paramDrawable.getConstantState();
        if (localObject == null)
        {
          localObject = android.support.v4.a.a.a.f(paramDrawable).mutate();
          android.support.v4.a.a.a.a((Drawable)localObject, this.lE);
        }
      }
      else
      {
        ((Drawable)localObject).setBounds(0, 0, this.lz, this.lz);
        paramDrawable = (Drawable)localObject;
      }
    }
    while (true)
    {
      q.a(this.lC, paramDrawable, null, null, null);
      return;
      paramDrawable = ((Drawable.ConstantState)localObject).newDrawable();
      break;
      if (this.lA)
      {
        if (this.lG == null)
        {
          this.lG = b.b(getResources(), 2130839661, getContext().getTheme());
          if (this.lG != null)
            this.lG.setBounds(0, 0, this.lz, this.lz);
        }
        paramDrawable = this.lG;
      }
    }
  }

  void setIconTintList(ColorStateList paramColorStateList)
  {
    this.lE = paramColorStateList;
    if (this.lE != null);
    for (boolean bool = true; ; bool = false)
    {
      this.lF = bool;
      if (this.kY != null)
        setIcon(this.kY.getIcon());
      return;
    }
  }

  public void setNeedsEmptyIcon(boolean paramBoolean)
  {
    this.lA = paramBoolean;
  }

  public void setTextAppearance(int paramInt)
  {
    q.b(this.lC, paramInt);
  }

  public void setTextColor(ColorStateList paramColorStateList)
  {
    this.lC.setTextColor(paramColorStateList);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    this.lC.setText(paramCharSequence);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.design.internal.NavigationMenuItemView
 * JD-Core Version:    0.6.2
 */