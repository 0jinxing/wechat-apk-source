package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class g extends Drawable
  implements Drawable.Callback, e, f
{
  static final PorterDuff.Mode uK = PorterDuff.Mode.SRC_IN;
  private int HD;
  private PorterDuff.Mode HE;
  private boolean HF;
  a HG;
  Drawable mDrawable;
  private boolean uO;

  g(Drawable paramDrawable)
  {
    this.HG = dD();
    h(paramDrawable);
  }

  g(a parama, Resources paramResources)
  {
    this.HG = parama;
    if ((this.HG != null) && (this.HG.HH != null))
      h(this.HG.HH.newDrawable(paramResources));
  }

  private boolean e(int[] paramArrayOfInt)
  {
    boolean bool = false;
    if (!dE());
    while (true)
    {
      return bool;
      ColorStateList localColorStateList = this.HG.vH;
      PorterDuff.Mode localMode = this.HG.vI;
      if ((localColorStateList != null) && (localMode != null))
      {
        int i = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
        if ((!this.HF) || (i != this.HD) || (localMode != this.HE))
        {
          setColorFilter(i, localMode);
          this.HD = i;
          this.HE = localMode;
          this.HF = true;
          bool = true;
        }
      }
      else
      {
        this.HF = false;
        clearColorFilter();
      }
    }
  }

  public final Drawable dC()
  {
    return this.mDrawable;
  }

  a dD()
  {
    return new b(this.HG);
  }

  protected boolean dE()
  {
    return true;
  }

  public void draw(Canvas paramCanvas)
  {
    this.mDrawable.draw(paramCanvas);
  }

  public int getChangingConfigurations()
  {
    int i = super.getChangingConfigurations();
    if (this.HG != null);
    for (int j = this.HG.getChangingConfigurations(); ; j = 0)
      return j | i | this.mDrawable.getChangingConfigurations();
  }

  public Drawable.ConstantState getConstantState()
  {
    int i;
    if (this.HG != null)
      if (this.HG.HH != null)
      {
        i = 1;
        if (i == 0)
          break label46;
        this.HG.mChangingConfigurations = getChangingConfigurations();
      }
    label46: for (a locala = this.HG; ; locala = null)
    {
      return locala;
      i = 0;
      break;
    }
  }

  public Drawable getCurrent()
  {
    return this.mDrawable.getCurrent();
  }

  public int getIntrinsicHeight()
  {
    return this.mDrawable.getIntrinsicHeight();
  }

  public int getIntrinsicWidth()
  {
    return this.mDrawable.getIntrinsicWidth();
  }

  public int getMinimumHeight()
  {
    return this.mDrawable.getMinimumHeight();
  }

  public int getMinimumWidth()
  {
    return this.mDrawable.getMinimumWidth();
  }

  public int getOpacity()
  {
    return this.mDrawable.getOpacity();
  }

  public boolean getPadding(Rect paramRect)
  {
    return this.mDrawable.getPadding(paramRect);
  }

  public int[] getState()
  {
    return this.mDrawable.getState();
  }

  public Region getTransparentRegion()
  {
    return this.mDrawable.getTransparentRegion();
  }

  public final void h(Drawable paramDrawable)
  {
    if (this.mDrawable != null)
      this.mDrawable.setCallback(null);
    this.mDrawable = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      setVisible(paramDrawable.isVisible(), true);
      setState(paramDrawable.getState());
      setLevel(paramDrawable.getLevel());
      setBounds(paramDrawable.getBounds());
      if (this.HG != null)
        this.HG.HH = paramDrawable.getConstantState();
    }
    invalidateSelf();
  }

  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }

  public boolean isStateful()
  {
    ColorStateList localColorStateList;
    if ((dE()) && (this.HG != null))
    {
      localColorStateList = this.HG.vH;
      if (((localColorStateList == null) || (!localColorStateList.isStateful())) && (!this.mDrawable.isStateful()))
        break label52;
    }
    label52: for (boolean bool = true; ; bool = false)
    {
      return bool;
      localColorStateList = null;
      break;
    }
  }

  public void jumpToCurrentState()
  {
    this.mDrawable.jumpToCurrentState();
  }

  public Drawable mutate()
  {
    a locala;
    if ((!this.uO) && (super.mutate() == this))
    {
      this.HG = dD();
      if (this.mDrawable != null)
        this.mDrawable.mutate();
      if (this.HG != null)
      {
        locala = this.HG;
        if (this.mDrawable == null)
          break label77;
      }
    }
    label77: for (Drawable.ConstantState localConstantState = this.mDrawable.getConstantState(); ; localConstantState = null)
    {
      locala.HH = localConstantState;
      this.uO = true;
      return this;
    }
  }

  protected void onBoundsChange(Rect paramRect)
  {
    if (this.mDrawable != null)
      this.mDrawable.setBounds(paramRect);
  }

  protected boolean onLevelChange(int paramInt)
  {
    return this.mDrawable.setLevel(paramInt);
  }

  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }

  public void setAlpha(int paramInt)
  {
    this.mDrawable.setAlpha(paramInt);
  }

  public void setChangingConfigurations(int paramInt)
  {
    this.mDrawable.setChangingConfigurations(paramInt);
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mDrawable.setColorFilter(paramColorFilter);
  }

  public void setDither(boolean paramBoolean)
  {
    this.mDrawable.setDither(paramBoolean);
  }

  public void setFilterBitmap(boolean paramBoolean)
  {
    this.mDrawable.setFilterBitmap(paramBoolean);
  }

  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = this.mDrawable.setState(paramArrayOfInt);
    if ((e(paramArrayOfInt)) || (bool));
    for (bool = true; ; bool = false)
      return bool;
  }

  public void setTint(int paramInt)
  {
    setTintList(ColorStateList.valueOf(paramInt));
  }

  public void setTintList(ColorStateList paramColorStateList)
  {
    this.HG.vH = paramColorStateList;
    e(getState());
  }

  public void setTintMode(PorterDuff.Mode paramMode)
  {
    this.HG.vI = paramMode;
    e(getState());
  }

  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((super.setVisible(paramBoolean1, paramBoolean2)) || (this.mDrawable.setVisible(paramBoolean1, paramBoolean2)));
    for (paramBoolean1 = true; ; paramBoolean1 = false)
      return paramBoolean1;
  }

  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }

  protected static abstract class a extends Drawable.ConstantState
  {
    Drawable.ConstantState HH;
    int mChangingConfigurations;
    ColorStateList vH = null;
    PorterDuff.Mode vI = g.uK;

    a(a parama)
    {
      if (parama != null)
      {
        this.mChangingConfigurations = parama.mChangingConfigurations;
        this.HH = parama.HH;
        this.vH = parama.vH;
        this.vI = parama.vI;
      }
    }

    public int getChangingConfigurations()
    {
      int i = this.mChangingConfigurations;
      if (this.HH != null);
      for (int j = this.HH.getChangingConfigurations(); ; j = 0)
        return j | i;
    }

    public Drawable newDrawable()
    {
      return newDrawable(null);
    }

    public abstract Drawable newDrawable(Resources paramResources);
  }

  static final class b extends g.a
  {
    b(g.a parama)
    {
      super();
    }

    public final Drawable newDrawable(Resources paramResources)
    {
      return new g(this, paramResources);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.a.g
 * JD-Core Version:    0.6.2
 */