package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.v4.view.s;
import android.util.DisplayMetrics;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

final class c extends ImageView
{
  Animation.AnimationListener OW;
  int OX;

  c(Context paramContext)
  {
    super(paramContext);
    float f = getContext().getResources().getDisplayMetrics().density;
    int i = (int)(1.75F * f);
    int j = (int)(0.0F * f);
    this.OX = ((int)(3.5F * f));
    if (ey())
    {
      paramContext = new ShapeDrawable(new OvalShape());
      s.h(this, f * 4.0F);
    }
    while (true)
    {
      paramContext.getPaint().setColor(-328966);
      s.a(this, paramContext);
      return;
      paramContext = new ShapeDrawable(new c.a(this, this.OX));
      setLayerType(1, paramContext.getPaint());
      paramContext.getPaint().setShadowLayer(this.OX, j, i, 503316480);
      j = this.OX;
      setPadding(j, j, j, j);
    }
  }

  private static boolean ey()
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void onAnimationEnd()
  {
    super.onAnimationEnd();
    if (this.OW != null)
      this.OW.onAnimationEnd(getAnimation());
  }

  public final void onAnimationStart()
  {
    super.onAnimationStart();
    if (this.OW != null)
      this.OW.onAnimationStart(getAnimation());
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!ey())
      setMeasuredDimension(getMeasuredWidth() + this.OX * 2, getMeasuredHeight() + this.OX * 2);
  }

  public final void setBackgroundColor(int paramInt)
  {
    if ((getBackground() instanceof ShapeDrawable))
      ((ShapeDrawable)getBackground()).getPaint().setColor(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.c
 * JD-Core Version:    0.6.2
 */