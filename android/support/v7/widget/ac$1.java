package android.support.v7.widget;

import android.animation.ValueAnimator;

final class ac$1
  implements Runnable
{
  ac$1(ac paramac)
  {
  }

  public final void run()
  {
    ac localac = this.aiJ;
    switch (localac.aiH)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      localac.aiG.cancel();
      localac.aiH = 3;
      localac.aiG.setFloatValues(new float[] { ((Float)localac.aiG.getAnimatedValue()).floatValue(), 0.0F });
      localac.aiG.setDuration(500L);
      localac.aiG.start();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ac.1
 * JD-Core Version:    0.6.2
 */