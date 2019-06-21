package android.support.transition;

import android.view.View;
import android.view.ViewGroup;

final class Slide$4 extends Slide.b
{
  Slide$4()
  {
    super((byte)0);
  }

  public final float b(ViewGroup paramViewGroup, View paramView)
  {
    return paramView.getTranslationX() + paramViewGroup.getWidth();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.transition.Slide.4
 * JD-Core Version:    0.6.2
 */