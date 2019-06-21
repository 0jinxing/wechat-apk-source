package android.support.c.a;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.a.a.a;
import android.support.v4.a.a.e;

abstract class h extends Drawable
  implements e
{
  Drawable uJ;

  public void applyTheme(Resources.Theme paramTheme)
  {
    if (this.uJ != null)
      a.a(this.uJ, paramTheme);
  }

  public void clearColorFilter()
  {
    if (this.uJ != null)
      this.uJ.clearColorFilter();
    while (true)
    {
      return;
      super.clearColorFilter();
    }
  }

  public ColorFilter getColorFilter()
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (this.uJ != null)
    {
      Drawable localDrawable = this.uJ;
      localObject2 = localObject1;
      if (Build.VERSION.SDK_INT >= 21)
        localObject2 = localDrawable.getColorFilter();
    }
    return localObject2;
  }

  public Drawable getCurrent()
  {
    if (this.uJ != null);
    for (Drawable localDrawable = this.uJ.getCurrent(); ; localDrawable = super.getCurrent())
      return localDrawable;
  }

  public int getMinimumHeight()
  {
    if (this.uJ != null);
    for (int i = this.uJ.getMinimumHeight(); ; i = super.getMinimumHeight())
      return i;
  }

  public int getMinimumWidth()
  {
    if (this.uJ != null);
    for (int i = this.uJ.getMinimumWidth(); ; i = super.getMinimumWidth())
      return i;
  }

  public boolean getPadding(Rect paramRect)
  {
    if (this.uJ != null);
    for (boolean bool = this.uJ.getPadding(paramRect); ; bool = super.getPadding(paramRect))
      return bool;
  }

  public int[] getState()
  {
    if (this.uJ != null);
    for (int[] arrayOfInt = this.uJ.getState(); ; arrayOfInt = super.getState())
      return arrayOfInt;
  }

  public Region getTransparentRegion()
  {
    if (this.uJ != null);
    for (Region localRegion = this.uJ.getTransparentRegion(); ; localRegion = super.getTransparentRegion())
      return localRegion;
  }

  public void jumpToCurrentState()
  {
    if (this.uJ != null)
      this.uJ.jumpToCurrentState();
  }

  protected void onBoundsChange(Rect paramRect)
  {
    if (this.uJ != null)
      this.uJ.setBounds(paramRect);
    while (true)
    {
      return;
      super.onBoundsChange(paramRect);
    }
  }

  protected boolean onLevelChange(int paramInt)
  {
    if (this.uJ != null);
    for (boolean bool = this.uJ.setLevel(paramInt); ; bool = super.onLevelChange(paramInt))
      return bool;
  }

  public void setChangingConfigurations(int paramInt)
  {
    if (this.uJ != null)
      this.uJ.setChangingConfigurations(paramInt);
    while (true)
    {
      return;
      super.setChangingConfigurations(paramInt);
    }
  }

  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    if (this.uJ != null)
      this.uJ.setColorFilter(paramInt, paramMode);
    while (true)
    {
      return;
      super.setColorFilter(paramInt, paramMode);
    }
  }

  public void setFilterBitmap(boolean paramBoolean)
  {
    if (this.uJ != null)
      this.uJ.setFilterBitmap(paramBoolean);
  }

  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    if (this.uJ != null)
      a.a(this.uJ, paramFloat1, paramFloat2);
  }

  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.uJ != null)
      a.a(this.uJ, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public boolean setState(int[] paramArrayOfInt)
  {
    if (this.uJ != null);
    for (boolean bool = this.uJ.setState(paramArrayOfInt); ; bool = super.setState(paramArrayOfInt))
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.c.a.h
 * JD-Core Version:    0.6.2
 */