package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Map;

public class Explode extends Visibility
{
  private static final TimeInterpolator yp = new DecelerateInterpolator();
  private static final TimeInterpolator yq = new AccelerateInterpolator();
  private int[] yr = new int[2];

  public Explode()
  {
    a(new e());
  }

  public Explode(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(new e());
  }

  private void a(View paramView, Rect paramRect, int[] paramArrayOfInt)
  {
    paramView.getLocationOnScreen(this.yr);
    int i = this.yr[0];
    int j = this.yr[1];
    Rect localRect = getEpicenter();
    int k;
    if (localRect == null)
      k = paramView.getWidth() / 2 + i + Math.round(paramView.getTranslationX());
    for (int m = paramView.getHeight() / 2 + j + Math.round(paramView.getTranslationY()); ; m = localRect.centerY())
    {
      int n = paramRect.centerX();
      int i1 = paramRect.centerY();
      float f1 = n - k;
      float f2 = i1 - m;
      float f3 = f1;
      float f4 = f2;
      if (f1 == 0.0F)
      {
        f3 = f1;
        f4 = f2;
        if (f2 == 0.0F)
        {
          f3 = (float)(Math.random() * 2.0D) - 1.0F;
          f4 = (float)(Math.random() * 2.0D) - 1.0F;
        }
      }
      f2 = q(f3, f4);
      f3 /= f2;
      f2 = f4 / f2;
      f4 = f(paramView, k - i, m - j);
      paramArrayOfInt[0] = Math.round(f3 * f4);
      paramArrayOfInt[1] = Math.round(f4 * f2);
      return;
      k = localRect.centerX();
    }
  }

  private void c(ah paramah)
  {
    View localView = paramah.view;
    localView.getLocationOnScreen(this.yr);
    int i = this.yr[0];
    int j = this.yr[1];
    int k = localView.getWidth();
    int m = localView.getHeight();
    paramah.values.put("android:explode:screenBounds", new Rect(i, j, k + i, m + j));
  }

  private static float f(View paramView, int paramInt1, int paramInt2)
  {
    paramInt1 = Math.max(paramInt1, paramView.getWidth() - paramInt1);
    paramInt2 = Math.max(paramInt2, paramView.getHeight() - paramInt2);
    return q(paramInt1, paramInt2);
  }

  private static float q(float paramFloat1, float paramFloat2)
  {
    return (float)Math.sqrt(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
  }

  public final Animator a(ViewGroup paramViewGroup, View paramView, ah paramah)
  {
    if (paramah == null)
    {
      paramViewGroup = null;
      return paramViewGroup;
    }
    Rect localRect = (Rect)paramah.values.get("android:explode:screenBounds");
    int i = localRect.left;
    int j = localRect.top;
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    int[] arrayOfInt = (int[])paramah.view.getTag(2131820682);
    float f3;
    float f4;
    if (arrayOfInt != null)
    {
      f3 = f1 + (arrayOfInt[0] - localRect.left);
      f4 = arrayOfInt[1] - localRect.top;
      localRect.offsetTo(arrayOfInt[0], arrayOfInt[1]);
      f4 += f2;
    }
    while (true)
    {
      a(paramViewGroup, localRect, this.yr);
      paramViewGroup = aj.a(paramView, paramah, i, j, f1, f2, f3 + this.yr[0], f4 + this.yr[1], yq);
      break;
      f4 = f2;
      f3 = f1;
    }
  }

  public final Animator a(ViewGroup paramViewGroup, View paramView, ah paramah1, ah paramah2)
  {
    if (paramah2 == null);
    float f1;
    float f2;
    float f3;
    float f4;
    for (paramViewGroup = null; ; paramViewGroup = aj.a(paramView, paramah2, paramah1.left, paramah1.top, f1 + f3, f2 + f4, f1, f2, yp))
    {
      return paramViewGroup;
      paramah1 = (Rect)paramah2.values.get("android:explode:screenBounds");
      f1 = paramView.getTranslationX();
      f2 = paramView.getTranslationY();
      a(paramViewGroup, paramah1, this.yr);
      f3 = this.yr[0];
      f4 = this.yr[1];
    }
  }

  public final void a(ah paramah)
  {
    super.a(paramah);
    c(paramah);
  }

  public final void b(ah paramah)
  {
    super.b(paramah);
    c(paramah);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.transition.Explode
 * JD-Core Version:    0.6.2
 */