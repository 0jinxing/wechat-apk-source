package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import java.lang.reflect.Method;

final class i extends h
{
  private static Method HI;

  i(Drawable paramDrawable)
  {
    super(paramDrawable);
    dF();
  }

  i(g.a parama, Resources paramResources)
  {
    super(parama, paramResources);
    dF();
  }

  private static void dF()
  {
    if (HI == null);
    try
    {
      HI = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
      label20: return;
    }
    catch (Exception localException)
    {
      break label20;
    }
  }

  final g.a dD()
  {
    return new a(this.HG);
  }

  protected final boolean dE()
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (Build.VERSION.SDK_INT == 21)
    {
      Drawable localDrawable = this.mDrawable;
      if ((!(localDrawable instanceof GradientDrawable)) && (!(localDrawable instanceof DrawableContainer)) && (!(localDrawable instanceof InsetDrawable)))
      {
        bool2 = bool1;
        if (!(localDrawable instanceof RippleDrawable));
      }
      else
      {
        bool2 = true;
      }
    }
    return bool2;
  }

  public final Rect getDirtyBounds()
  {
    return this.mDrawable.getDirtyBounds();
  }

  public final void getOutline(Outline paramOutline)
  {
    this.mDrawable.getOutline(paramOutline);
  }

  public final void setHotspot(float paramFloat1, float paramFloat2)
  {
    this.mDrawable.setHotspot(paramFloat1, paramFloat2);
  }

  public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final boolean setState(int[] paramArrayOfInt)
  {
    if (super.setState(paramArrayOfInt))
      invalidateSelf();
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void setTint(int paramInt)
  {
    if (dE())
      super.setTint(paramInt);
    while (true)
    {
      return;
      this.mDrawable.setTint(paramInt);
    }
  }

  public final void setTintList(ColorStateList paramColorStateList)
  {
    if (dE())
      super.setTintList(paramColorStateList);
    while (true)
    {
      return;
      this.mDrawable.setTintList(paramColorStateList);
    }
  }

  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    if (dE())
      super.setTintMode(paramMode);
    while (true)
    {
      return;
      this.mDrawable.setTintMode(paramMode);
    }
  }

  static final class a extends g.a
  {
    a(g.a parama)
    {
      super();
    }

    public final Drawable newDrawable(Resources paramResources)
    {
      return new i(this, paramResources);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.a.i
 * JD-Core Version:    0.6.2
 */