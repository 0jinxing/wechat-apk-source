package com.tencent.mm.ui.c.a;

import android.view.animation.DecelerateInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c extends DecelerateInterpolator
{
  public final float getInterpolation(float paramFloat)
  {
    AppMethodBeat.i(106220);
    if (paramFloat <= 0.5D)
    {
      paramFloat = super.getInterpolation(2.0F * paramFloat);
      AppMethodBeat.o(106220);
    }
    while (true)
    {
      return paramFloat;
      paramFloat = 1.0F;
      AppMethodBeat.o(106220);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.c.a.c
 * JD-Core Version:    0.6.2
 */