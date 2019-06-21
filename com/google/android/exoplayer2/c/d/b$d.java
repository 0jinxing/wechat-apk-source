package com.google.android.exoplayer2.c.d;

import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$d
  implements b.b
{
  private final int aXP;
  private final l aXz;
  private final int sampleCount;

  public b$d(a.b paramb)
  {
    AppMethodBeat.i(94944);
    this.aXz = paramb.aXz;
    this.aXz.setPosition(12);
    this.aXP = this.aXz.tI();
    this.sampleCount = this.aXz.tI();
    AppMethodBeat.o(94944);
  }

  public final int getSampleCount()
  {
    return this.sampleCount;
  }

  public final int rg()
  {
    AppMethodBeat.i(94945);
    int i;
    if (this.aXP == 0)
    {
      i = this.aXz.tI();
      AppMethodBeat.o(94945);
    }
    while (true)
    {
      return i;
      i = this.aXP;
      AppMethodBeat.o(94945);
    }
  }

  public final boolean rh()
  {
    if (this.aXP != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.b.d
 * JD-Core Version:    0.6.2
 */