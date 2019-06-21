package android.support.transition;

import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup;

final class Slide$2 extends Slide.b
{
  Slide$2()
  {
    super((byte)0);
  }

  public final float b(ViewGroup paramViewGroup, View paramView)
  {
    int i = 1;
    if (s.T(paramViewGroup) == 1)
      if (i == 0)
        break label34;
    label34: for (float f = paramView.getTranslationX() + paramViewGroup.getWidth(); ; f = paramView.getTranslationX() - paramViewGroup.getWidth())
    {
      return f;
      i = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.Slide.2
 * JD-Core Version:    0.6.2
 */