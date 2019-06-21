package com.tencent.mm.ui.c.a;

import android.view.animation.BounceInterpolator;

public final class a extends BounceInterpolator
{
  public final float getInterpolation(float paramFloat)
  {
    if (paramFloat < 0.3636363636363637D)
      paramFloat = (float)(paramFloat * 7.5625D * paramFloat);
    while (true)
    {
      return paramFloat;
      double d;
      if (paramFloat < 0.7272727272727273D)
      {
        paramFloat = (float)(paramFloat - 0.5454545454545454D);
        d = paramFloat;
        paramFloat = (float)(paramFloat * (d * 7.5625D) + 0.75D);
      }
      else
      {
        paramFloat = (float)(paramFloat - 0.8181818181818182D);
        d = paramFloat;
        paramFloat = (float)(paramFloat * (d * 7.5625D) + 0.9375D);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.c.a.a
 * JD-Core Version:    0.6.2
 */