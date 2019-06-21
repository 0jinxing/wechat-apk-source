package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.s;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

final class ar$a extends ViewGroup
{
  static Method Bc;
  ViewGroup Bd;
  View Be;
  ArrayList<Drawable> Bf = null;
  ar Bg;

  static
  {
    try
    {
      Bc = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[] { Integer.TYPE, Integer.TYPE, Rect.class });
      label31: return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label31;
    }
  }

  ar$a(Context paramContext, ViewGroup paramViewGroup, View paramView, ar paramar)
  {
    super(paramContext);
    this.Bd = paramViewGroup;
    this.Be = paramView;
    setRight(paramViewGroup.getWidth());
    setBottom(paramViewGroup.getHeight());
    paramViewGroup.addView(this);
    this.Bg = paramar;
  }

  public final void add(View paramView)
  {
    if ((paramView.getParent() instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
      if ((localViewGroup != this.Bd) && (localViewGroup.getParent() != null) && (s.av(localViewGroup)))
      {
        int[] arrayOfInt1 = new int[2];
        int[] arrayOfInt2 = new int[2];
        localViewGroup.getLocationOnScreen(arrayOfInt1);
        this.Bd.getLocationOnScreen(arrayOfInt2);
        s.r(paramView, arrayOfInt1[0] - arrayOfInt2[0]);
        s.q(paramView, arrayOfInt1[1] - arrayOfInt2[1]);
      }
      localViewGroup.removeView(paramView);
      if (paramView.getParent() != null)
        localViewGroup.removeView(paramView);
    }
    super.addView(paramView, getChildCount() - 1);
  }

  protected final void dispatchDraw(Canvas paramCanvas)
  {
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    this.Bd.getLocationOnScreen(arrayOfInt1);
    this.Be.getLocationOnScreen(arrayOfInt2);
    paramCanvas.translate(arrayOfInt2[0] - arrayOfInt1[0], arrayOfInt2[1] - arrayOfInt1[1]);
    paramCanvas.clipRect(new Rect(0, 0, this.Be.getWidth(), this.Be.getHeight()));
    super.dispatchDraw(paramCanvas);
    if (this.Bf == null);
    for (int i = 0; ; i = this.Bf.size())
      for (int j = 0; j < i; j++)
        ((Drawable)this.Bf.get(j)).draw(paramCanvas);
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public final ViewParent invalidateChildInParent(int[] paramArrayOfInt, Rect paramRect)
  {
    if (this.Bd != null)
    {
      paramRect.offset(paramArrayOfInt[0], paramArrayOfInt[1]);
      if ((this.Bd instanceof ViewGroup))
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
        int[] arrayOfInt1 = new int[2];
        int[] arrayOfInt2 = new int[2];
        int[] arrayOfInt3 = new int[2];
        this.Bd.getLocationOnScreen(arrayOfInt2);
        this.Be.getLocationOnScreen(arrayOfInt3);
        arrayOfInt3[0] -= arrayOfInt2[0];
        arrayOfInt3[1] -= arrayOfInt2[1];
        paramRect.offset(arrayOfInt1[0], arrayOfInt1[1]);
      }
    }
    for (paramArrayOfInt = super.invalidateChildInParent(paramArrayOfInt, paramRect); ; paramArrayOfInt = null)
    {
      return paramArrayOfInt;
      invalidate(paramRect);
    }
  }

  public final void invalidateDrawable(Drawable paramDrawable)
  {
    invalidate(paramDrawable.getBounds());
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public final void remove(View paramView)
  {
    super.removeView(paramView);
    if ((getChildCount() == 0) && ((this.Bf == null) || (this.Bf.size() == 0)));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        this.Bd.removeView(this);
      return;
    }
  }

  protected final boolean verifyDrawable(Drawable paramDrawable)
  {
    if ((super.verifyDrawable(paramDrawable)) || ((this.Bf != null) && (this.Bf.contains(paramDrawable))));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.transition.ar.a
 * JD-Core Version:    0.6.2
 */