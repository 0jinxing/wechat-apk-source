package android.support.transition;

import android.view.View;
import java.util.Map;

public abstract class bb extends af
{
  private static final String[] BM = { "android:visibilityPropagation:visibility", "android:visibilityPropagation:center" };

  static int a(ah paramah, int paramInt)
  {
    if (paramah == null)
      paramInt = -1;
    while (true)
    {
      return paramInt;
      paramah = (int[])paramah.values.get("android:visibilityPropagation:center");
      if (paramah == null)
        paramInt = -1;
      else
        paramInt = paramah[paramInt];
    }
  }

  public static int e(ah paramah)
  {
    int i;
    if (paramah == null)
      i = 8;
    while (true)
    {
      return i;
      paramah = (Integer)paramah.values.get("android:visibilityPropagation:visibility");
      if (paramah == null)
        i = 8;
      else
        i = paramah.intValue();
    }
  }

  public final void c(ah paramah)
  {
    View localView = paramah.view;
    Integer localInteger = (Integer)paramah.values.get("android:visibility:visibility");
    Object localObject = localInteger;
    if (localInteger == null)
      localObject = Integer.valueOf(localView.getVisibility());
    paramah.values.put("android:visibilityPropagation:visibility", localObject);
    localObject = new int[2];
    localView.getLocationOnScreen((int[])localObject);
    localObject[0] += Math.round(localView.getTranslationX());
    localObject[0] += localView.getWidth() / 2;
    localObject[1] += Math.round(localView.getTranslationY());
    int i = localObject[1];
    localObject[1] = (localView.getHeight() / 2 + i);
    paramah.values.put("android:visibilityPropagation:center", localObject);
  }

  public final String[] getPropagationProperties()
  {
    return BM;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.transition.bb
 * JD-Core Version:    0.6.2
 */