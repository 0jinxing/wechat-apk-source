package com.tencent.mm.ui.c.a;

import android.view.animation.CycleInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends CycleInterpolator
{
  public b()
  {
    super(0.5F);
  }

  public final float getInterpolation(float paramFloat)
  {
    AppMethodBeat.i(106219);
    paramFloat = (float)(1.0D - Math.pow(2.0F * paramFloat - 1.0F, 2.0D));
    AppMethodBeat.o(106219);
    return paramFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.c.a.b
 * JD-Core Version:    0.6.2
 */