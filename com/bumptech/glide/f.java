package com.bumptech.glide;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum f
{
  private final float awF;

  static
  {
    AppMethodBeat.i(91617);
    awC = new f("LOW", 0, 0.5F);
    awD = new f("NORMAL", 1, 1.0F);
    awE = new f("HIGH", 2, 1.5F);
    awG = new f[] { awC, awD, awE };
    AppMethodBeat.o(91617);
  }

  private f(float paramFloat)
  {
    this.awF = paramFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.f
 * JD-Core Version:    0.6.2
 */