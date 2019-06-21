package android.support.design.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.support.transition.Transition;
import android.support.transition.ah;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

public final class e extends Transition
{
  private static void c(ah paramah)
  {
    if ((paramah.view instanceof TextView))
    {
      TextView localTextView = (TextView)paramah.view;
      paramah.values.put("android:textscale:scale", Float.valueOf(localTextView.getScaleX()));
    }
  }

  public final Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    float f1 = 1.0F;
    if ((paramah1 == null) || (paramah2 == null) || (!(paramah1.view instanceof TextView)) || (!(paramah2.view instanceof TextView)))
      paramViewGroup = null;
    while (true)
    {
      return paramViewGroup;
      TextView localTextView = (TextView)paramah2.view;
      paramViewGroup = paramah1.values;
      paramah1 = paramah2.values;
      if (paramViewGroup.get("android:textscale:scale") != null);
      for (float f2 = ((Float)paramViewGroup.get("android:textscale:scale")).floatValue(); ; f2 = 1.0F)
      {
        if (paramah1.get("android:textscale:scale") != null)
          f1 = ((Float)paramah1.get("android:textscale:scale")).floatValue();
        if (f2 != f1)
          break label127;
        paramViewGroup = null;
        break;
      }
      label127: paramViewGroup = ValueAnimator.ofFloat(new float[] { f2, f1 });
      paramViewGroup.addUpdateListener(new e.1(this, localTextView));
    }
  }

  public final void a(ah paramah)
  {
    c(paramah);
  }

  public final void b(ah paramah)
  {
    c(paramah);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.design.internal.e
 * JD-Core Version:    0.6.2
 */