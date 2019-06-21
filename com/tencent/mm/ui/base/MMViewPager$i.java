package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MMViewPager$i extends MMViewPager.a
{
  float[] v;

  public MMViewPager$i(MMViewPager paramMMViewPager)
  {
    super(paramMMViewPager);
    AppMethodBeat.i(106915);
    this.v = new float[9];
    AppMethodBeat.o(106915);
  }

  public final void play()
  {
    AppMethodBeat.i(106916);
    MMViewPager.c(this.yyC).post(new MMViewPager.i.1(this));
    AppMethodBeat.o(106916);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.i
 * JD-Core Version:    0.6.2
 */