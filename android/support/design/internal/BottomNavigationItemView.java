package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.v4.a.a.a;
import android.support.v4.content.b;
import android.support.v4.view.q;
import android.support.v4.view.s;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.p.a;
import android.support.v7.widget.be;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;

public class BottomNavigationItemView extends FrameLayout
  implements p.a
{
  private static final int[] kO = { 16842912 };
  private final int kP;
  private final int kQ;
  private final float kR;
  private final float kS;
  private boolean kT;
  private ImageView kU;
  private final TextView kV;
  private final TextView kW;
  private int kX = -1;
  private j kY;
  private ColorStateList kZ;

  public BottomNavigationItemView(Context paramContext)
  {
    this(paramContext, null);
  }

  public BottomNavigationItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public BottomNavigationItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = getResources();
    int i = paramAttributeSet.getDimensionPixelSize(2131428279);
    paramInt = paramAttributeSet.getDimensionPixelSize(2131428272);
    this.kP = paramAttributeSet.getDimensionPixelSize(2131428277);
    this.kQ = (i - paramInt);
    this.kR = (paramInt * 1.0F / i);
    this.kS = (i * 1.0F / paramInt);
    LayoutInflater.from(paramContext).inflate(2130969271, this, true);
    setBackgroundResource(2130838456);
    this.kU = ((ImageView)findViewById(2131820915));
    this.kV = ((TextView)findViewById(2131823260));
    this.kW = ((TextView)findViewById(2131823261));
  }

  public final void a(j paramj)
  {
    this.kY = paramj;
    setCheckable(paramj.isCheckable());
    setChecked(paramj.isChecked());
    setEnabled(paramj.isEnabled());
    setIcon(paramj.getIcon());
    setTitle(paramj.getTitle());
    setId(paramj.getItemId());
    setContentDescription(paramj.getContentDescription());
    be.a(this, paramj.getTooltipText());
  }

  public final boolean br()
  {
    return false;
  }

  public j getItemData()
  {
    return this.kY;
  }

  public int getItemPosition()
  {
    return this.kX;
  }

  public int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if ((this.kY != null) && (this.kY.isCheckable()) && (this.kY.isChecked()))
      mergeDrawableStates(arrayOfInt, kO);
    return arrayOfInt;
  }

  public void setCheckable(boolean paramBoolean)
  {
    refreshDrawableState();
  }

  public void setChecked(boolean paramBoolean)
  {
    this.kW.setPivotX(this.kW.getWidth() / 2);
    this.kW.setPivotY(this.kW.getBaseline());
    this.kV.setPivotX(this.kV.getWidth() / 2);
    this.kV.setPivotY(this.kV.getBaseline());
    FrameLayout.LayoutParams localLayoutParams;
    if (this.kT)
      if (paramBoolean)
      {
        localLayoutParams = (FrameLayout.LayoutParams)this.kU.getLayoutParams();
        localLayoutParams.gravity = 49;
        localLayoutParams.topMargin = this.kP;
        this.kU.setLayoutParams(localLayoutParams);
        this.kW.setVisibility(0);
        this.kW.setScaleX(1.0F);
        this.kW.setScaleY(1.0F);
        this.kV.setVisibility(4);
      }
    while (true)
    {
      refreshDrawableState();
      return;
      localLayoutParams = (FrameLayout.LayoutParams)this.kU.getLayoutParams();
      localLayoutParams.gravity = 17;
      localLayoutParams.topMargin = this.kP;
      this.kU.setLayoutParams(localLayoutParams);
      this.kW.setVisibility(4);
      this.kW.setScaleX(0.5F);
      this.kW.setScaleY(0.5F);
      break;
      if (paramBoolean)
      {
        localLayoutParams = (FrameLayout.LayoutParams)this.kU.getLayoutParams();
        localLayoutParams.gravity = 49;
        localLayoutParams.topMargin = (this.kP + this.kQ);
        this.kU.setLayoutParams(localLayoutParams);
        this.kW.setVisibility(0);
        this.kV.setVisibility(4);
        this.kW.setScaleX(1.0F);
        this.kW.setScaleY(1.0F);
        this.kV.setScaleX(this.kR);
        this.kV.setScaleY(this.kR);
      }
      else
      {
        localLayoutParams = (FrameLayout.LayoutParams)this.kU.getLayoutParams();
        localLayoutParams.gravity = 49;
        localLayoutParams.topMargin = this.kP;
        this.kU.setLayoutParams(localLayoutParams);
        this.kW.setVisibility(4);
        this.kV.setVisibility(0);
        this.kW.setScaleX(this.kS);
        this.kW.setScaleY(this.kS);
        this.kV.setScaleX(1.0F);
        this.kV.setScaleY(1.0F);
      }
    }
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.kV.setEnabled(paramBoolean);
    this.kW.setEnabled(paramBoolean);
    this.kU.setEnabled(paramBoolean);
    if (paramBoolean)
      s.a(this, q.U(getContext()));
    while (true)
    {
      return;
      s.a(this, null);
    }
  }

  public void setIcon(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if (paramDrawable != null)
    {
      localObject = paramDrawable.getConstantState();
      if (localObject != null)
        break label40;
    }
    while (true)
    {
      localObject = a.f(paramDrawable).mutate();
      a.a((Drawable)localObject, this.kZ);
      this.kU.setImageDrawable((Drawable)localObject);
      return;
      label40: paramDrawable = ((Drawable.ConstantState)localObject).newDrawable();
    }
  }

  public void setIconTintList(ColorStateList paramColorStateList)
  {
    this.kZ = paramColorStateList;
    if (this.kY != null)
      setIcon(this.kY.getIcon());
  }

  public void setItemBackground(int paramInt)
  {
    if (paramInt == 0);
    for (Drawable localDrawable = null; ; localDrawable = b.g(getContext(), paramInt))
    {
      s.a(this, localDrawable);
      return;
    }
  }

  public void setItemPosition(int paramInt)
  {
    this.kX = paramInt;
  }

  public void setShiftingMode(boolean paramBoolean)
  {
    this.kT = paramBoolean;
  }

  public void setTextColor(ColorStateList paramColorStateList)
  {
    this.kV.setTextColor(paramColorStateList);
    this.kW.setTextColor(paramColorStateList);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    this.kV.setText(paramCharSequence);
    this.kW.setText(paramCharSequence);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.design.internal.BottomNavigationItemView
 * JD-Core Version:    0.6.2
 */