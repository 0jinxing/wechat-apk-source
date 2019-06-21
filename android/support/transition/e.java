package android.support.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

public final class e extends bb
{
  private float yo = 3.0F;

  private static float b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat1 = paramFloat3 - paramFloat1;
    paramFloat2 = paramFloat4 - paramFloat2;
    return (float)Math.sqrt(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
  }

  public final long a(ViewGroup paramViewGroup, Transition paramTransition, ah paramah1, ah paramah2)
  {
    long l1;
    if ((paramah1 == null) && (paramah2 == null))
    {
      l1 = 0L;
      return l1;
    }
    int i;
    label30: int j;
    int k;
    int m;
    if ((paramah2 == null) || (e(paramah1) == 0))
    {
      i = -1;
      j = bb.a(paramah1, 0);
      k = bb.a(paramah1, 1);
      paramah1 = paramTransition.getEpicenter();
      if (paramah1 == null)
        break label153;
      m = paramah1.centerX();
    }
    for (int n = paramah1.centerY(); ; n = Math.round(paramah1[1] + paramViewGroup.getHeight() / 2 + paramViewGroup.getTranslationY()))
    {
      float f = b(j, k, m, n) / b(0.0F, 0.0F, paramViewGroup.getWidth(), paramViewGroup.getHeight());
      long l2 = paramTransition.mDuration;
      l1 = l2;
      if (l2 < 0L)
        l1 = 300L;
      l1 = Math.round((float)(l1 * i) / this.yo * f);
      break;
      i = 1;
      paramah1 = paramah2;
      break label30;
      label153: paramah1 = new int[2];
      paramViewGroup.getLocationOnScreen(paramah1);
      m = Math.round(paramah1[0] + paramViewGroup.getWidth() / 2 + paramViewGroup.getTranslationX());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.transition.e
 * JD-Core Version:    0.6.2
 */