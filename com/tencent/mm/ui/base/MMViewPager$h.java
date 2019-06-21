package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MMViewPager$h extends MMViewPager.a
{
  float[] v;

  public MMViewPager$h(MMViewPager paramMMViewPager)
  {
    super(paramMMViewPager);
    AppMethodBeat.i(106912);
    this.v = new float[9];
    AppMethodBeat.o(106912);
  }

  public final void play()
  {
    AppMethodBeat.i(106913);
    MMViewPager.c(this.yyC).post(new MMViewPager.h.1(this));
    AppMethodBeat.o(106913);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.h
 * JD-Core Version:    0.6.2
 */