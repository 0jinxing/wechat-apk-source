package android.support.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet
{
  public AutoTransition()
  {
    init();
  }

  public AutoTransition(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  private void init()
  {
    ao(1);
    d(new Fade(2)).d(new ChangeBounds()).d(new Fade(1));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.transition.AutoTransition
 * JD-Core Version:    0.6.2
 */