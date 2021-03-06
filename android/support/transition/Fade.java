package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.content.a.c;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class Fade extends Visibility
{
  public Fade()
  {
  }

  public Fade(int paramInt)
  {
    setMode(paramInt);
  }

  public Fade(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ac.zB);
    setMode(c.a(paramContext, (XmlResourceParser)paramAttributeSet, "fadingMode", 0, this.mMode));
    paramContext.recycle();
  }

  private static float a(ah paramah, float paramFloat)
  {
    float f = paramFloat;
    if (paramah != null)
    {
      paramah = (Float)paramah.values.get("android:fade:transitionAlpha");
      f = paramFloat;
      if (paramah != null)
        f = paramah.floatValue();
    }
    return f;
  }

  private Animator b(View paramView, float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 == paramFloat2);
    ObjectAnimator localObjectAnimator;
    for (paramView = null; ; paramView = localObjectAnimator)
    {
      return paramView;
      au.c(paramView, paramFloat1);
      localObjectAnimator = ObjectAnimator.ofFloat(paramView, au.Bl, new float[] { paramFloat2 });
      localObjectAnimator.addListener(new Fade.a(paramView));
      a(new Fade.1(this, paramView));
    }
  }

  public final Animator a(ViewGroup paramViewGroup, View paramView, ah paramah)
  {
    au.M(paramView);
    return b(paramView, a(paramah, 1.0F), 0.0F);
  }

  public final Animator a(ViewGroup paramViewGroup, View paramView, ah paramah1, ah paramah2)
  {
    float f1 = 0.0F;
    float f2 = a(paramah1, 0.0F);
    if (f2 == 1.0F);
    while (true)
    {
      return b(paramView, f1, 1.0F);
      f1 = f2;
    }
  }

  public final void a(ah paramah)
  {
    super.a(paramah);
    paramah.values.put("android:fade:transitionAlpha", Float.valueOf(au.L(paramah.view)));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.transition.Fade
 * JD-Core Version:    0.6.2
 */