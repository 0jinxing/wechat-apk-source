package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class ChangeClipBounds extends Transition
{
  private static final String[] xk = { "android:clipBounds:clip" };

  public ChangeClipBounds()
  {
  }

  public ChangeClipBounds(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private static void c(ah paramah)
  {
    Object localObject = paramah.view;
    if (((View)localObject).getVisibility() == 8);
    while (true)
    {
      return;
      Rect localRect = s.au((View)localObject);
      paramah.values.put("android:clipBounds:clip", localRect);
      if (localRect == null)
      {
        localObject = new Rect(0, 0, ((View)localObject).getWidth(), ((View)localObject).getHeight());
        paramah.values.put("android:clipBounds:bounds", localObject);
      }
    }
  }

  public final Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    if ((paramah1 == null) || (paramah2 == null) || (!paramah1.values.containsKey("android:clipBounds:clip")) || (!paramah2.values.containsKey("android:clipBounds:clip")))
      paramViewGroup = null;
    while (true)
    {
      return paramViewGroup;
      Object localObject = (Rect)paramah1.values.get("android:clipBounds:clip");
      Rect localRect = (Rect)paramah2.values.get("android:clipBounds:clip");
      if (localRect == null);
      for (int i = 1; ; i = 0)
      {
        if ((localObject != null) || (localRect != null))
          break label101;
        paramViewGroup = null;
        break;
      }
      label101: if (localObject == null)
      {
        paramViewGroup = (Rect)paramah1.values.get("android:clipBounds:bounds");
        paramah1 = localRect;
      }
      while (true)
      {
        if (!paramViewGroup.equals(paramah1))
          break label169;
        paramViewGroup = null;
        break;
        paramViewGroup = (ViewGroup)localObject;
        paramah1 = localRect;
        if (localRect == null)
        {
          paramah1 = (Rect)paramah2.values.get("android:clipBounds:bounds");
          paramViewGroup = (ViewGroup)localObject;
        }
      }
      label169: s.c(paramah2.view, paramViewGroup);
      localObject = new z(new Rect());
      paramah1 = ObjectAnimator.ofObject(paramah2.view, au.Bm, (TypeEvaluator)localObject, new Rect[] { paramViewGroup, paramah1 });
      paramViewGroup = paramah1;
      if (i != 0)
      {
        paramah1.addListener(new ChangeClipBounds.1(this, paramah2.view));
        paramViewGroup = paramah1;
      }
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

  public final String[] getTransitionProperties()
  {
    return xk;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeClipBounds
 * JD-Core Version:    0.6.2
 */