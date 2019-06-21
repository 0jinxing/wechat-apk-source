package android.support.transition;

import android.graphics.Rect;
import android.support.v4.view.s;
import android.view.ViewGroup;

public final class ab extends bb
{
  private float yo = 3.0F;
  int zm = 80;

  public final long a(ViewGroup paramViewGroup, Transition paramTransition, ah paramah1, ah paramah2)
  {
    long l1;
    if ((paramah1 == null) && (paramah2 == null))
    {
      l1 = 0L;
      return l1;
    }
    int i = 1;
    Rect localRect = paramTransition.getEpicenter();
    if ((paramah2 == null) || (e(paramah1) == 0))
    {
      i = -1;
      paramah2 = paramah1;
    }
    int j = bb.a(paramah2, 0);
    int k = bb.a(paramah2, 1);
    paramah1 = new int[2];
    paramViewGroup.getLocationOnScreen(paramah1);
    int m = paramah1[0] + Math.round(paramViewGroup.getTranslationX());
    int n = paramah1[1] + Math.round(paramViewGroup.getTranslationY());
    int i1 = m + paramViewGroup.getWidth();
    int i2 = n + paramViewGroup.getHeight();
    int i3;
    int i4;
    label130: label150: label158: label207: float f;
    if (localRect != null)
    {
      i3 = localRect.centerX();
      i4 = localRect.centerY();
      if (this.zm != 8388611)
        break label353;
      if (s.T(paramViewGroup) != 1)
        break label341;
      i5 = 1;
      if (i5 == 0)
        break label347;
      i5 = 5;
      switch (i5)
      {
      default:
        i5 = 0;
        f = i5;
        switch (this.zm)
        {
        default:
        case 3:
        case 5:
        case 8388611:
        case 8388613:
        }
        break;
      case 3:
      case 48:
      case 5:
      case 80:
      }
    }
    for (int i5 = paramViewGroup.getHeight(); ; i5 = paramViewGroup.getWidth())
    {
      f /= i5;
      long l2 = paramTransition.mDuration;
      l1 = l2;
      if (l2 < 0L)
        l1 = 300L;
      l1 = Math.round((float)(l1 * i) / this.yo * f);
      break;
      i3 = (m + i1) / 2;
      i4 = (n + i2) / 2;
      break label130;
      label341: i5 = 0;
      break label150;
      label347: i5 = 3;
      break label158;
      label353: if (this.zm == 8388613)
      {
        if (s.T(paramViewGroup) == 1)
        {
          i5 = 1;
          label373: if (i5 == 0)
            break label390;
        }
        for (i5 = 3; ; i5 = 5)
        {
          break;
          i5 = 0;
          break label373;
        }
      }
      label390: i5 = this.zm;
      break label158;
      i5 = i1 - j + Math.abs(i4 - k);
      break label207;
      i5 = Math.abs(i3 - j) + (i2 - k);
      break label207;
      i5 = j - m + Math.abs(i4 - k);
      break label207;
      i5 = Math.abs(i3 - j) + (k - n);
      break label207;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.transition.ab
 * JD-Core Version:    0.6.2
 */