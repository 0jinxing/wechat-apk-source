package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MMViewPager$j extends MMViewPager.a
{
  float[] v;

  public MMViewPager$j(MMViewPager paramMMViewPager)
  {
    super(paramMMViewPager);
    AppMethodBeat.i(106918);
    this.v = new float[9];
    AppMethodBeat.o(106918);
  }

  public final void play()
  {
    AppMethodBeat.i(106919);
    MMViewPager.c(this.yyC).post(new MMViewPager.j.1(this));
    AppMethodBeat.o(106919);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.j
 * JD-Core Version:    0.6.2
 */